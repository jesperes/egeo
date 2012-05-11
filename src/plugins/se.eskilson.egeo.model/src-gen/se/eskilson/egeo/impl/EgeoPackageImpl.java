/**
 */
package se.eskilson.egeo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.eskilson.egeo.Attribute;
import se.eskilson.egeo.Cache;
import se.eskilson.egeo.CacheType;
import se.eskilson.egeo.Coordinate;
import se.eskilson.egeo.Database;
import se.eskilson.egeo.Description;
import se.eskilson.egeo.EgeoFactory;
import se.eskilson.egeo.EgeoPackage;
import se.eskilson.egeo.Log;
import se.eskilson.egeo.LogType;
import se.eskilson.egeo.User;

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
  private EClass databaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

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
  private EClass coordinateEClass = null;

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
  private EClass cacheEClass = null;

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
  private EEnum containerEEnum = null;

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
   * @see se.eskilson.egeo.EgeoPackage#eNS_URI
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
  public EClass getDatabase()
  {
    return databaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabase_Caches()
  {
    return (EReference)databaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabase_Attributes()
  {
    return (EReference)databaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabase_Users()
  {
    return (EReference)databaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_AttrId()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getDescription_Text()
  {
    return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDescription_Html()
  {
    return (EAttribute)descriptionEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getCoordinate_Latitude()
  {
    return (EAttribute)coordinateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoordinate_Longitude()
  {
    return (EAttribute)coordinateEClass.getEStructuralFeatures().get(1);
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
  public EClass getCache()
  {
    return cacheEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCache_Code()
  {
    return (EAttribute)cacheEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCache_Name()
  {
    return (EAttribute)cacheEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCache_Description()
  {
    return (EAttribute)cacheEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCache_Time()
  {
    return (EAttribute)cacheEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCache_CacheType()
  {
    return (EAttribute)cacheEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCache_PlacedBy()
  {
    return (EAttribute)cacheEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCache_OwnedBy()
  {
    return (EReference)cacheEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCache_Cont()
  {
    return (EAttribute)cacheEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCache_Attributes()
  {
    return (EReference)cacheEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCache_Difficulty()
  {
    return (EAttribute)cacheEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCache_Terrain()
  {
    return (EAttribute)cacheEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCache_Country()
  {
    return (EAttribute)cacheEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCache_State()
  {
    return (EAttribute)cacheEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCache_ShortDescription()
  {
    return (EReference)cacheEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCache_LongDescription()
  {
    return (EReference)cacheEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCache_Coordinate()
  {
    return (EReference)cacheEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCache_Logs()
  {
    return (EReference)cacheEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCache_Hint()
  {
    return (EAttribute)cacheEClass.getEStructuralFeatures().get(17);
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
  public EAttribute getLog_Text()
  {
    return (EAttribute)logEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLog_User()
  {
    return (EReference)logEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLog_Encoded()
  {
    return (EAttribute)logEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLog_LogId()
  {
    return (EAttribute)logEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLog_Date()
  {
    return (EAttribute)logEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLog_LogType()
  {
    return (EAttribute)logEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getContainer()
  {
    return containerEEnum;
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
    databaseEClass = createEClass(DATABASE);
    createEReference(databaseEClass, DATABASE__CACHES);
    createEReference(databaseEClass, DATABASE__ATTRIBUTES);
    createEReference(databaseEClass, DATABASE__USERS);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__ATTR_ID);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);

    descriptionEClass = createEClass(DESCRIPTION);
    createEAttribute(descriptionEClass, DESCRIPTION__TEXT);
    createEAttribute(descriptionEClass, DESCRIPTION__HTML);

    coordinateEClass = createEClass(COORDINATE);
    createEAttribute(coordinateEClass, COORDINATE__LATITUDE);
    createEAttribute(coordinateEClass, COORDINATE__LONGITUDE);

    userEClass = createEClass(USER);
    createEAttribute(userEClass, USER__USER_ID);
    createEAttribute(userEClass, USER__NAME);

    cacheEClass = createEClass(CACHE);
    createEAttribute(cacheEClass, CACHE__CODE);
    createEAttribute(cacheEClass, CACHE__NAME);
    createEAttribute(cacheEClass, CACHE__DESCRIPTION);
    createEAttribute(cacheEClass, CACHE__TIME);
    createEAttribute(cacheEClass, CACHE__CACHE_TYPE);
    createEAttribute(cacheEClass, CACHE__PLACED_BY);
    createEReference(cacheEClass, CACHE__OWNED_BY);
    createEAttribute(cacheEClass, CACHE__CONT);
    createEReference(cacheEClass, CACHE__ATTRIBUTES);
    createEAttribute(cacheEClass, CACHE__DIFFICULTY);
    createEAttribute(cacheEClass, CACHE__TERRAIN);
    createEAttribute(cacheEClass, CACHE__COUNTRY);
    createEAttribute(cacheEClass, CACHE__STATE);
    createEReference(cacheEClass, CACHE__SHORT_DESCRIPTION);
    createEReference(cacheEClass, CACHE__LONG_DESCRIPTION);
    createEReference(cacheEClass, CACHE__COORDINATE);
    createEReference(cacheEClass, CACHE__LOGS);
    createEAttribute(cacheEClass, CACHE__HINT);

    logEClass = createEClass(LOG);
    createEAttribute(logEClass, LOG__TEXT);
    createEReference(logEClass, LOG__USER);
    createEAttribute(logEClass, LOG__ENCODED);
    createEAttribute(logEClass, LOG__LOG_ID);
    createEAttribute(logEClass, LOG__DATE);
    createEAttribute(logEClass, LOG__LOG_TYPE);

    // Create enums
    containerEEnum = createEEnum(CONTAINER);
    cacheTypeEEnum = createEEnum(CACHE_TYPE);
    logTypeEEnum = createEEnum(LOG_TYPE);
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
    initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDatabase_Caches(), this.getCache(), null, "caches", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabase_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabase_Users(), this.getUser(), null, "users", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_AttrId(), theEcorePackage.getEInt(), "attrId", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDescription_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDescription_Html(), theEcorePackage.getEBoolean(), "html", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(coordinateEClass, Coordinate.class, "Coordinate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCoordinate_Latitude(), theEcorePackage.getEDouble(), "latitude", null, 0, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCoordinate_Longitude(), theEcorePackage.getEDouble(), "longitude", null, 0, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUser_UserId(), theEcorePackage.getEInt(), "userId", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUser_Name(), theEcorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cacheEClass, Cache.class, "Cache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCache_Code(), theEcorePackage.getEString(), "code", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCache_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCache_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCache_Time(), theEcorePackage.getEString(), "time", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCache_CacheType(), this.getCacheType(), "cacheType", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCache_PlacedBy(), theEcorePackage.getEString(), "placedBy", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCache_OwnedBy(), this.getUser(), null, "ownedBy", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCache_Cont(), this.getContainer(), "cont", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCache_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCache_Difficulty(), theEcorePackage.getEInt(), "difficulty", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCache_Terrain(), theEcorePackage.getEInt(), "terrain", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCache_Country(), theEcorePackage.getEString(), "country", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCache_State(), theEcorePackage.getEString(), "state", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCache_ShortDescription(), this.getDescription(), null, "shortDescription", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCache_LongDescription(), this.getDescription(), null, "longDescription", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCache_Coordinate(), this.getCoordinate(), null, "coordinate", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCache_Logs(), this.getLog(), null, "logs", null, 0, -1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCache_Hint(), theEcorePackage.getEString(), "hint", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logEClass, Log.class, "Log", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLog_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLog_User(), this.getUser(), null, "user", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLog_Encoded(), theEcorePackage.getEBoolean(), "encoded", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLog_LogId(), theEcorePackage.getEInt(), "logId", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLog_Date(), theEcorePackage.getEString(), "date", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLog_LogType(), this.getLogType(), "logType", null, 0, 1, Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(containerEEnum, se.eskilson.egeo.Container.class, "Container");
    addEEnumLiteral(containerEEnum, se.eskilson.egeo.Container.MICRO);
    addEEnumLiteral(containerEEnum, se.eskilson.egeo.Container.SMALL);
    addEEnumLiteral(containerEEnum, se.eskilson.egeo.Container.REGULAR);
    addEEnumLiteral(containerEEnum, se.eskilson.egeo.Container.LARGE);

    initEEnum(cacheTypeEEnum, CacheType.class, "CacheType");
    addEEnumLiteral(cacheTypeEEnum, CacheType.TRADITIONAL);
    addEEnumLiteral(cacheTypeEEnum, CacheType.UNKNOWN);
    addEEnumLiteral(cacheTypeEEnum, CacheType.MULTI);
    addEEnumLiteral(cacheTypeEEnum, CacheType.EVENT);

    initEEnum(logTypeEEnum, LogType.class, "LogType");
    addEEnumLiteral(logTypeEEnum, LogType.FOUND_IT);
    addEEnumLiteral(logTypeEEnum, LogType.DID_NOT_FIND);
    addEEnumLiteral(logTypeEEnum, LogType.NEEDS_MAINTENANCE);

    // Create resource
    createResource(eNS_URI);
  }

} //EgeoPackageImpl
