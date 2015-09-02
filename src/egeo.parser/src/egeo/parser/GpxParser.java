package egeo.parser;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class GpxParser {

	public GpxParser() {
		super();
	}

	public static void main(String[] args) throws DOMException, Exception {
		File f = new File("/home/jesperes/Downloads/5982344_Uppsala.gpx");

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new InputSource(new FileInputStream(f)));

		GpxParser parser = new GpxParser();

		GeocacheDatabase db = parser.parse(doc);

		for (Geocache geocache : db.caches) {
			System.out.println(geocache);
		}
		for (User user : db.users.values()) {
			System.out.println(user);
		}
	}

	private GeocacheDatabase parse(Document doc) throws DOMException, Exception {
		Element gpxElement = doc.getDocumentElement();
		NodeList waypoints = gpxElement.getElementsByTagName("wpt");

		GeocacheDatabase db = new GeocacheDatabase();

		for (int i = 0; i < waypoints.getLength(); i++) {
			parseWaypoint(db, (Element) waypoints.item(i));
		}

		return db;
	}

	private Geocache parseWaypoint(GeocacheDatabase db, Element wpt) throws DOMException, Exception {
		Geocache gc = new Geocache();

		gc.lat = wpt.getAttribute("lat");
		gc.lon = wpt.getAttribute("lon");
		gc.gccode = wpt.getElementsByTagName("name").item(0).getTextContent();
		gc.name = wpt.getElementsByTagName("urlname").item(0).getTextContent();
		gc.url = wpt.getElementsByTagName("url").item(0).getTextContent();
		gc.time = wpt.getElementsByTagName("time").item(0).getTextContent();

		Element gspk = (Element) wpt.getElementsByTagName("groundspeak:cache").item(0);
		gc.id = Long.valueOf(gspk.getAttribute("id"));
		gc.available = Boolean.parseBoolean(gspk.getAttribute("available"));
		gc.archived = Boolean.parseBoolean(gspk.getAttribute("archived"));
		gc.placedBy = gspk.getElementsByTagName("groundspeak:placed_by").item(0).getTextContent();

		gc.owner = parseOwner((Element) gspk.getElementsByTagName("groundspeak:owner").item(0));
		db.caches.add(gc);
		db.users.put(gc.owner.id, gc.owner);

		gc.type = parseType(gspk.getElementsByTagName("groundspeak:type").item(0).getTextContent());
		gc.container = parseSize(gspk.getElementsByTagName("groundspeak:container").item(0).getTextContent());
		return gc;
	}

	private GcType parseType(String text) throws Exception {
		switch (text) {
		case "Traditional Cache":
			return GcType.Traditional;
		case "Unknown Cache":
			return GcType.Unknown;
		case "Multi-cache":
			return GcType.Multi;
		case "Wherigo Cache":
			return GcType.Wherigo;
		case "Letterbox Hybrid":
			return GcType.LetterboxHybrid;
		case "Event Cache":
			return GcType.Event;
		default:
			throw new Exception("unknown gc type " + text);
		}
	}

	private GcContainer parseSize(String text) throws Exception {
		switch (text) {
		case "Small":
			return GcContainer.Small;
		case "Micro":
			return GcContainer.Micro;
		case "Regular":
			return GcContainer.Regular;
		case "Large":
			return GcContainer.Large;
		case "Not chosen":
			return GcContainer.NotChosen;
		case "Other":
			return GcContainer.Other;
		default:
			throw new Exception("unknown container type " + text);
		}
	}

	private User parseOwner(Element item) {
		User owner = new User();
		owner.name = item.getTextContent();
		owner.id = Long.valueOf(item.getAttribute("id"));
		return owner;
	}
}
