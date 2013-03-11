package egeo.ui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;

import egeo.Coordinate;
import egeo.Geocache;
import egeo.core.GpxLoader;
import egeo.gpx.DocumentRoot;
import egeo.ui.MapWidget.PointD;

public class MapView extends ViewPart {

    private MapWidget mapWidget;
    private Collection<Geocache> caches = Collections.emptyList();
    private final Collection<Geocache> visibleCaches = new ArrayList<Geocache>();
    Coordinate center;
    // String gpx = "GC3X94J.gpx";
    String gpx = "5982344_Uppsala.gpx";
    // String gpx = "5110831.gpx";
    private final CacheIconFactory iconFactory;

    public MapView() {
        iconFactory = CacheIconFactory.getInstance();

        ResourceSet resourceSet = new ResourceSetImpl();
        URI uri = URI.createPlatformPluginURI("/egeo.ui/" + gpx, false);
        Resource resource = resourceSet.createResource(uri);
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            resource.load(map);
            DocumentRoot root = (DocumentRoot) resource.getContents().get(0);
            caches = GpxLoader.loadGpx(root.getGpx());
            Geocache cache = caches.iterator().next();
            center = cache.getCoord();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createPartControl(Composite parent) {
        mapWidget = new MapWidget(parent, SWT.NONE);
        mapWidget.addPaintListener(new PaintListener() {
            @Override
            public void paintControl(PaintEvent e) {
                Point mapPosition = mapWidget.getMapPosition();
                for (Geocache cache : visibleCaches) {
                    Coordinate coord = cache.getCoord();
                    PointD point = new PointD(coord.getLon().doubleValue(),
                            coord.getLat().doubleValue());
                    Point cachePos = mapWidget.computePosition(point);

                    Point p = new Point(cachePos.x - mapPosition.x, cachePos.y
                            - mapPosition.y);

                    Image image = iconFactory.getIcon(cache.getCacheType());
                    if (image != null) {
                        Rectangle bounds = image.getBounds();

                        e.gc.setForeground(Display.getCurrent().getSystemColor(
                                SWT.COLOR_BLACK));
                        e.gc.setBackground(Display.getCurrent().getSystemColor(
                                SWT.COLOR_WHITE));

                        int margin = 2;
                        int rounded = 6;
                        Rectangle frame = new Rectangle( //
                                p.x - bounds.width / 2 - margin, //
                                p.y - bounds.height / 2 - margin, //
                                bounds.width + margin * 2 - 1, //
                                bounds.height + margin * 2 - 1 //
                        );

                        e.gc.fillRoundRectangle(frame.x, frame.y, frame.width,
                                frame.height, rounded, rounded);

                        e.gc.drawRoundRectangle(frame.x, frame.y, frame.width,
                                frame.height, rounded, rounded);

                        e.gc.drawImage(image, p.x - bounds.width / 2, p.y
                                - bounds.height / 2);

                    }
                }
            }
        });

        mapWidget.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent arg0) {
                // System.out.println(arg0.getPropertyName() + ": "
                // + arg0.getNewValue());
                if (!arg0.getPropertyName().equals("mapPosition"))
                    return;

                Point mapPosition = (Point) arg0.getNewValue();

                visibleCaches.clear();

                for (Geocache cache : caches) {
                    Coordinate coord = cache.getCoord();
                    PointD point = new PointD(coord.getLon().doubleValue(),
                            coord.getLat().doubleValue());
                    Point cachePos = mapWidget.computePosition(point);

                    Point mapSize = mapWidget.getSize();
                    Rectangle visibleMap = new Rectangle(mapPosition.x,
                            mapPosition.y, mapSize.x, mapSize.y);

                    if (visibleMap.contains(cachePos)) {
                        visibleCaches.add(cache);
                    }
                }
            }
        });
    }

    @Override
    public void setFocus() {
        mapWidget.setFocus();
        Point pos = mapWidget.computePosition(new PointD(center.getLon()
                .doubleValue(), center.getLat().doubleValue()));
        mapWidget.setCenterPosition(pos);
    }
}