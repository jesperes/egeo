package egeo.core.parsers.gpx;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import egeo.CacheType;
import egeo.Coordinate;
import egeo.Description;
import egeo.EgeoFactory;
import egeo.Geocache;
import egeo.Log;
import egeo.core.parsers.IParser;
import egeo.core.parsers.ParseException;

public class GpxParser implements IParser {

	Pattern datePattern = Pattern
			.compile("(\\d+)-(\\d+)-(\\d+)T(\\d+):(\\d+):(\\d+)Z");

	@Override
	public Collection<Geocache> parse(URI input) throws ParseException {
		throw new ParseException("URI parse not supported");
	}

	@Override
	public Collection<Geocache> parse(File input) throws ParseException {
		try {
			System.out.println("Parsing " + input);
			Document doc = Jsoup.parse(input, "UTF-8");
			return parseDoc(doc);
		} catch (IOException e) {
			throw new ParseException(e);
		}
	}

	private Date parseDate(String str) {
		// 2006-08-09T07:00:00Z
		SimpleDateFormat format = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ss'Z'");
		try {
			Date date = format.parse(str);
			// System.out.format("%s -> %s\n", str, date);
			return date;
		} catch (java.text.ParseException e) {
			e.printStackTrace();
			return new Date();
		}
	}

	private Collection<Geocache> parseDoc(Document doc) throws ParseException {
		Collection<Geocache> list = new ArrayList<Geocache>();
		Elements waypoints = doc.select("wpt");
		System.out.println("Waypoints: " + waypoints.size());
		for (Element wpt : waypoints) {
			Geocache cache = EgeoFactory.eINSTANCE.createGeocache();

			cache.setCode(wpt.getElementsByTag("name").text());
			cache.setTime(parseDate(wpt.getElementsByTag("time").text()));
			Coordinate coord = EgeoFactory.eINSTANCE.createCoordinate();
			coord.setLat(new BigDecimal(wpt.attr("lat")));
			coord.setLon(new BigDecimal(wpt.attr("lon")));
			cache.setCoord(coord);

			Elements gspk = wpt.getElementsByTag("groundspeak:cache");
			if (gspk.size() > 0) {
				Element gc = gspk.get(0);

				cache.setCacheId(Integer.valueOf(gc.attr("id")));
				cache.setName(gc.getElementsByTag("groundspeak:name").text());

				Description shortDesc = EgeoFactory.eINSTANCE
						.createDescription();
				Element elemShort = gc.getElementsByTag(
						"groundspeak:short_description").first();
				shortDesc.setText(elemShort.text());
				shortDesc.setHtml(elemShort.attr("html").equals("True") ? true
						: false);
				cache.setShortText(shortDesc);

				Description longDesc = EgeoFactory.eINSTANCE
						.createDescription();
				Element elemLong = gc.getElementsByTag(
						"groundspeak:long_description").first();
				longDesc.setText(elemLong.text());
				longDesc.setHtml(elemLong.attr("html").equals("True") ? true
						: false);
				cache.setLongText(longDesc);

				String cacheType = gc.getElementsByTag("groundspeak:type")
						.first().text();
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

				for (Element elem : gc.select("groundspeak|log")) {
					Log log = EgeoFactory.eINSTANCE.createLog();
					log.setDate(parseDate(elem.getElementsByTag(
							"groundspeak:date").text()));
					cache.getLogs().add(log);
				}
			}
			list.add(cache);
		}
		return list;
	}
}
