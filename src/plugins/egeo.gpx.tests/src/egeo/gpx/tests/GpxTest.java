package egeo.gpx.tests;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.xml.stream.XMLResolver;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.junit.Test;

import egeo.gpx.DocumentRoot;
import egeo.gpx.impl.DocumentRootImpl;

public class GpxTest {

	@Test
	public void testLoadGpx() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();

		File file = new File("/home/jesperes/Downloads/GC3D74N.gpx");
		URI uri = URI.createFileURI(file.getAbsolutePath());

		Registry registry = resourceSet.getPackageRegistry();

		System.out.println(registry);

		Resource resource = resourceSet.createResource(uri);
		Map<String, Object> map = new HashMap<String, Object>();
		resource.load(map);

		
		// Validate the contents of the loaded resource.
		//
		for (EObject eObject : resource.getContents()) {
			Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
			if (diagnostic.getSeverity() != Diagnostic.OK) {
				printDiagnostic(diagnostic, "");
			}
		}


		for (EObject obj: resource.getContents()) {
			DocumentRoot root = (DocumentRoot) obj;			
			System.out.println(obj);
		}
		
	}

	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}
}
