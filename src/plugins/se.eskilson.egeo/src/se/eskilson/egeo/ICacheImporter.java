package se.eskilson.egeo;

import org.eclipse.emf.common.util.URI;

public interface ICacheImporter {

	public void importCaches(CacheDB db, URI source);
}
