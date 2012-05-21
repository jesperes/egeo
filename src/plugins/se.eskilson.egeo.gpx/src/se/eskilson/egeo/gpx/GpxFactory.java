package se.eskilson.egeo.gpx;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import se.eskilson.egeo.CacheDB;
import se.eskilson.egeo.EgeoFactory;
import se.eskilson.egeo.ICacheImporter;

public class GpxFactory implements Resource.Factory {

	@Override
	public Resource createResource(URI uri) {

		/*
		 * TODO this is the place to start when implementing support for other formats
		 * than GPX.
		 */
		
		Resource res = new ResourceImpl(uri);

		ICacheImporter importer = new GpxParser();
		
		CacheDB db = EgeoFactory.eINSTANCE.createCacheDB();
		
		importer.importCaches(db, uri);
		
		res.getContents().add(db);
		
		return res;
	}
}
