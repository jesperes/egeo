package egeo.gpx.tests;

import java.io.File;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;

public class GpxTest {

	@Test
	public void testLoadGpx() {
		ResourceSet resourceSet = new ResourceSetImpl();

		File file = new File("C:\\Users\\jesperes\\Downloads\\GC459Y1.gpx");
		URI uri = URI.createFileURI(file.getAbsolutePath());

		try {
			// Demand load resource for this file.
			//
			Resource resource = resourceSet.getResource(uri, true);
			System.out.println("Loaded " + uri);

			// Validate the contents of the loaded resource.
			//
			for (EObject eObject : resource.getContents()) {
				Diagnostic diagnostic = Diagnostician.INSTANCE
						.validate(eObject);
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					printDiagnostic(diagnostic, "");
				}
			}
		} catch (Exception exception) {
			System.out.println("Problem loading " + uri);
			exception.printStackTrace();
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
