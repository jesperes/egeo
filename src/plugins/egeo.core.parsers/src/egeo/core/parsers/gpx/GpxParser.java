package egeo.core.parsers.gpx;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import egeo.Attribute;
import egeo.CacheDatabase;
import egeo.CacheType;
import egeo.ContainerType;
import egeo.Coordinate;
import egeo.Description;
import egeo.EgeoFactory;
import egeo.Geocache;
import egeo.Log;
import egeo.LogType;
import egeo.User;
import egeo.Waypoint;
import egeo.core.parsers.GeocacheUtils;
import egeo.core.parsers.IParser;
import egeo.core.parsers.ParseException;

public class GpxParser implements IParser {

	private static final Logger logger = Logger.getLogger(GpxParser.class);

	@Override
	public void parse(File input, CacheDatabase db) throws ParseException {
		try {
			Document doc = Jsoup.parse(input, "UTF-8");
			parseDoc(doc, URI.createFileURI(input.toString()), db);
		} catch (IOException e) {
			throw new ParseException(e);
		}
	}

	private void parseDoc(Document doc, URI from, CacheDatabase db) {
		// Element gpx = doc.select("gpx").first();
		// String gpxVersion = gpx.attr("version");

		Elements waypoints = doc.select("wpt");
		System.out.println("Waypoints: " + waypoints.size());
		for (Element wpt : waypoints) {
			try {
				parseWaypoint(wpt, from, db);
			} catch (Exception e) {
				logger.error("Could not parse waypoint: " + e);
			}
		}
	}

	private User lookupUser(long id, String name, CacheDatabase db) {
		for (User user : db.getUsers()) {
			if (user.getUserId() == id)
				return user;
		}

		User user = EgeoFactory.eINSTANCE.createUser();
		user.setUserId(id);
		user.setName(name);

		logger.debug("Adding new user: " + user.getName());
		db.getUsers().add(user);
		return user;
	}

