package egeo.gpx.tests;

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
	public void testParseDate() {
		Date d = new Date();
		d.setYear(2013);
		d.setMonth(11);
		d.setDate(23);
		d.setHours(14);
		d.setMinutes(12);
		d.setSeconds(26);
		System.out.println(d);
		Assert.assertEquals(d,
				GeocacheUtils.parseDate("2013-12-23T14:12:26.5488002Z"));
	}
}
