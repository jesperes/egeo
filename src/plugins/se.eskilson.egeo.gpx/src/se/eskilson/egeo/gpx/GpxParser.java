package se.eskilson.egeo.gpx;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import se.eskilson.egeo.Cache;
import se.eskilson.egeo.CacheDB;
import se.eskilson.egeo.Coordinate;
import se.eskilson.egeo.EgeoFactory;
import se.eskilson.egeo.ICacheImporter;
import se.eskilson.egeo.User;

public class GpxParser implements ICacheImporter {

	@Override
	public void importCaches(CacheDB db, URI source) {
		URIConverter conv = new ExtensibleURIConverterImpl();

		try {
			System.out.println(conv.normalize(source));
			InputStream is = conv.createInputStream(source);

			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(is);

			Node gpx = doc.getFirstChild();
			NodeList gpxChildren = gpx.getChildNodes();

			for (int i = 0; i < gpxChildren.getLength(); i++) {
				Node node = gpxChildren.item(i);
				String name = node.getNodeName();

				if (name.equals("#text"))
					continue;

				if (name.equals("wpt"))
					addCache(db, node);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}

	private void addCache(CacheDB db, Node node) {
		Cache cache = EgeoFactory.eINSTANCE.createCache();
		db.getCaches().add(cache);

		Double lat = Double.valueOf(node.getAttributes().getNamedItem("lat")
				.getNodeValue());
		Double lon = Double.valueOf(node.getAttributes().getNamedItem("lon")
				.getNodeValue());

		Coordinate coord = EgeoFactory.eINSTANCE.createCoordinate();
		coord.setLatitude(lat);
		coord.setLongitude(lon);
		cache.setCoordinate(coord);

		for (int i = 0; i < node.getChildNodes().getLength(); i++) {
			Node child = node.getChildNodes().item(i);
			String name = child.getNodeName();
			String text = child.getTextContent();
			if (name.equals("desc")) {
				cache.setDescription(text);
			} else if (name.equals("name")) {
				cache.setCode(text);
			} else if (name.equals("time")) {
				try {
					cache.setTime(DateFormat.getInstance().parse(text));
				} catch (ParseException e) {
					System.out.println("Failed to parse date: " + text);
				}
			} else if (name.equals("groundspeak:cache")) {
				addGroundspeakInfo(db, cache, child);
			}
		}
	}

	private User getUser(CacheDB db, String name, int userid) {
		User user = EgeoFactory.eINSTANCE.createUser();
		user.setName(name);
		user.setUserId(userid);
		return user;
	}

	private void addGroundspeakInfo(CacheDB db, Cache cache, Node node) {
		for (int i = 0; i < node.getChildNodes().getLength(); i++) {
			Node child = node.getChildNodes().item(i);
			String name = child.getNodeName();
			String text = child.getTextContent();

			if (name.equals("groundspeak:name"))
				cache.setName(text);
			else if (name.equals("groundspeak:placed_by")) {
				cache.setPlacedBy(text);
			} else if (name.equals("groundspeak:owner")) {
				int userid = Integer.valueOf(child.getAttributes()
						.getNamedItem("id").getNodeValue());
				cache.setOwnedBy(getUser(db, text, userid));
			}
		}
	}
}
