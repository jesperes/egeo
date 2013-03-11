package egeo.core;

import java.util.ArrayList;
import java.util.Collection;

import egeo.Coordinate;
import egeo.EgeoFactory;
import egeo.Geocache;
import egeo.User;
import egeo.gpx.GpxType;
import egeo.gpx.WptType;
import egeo.gpx.groundspeak.CacheType;
import egeo.gpx.groundspeak.OwnerType;

public class GpxLoader {
    static EgeoFactory f = EgeoFactory.eINSTANCE;

    private static User getUser(OwnerType owner) {
        User user = EgeoFactory.eINSTANCE.createUser();
        user.setName(owner.getValue());
        user.setUserId(Long.valueOf(owner.getId()));
        return user;
    }

    private static CacheType getGroundspeakExt(WptType wpt) {
        if (wpt.getAny().size() > 0) {
            Object any = wpt.getAny().get(0).getValue();
            if (any instanceof CacheType) {
                // has groundspeak extensions
                return (CacheType) any;
            }
        }

        return null;
    }

    private static Coordinate getCoordinate(WptType wpt) {
        Coordinate coord = f.createCoordinate();
        coord.setLat(wpt.getLat());
        coord.setLon(wpt.getLon());
        return coord;
    }

    public static Collection<Geocache> loadGpx(GpxType gpx) {

        ArrayList<Geocache> list = new ArrayList<Geocache>();

        for (WptType wpt : gpx.getWpt()) {
            Geocache cache = f.createGeocache();
            list.add(cache);

            cache.setCode(wpt.getName());
            cache.setCoord(getCoordinate(wpt));

            CacheType gscache = getGroundspeakExt(wpt);
            if (gscache != null) {
                cache.setName(gscache.getName());
                cache.setPlacedBy(gscache.getPlacedBy());
                cache.setOwner(getUser(gscache.getOwner().get(0)));

                String type = gscache.getType();
                if (type.equals("Traditional Cache"))
                    cache.setCacheType(egeo.CacheType.TRADITIONAL);
                else if (type.equals("Unknown Cache"))
                    cache.setCacheType(egeo.CacheType.UNKNOWN);
                else if (type.equals("Multi-cache"))
                    cache.setCacheType(egeo.CacheType.MULTI);
                else if (type.equals("Event Cache"))
                    cache.setCacheType(egeo.CacheType.EVENT);
            }
        }

        return list;
    }
}
