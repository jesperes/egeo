package egeo.database;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GpxParser {

    public void parse(File file, Connection connection) throws IOException {
        Document doc = Jsoup.parse(file, "UTF-8");
        parseDoc(doc, connection);
    }

    private void parseDoc(Document doc, Connection connection) {

        Elements waypoints = doc.select("wpt");
        System.out.println("Waypoints: " + waypoints.size());
        for (Element wpt : waypoints) {
            try {
                parseWaypoint(wpt, connection);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void parseWaypoint_(Element element, Connection connection)
            throws MalformedURLException, ParseException, SQLException {

        // parseWaypoint(wpt, connection);
        // Element gspk = element.getElementsByTag("groundspeak:cache").first();
        // Waypoint wpt;
        // if (gspk == null) {
        // wpt = EgeoFactory.eINSTANCE.createWaypoint();
        // } else {
        // wpt = EgeoFactory.eINSTANCE.createGeocache();
        // }
        //
        // db.getWaypoints().add(wpt);
        //

        //
        // if (wpt instanceof Geocache) {
        // Geocache cache = (Geocache) wpt;
        // Element gc = element.getElementsByTag("groundspeak:cache").first();
        //
        // cache.setCacheId(Integer.valueOf(gc.attr("id")));
        // cache.setName(gc.getElementsByTag("groundspeak:name").text());
        // cache.setArchived(gc.attr("archive").equals("True"));
        // cache.setAvailable(gc.attr("available").equals("True"));
        // cache.setPlacedBy(gc.getElementsByTag("groundspeak:placed_by")
        // .text());
        //
        // User owner = lookupUser(Integer.valueOf(gc.getElementsByTag(
        // "groundspeak:owner").attr("id")),
        // gc.getElementsByTag("groundspeak:owner").text(), db);
        //
        // cache.setOwner(owner);
        //
        // cache.setDifficulty(Double.parseDouble(gc.getElementsByTag(
        // "groundspeak:difficulty").text()));
        // cache.setTerrain(Double.parseDouble(gc.getElementsByTag(
        // "groundspeak:terrain").text()));
        // Description shortDesc = EgeoFactory.eINSTANCE.createDescription();
        // Element elemShort = gc.getElementsByTag(
        // "groundspeak:short_description").first();
        // // shortDesc.setText(elemShort.text());
        // shortDesc.setHtml(elemShort.attr("html").equals("True") ? true
        // : false);
        // cache.setShortText(shortDesc);
        //
        // cache.setHint(gc.getElementsByTag("groundspeak:encoded_hints")
        // .text());
        //
        // Description longDesc = EgeoFactory.eINSTANCE.createDescription();
        // Element elemLong = gc.getElementsByTag(
        // "groundspeak:long_description").first();
        // // longDesc.setText(elemLong.text());
        // longDesc.setHtml(elemLong.attr("html").equals("True") ? true
        // : false);
        // cache.setLongText(longDesc);
        //
        // cache.setCountry(gc.getElementsByTag("groundspeak:country").first()
        // .text());
        // cache.setState(gc.getElementsByTag("groundspeak:state").first()
        // .text());
        //
        // String cacheType = gc.getElementsByTag("groundspeak:type").first()
        // .text();
        // switch (cacheType) {
        // case "Traditional Cache":
        // cache.setCacheType(CacheType.TRADITIONAL);
        // break;
        // case "Earthcache":
        // cache.setCacheType(CacheType.EARTHCACHE);
        // break;
        // case "Webcam Cache":
        // cache.setCacheType(CacheType.WEBCAM);
        // break;
        // case "Multi-cache":
        // cache.setCacheType(CacheType.MULTI);
        // break;
        // case "Unknown Cache":
        // cache.setCacheType(CacheType.UNKNOWN);
        // break;
        // case "Event Cache":
        // cache.setCacheType(CacheType.EVENT);
        // break;
        // case "Wherigo Cache":
        // cache.setCacheType(CacheType.WHERIGO);
        // break;
        // case "Letterbox Hybrid":
        // cache.setCacheType(CacheType.LETTERBOX_HYBRID);
        // break;
        // case "Cache In Trash Out Event":
        // cache.setCacheType(CacheType.CITO);
        // break;
        // case "Mega-Event Cache":
        // cache.setCacheType(CacheType.MEGA_EVENT);
        // break;
        // case "Virtual Cache":
        // cache.setCacheType(CacheType.VIRTUAL);
        // break;
        // default:
        // throw new ParseException("Unknown cache type: " + cacheType);
        // }
        //
        // String container = gc.getElementsByTag("groundspeak:container")
        // .text();
        // switch (container) {
        // case "Micro":
        // cache.setContainerType(ContainerType.MICRO);
        // break;
        // case "Small":
        // cache.setContainerType(ContainerType.SMALL);
        // break;
        // case "Regular":
        // cache.setContainerType(ContainerType.REGULAR);
        // break;
        // case "Large":
        // cache.setContainerType(ContainerType.LARGE);
        // break;
        // case "Other":
        // cache.setContainerType(ContainerType.OTHER);
        // break;
        // case "Not chosen":
        // cache.setContainerType(ContainerType.UNSPECIFIED);
        // break;
        // case "Virtual":
        // cache.setContainerType(ContainerType.VIRTUAL);
        // break;
        // default:
        // throw new ParseException("Unknown container type: " + container);
        // }
        //
        // for (Element elem : gc.select("groundspeak|attribute")) {
        // Attribute attr = Attribute
        // .get(Integer.parseInt(elem.attr("id")));
        // if (attr == null) {
        // throw new ParseException("Unknown attribute: "
        // + elem.text());
        // }
        // boolean enabled = elem.attr("inc").equals("1");
        // if (enabled)
        // cache.getEnabledAttributes().add(attr);
        // else
        // cache.getDisabledAttributes().add(attr);
        // }
        //
        // for (Element elem : gc.select("groundspeak|log")) {
        // Log log = EgeoFactory.eINSTANCE.createLog();
        // log.setDate(GeocacheUtils.parseDate(elem.getElementsByTag(
        // "groundspeak:date").text()));
        //
        // User finder = lookupUser(Integer.valueOf(elem.getElementsByTag(
        // "groundspeak:finder").attr("id")), elem
        // .getElementsByTag("groundspeak:finder").text(), db);
        //
        // log.setFinder(finder);
        // log.setText(elem.getElementsByTag("groundspeak:text").text());
        //
        // String logtype = elem.getElementsByTag("groundspeak:type")
        // .text();
        // switch (logtype) {
        // case "Found it":
        // log.setLogType(LogType.FOUND_IT);
        // break;
        // case "Write note":
        // log.setLogType(LogType.WRITE_NOTE);
        // break;
        // case "Owner Maintenance":
        // log.setLogType(LogType.OWNER_MAINTENANCE);
        // break;
        // case "Will Attend":
        // log.setLogType(LogType.WILL_ATTEND);
        // break;
        // case "Publish Listing":
        // log.setLogType(LogType.PUBLISH_LISTING);
        // break;
        // case "Didn't find it":
        // log.setLogType(LogType.DID_NOT_FIND);
        // break;
        // case "Temporarily Disable Listing":
        // log.setLogType(LogType.DISABLE);
        // break;
        // case "Announcement":
        // log.setLogType(LogType.ANNOUNCEMENT);
        // break;
        // case "Attended":
        // log.setLogType(LogType.ATTENDED);
        // break;
        // case "Enable Listing":
        // log.setLogType(LogType.ENABLE_LISTING);
        // break;
        // case "Post Reviewer Note":
        // log.setLogType(LogType.POST_REVIEWER_NOTE);
        // break;
        // case "Needs Maintenance":
        // log.setLogType(LogType.NEEDS_MAINTENANCE);
        // break;
        // case "Update Coordinates":
        // log.setLogType(LogType.UPDATE_COORDINATES);
        // break;
        // case "Webcam Photo Taken":
        // log.setLogType(LogType.WEBCAM_PHOTO_TAKEN);
        // break;
        // case "Needs Archived":
        // log.setLogType(LogType.NEEDS_ARCHIVED);
        // break;
        // case "Archive":
        // log.setLogType(LogType.ARCHIVE);
        // break;
        // case "Unarchive":
        // log.setLogType(LogType.UNARCHIVE);
        // break;
        // case "Retract Listing":
        // log.setLogType(LogType.RETRACT_LISTING);
        // break;
        // default:
        // logger.error("Unknown log type: " + logtype);
        // continue;
        // }
        // cache.getLogs().add(log);
        // }
        // }
    }

    private void parseWaypoint(Element wpt, Connection connection)
            throws SQLException {

        PreparedStatement ps = connection
                .prepareStatement("INSERT INTO caches (id, name) VALUES (?, ?)");
        ps.setString(1, wpt.getElementsByTag("name").text());
        ps.setString(2, wpt.getElementsByTag("urlname").text());
        ps.execute();

        // wpt.setName();
        // wpt.setTime(GeocacheUtils.parseDate(element.getElementsByTag("time")
        // .text()));
        // wpt.setUrl(new URL(element.getElementsByTag("url").text()));
        // wpt.setType0(element.getElementsByTag("type").text());
        // wpt.setUrlname(element.getElementsByTag("urlname").text());
        // wpt.setSym(element.getElementsByTag("sym").text());
        // wpt.setCmt(element.getElementsByTag("cmt").text());
        //
        // Coordinate coord = EgeoFactory.eINSTANCE.createCoordinate();
        // coord.setLat(new BigDecimal(element.attr("lat")));
        // coord.setLon(new BigDecimal(element.attr("lon")));
        // wpt.setCoord(coord);
    }
}
