/**
 */
package egeo.impl;

import egeo.Attribute;
import egeo.CacheDatabase;
import egeo.CacheType;
import egeo.ContainerType;
import egeo.Coordinate;
import egeo.Description;
import egeo.EgeoFactory;
import egeo.EgeoPackage;
import egeo.Geocache;
import egeo.Log;
import egeo.LogType;
import egeo.User;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EgeoPackageImpl extends EPackageImpl implements EgeoPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coordinateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geocacheEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cacheDatabaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum cacheTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum logTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum attributeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum containerTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType uriEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType urlEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType dateEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType bigDecimalEDataType = null;

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
   * @see egeo.EgeoPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EgeoPackageImpl()
  {
    super(eNS_URI, EgeoFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EgeoPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EgeoPackage init()
  {
    if (isInited) return (EgeoPackage)EPackage.Registry.INSTANCE.getEPackage(EgeoPackage.eNS_URI);

    // Obtain or create and register package
    EgeoPackageImpl theEgeoPackage = (EgeoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EgeoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EgeoPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theEgeoPackage.createPackageContents();

    // Initialize created meta-data
    theEgeoPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEgeoPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EgeoPackage.eNS_URI, theEgeoPackage);
    return theEgeoPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCoordinate()
  {
    return coordinateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoordinate_Lat()
  {
    return (EAttribute)coordinateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoordinate_Lon()
  {
    return (EAttribute)coordinateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescription()
  {
    return descriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDescription_Html()
  {
    return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDescription_Text()
  {
    return (EAttribute)descriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLog()
  {
    return logEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLog_LogId()
  {
    return (EAttribute)logEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLog_Date()
  {
    return (EAttribute)logEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLog_LogType()
  {
    return (EAttribute)logEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLog_Text()
  {
    return (EAttribute)logEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLog_Finder()
  {
    return (EReference)logEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLog_Encoded()
  {
    return (EAttribute)logEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUser()
  {
    return userEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUser_UserId()
  {
    return (EAttribute)userEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUser_Name()
  {
    return (EAttribute)userEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeocache()
  {
    return geocacheEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_CacheId()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_Code()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_Time()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_Name()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_Available()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_Archived()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_ContainerType()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeocache_Owner()
  {
    return (EReference)geocacheEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_PlacedBy()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_CacheType()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_Difficulty()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_Terrain()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_Country()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_State()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeocache_Coord()
  {
    return (EReference)geocacheEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_Url()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_Attributes()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_Hint()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeocache_ShortText()
  {
    return (EReference)geocacheEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeocache_LongText()
  {
    return (EReference)geocacheEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeocache_Logs()
  {
    return (EReference)geocacheEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_Source()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_LastUpdate()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeocache_Tags()
  {
    return (EAttribute)geocacheEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCacheDatabase()
  {
    return cacheDatabaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCacheDatabase_Caches()
  {
    return (EReference)cacheDatabaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCacheType()
  {
    return cacheTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLogType()
  {
    return logTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAttribute()
  {
    return attributeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getContainerType()
  {
    return containerTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getURI()
  {
    return uriEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getURL()
  {
    return urlEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getDate()
  {
    return dateEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getBigDecimal()
  {
    return bigDecimalEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EgeoFactory getEgeoFactory()
  {
    return (EgeoFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    coordinateEClass = createEClass(COORDINATE);
    createEAttribute(coordinateEClass, COORDINATE__LAT);
    createEAttribute(coordinateEClass, COORDINATE__LON);

    descriptionEClass = createEClass(DESCRIPTION);
    createEAttribute(descriptionEClass, DESCRIPTION__HTML);
    createEAttribute(descriptionEClass, DESCRIPTION__TEXT);

    logEClass = createEClass(LOG);
    createEAttribute(logEClass, LOG__LOG_ID);
    createEAttribute(logEClass, LOG__DATE);
    createEAttribute(logEClass, LOG__LOG_TYPE);
    createEAttribute(logEClass, LOG__TEXT);
    createEReference(logEClass, LOG__FINDER);
    createEAttribute(logEClass, LOG__ENCODED);

    userEClass = createEClass(USER);
    createEAttribute(userEClass, USER__USER_ID);
    createEAttribute(userEClass, USER__NAME);

    geocacheEClass = createEClass(GEOCACHE);
    createEAttribute(geocacheEClass, GEOCACHE__CACHE_ID);
    createEAttribute(geocacheEClass, GEOCACHE__CODE);
    createEAttribute(geocacheEClass, GEOCACHE__TIME);
    createEAttribute(geocacheEClass, GEOCACHE__NAME);
    createEAttribute(geocacheEClass, GEOCACHE__AVAILABLE);
    createEAttribute(geocacheEClass, GEOCACHE__ARCHIVED);
    createEAttribute(geocacheEClass, GEOCACHE__CONTAINER_TYPE);
    createEReference(geocacheEClass, GEOCACHE__OWNER);
    createEAttribute(geocacheEClass, GEOCACHE__PLACED_BY);
    createEAttribute(geocacheEClass, GEOCACHE__CACHE_TYPE);
    createEAttribute(geocacheEClass, GEOCACHE__DIFFICULTY);
    createEAttribute(geocacheEClass, GEOCACHE__TERRAIN);
    createEAttribute(geocacheEClass, GEOCACHE__COUNTRY);
    createEAttribute(geocacheEClass, GEOCACHE__STATE);
    createEReference(geocacheEClass, GEOCACHE__COORD);
    createEAttribute(geocacheEClass, GEOCACHE__URL);
    createEAttribute(geocacheEClass, GEOCACHE__ATTRIBUTES);
    createEAttribute(geocacheEClass, GEOCACHE__HINT);
    createEReference(geocacheEClass, GEOCACHE__SHORT_TEXT);
    createEReference(geocacheEClass, GEOCACHE__LONG_TEXT);
    createEReference(geocacheEClass, GEOCACHE__LOGS);
    createEAttribute(geocacheEClass, GEOCACHE__SOURCE);
    createEAttribute(geocacheEClass, GEOCACHE__LAST_UPDATE);
    createEAttribute(geocacheEClass, GEOCACHE__TAGS);

    cacheDatabaseEClass = createEClass(CACHE_DATABASE);
    createEReference(cacheDatabaseEClass, CACHE_DATABASE__CACHES);

    // Create enums
    cacheTypeEEnum = createEEnum(CACHE_TYPE);
    logTypeEEnum = createEEnum(LOG_TYPE);
    attributeEEnum = createEEnum(ATTRIBUTE);
    containerTypeEEnum = createEEnum(CONTAINER_TYPE);

    // Create data types
    uriEDataType = createEDataType(URI);
    urlEDataType = createEDataType(URL);
    dateEDataType = createEDataType(DATE);
    bigDecimalEDataType = createEDataType(BIG_DECIMAL);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(coordinateEClass, Coordinate.class, "Coordinate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCoordinate_Lat(), this.getBigDecimal(), "lat", null, 0, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCoordinate_Lon(), this.getBigDecimal(), "lon", null, 0, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDescription_Html(), theEcorePackage.getEBoolean(), "html", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDescription_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logEClass, Log.class, "Log", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLog_LogId(), theEcorePackage.getEInt(), "logId", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLog_Date(), this.getDate(), "date", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLog_LogType(), this.getLogType(), "logType", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLog_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLog_Finder(), this.getUser(), null, "finder", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLog_Encoded(), theEcorePackage.getEBoolean(), "encoded", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUser_UserId(), theEcorePackage.getELong(), "userId", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUser_Name(), theEcorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(geocacheEClass, Geocache.class, "Geocache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGeocache_CacheId(), theEcorePackage.getELong(), "cacheId", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_Code(), theEcorePackage.getEString(), "code", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_Time(), this.getDate(), "time", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_Available(), theEcorePackage.getEBoolean(), "available", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_Archived(), theEcorePackage.getEBoolean(), "archived", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_ContainerType(), this.getContainerType(), "containerType", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeocache_Owner(), this.getUser(), null, "owner", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_PlacedBy(), theEcorePackage.getEString(), "placedBy", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_CacheType(), this.getCacheType(), "cacheType", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_Difficulty(), theEcorePackage.getEDouble(), "difficulty", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_Terrain(), theEcorePackage.getEDouble(), "terrain", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_Country(), theEcorePackage.getEString(), "country", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_State(), theEcorePackage.getEString(), "state", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeocache_Coord(), this.getCoordinate(), null, "coord", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_Url(), this.getURL(), "url", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_Attributes(), this.getAttribute(), "attributes", null, 0, -1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_Hint(), theEcorePackage.getEString(), "hint", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeocache_ShortText(), this.getDescription(), null, "shortText", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeocache_LongText(), this.getDescription(), null, "longText", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeocache_Logs(), this.getLog(), null, "logs", null, 0, -1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_Source(), this.getURI(), "source", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_LastUpdate(), this.getDate(), "lastUpdate", null, 0, 1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeocache_Tags(), theEcorePackage.getEString(), "tags", null, 0, -1, Geocache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cacheDatabaseEClass, CacheDatabase.class, "CacheDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCacheDatabase_Caches(), this.getGeocache(), null, "caches", null, 0, -1, CacheDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(cacheTypeEEnum, CacheType.class, "CacheType");
    addEEnumLiteral(cacheTypeEEnum, CacheType.TRADITIONAL);
    addEEnumLiteral(cacheTypeEEnum, CacheType.MULTI);
    addEEnumLiteral(cacheTypeEEnum, CacheType.UNKNOWN);
    addEEnumLiteral(cacheTypeEEnum, CacheType.EVENT);

    initEEnum(logTypeEEnum, LogType.class, "LogType");
    addEEnumLiteral(logTypeEEnum, LogType.FOUND_IT);
    addEEnumLiteral(logTypeEEnum, LogType.DID_NOT_FIND);
    addEEnumLiteral(logTypeEEnum, LogType.NOTE);

    initEEnum(attributeEEnum, Attribute.class, "Attribute");
    addEEnumLiteral(attributeEEnum, Attribute.RECOMMENDED_FOR_KIDS);
    addEEnumLiteral(attributeEEnum, Attribute.TAKES_LESS_THAN_AN_HOUR);
    addEEnumLiteral(attributeEEnum, Attribute.AVAILABLE_AT_ALL_TIMES);
    addEEnumLiteral(attributeEEnum, Attribute.RECOMMENDED_AT_NIGHT);
    addEEnumLiteral(attributeEEnum, Attribute.AVAILABLE_DURING_WINTER);
    addEEnumLiteral(attributeEEnum, Attribute.BICYCLES);

    initEEnum(containerTypeEEnum, ContainerType.class, "ContainerType");
    addEEnumLiteral(containerTypeEEnum, ContainerType.MICRO);
    addEEnumLiteral(containerTypeEEnum, ContainerType.SMALL);
    addEEnumLiteral(containerTypeEEnum, ContainerType.REGULAR);
    addEEnumLiteral(containerTypeEEnum, ContainerType.LARGE);
    addEEnumLiteral(containerTypeEEnum, ContainerType.OTHER);
    addEEnumLiteral(containerTypeEEnum, ContainerType.UNSPECIFIED);

    // Initialize data types
    initEDataType(uriEDataType, org.eclipse.emf.common.util.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(urlEDataType, java.net.URL.class, "URL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(bigDecimalEDataType, BigDecimal.class, "BigDecimal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //EgeoPackageImpl
