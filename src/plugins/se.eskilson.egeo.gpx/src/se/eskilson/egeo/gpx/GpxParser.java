package se.eskilson.egeo.gpx;

import java.io.IOException;
import java.io.InputStream;

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
import se.eskilson.egeo.EgeoFactory;
import se.eskilson.egeo.ICacheImporter;

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

		for (int i = 0; i < node.getChildNodes().getLength(); i++) {
			Node attr = node.getChildNodes().item(i);
			String name = attr.getNodeName();
			if (name.equals("desc")) {
				cache.setDescription(attr.getTextContent());
			} else if (name.equals("name")) {
				cache.setCode(attr.getTextContent());
			}
		}
	}
}
