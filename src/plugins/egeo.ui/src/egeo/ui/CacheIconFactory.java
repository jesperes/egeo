package egeo.ui;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import egeo.CacheType;

public class CacheIconFactory {

    enum IconType {
        Found("http://www.geocaching.com/images/logtypes/2.png"),
        DNF("http://www.geocaching.com/images/logtypes/3.png"),
        Note("http://www.geocaching.com/images/logtypes/4.png"),
        Archived("http://www.geocaching.com/images/logtypes/5.png"),
        NeedsArchived("http://www.geocaching.com/images/logtypes/7.png"),
        WillAttend("http://www.geocaching.com/images/logtypes/9.png"),
        Attended("http://www.geocaching.com/images/logtypes/10.png"),
        Photo("http://www.geocaching.com/images/logtypes/11.png"),
        ReviewerNote("http://www.geocaching.com/images/logtypes/18.png"),
        Disabled("http://www.geocaching.com/images/logtypes/22.png"),
        Enabled("http://www.geocaching.com/images/logtypes/23.png"),
        Published("http://www.geocaching.com/images/logtypes/24.png"),
        Retracted("http://www.geocaching.com/images/logtypes/25.png"),
        NeedsMaintenance("http://www.geocaching.com/images/logtypes/45.png"),
        PerformedMaintenance("http://www.geocaching.com/images/logtypes/46.png"),
        CoordUpdate("http://www.geocaching.com/images/logtypes/47.png"),
        Announcement("http://www.geocaching.com/images/logtypes/74.png"),
        Traditional("http://www.geocaching.com/images/WptTypes/2.gif"),
        Multi("http://www.geocaching.com/images/WptTypes/3.gif"),
        Ape("http://www.geocaching.com/images/WptTypes/32.gif"),
        Unknown("http://www.geocaching.com/images/WptTypes/8.gif"),
        LetterboxHybrid("http://www.geocaching.com/images/WptTypes/5.gif"),
        Wherigo("http://www.geocaching.com/images/WptTypes/1858.gif"),
        Event("http://www.geocaching.com/images/WptTypes/6.gif"),
        Mega("http://www.geocaching.com/images/WptTypes/mega.gif"),
        Cito("http://www.geocaching.com/images/WptTypes/13.gif"),
        EarthCache("http://www.geocaching.com/images/WptTypes/earthcache.gif"),
        HQ("http://www.geocaching.com/images/WptTypes/HQ_32.gif"),
        GPSAdvExhibit("http://www.geocaching.com/images/WptTypes/1304.gif");

        IconType(String url) {

        }
    }

    private static CacheIconFactory instance;

    private final Map<CacheType, URL> geocacheTypeUrlMap = new HashMap<CacheType, URL>();
    private final Map<CacheType, Image> geocacheIconCache = new HashMap<CacheType, Image>();

    private CacheIconFactory() {
        try {
            geocacheTypeUrlMap.put(CacheType.TRADITIONAL, new URL(
                    "http://www.geocaching.com/images/WptTypes/sm/2.gif"));
            geocacheTypeUrlMap.put(CacheType.MULTI, new URL(
                    "http://www.geocaching.com/images/WptTypes/sm/3.gif"));
            geocacheTypeUrlMap.put(CacheType.UNKNOWN, new URL(
                    "http://www.geocaching.com/images/WptTypes/sm/8.gif"));
            geocacheTypeUrlMap.put(CacheType.EVENT, new URL(
                    "http://www.geocaching.com/images/WptTypes/sm/6.gif"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public Image getIcon(CacheType type) {
        Image image = geocacheIconCache.get(type);
        if (image == null) {
            try {
                URL url = geocacheTypeUrlMap.get(type);
                image = new Image(Display.getCurrent(), url.openStream());
                geocacheIconCache.put(type, image);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        return geocacheIconCache.get(type);
    }

    public static CacheIconFactory getInstance() {
        if (instance == null)
            instance = new CacheIconFactory();

        return instance;
    }

    public void dispose() {
        for (Image image : geocacheIconCache.values()) {
            image.dispose();
        }

        geocacheIconCache.clear();
        instance = null;
    }
}
