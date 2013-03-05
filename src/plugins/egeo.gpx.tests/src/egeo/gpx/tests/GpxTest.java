package egeo.gpx.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Before;
import org.junit.Test;

import egeo.gpx.DocumentRoot;
import egeo.gpx.GpxPackage;
import egeo.gpx.WptType;
import egeo.gpx.groundspeak.CacheType;
import egeo.gpx.groundspeak.GroundspeakPackage;
import egeo.gpx.util.GpxResourceFactoryImpl;

public class GpxTest {

	@Before
	public void setup() {
		GpxPackage.eINSTANCE.getEFactoryInstance();
		GroundspeakPackage.eINSTANCE.getEFactoryInstance();
	}

	@Test
	public void testLoadGpx() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri;

		if (Platform.isRunning())
			uri = URI.createPlatformPluginURI("/egeo.gpx.tests/5110831.gpx",
					false);
		else
			// uri = URI.createFileURI("5110831.gpx");
			uri = URI
					.createFileURI("c:/Users/jesperes/Documents/Waypoints.gpx");

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("gpx", new GpxResourceFactoryImpl());

		Resource resource = resourceSet.createResource(uri);
		Map<String, Object> map = new HashMap<String, Object>();
		long t0 = System.nanoTime();
		resource.load(map);
		long t1 = System.nanoTime();

		System.out.println("Loaded " + uri + " in " + (double) (t1 - t0)
				/ 1000000000 + " seconds");

		for (EObject eObject : resource.getContents()) {
			Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
			if (diagnostic.getSeverity() != Diagnostic.OK) {
				printDiagnostic(diagnostic, "");
			}
		}

		t0 = System.nanoTime();

		DocumentRoot root = (DocumentRoot) resource.getContents().get(0);
		for (WptType wpt : root.getGpx().getWpt()) {
			if (wpt.getAny().size() > 0) {
				CacheType cache = (CacheType) wpt.getAny().get(0).getValue();
				// System.out.println("Cache: " + cache.getName());

				// for (LogType logs : cache.getLogs().get(0).getLog()) {
				// System.out.format("Log [%s: %s]: %s\n", logs.getFinder()
				// .get(0).getValue(), logs.getType(), logs.getText()
				// .get(0).getValue());
				// }

				// System.out.println();
			}
		}

		t1 = System.nanoTime();

		System.out.println("Caches: " + root.getGpx().getWpt().size());
		System.out.println("Printed descriptions in " + (t1 - t0) / 100000000.0
				+ " seconds.");
		System.out.flush();
	}

	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}
}
