package egeo.core.parsers;

import java.io.File;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;

import egeo.Geocache;

public interface IParser {

	Collection<Geocache> parse(URI input) throws ParseException;

	Collection<Geocache> parse(File input) throws ParseException;
}
