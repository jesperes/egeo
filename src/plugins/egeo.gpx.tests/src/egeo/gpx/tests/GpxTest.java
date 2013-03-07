package egeo.gpx.tests;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.Test;

import egeo.Geocache;
import egeo.core.GpxLoader;
import egeo.gpx.DocumentRoot;
import egeo.gpx.GpxPackage;
import egeo.gpx.groundspeak.GroundspeakPackage;
import egeo.gpx.util.GpxResourceFactoryImpl;

public class GpxTest {

	private DocumentRoot root;

	@Before
	public void setup() throws IOException {
		GpxPackage.eINSTANCE.getEFactoryInstance();
		GroundspeakPackage.eINSTANCE.getEFactoryInstance();

		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri;

		if (Platform.isRunning())
			uri = URI.createPlatformPluginURI("/egeo.gpx.tests/5110831.gpx",
					false);
		else
			uri = URI.createFileURI("5110831.gpx");

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("gpx", new GpxResourceFactoryImpl());

		Resource resource = resourceSet.createResource(uri);
		Map<String, Object> map = new HashMap<String, Object>();
		resource.load(map);

		root = (DocumentRoot) resource.getContents().get(0);
	}

	@Test
	public void testConvertGpx() throws IOException {
		Collection<Geocache> caches = GpxLoader.loadGpx(root.getGpx());
		for (Geocache cache : caches) {
			System.out.format("%s (%s)\n", cache.getName(), cache.getCoord());
		}

		System.out.println(caches.size());
	}
}
