package egeo.gpx.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import egeo.core.parsers.GeocacheUtils;

public class GeocacheUtilsTests {

	private static final Logger logger = Logger
			.getLogger(GeocacheUtilsTests.class);

	@Test
	public void testFormatCoordinate() {
		logger.debug("HERE!");

		Assert.assertEquals("N37\u00b0 35.842 W122\u00b0 21.939",
				GeocacheUtils.formatCoordinate(37.597367, -122.36565));
		Assert.assertEquals("N59\u00b0 58.011 E017\u00b0 02.236",
				GeocacheUtils.formatCoordinate(59.966850, 17.037267));
	}

	@Test
	public void testParseDate() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse("2013-12-23");
		Assert.assertEquals(d,
				GeocacheUtils.parseDate("2013-12-23T14:12:26.5488002Z"));
	}
}
