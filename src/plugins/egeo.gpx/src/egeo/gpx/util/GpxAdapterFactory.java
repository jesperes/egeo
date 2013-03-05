/**
 */
package egeo.gpx.util;

import egeo.gpx.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import egeo.gpx.BoundsType;
import egeo.gpx.DocumentRoot;
import egeo.gpx.GpxPackage;
import egeo.gpx.GpxType;
import egeo.gpx.RteType;
import egeo.gpx.RteptType;
import egeo.gpx.TrkType;
import egeo.gpx.TrkptType;
import egeo.gpx.TrksegType;
import egeo.gpx.WptType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see egeo.gpx.GpxPackage
 * @generated
 */
public class GpxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GpxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GpxPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GpxSwitch<Adapter> modelSwitch =
		new GpxSwitch<Adapter>() {
			@Override
			public Adapter caseBoundsType(BoundsType object) {
				return createBoundsTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseGpxType(GpxType object) {
				return createGpxTypeAdapter();
			}
			@Override
			public Adapter caseRteptType(RteptType object) {
				return createRteptTypeAdapter();
			}
			@Override
			public Adapter caseRteType(RteType object) {
				return createRteTypeAdapter();
			}
			@Override
			public Adapter caseTrkptType(TrkptType object) {
				return createTrkptTypeAdapter();
			}
			@Override
			public Adapter caseTrksegType(TrksegType object) {
				return createTrksegTypeAdapter();
			}
			@Override
			public Adapter caseTrkType(TrkType object) {
				return createTrkTypeAdapter();
			}
			@Override
			public Adapter caseWptType(WptType object) {
				return createWptTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.BoundsType <em>Bounds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.BoundsType
	 * @generated
	 */
	public Adapter createBoundsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.GpxType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.GpxType
	 * @generated
	 */
	public Adapter createGpxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.RteptType <em>Rtept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.RteptType
	 * @generated
	 */
	public Adapter createRteptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.RteType <em>Rte Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.RteType
	 * @generated
	 */
	public Adapter createRteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.TrkptType <em>Trkpt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.TrkptType
	 * @generated
	 */
	public Adapter createTrkptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.TrksegType <em>Trkseg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.TrksegType
	 * @generated
	 */
	public Adapter createTrksegTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.TrkType <em>Trk Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.TrkType
	 * @generated
	 */
	public Adapter createTrkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.WptType <em>Wpt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.WptType
	 * @generated
	 */
	public Adapter createWptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GpxAdapterFactory
