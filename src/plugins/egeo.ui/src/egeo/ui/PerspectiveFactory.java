package egeo.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class PerspectiveFactory implements IPerspectiveFactory {
	@Override
	public void createInitialLayout(IPageLayout layout) {
		String area = layout.getEditorArea();
		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT,
				(float) 0.25, area);
		left.addView("egeo.ui.database");

		IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT,
				(float) 0.25, area);
		right.addView("egeo.ui.mapView");
	}
}
