package egeo.gpx.tests;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

import egeo.core.GpxParser;

public class GpxSaxTest {
	URI uri;

	@Before
	public void setup() {
		if (Platform.isRunning())
			uri = URI.createPlatformPluginURI("/egeo.gpx.tests/5110831.gpx",
					false);
		else
			uri = URI.createFileURI("5110831.gpx");

		uri = CommonPlugin.resolve(uri);
		System.out.println("Gpx: " + uri.path());
	}

	@Test
	public void testSaxParser() throws IOException,
			ParserConfigurationException, SAXException, IOException {
		new GpxParser(new FileInputStream(uri.path()));
	}

}
