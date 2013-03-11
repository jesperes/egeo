package egeo.ui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.progress.UIJob;

import egeo.Coordinate;
import egeo.Geocache;
import egeo.ui.MapWidget.PointD;

public class MapView extends ViewPart {

    private MapWidget mapWidget;
    private final Collection<Geocache> visibleCaches = new ArrayList<Geocache>();
    Coordinate center;
    // String gpx = "GC3X94J.gpx";
    String gpx = "5982344_Uppsala.gpx";
    // String gpx = "5110831.gpx";
    private final CacheIconFactory iconFactory;

    int CACHE_UPDATE_DELAY = 250;

    Image cacheLayer = null;

    Job cacheLayerUpdateJob = new UIJob("Updating caches") {
        @Override
        public IStatus runInUIThread(IProgressMonitor monitor) {
            updateCacheLayer();
            return Status.OK_STATUS;
        }
    };

    public MapView() {
        iconFactory = CacheIconFactory.getInstance();
    }

    private void updateCacheLayer() {
        if (cacheLayer != null) {
            cacheLayer.dispose();
        }

        cacheLayer = new Image(mapWidget.getDisplay(), mapWidget.getBounds());
        ImageData imageData = cacheLayer.getImageData();
        int whitePixel = imageData.palette.getPixel(new RGB(255, 255, 255));
        imageData.transparentPixel = whitePixel;

        GC gc = new GC(cacheLayer);
        Point mapPosition = mapWidget.getMapPosition();

        try {
            gc.setForeground(Display.getCurrent().getSystemColor(
                    SWT.COLOR_BLACK));
            gc.setBackground(Display.getCurrent().getSystemColor(
                    SWT.COLOR_YELLOW));

            for (Geocache cache : visibleCaches) {
                Coordinate coord = cache.getCoord();
                PointD point = new PointD(coord.getLon().doubleValue(), coord
                        .getLat().doubleValue());
                Point cachePos = mapWidget.computePosition(point);

                Point p = new Point(cachePos.x - mapPosition.x, cachePos.y
                        - mapPosition.y);

                Image image = iconFactory.getIcon(cache.getCacheType());
                if (image != null) {
                    Rectangle bounds = image.getBounds();

                    int margin = 2;
                    int rounded = 6;
                    Rectangle frame = new Rectangle( //
                            p.x - bounds.width / 2 - margin, //
                            p.y - bounds.height / 2 - margin, //
                            bounds.width + margin * 2 - 1, //
                            bounds.height + margin * 2 - 1 //
                    );

                    gc.fillRoundRectangle(frame.x, frame.y, frame.width,
                            frame.height, rounded, rounded);

                    gc.drawRoundRectangle(frame.x, frame.y, frame.width,
                            frame.height, rounded, rounded);

                    gc.drawImage(image, p.x - bounds.width / 2, p.y
                            - bounds.height / 2);

                }
            }

            mapWidget.redraw();
        } finally {
            gc.dispose();
        }
    }

    @Override
    public void createPartControl(Composite parent) {
        mapWidget = new MapWidget(parent, SWT.NONE);
        mapWidget.addPaintListener(new PaintListener() {
            @Override
            public void paintControl(PaintEvent e) {
                if (cacheLayer == null)
                    return;

                e.gc.drawImage(cacheLayer, 0, 0);
            }
        });

        getSite().getWorkbenchWindow().getSelectionService()
                .addSelectionListener(new ISelectionListener() {
                    @Override
                    public void selectionChanged(IWorkbenchPart part,
                            ISelection selection) {
                        if (part != MapView.this
                                && selection instanceof IStructuredSelection) {
                            IStructuredSelection sel = (IStructuredSelection) selection;

                        }
                    }
                });

        final Job visibleCacheUpdateJob = new UIJob(
                "recalculate visible caches") {
            @Override
            public IStatus runInUIThread(IProgressMonitor monitor) {
                Point mapPosition = mapWidget.getMapPosition();

                Collection<Geocache> allCaches = DatabaseView
                        .getDefaultDatabase().getCaches();

                SubMonitor sm = SubMonitor.convert(monitor, allCaches.size());

                visibleCaches.clear();

                for (Geocache cache : allCaches) {
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

                    sm.worked(1);
                }

                sm.done();

                cacheLayerUpdateJob.schedule();
                return Status.OK_STATUS;
            }
        };

        mapWidget.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent arg0) {
                visibleCacheUpdateJob.schedule(CACHE_UPDATE_DELAY);
            }
        });

        DatabaseView.getDefaultDatabase().eAdapters().add(new AdapterImpl() {
            @Override
            public void notifyChanged(Notification msg) {
                visibleCacheUpdateJob.schedule(CACHE_UPDATE_DELAY);
            }
        });
    }

    @Override
    public void setFocus() {
        mapWidget.setFocus();
        // Point pos = mapWidget.computePosition(new PointD(center.getLon()
        // .doubleValue(), center.getLat().doubleValue()));
        // mapWidget.setCenterPosition(pos);
    }
}
