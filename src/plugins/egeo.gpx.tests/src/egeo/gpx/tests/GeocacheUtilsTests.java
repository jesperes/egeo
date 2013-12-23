package egeo.gpx.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import egeo.core.parsers.GeocacheUtils;

public class GeocacheUtilsTests {

	@Test
	public void testFormatCoordinate() {
		Assert.assertEquals("N37 35.842 W122 21.939",
				GeocacheUtils.formatCoordinate(37.597367, -122.36565));
	}

	@Test
	public void testParseDate() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse("2013-12-23");
		Assert.assertEquals(d,
				GeocacheUtils.parseDate("2013-12-23T14:12:26.5488002Z"));
	}
}
