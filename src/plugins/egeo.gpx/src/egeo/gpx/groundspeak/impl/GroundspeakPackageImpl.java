/**
 */
package egeo.gpx.groundspeak.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import egeo.gpx.groundspeak.AttributeType;
import egeo.gpx.groundspeak.AttributesType;
import egeo.gpx.groundspeak.CacheType;
import egeo.gpx.groundspeak.DocumentRoot;
import egeo.gpx.groundspeak.FinderType;
import egeo.gpx.groundspeak.GroundspeakFactory;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroundspeakPackageImpl extends EPackageImpl implements GroundspeakPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logWptTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass travelbugsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass travelbugTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GroundspeakPackageImpl() {
		super(eNS_URI, GroundspeakFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GroundspeakPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GroundspeakPackage init() {
		if (isInited) return (GroundspeakPackage)EPackage.Registry.INSTANCE.getEPackage(GroundspeakPackage.eNS_URI);

		// Obtain or create and register package
		GroundspeakPackageImpl theGroundspeakPackage = (GroundspeakPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GroundspeakPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GroundspeakPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGroundspeakPackage.createPackageContents();

		// Initialize created meta-data
		theGroundspeakPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGroundspeakPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GroundspeakPackage.eNS_URI, theGroundspeakPackage);
		return theGroundspeakPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributesType() {
		return attributesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributesType_Attribute() {
		return (EReference)attributesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeType() {
		return attributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Value() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Id() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Inc() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCacheType() {
		return cacheTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCacheType_Name() {
		return (EAttribute)cacheTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCacheType_PlacedBy() {
		return (EAttribute)cacheTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCacheType_Owner() {
		return (EReference)cacheTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCacheType_Type() {
		return (EAttribute)cacheTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCacheType_Container() {
		return (EAttribute)cacheTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCacheType_Attributes() {
		return (EReference)cacheTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCacheType_Difficulty() {
		return (EAttribute)cacheTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCacheType_Terrain() {
		return (EAttribute)cacheTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCacheType_Country() {
		return (EAttribute)cacheTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCacheType_State() {
		return (EAttribute)cacheTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCacheType_ShortDescription() {
		return (EReference)cacheTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCacheType_LongDescription() {
		return (EReference)cacheTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCacheType_EncodedHints() {
		return (EAttribute)cacheTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCacheType_Logs() {
		return (EReference)cacheTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCacheType_Travelbugs() {
		return (EReference)cacheTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCacheType_Archived() {
		return (EAttribute)cacheTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCacheType_Available() {
		return (EAttribute)cacheTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCacheType_Id() {
		return (EAttribute)cacheTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Cache() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinderType() {
		return finderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinderType_Value() {
		return (EAttribute)finderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinderType_Id() {
		return (EAttribute)finderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogsType() {
		return logsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogsType_Log() {
		return (EReference)logsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogType() {
		return logTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogType_Date() {
		return (EAttribute)logTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogType_Type() {
		return (EAttribute)logTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogType_Finder() {
		return (EReference)logTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogType_Text() {
		return (EReference)logTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogType_LogWpt() {
		return (EReference)logTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogType_Id() {
		return (EAttribute)logTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogWptType() {
		return logWptTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogWptType_Lat() {
		return (EAttribute)logWptTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogWptType_Lon() {
		return (EAttribute)logWptTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongDescriptionType() {
		return longDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongDescriptionType_Value() {
		return (EAttribute)longDescriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongDescriptionType_Html() {
		return (EAttribute)longDescriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwnerType() {
		return ownerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwnerType_Value() {
		return (EAttribute)ownerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwnerType_Id() {
		return (EAttribute)ownerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortDescriptionType() {
		return shortDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortDescriptionType_Value() {
		return (EAttribute)shortDescriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortDescriptionType_Html() {
		return (EAttribute)shortDescriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextType() {
		return textTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_Value() {
		return (EAttribute)textTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_Encoded() {
		return (EAttribute)textTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTravelbugsType() {
		return travelbugsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelbugsType_Travelbug() {
		return (EReference)travelbugsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTravelbugType() {
		return travelbugTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelbugType_Name() {
		return (EAttribute)travelbugTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelbugType_Id() {
		return (EAttribute)travelbugTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelbugType_Ref() {
		return (EAttribute)travelbugTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundspeakFactory getGroundspeakFactory() {
		return (GroundspeakFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attributesTypeEClass = createEClass(ATTRIBUTES_TYPE);
		createEReference(attributesTypeEClass, ATTRIBUTES_TYPE__ATTRIBUTE);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__VALUE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__ID);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__INC);

		cacheTypeEClass = createEClass(CACHE_TYPE);
		createEAttribute(cacheTypeEClass, CACHE_TYPE__NAME);
		createEAttribute(cacheTypeEClass, CACHE_TYPE__PLACED_BY);
		createEReference(cacheTypeEClass, CACHE_TYPE__OWNER);
		createEAttribute(cacheTypeEClass, CACHE_TYPE__TYPE);
		createEAttribute(cacheTypeEClass, CACHE_TYPE__CONTAINER);
		createEReference(cacheTypeEClass, CACHE_TYPE__ATTRIBUTES);
		createEAttribute(cacheTypeEClass, CACHE_TYPE__DIFFICULTY);
		createEAttribute(cacheTypeEClass, CACHE_TYPE__TERRAIN);
		createEAttribute(cacheTypeEClass, CACHE_TYPE__COUNTRY);
		createEAttribute(cacheTypeEClass, CACHE_TYPE__STATE);
		createEReference(cacheTypeEClass, CACHE_TYPE__SHORT_DESCRIPTION);
		createEReference(cacheTypeEClass, CACHE_TYPE__LONG_DESCRIPTION);
		createEAttribute(cacheTypeEClass, CACHE_TYPE__ENCODED_HINTS);
		createEReference(cacheTypeEClass, CACHE_TYPE__LOGS);
		createEReference(cacheTypeEClass, CACHE_TYPE__TRAVELBUGS);
		createEAttribute(cacheTypeEClass, CACHE_TYPE__ARCHIVED);
		createEAttribute(cacheTypeEClass, CACHE_TYPE__AVAILABLE);
		createEAttribute(cacheTypeEClass, CACHE_TYPE__ID);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CACHE);

		finderTypeEClass = createEClass(FINDER_TYPE);
		createEAttribute(finderTypeEClass, FINDER_TYPE__VALUE);
		createEAttribute(finderTypeEClass, FINDER_TYPE__ID);

		logsTypeEClass = createEClass(LOGS_TYPE);
		createEReference(logsTypeEClass, LOGS_TYPE__LOG);

		logTypeEClass = createEClass(LOG_TYPE);
		createEAttribute(logTypeEClass, LOG_TYPE__DATE);
		createEAttribute(logTypeEClass, LOG_TYPE__TYPE);
		createEReference(logTypeEClass, LOG_TYPE__FINDER);
		createEReference(logTypeEClass, LOG_TYPE__TEXT);
		createEReference(logTypeEClass, LOG_TYPE__LOG_WPT);
		createEAttribute(logTypeEClass, LOG_TYPE__ID);

		logWptTypeEClass = createEClass(LOG_WPT_TYPE);
		createEAttribute(logWptTypeEClass, LOG_WPT_TYPE__LAT);
		createEAttribute(logWptTypeEClass, LOG_WPT_TYPE__LON);

		longDescriptionTypeEClass = createEClass(LONG_DESCRIPTION_TYPE);
		createEAttribute(longDescriptionTypeEClass, LONG_DESCRIPTION_TYPE__VALUE);
		createEAttribute(longDescriptionTypeEClass, LONG_DESCRIPTION_TYPE__HTML);

		ownerTypeEClass = createEClass(OWNER_TYPE);
		createEAttribute(ownerTypeEClass, OWNER_TYPE__VALUE);
		createEAttribute(ownerTypeEClass, OWNER_TYPE__ID);

		shortDescriptionTypeEClass = createEClass(SHORT_DESCRIPTION_TYPE);
		createEAttribute(shortDescriptionTypeEClass, SHORT_DESCRIPTION_TYPE__VALUE);
		createEAttribute(shortDescriptionTypeEClass, SHORT_DESCRIPTION_TYPE__HTML);

		textTypeEClass = createEClass(TEXT_TYPE);
		createEAttribute(textTypeEClass, TEXT_TYPE__VALUE);
		createEAttribute(textTypeEClass, TEXT_TYPE__ENCODED);

		travelbugsTypeEClass = createEClass(TRAVELBUGS_TYPE);
		createEReference(travelbugsTypeEClass, TRAVELBUGS_TYPE__TRAVELBUG);

		travelbugTypeEClass = createEClass(TRAVELBUG_TYPE);
		createEAttribute(travelbugTypeEClass, TRAVELBUG_TYPE__NAME);
		createEAttribute(travelbugTypeEClass, TRAVELBUG_TYPE__ID);
		createEAttribute(travelbugTypeEClass, TRAVELBUG_TYPE__REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(attributesTypeEClass, AttributesType.class, "AttributesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributesType_Attribute(), this.getAttributeType(), null, "attribute", null, 0, -1, AttributesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Inc(), theXMLTypePackage.getByte(), "inc", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheTypeEClass, CacheType.class, "CacheType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCacheType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheType_PlacedBy(), theXMLTypePackage.getString(), "placedBy", null, 0, 1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCacheType_Owner(), this.getOwnerType(), null, "owner", null, 0, -1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheType_Container(), theXMLTypePackage.getString(), "container", null, 0, 1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCacheType_Attributes(), this.getAttributesType(), null, "attributes", null, 0, -1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheType_Difficulty(), theXMLTypePackage.getString(), "difficulty", null, 0, 1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheType_Terrain(), theXMLTypePackage.getString(), "terrain", null, 0, 1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheType_Country(), theXMLTypePackage.getString(), "country", null, 0, 1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheType_State(), theXMLTypePackage.getString(), "state", null, 0, 1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCacheType_ShortDescription(), this.getShortDescriptionType(), null, "shortDescription", null, 0, -1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCacheType_LongDescription(), this.getLongDescriptionType(), null, "longDescription", null, 0, -1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheType_EncodedHints(), theXMLTypePackage.getString(), "encodedHints", null, 0, 1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCacheType_Logs(), this.getLogsType(), null, "logs", null, 0, -1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCacheType_Travelbugs(), this.getTravelbugsType(), null, "travelbugs", null, 0, -1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheType_Archived(), theXMLTypePackage.getString(), "archived", null, 0, 1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheType_Available(), theXMLTypePackage.getString(), "available", null, 0, 1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, CacheType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Cache(), this.getCacheType(), null, "cache", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(finderTypeEClass, FinderType.class, "FinderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFinderType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, FinderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinderType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, FinderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logsTypeEClass, LogsType.class, "LogsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogsType_Log(), this.getLogType(), null, "log", null, 0, -1, LogsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logTypeEClass, LogType.class, "LogType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogType_Date(), theXMLTypePackage.getString(), "date", null, 0, 1, LogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, LogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogType_Finder(), this.getFinderType(), null, "finder", null, 0, -1, LogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogType_Text(), this.getTextType(), null, "text", null, 0, -1, LogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogType_LogWpt(), this.getLogWptType(), null, "logWpt", null, 0, -1, LogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, LogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logWptTypeEClass, LogWptType.class, "LogWptType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogWptType_Lat(), theXMLTypePackage.getString(), "lat", null, 0, 1, LogWptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogWptType_Lon(), theXMLTypePackage.getString(), "lon", null, 0, 1, LogWptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longDescriptionTypeEClass, LongDescriptionType.class, "LongDescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongDescriptionType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, LongDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongDescriptionType_Html(), theXMLTypePackage.getString(), "html", null, 0, 1, LongDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ownerTypeEClass, OwnerType.class, "OwnerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOwnerType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, OwnerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOwnerType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, OwnerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shortDescriptionTypeEClass, ShortDescriptionType.class, "ShortDescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShortDescriptionType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ShortDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortDescriptionType_Html(), theXMLTypePackage.getString(), "html", null, 0, 1, ShortDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textTypeEClass, TextType.class, "TextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextType_Encoded(), theXMLTypePackage.getString(), "encoded", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(travelbugsTypeEClass, TravelbugsType.class, "TravelbugsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTravelbugsType_Travelbug(), this.getTravelbugType(), null, "travelbug", null, 0, -1, TravelbugsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(travelbugTypeEClass, TravelbugType.class, "TravelbugType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTravelbugType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TravelbugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelbugType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, TravelbugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelbugType_Ref(), theXMLTypePackage.getString(), "ref", null, 0, 1, TravelbugType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// urn:schemas-microsoft-com:xml-msdata
		createUrnschemasmicrosoftcomxmlmsdataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (attributesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "attributes_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getAttributesType_Attribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (attributeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "attribute_._type",
			 "kind", "simple"
		   });			
		addAnnotation
		  (getAttributeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAttributeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getAttributeType_Inc(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "inc"
		   });		
		addAnnotation
		  (cacheTypeEClass, 
		   source, 
		   new String[] {
			 "name", "cache_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getCacheType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCacheType_PlacedBy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "placed_by",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCacheType_Owner(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "owner",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCacheType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCacheType_Container(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "container",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCacheType_Attributes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attributes",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCacheType_Difficulty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "difficulty",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCacheType_Terrain(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "terrain",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCacheType_Country(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "country",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCacheType_State(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "state",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCacheType_ShortDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "short_description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCacheType_LongDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "long_description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCacheType_EncodedHints(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "encoded_hints",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCacheType_Logs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "logs",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCacheType_Travelbugs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "travelbugs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCacheType_Archived(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archived"
		   });		
		addAnnotation
		  (getCacheType_Available(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "available"
		   });		
		addAnnotation
		  (getCacheType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_Cache(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cache",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (finderTypeEClass, 
		   source, 
		   new String[] {
			 "name", "finder_._type",
			 "kind", "simple"
		   });			
		addAnnotation
		  (getFinderType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFinderType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (logsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "logs_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getLogsType_Log(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "log",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (logTypeEClass, 
		   source, 
		   new String[] {
			 "name", "log_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getLogType_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getLogType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getLogType_Finder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "finder",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getLogType_Text(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getLogType_LogWpt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "log_wpt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLogType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (logWptTypeEClass, 
		   source, 
		   new String[] {
			 "name", "log_wpt_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLogWptType_Lat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lat"
		   });		
		addAnnotation
		  (getLogWptType_Lon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lon"
		   });		
		addAnnotation
		  (longDescriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "long_description_._type",
			 "kind", "simple"
		   });			
		addAnnotation
		  (getLongDescriptionType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLongDescriptionType_Html(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "html"
		   });		
		addAnnotation
		  (ownerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "owner_._type",
			 "kind", "simple"
		   });			
		addAnnotation
		  (getOwnerType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getOwnerType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (shortDescriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "short_description_._type",
			 "kind", "simple"
		   });			
		addAnnotation
		  (getShortDescriptionType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getShortDescriptionType_Html(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "html"
		   });		
		addAnnotation
		  (textTypeEClass, 
		   source, 
		   new String[] {
			 "name", "text_._type",
			 "kind", "simple"
		   });			
		addAnnotation
		  (getTextType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTextType_Encoded(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "encoded"
		   });		
		addAnnotation
		  (travelbugsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "travelbugs_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getTravelbugsType_Travelbug(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "travelbug",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (travelbugTypeEClass, 
		   source, 
		   new String[] {
			 "name", "travelbug_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getTravelbugType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTravelbugType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getTravelbugType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:schemas-microsoft-com:xml-msdata</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnschemasmicrosoftcomxmlmsdataAnnotations() {
		String source = "urn:schemas-microsoft-com:xml-msdata";			
		addAnnotation
		  (getAttributesType_Attribute(), 
		   source, 
		   new String[] {
			 "Prefix", "groundspeak"
		   });				
		addAnnotation
		  (getAttributeType_Value(), 
		   source, 
		   new String[] {
			 "ColumnName", "attribute_Text",
			 "Ordinal", "1"
		   });						
		addAnnotation
		  (getCacheType_Name(), 
		   source, 
		   new String[] {
			 "Ordinal", "0",
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getCacheType_PlacedBy(), 
		   source, 
		   new String[] {
			 "Ordinal", "1",
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getCacheType_Owner(), 
		   source, 
		   new String[] {
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getCacheType_Type(), 
		   source, 
		   new String[] {
			 "Ordinal", "3",
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getCacheType_Container(), 
		   source, 
		   new String[] {
			 "Ordinal", "4",
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getCacheType_Attributes(), 
		   source, 
		   new String[] {
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getCacheType_Difficulty(), 
		   source, 
		   new String[] {
			 "Ordinal", "5",
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getCacheType_Terrain(), 
		   source, 
		   new String[] {
			 "Ordinal", "6",
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getCacheType_Country(), 
		   source, 
		   new String[] {
			 "Ordinal", "7",
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getCacheType_State(), 
		   source, 
		   new String[] {
			 "Ordinal", "8",
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getCacheType_ShortDescription(), 
		   source, 
		   new String[] {
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getCacheType_LongDescription(), 
		   source, 
		   new String[] {
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getCacheType_EncodedHints(), 
		   source, 
		   new String[] {
			 "Ordinal", "9",
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getCacheType_Logs(), 
		   source, 
		   new String[] {
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getCacheType_Travelbugs(), 
		   source, 
		   new String[] {
			 "Prefix", "groundspeak"
		   });										
		addAnnotation
		  (getDocumentRoot_Cache(), 
		   source, 
		   new String[] {
			 "Prefix", "groundspeak"
		   });				
		addAnnotation
		  (getFinderType_Value(), 
		   source, 
		   new String[] {
			 "ColumnName", "finder_Text",
			 "Ordinal", "1"
		   });					
		addAnnotation
		  (getLogsType_Log(), 
		   source, 
		   new String[] {
			 "Prefix", "groundspeak"
		   });				
		addAnnotation
		  (getLogType_Date(), 
		   source, 
		   new String[] {
			 "Ordinal", "0",
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getLogType_Type(), 
		   source, 
		   new String[] {
			 "Ordinal", "1",
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getLogType_Finder(), 
		   source, 
		   new String[] {
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getLogType_Text(), 
		   source, 
		   new String[] {
			 "Prefix", "groundspeak"
		   });			
		addAnnotation
		  (getLogType_LogWpt(), 
		   source, 
		   new String[] {
			 "Prefix", "groundspeak"
		   });								
		addAnnotation
		  (getLongDescriptionType_Value(), 
		   source, 
		   new String[] {
			 "ColumnName", "long_description_Text",
			 "Ordinal", "1"
		   });					
		addAnnotation
		  (getOwnerType_Value(), 
		   source, 
		   new String[] {
			 "ColumnName", "owner_Text",
			 "Ordinal", "1"
		   });					
		addAnnotation
		  (getShortDescriptionType_Value(), 
		   source, 
		   new String[] {
			 "ColumnName", "short_description_Text",
			 "Ordinal", "1"
		   });					
		addAnnotation
		  (getTextType_Value(), 
		   source, 
		   new String[] {
			 "ColumnName", "text_Text",
			 "Ordinal", "1"
		   });					
		addAnnotation
		  (getTravelbugsType_Travelbug(), 
		   source, 
		   new String[] {
			 "Prefix", "groundspeak"
		   });				
		addAnnotation
		  (getTravelbugType_Name(), 
		   source, 
		   new String[] {
			 "Ordinal", "0",
			 "Prefix", "groundspeak"
		   });			
	}

} //GroundspeakPackageImpl
