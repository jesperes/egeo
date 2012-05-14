package se.eskilson.egeo.gpx;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import se.eskilson.egeo.Database;
import se.eskilson.egeo.EgeoFactory;

public class GpxFactory implements Resource.Factory {

	@Override
	public Resource createResource(URI uri) {
		// TODO Parse gpx file pointed to by uri

		Database db = EgeoFactory.eINSTANCE.createDatabase();

		Resource res;
		return res;
	}
}