	private void parseWaypoint(Element element, URI from, CacheDatabase db)
			throws MalformedURLException, ParseException {

		Element gspk = element.getElementsByTag("groundspeak:cache").first();
		Waypoint wpt;
		if (gspk == null) {
			wpt = EgeoFactory.eINSTANCE.createWaypoint();
		} else {
			wpt = EgeoFactory.eINSTANCE.createGeocache();
		}

		db.getWaypoints().add(wpt);

		parseGpxWaypoint(wpt, element);

		if (wpt instanceof Geocache) {
			Geocache cache = (Geocache) wpt;
			Element gc = element.getElementsByTag("groundspeak:cache").first();

			cache.setCacheId(Integer.valueOf(gc.attr("id")));
			cache.setName(gc.getElementsByTag("groundspeak:name").text());
			cache.setArchived(gc.attr("archive").equals("True"));
			cache.setAvailable(gc.attr("available").equals("True"));
			cache.setPlacedBy(gc.getElementsByTag("groundspeak:placed_by")
					.text());

			User owner = lookupUser(Integer.valueOf(gc.getElementsByTag(
					"groundspeak:owner").attr("id")),
					gc.getElementsByTag("groundspeak:owner").text(), db);

			cache.setOwner(owner);

			cache.setDifficulty(Double.parseDouble(gc.getElementsByTag(
					"groundspeak:difficulty").text()));
			cache.setTerrain(Double.parseDouble(gc.getElementsByTag(
					"groundspeak:terrain").text()));
			Description shortDesc = EgeoFactory.eINSTANCE.createDescription();
			Element elemShort = gc.getElementsByTag(
					"groundspeak:short_description").first();
			// shortDesc.setText(elemShort.text());
			shortDesc.setHtml(elemShort.attr("html").equals("True") ? true
					: false);
			cache.setShortText(shortDesc);

			cache.setHint(gc.getElementsByTag("groundspeak:encoded_hints")
					.text());

			Description longDesc = EgeoFactory.eINSTANCE.createDescription();
			Element elemLong = gc.getElementsByTag(
					"groundspeak:long_description").first();
			// longDesc.setText(elemLong.text());
			longDesc.setHtml(elemLong.attr("html").equals("True") ? true
					: false);
			cache.setLongText(longDesc);

			cache.setCountry(gc.getElementsByTag("groundspeak:country").first()
					.text());
			cache.setState(gc.getElementsByTag("groundspeak:state").first()
					.text());

			String cacheType = gc.getElementsByTag("groundspeak:type").first()
					.text();
			switch (cacheType) {
			case "Traditional Cache":
				cache.setCacheType(CacheType.TRADITIONAL);
				break;
			case "Earthcache":
				cache.setCacheType(CacheType.EARTHCACHE);
				break;
			case "Webcam Cache":
				cache.setCacheType(CacheType.WEBCAM);
				break;
			case "Multi-cache":
				cache.setCacheType(CacheType.MULTI);
				break;
			case "Unknown Cache":
				cache.setCacheType(CacheType.UNKNOWN);
				break;
			case "Event Cache":
				cache.setCacheType(CacheType.EVENT);
				break;
			case "Wherigo Cache":
				cache.setCacheType(CacheType.WHERIGO);
				break;
			case "Letterbox Hybrid":
				cache.setCacheType(CacheType.LETTERBOX_HYBRID);
				break;
			case "Cache In Trash Out Event":
				cache.setCacheType(CacheType.CITO);
				break;
			case "Mega-Event Cache":
				cache.setCacheType(CacheType.MEGA_EVENT);
				break;
			case "Virtual Cache":
				cache.setCacheType(CacheType.VIRTUAL);
				break;
			default:
				throw new ParseException("Unknown cache type: " + cacheType);
			}

			String container = gc.getElementsByTag("groundspeak:container")
					.text();
			switch (container) {
			case "Micro":
				cache.setContainerType(ContainerType.MICRO);
				break;
			case "Small":
				cache.setContainerType(ContainerType.SMALL);
				break;
			case "Regular":
				cache.setContainerType(ContainerType.REGULAR);
				break;
			case "Large":
				cache.setContainerType(ContainerType.LARGE);
				break;
			case "Other":
				cache.setContainerType(ContainerType.OTHER);
				break;
			case "Not chosen":
				cache.setContainerType(ContainerType.UNSPECIFIED);
				break;
			case "Virtual":
				cache.setContainerType(ContainerType.VIRTUAL);
				break;
			default:
				throw new ParseException("Unknown container type: " + container);
			}

			for (Element elem : gc.select("groundspeak|attribute")) {
				Attribute attr = Attribute
						.get(Integer.parseInt(elem.attr("id")));
				if (attr == null) {
					throw new ParseException("Unknown attribute: "
							+ elem.text());
				}
				boolean enabled = elem.attr("inc").equals("1");
				if (enabled)
					cache.getEnabledAttributes().add(attr);
				else
					cache.getDisabledAttributes().add(attr);
			}

			for (Element elem : gc.select("groundspeak|log")) {
				Log log = EgeoFactory.eINSTANCE.createLog();
				log.setDate(GeocacheUtils.parseDate(elem.getElementsByTag(
						"groundspeak:date").text()));

				User finder = lookupUser(Integer.valueOf(elem.getElementsByTag(
						"groundspeak:finder").attr("id")), elem
						.getElementsByTag("groundspeak:finder").text(), db);

				log.setFinder(finder);
				log.setText(elem.getElementsByTag("groundspeak:text").text());

				String logtype = elem.getElementsByTag("groundspeak:type")
						.text();
				switch (logtype) {
				case "Found it":
					log.setLogType(LogType.FOUND_IT);
					break;
				case "Write note":
					log.setLogType(LogType.WRITE_NOTE);
					break;
				case "Owner Maintenance":
					log.setLogType(LogType.OWNER_MAINTENANCE);
					break;
				case "Will Attend":
					log.setLogType(LogType.WILL_ATTEND);
					break;
				case "Publish Listing":
					log.setLogType(LogType.PUBLISH_LISTING);
					break;
				case "Didn't find it":
					log.setLogType(LogType.DID_NOT_FIND);
					break;
				case "Temporarily Disable Listing":
					log.setLogType(LogType.DISABLE);
					break;
				case "Announcement":
					log.setLogType(LogType.ANNOUNCEMENT);
					break;
				case "Attended":
					log.setLogType(LogType.ATTENDED);
					break;
				case "Enable Listing":
					log.setLogType(LogType.ENABLE_LISTING);
					break;
				case "Post Reviewer Note":
					log.setLogType(LogType.POST_REVIEWER_NOTE);
					break;
				case "Needs Maintenance":
					log.setLogType(LogType.NEEDS_MAINTENANCE);
					break;
				case "Update Coordinates":
					log.setLogType(LogType.UPDATE_COORDINATES);
					break;
				case "Webcam Photo Taken":
					log.setLogType(LogType.WEBCAM_PHOTO_TAKEN);
					break;
				case "Needs Archived":
					log.setLogType(LogType.NEEDS_ARCHIVED);
					break;
				case "Archive":
					log.setLogType(LogType.ARCHIVE);
					break;
				case "Unarchive":
					log.setLogType(LogType.UNARCHIVE);
					break;
				case "Retract Listing":
					log.setLogType(LogType.RETRACT_LISTING);
					break;
				default:
					logger.error("Unknown log type: " + logtype);
					continue;
				}
				cache.getLogs().add(log);
			}
		}
	}

	private void parseGpxWaypoint(Waypoint wpt, Element element)
			throws MalformedURLException {
		wpt.setName(element.getElementsByTag("name").text());
		wpt.setTime(GeocacheUtils.parseDate(element.getElementsByTag("time")
				.text()));
		wpt.setUrl(new URL(element.getElementsByTag("url").text()));
		wpt.setType0(element.getElementsByTag("type").text());
		wpt.setUrlname(element.getElementsByTag("urlname").text());
		wpt.setSym(element.getElementsByTag("sym").text());
		wpt.setCmt(element.getElementsByTag("cmt").text());

		Coordinate coord = EgeoFactory.eINSTANCE.createCoordinate();
		coord.setLat(new BigDecimal(element.attr("lat")));
		coord.setLon(new BigDecimal(element.attr("lon")));
		wpt.setCoord(coord);
	}
}
