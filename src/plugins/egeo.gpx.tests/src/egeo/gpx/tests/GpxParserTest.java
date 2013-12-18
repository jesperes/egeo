package egeo.gpx.tests;

import java.io.File;
import java.util.Collection;

import org.junit.Test;

import egeo.Geocache;
import egeo.core.parsers.IParser;
import egeo.core.parsers.ParseException;
import egeo.core.parsers.gpx.GpxParser;

public class GpxParserTest {

	File file = new File("C:/Users/jesperes/Documents/Waypoints.gpx");

	@Test
	public void testMyFindsImport() throws ParseException {
		IParser p = new GpxParser();
		Collection<Geocache> caches = p.parse(file);

		System.out.println("Caches imported: " + caches.size());
	}
}
