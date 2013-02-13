/**
 */
package egeo.gpx.groundspeak.impl;

import egeo.gpx.groundspeak.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroundspeakFactoryImpl extends EFactoryImpl implements GroundspeakFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GroundspeakFactory init() {
		try {
			GroundspeakFactory theGroundspeakFactory = (GroundspeakFactory)EPackage.Registry.INSTANCE.getEFactory(GroundspeakPackage.eNS_URI);
			if (theGroundspeakFactory != null) {
				return theGroundspeakFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GroundspeakFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundspeakFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GroundspeakPackage.ATTRIBUTES_TYPE: return createAttributesType();
			case GroundspeakPackage.ATTRIBUTE_TYPE: return createAttributeType();
			case GroundspeakPackage.CACHE_TYPE: return createCacheType();
			case GroundspeakPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case GroundspeakPackage.FINDER_TYPE: return createFinderType();
			case GroundspeakPackage.LOGS_TYPE: return createLogsType();
			case GroundspeakPackage.LOG_TYPE: return createLogType();
			case GroundspeakPackage.LOG_WPT_TYPE: return createLogWptType();
			case GroundspeakPackage.LONG_DESCRIPTION_TYPE: return createLongDescriptionType();
			case GroundspeakPackage.OWNER_TYPE: return createOwnerType();
			case GroundspeakPackage.SHORT_DESCRIPTION_TYPE: return createShortDescriptionType();
			case GroundspeakPackage.TEXT_TYPE: return createTextType();
			case GroundspeakPackage.TRAVELBUGS_TYPE: return createTravelbugsType();
			case GroundspeakPackage.TRAVELBUG_TYPE: return createTravelbugType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType createAttributesType() {
		AttributesTypeImpl attributesType = new AttributesTypeImpl();
		return attributesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeType() {
		AttributeTypeImpl attributeType = new AttributeTypeImpl();
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheType createCacheType() {
		CacheTypeImpl cacheType = new CacheTypeImpl();
		return cacheType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinderType createFinderType() {
		FinderTypeImpl finderType = new FinderTypeImpl();
		return finderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogsType createLogsType() {
		LogsTypeImpl logsType = new LogsTypeImpl();
		return logsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogType createLogType() {
		LogTypeImpl logType = new LogTypeImpl();
		return logType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogWptType createLogWptType() {
		LogWptTypeImpl logWptType = new LogWptTypeImpl();
		return logWptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongDescriptionType createLongDescriptionType() {
		LongDescriptionTypeImpl longDescriptionType = new LongDescriptionTypeImpl();
		return longDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnerType createOwnerType() {
		OwnerTypeImpl ownerType = new OwnerTypeImpl();
		return ownerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortDescriptionType createShortDescriptionType() {
		ShortDescriptionTypeImpl shortDescriptionType = new ShortDescriptionTypeImpl();
		return shortDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextType createTextType() {
		TextTypeImpl textType = new TextTypeImpl();
		return textType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelbugsType createTravelbugsType() {
		TravelbugsTypeImpl travelbugsType = new TravelbugsTypeImpl();
		return travelbugsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelbugType createTravelbugType() {
		TravelbugTypeImpl travelbugType = new TravelbugTypeImpl();
		return travelbugType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundspeakPackage getGroundspeakPackage() {
		return (GroundspeakPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GroundspeakPackage getPackage() {
		return GroundspeakPackage.eINSTANCE;
	}

} //GroundspeakFactoryImpl
