package egeo.core.parsers;

import java.io.File;

import egeo.CacheDatabase;

public interface IParser {

	void parse(File input, CacheDatabase db) throws ParseException;

}
