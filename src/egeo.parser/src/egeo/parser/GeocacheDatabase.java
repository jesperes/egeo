package egeo.parser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GeocacheDatabase {
	Collection<Geocache> caches = new ArrayList<>();
	Map<Long, User> users = new HashMap<>();
}
