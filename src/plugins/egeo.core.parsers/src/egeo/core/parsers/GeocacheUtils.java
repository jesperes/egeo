package egeo.core.parsers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import egeo.Coordinate;
import egeo.Geocache;
import egeo.Log;
import egeo.Waypoint;

public class GeocacheUtils {

	private static String formatDDD_MM_MMM(double l) {
		if (l < 0)
			l = -l;

		double ddd = Math.floor(l);
		double mm = l - ddd;

		return String.format(Locale.US, "%02d %.03f", (int) ddd, mm * 60);
	}

	public static String formatCoordinate(double lat, double lon) {
		return String.format("%s%s %s%s", (lat < 0) ? "S" : "N",
				formatDDD_MM_MMM(lat), (lon < 0) ? "W" : "E",
				formatDDD_MM_MMM(lon));

	}

	public static String formatCoordinate(Coordinate coord) {
		double lat = coord.getLat().doubleValue();
		double lon = coord.getLon().doubleValue();
		return formatCoordinate(lat, lon);
	}

	public static Date parseDate(String str) {
		// 2006-08-09T07:00:00Z
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		try {
			// Ignore everything after the leading 'T'
			String datestr = str.substring(0, str.indexOf('T'));
			return format.parse(datestr);
		} catch (java.text.ParseException e) {
			e.printStackTrace();
			return new Date();
		}
	}

	public static void printCache(Waypoint wpt) {

		System.out.println("Waypoint info:");
		System.out.println("  Name: " + wpt.getName());
		System.out.println("  Time: " + wpt.getTime());
		System.out.println("  Comment: " + wpt.getCmt());
		System.out.println("  Type: " + wpt.getType0());
		System.out.println("  Symbol: " + wpt.getSym());
		System.out.println("  URL: " + wpt.getUrl());
		System.out.println("  URL name: " + wpt.getUrlname());
		System.out.println("  Coordinate: " + formatCoordinate(wpt.getCoord()));
		System.out.println("  Updated: " + wpt.getLastUpdate());

		if (wpt instanceof Geocache) {
			Geocache cache = (Geocache) wpt;

			System.out.println("  Geocache info:");

			System.out.println("    D/T: " + cache.getDifficulty() + "/"
					+ cache.getTerrain());
			System.out.println("    Available/archived: " + cache.isAvailable()
					+ "/" + cache.isArchived());
			System.out.println("    Container: " + cache.getContainerType());
			System.out.println("    Owner: " + cache.getOwner().getName());
			System.out.println("    Placed by: " + cache.getPlacedBy());
			System.out.println("    Cache type: " + cache.getCacheType());
			System.out.println("    Country: " + cache.getCountry());
			System.out.println("    State: " + cache.getState());
			System.out.println("    Attributes (enabled): "
					+ cache.getEnabledAttributes());
			System.out.println("    Attributes (disabled): "
					+ cache.getDisabledAttributes());
			System.out.format("    Short description (%s): %s\n", cache
					.getShortText().isHtml() ? "HTML" : "text", cache
					.getShortText().getText());
			System.out.format("    Long description (%s): %s\n", cache
					.getLongText().isHtml() ? "HTML" : "text", cache
					.getLongText().getText());
			System.out.println("    Logs:");
			for (Log log : cache.getLogs()) {
				System.out.format("      [%s] (%s) %s\n", log.getLogType(), log
						.getFinder().getName(), log.getText());
			}
		}
	}
}
