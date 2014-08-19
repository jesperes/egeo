package egeo.database;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GeocacheUtils {

    private static String formatDDD_MM_MMM(double l, int w) {
        if (l < 0)
            l = -l;

        double ddd = Math.floor(l);
        double mm = l - ddd;

        if (w == 2)
            return String.format(Locale.US, "%02d\u00B0 %06.03f", (int) ddd,
                    mm * 60);
        else
            return String.format(Locale.US, "%03d\u00B0 %06.03f", (int) ddd,
                    mm * 60);
    }

    public static String formatCoordinate(double lat, double lon) {
        return String.format("%s%s %s%s", (lat < 0) ? "S" : "N",
                formatDDD_MM_MMM(lat, 2), (lon < 0) ? "W" : "E",
                formatDDD_MM_MMM(lon, 3));

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
}
