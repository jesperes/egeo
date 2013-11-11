package egeo.core;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class GpxParser {
	static class EventHandler extends DefaultHandler {

		@Override
		public void characters(char[] ch, int start, int length)
				throws SAXException {
			String s = new String(ch, start, length);
			System.out.format("characters = %s\n", s);
		}

		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			System.out.format("endElement: uri=%s, localName=%s, qName=%s\n",
					uri, localName, qName);
		}

		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attrs) throws SAXException {
			System.out.format("startElement: uri=%s, localName=%s, qName=%s\n",
					uri, localName, qName);
		}
	}

	public GpxParser(InputStream stream) throws ParserConfigurationException,
			SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();

		SAXParser parser = factory.newSAXParser();
		EventHandler handler = new EventHandler();
		parser.parse(stream, handler);
	}
}
