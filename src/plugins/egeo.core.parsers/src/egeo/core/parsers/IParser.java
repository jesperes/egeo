package egeo.core.parsers;

import java.io.File;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;

import egeo.Waypoint;

public interface IParser {

	Collection<Waypoint> parse(URI input) throws ParseException;

	Collection<Waypoint> parse(File input) throws ParseException;
}
