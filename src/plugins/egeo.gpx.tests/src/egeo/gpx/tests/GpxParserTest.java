package egeo.gpx.tests;

import java.io.File;

import org.junit.Test;

import egeo.CacheDatabase;
import egeo.EgeoFactory;
import egeo.core.parsers.ParseException;
import egeo.core.parsers.gpx.GpxParser;

public class GpxParserTest {

	// File file = new File("C:/Users/jesperes/Documents/Waypoints.gpx");
	File file = new File("5110831.gpx");

	@Test
	public void testMyFindsImport() throws ParseException {
		CacheDatabase db = EgeoFactory.eINSTANCE.createCacheDatabase();
		new GpxParser().parse(file, db);
	}
}
