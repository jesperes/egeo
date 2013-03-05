/**
 */
package egeo.gpx.groundspeak.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import egeo.gpx.groundspeak.AttributeType;
import egeo.gpx.groundspeak.AttributesType;
import egeo.gpx.groundspeak.CacheType;
import egeo.gpx.groundspeak.DocumentRoot;
import egeo.gpx.groundspeak.FinderType;
import egeo.gpx.groundspeak.GroundspeakPackage;
import egeo.gpx.groundspeak.LogType;
import egeo.gpx.groundspeak.LogWptType;
import egeo.gpx.groundspeak.LogsType;
import egeo.gpx.groundspeak.LongDescriptionType;
import egeo.gpx.groundspeak.OwnerType;
import egeo.gpx.groundspeak.ShortDescriptionType;
import egeo.gpx.groundspeak.TextType;
import egeo.gpx.groundspeak.TravelbugType;
import egeo.gpx.groundspeak.TravelbugsType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see egeo.gpx.groundspeak.GroundspeakPackage
 * @generated
 */
public class GroundspeakAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GroundspeakPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundspeakAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GroundspeakPackage.eINSTANCE;
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
	protected GroundspeakSwitch<Adapter> modelSwitch =
		new GroundspeakSwitch<Adapter>() {
			@Override
			public Adapter caseAttributesType(AttributesType object) {
				return createAttributesTypeAdapter();
			}
			@Override
			public Adapter caseAttributeType(AttributeType object) {
				return createAttributeTypeAdapter();
			}
			@Override
			public Adapter caseCacheType(CacheType object) {
				return createCacheTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFinderType(FinderType object) {
				return createFinderTypeAdapter();
			}
			@Override
			public Adapter caseLogsType(LogsType object) {
				return createLogsTypeAdapter();
			}
			@Override
			public Adapter caseLogType(LogType object) {
				return createLogTypeAdapter();
			}
			@Override
			public Adapter caseLogWptType(LogWptType object) {
				return createLogWptTypeAdapter();
			}
			@Override
			public Adapter caseLongDescriptionType(LongDescriptionType object) {
				return createLongDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseOwnerType(OwnerType object) {
				return createOwnerTypeAdapter();
			}
			@Override
			public Adapter caseShortDescriptionType(ShortDescriptionType object) {
				return createShortDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseTextType(TextType object) {
				return createTextTypeAdapter();
			}
			@Override
			public Adapter caseTravelbugsType(TravelbugsType object) {
				return createTravelbugsTypeAdapter();
			}
			@Override
			public Adapter caseTravelbugType(TravelbugType object) {
				return createTravelbugTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link egeo.gpx.groundspeak.AttributesType <em>Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.groundspeak.AttributesType
	 * @generated
	 */
	public Adapter createAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.groundspeak.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.groundspeak.AttributeType
	 * @generated
	 */
	public Adapter createAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.groundspeak.CacheType <em>Cache Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.groundspeak.CacheType
	 * @generated
	 */
	public Adapter createCacheTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.groundspeak.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.groundspeak.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.groundspeak.FinderType <em>Finder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.groundspeak.FinderType
	 * @generated
	 */
	public Adapter createFinderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.groundspeak.LogsType <em>Logs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.groundspeak.LogsType
	 * @generated
	 */
	public Adapter createLogsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.groundspeak.LogType <em>Log Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.groundspeak.LogType
	 * @generated
	 */
	public Adapter createLogTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.groundspeak.LogWptType <em>Log Wpt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.groundspeak.LogWptType
	 * @generated
	 */
	public Adapter createLogWptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.groundspeak.LongDescriptionType <em>Long Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.groundspeak.LongDescriptionType
	 * @generated
	 */
	public Adapter createLongDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.groundspeak.OwnerType <em>Owner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.groundspeak.OwnerType
	 * @generated
	 */
	public Adapter createOwnerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.groundspeak.ShortDescriptionType <em>Short Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.groundspeak.ShortDescriptionType
	 * @generated
	 */
	public Adapter createShortDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.groundspeak.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.groundspeak.TextType
	 * @generated
	 */
	public Adapter createTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.groundspeak.TravelbugsType <em>Travelbugs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.groundspeak.TravelbugsType
	 * @generated
	 */
	public Adapter createTravelbugsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link egeo.gpx.groundspeak.TravelbugType <em>Travelbug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see egeo.gpx.groundspeak.TravelbugType
	 * @generated
	 */
	public Adapter createTravelbugTypeAdapter() {
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

} //GroundspeakAdapterFactory
