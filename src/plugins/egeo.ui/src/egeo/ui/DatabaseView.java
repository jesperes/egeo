package egeo.ui;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import egeo.CacheDatabase;
import egeo.EgeoFactory;
import egeo.Geocache;
import egeo.core.GpxLoader;
import egeo.gpx.DocumentRoot;
import egeo.provider.EgeoItemProviderAdapterFactory;

public class DatabaseView extends ViewPart {

    private final ComposedAdapterFactory adapterFactory;
    private TreeViewer viewer;
    private final static CacheDatabase db = EgeoFactory.eINSTANCE
            .createCacheDatabase();

    // String gpx = "GC3X94J.gpx";
    // String gpx = "5110831.gpx";
    static String gpx = "5982344_Uppsala.gpx";

    public static CacheDatabase getDefaultDatabase() {
        return db;
    }

    static {
        loadDatabase();
    }

    private static void loadDatabase() {
        System.out.println("Loading cache database...");

        ResourceSet resourceSet = new ResourceSetImpl();
        URI uri = URI.createPlatformPluginURI("/egeo.ui/" + gpx, false);
        Resource resource = resourceSet.createResource(uri);
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            resource.load(map);
            DocumentRoot root = (DocumentRoot) resource.getContents().get(0);
            Collection<Geocache> caches = GpxLoader.loadGpx(root.getGpx());
            db.getCaches().addAll(caches);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done.");
    }

    public DatabaseView() {
        adapterFactory = new ComposedAdapterFactory();
        adapterFactory.addAdapterFactory(new EgeoItemProviderAdapterFactory());
    }

    @Override
    public void createPartControl(Composite parent) {
        viewer = new TreeViewer(parent, SWT.NONE);
        viewer.setContentProvider(new AdapterFactoryContentProvider(
                adapterFactory));
        viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
        viewer.setInput(db);
    }

    @Override
    public void setFocus() {
        viewer.getControl().setFocus();
    }
}
