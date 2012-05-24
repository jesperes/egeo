/**
 */
package se.eskilson.egeo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.eskilson.egeo.EgeoFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='se.eskilson' codeFormatting='true' editDirectory='/se.eskilson.egeo.model.edit/src' editorDirectory='/se.eskilson.egeo.model.editor/src' testsDirectory='/se.eskilson.egeo.model.tests/src'"
 * @generated
 */
public interface EgeoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "egeo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "se.eskilson.egeo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "egeo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EgeoPackage eINSTANCE = se.eskilson.egeo.impl.EgeoPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.eskilson.egeo.impl.CacheDBImpl <em>Cache DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.eskilson.egeo.impl.CacheDBImpl
	 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getCacheDB()
	 * @generated
	 */
	int CACHE_DB = 0;

	/**
	 * The feature id for the '<em><b>Caches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DB__CACHES = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DB__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DB__USERS = 2;

	/**
	 * The number of structural features of the '<em>Cache DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DB_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cache DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.eskilson.egeo.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.eskilson.egeo.impl.AttributeImpl
	 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Attr Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTR_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.eskilson.egeo.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.eskilson.egeo.impl.DescriptionImpl
	 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__HTML = 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.eskilson.egeo.impl.CoordinateImpl <em>Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.eskilson.egeo.impl.CoordinateImpl
	 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getCoordinate()
	 * @generated
	 */
	int COORDINATE = 3;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__LONGITUDE = 1;

	/**
	 * The number of structural features of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.eskilson.egeo.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.eskilson.egeo.impl.UserImpl
	 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getUser()
	 * @generated
	 */
	int USER = 4;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.eskilson.egeo.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.eskilson.egeo.impl.CacheImpl
	 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__TIME = 3;

	/**
	 * The feature id for the '<em><b>Cache Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__CACHE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Placed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__PLACED_BY = 5;

	/**
	 * The feature id for the '<em><b>Owned By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__OWNED_BY = 6;

	/**
	 * The feature id for the '<em><b>Cont</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__CONT = 7;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__ATTRIBUTES = 8;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__DIFFICULTY = 9;

	/**
	 * The feature id for the '<em><b>Terrain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__TERRAIN = 10;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__COUNTRY = 11;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__STATE = 12;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__SHORT_DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__LONG_DESCRIPTION = 14;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__COORDINATE = 15;

	/**
	 * The feature id for the '<em><b>Logs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__LOGS = 16;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__HINT = 17;

	/**
	 * The number of structural features of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.eskilson.egeo.impl.LogImpl <em>Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.eskilson.egeo.impl.LogImpl
	 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getLog()
	 * @generated
	 */
	int LOG = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__TEXT = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__USER = 1;

	/**
	 * The feature id for the '<em><b>Encoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__ENCODED = 2;

	/**
	 * The feature id for the '<em><b>Log Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__LOG_ID = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__DATE = 4;

	/**
	 * The feature id for the '<em><b>Log Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG__LOG_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.eskilson.egeo.Container <em>Container</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.eskilson.egeo.Container
	 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 7;

	/**
	 * The meta object id for the '{@link se.eskilson.egeo.CacheType <em>Cache Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.eskilson.egeo.CacheType
	 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getCacheType()
	 * @generated
	 */
	int CACHE_TYPE = 8;

	/**
	 * The meta object id for the '{@link se.eskilson.egeo.LogType <em>Log Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.eskilson.egeo.LogType
	 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getLogType()
	 * @generated
	 */
	int LOG_TYPE = 9;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 10;

	/**
	 * Returns the meta object for class '{@link se.eskilson.egeo.CacheDB <em>Cache DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache DB</em>'.
	 * @see se.eskilson.egeo.CacheDB
	 * @generated
	 */
	EClass getCacheDB();

	/**
	 * Returns the meta object for the containment reference list '{@link se.eskilson.egeo.CacheDB#getCaches <em>Caches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Caches</em>'.
	 * @see se.eskilson.egeo.CacheDB#getCaches()
	 * @see #getCacheDB()
	 * @generated
	 */
	EReference getCacheDB_Caches();

	/**
	 * Returns the meta object for the containment reference list '{@link se.eskilson.egeo.CacheDB#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see se.eskilson.egeo.CacheDB#getAttributes()
	 * @see #getCacheDB()
	 * @generated
	 */
	EReference getCacheDB_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link se.eskilson.egeo.CacheDB#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see se.eskilson.egeo.CacheDB#getUsers()
	 * @see #getCacheDB()
	 * @generated
	 */
	EReference getCacheDB_Users();

	/**
	 * Returns the meta object for class '{@link se.eskilson.egeo.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see se.eskilson.egeo.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Attribute#getAttrId <em>Attr Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Id</em>'.
	 * @see se.eskilson.egeo.Attribute#getAttrId()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttrId();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.eskilson.egeo.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for class '{@link se.eskilson.egeo.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see se.eskilson.egeo.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Description#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see se.eskilson.egeo.Description#getText()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Text();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Description#isHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see se.eskilson.egeo.Description#isHtml()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Html();

	/**
	 * Returns the meta object for class '{@link se.eskilson.egeo.Coordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate</em>'.
	 * @see se.eskilson.egeo.Coordinate
	 * @generated
	 */
	EClass getCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Coordinate#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see se.eskilson.egeo.Coordinate#getLatitude()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Coordinate#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see se.eskilson.egeo.Coordinate#getLongitude()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Longitude();

	/**
	 * Returns the meta object for class '{@link se.eskilson.egeo.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see se.eskilson.egeo.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.User#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see se.eskilson.egeo.User#getUserId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserId();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.eskilson.egeo.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for class '{@link se.eskilson.egeo.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see se.eskilson.egeo.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Cache#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see se.eskilson.egeo.Cache#getCode()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Code();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Cache#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.eskilson.egeo.Cache#getName()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Name();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Cache#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see se.eskilson.egeo.Cache#getDescription()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Description();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Cache#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see se.eskilson.egeo.Cache#getTime()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Time();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Cache#getCacheType <em>Cache Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Type</em>'.
	 * @see se.eskilson.egeo.Cache#getCacheType()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_CacheType();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Cache#getPlacedBy <em>Placed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placed By</em>'.
	 * @see se.eskilson.egeo.Cache#getPlacedBy()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_PlacedBy();

	/**
	 * Returns the meta object for the reference '{@link se.eskilson.egeo.Cache#getOwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned By</em>'.
	 * @see se.eskilson.egeo.Cache#getOwnedBy()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_OwnedBy();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Cache#getCont <em>Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cont</em>'.
	 * @see se.eskilson.egeo.Cache#getCont()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Cont();

	/**
	 * Returns the meta object for the reference list '{@link se.eskilson.egeo.Cache#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see se.eskilson.egeo.Cache#getAttributes()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Cache#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see se.eskilson.egeo.Cache#getDifficulty()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Difficulty();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Cache#getTerrain <em>Terrain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terrain</em>'.
	 * @see se.eskilson.egeo.Cache#getTerrain()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Terrain();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Cache#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see se.eskilson.egeo.Cache#getCountry()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Country();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Cache#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see se.eskilson.egeo.Cache#getState()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_State();

	/**
	 * Returns the meta object for the containment reference '{@link se.eskilson.egeo.Cache#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short Description</em>'.
	 * @see se.eskilson.egeo.Cache#getShortDescription()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_ShortDescription();

	/**
	 * Returns the meta object for the containment reference '{@link se.eskilson.egeo.Cache#getLongDescription <em>Long Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Long Description</em>'.
	 * @see se.eskilson.egeo.Cache#getLongDescription()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_LongDescription();

	/**
	 * Returns the meta object for the containment reference '{@link se.eskilson.egeo.Cache#getCoordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinate</em>'.
	 * @see se.eskilson.egeo.Cache#getCoordinate()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_Coordinate();

	/**
	 * Returns the meta object for the containment reference list '{@link se.eskilson.egeo.Cache#getLogs <em>Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logs</em>'.
	 * @see se.eskilson.egeo.Cache#getLogs()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_Logs();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Cache#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see se.eskilson.egeo.Cache#getHint()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Hint();

	/**
	 * Returns the meta object for class '{@link se.eskilson.egeo.Log <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log</em>'.
	 * @see se.eskilson.egeo.Log
	 * @generated
	 */
	EClass getLog();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Log#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see se.eskilson.egeo.Log#getText()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_Text();

	/**
	 * Returns the meta object for the reference '{@link se.eskilson.egeo.Log#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see se.eskilson.egeo.Log#getUser()
	 * @see #getLog()
	 * @generated
	 */
	EReference getLog_User();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Log#isEncoded <em>Encoded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoded</em>'.
	 * @see se.eskilson.egeo.Log#isEncoded()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_Encoded();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Log#getLogId <em>Log Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Id</em>'.
	 * @see se.eskilson.egeo.Log#getLogId()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_LogId();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Log#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see se.eskilson.egeo.Log#getDate()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_Date();

	/**
	 * Returns the meta object for the attribute '{@link se.eskilson.egeo.Log#getLogType <em>Log Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Type</em>'.
	 * @see se.eskilson.egeo.Log#getLogType()
	 * @see #getLog()
	 * @generated
	 */
	EAttribute getLog_LogType();

	/**
	 * Returns the meta object for enum '{@link se.eskilson.egeo.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Container</em>'.
	 * @see se.eskilson.egeo.Container
	 * @generated
	 */
	EEnum getContainer();

	/**
	 * Returns the meta object for enum '{@link se.eskilson.egeo.CacheType <em>Cache Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Type</em>'.
	 * @see se.eskilson.egeo.CacheType
	 * @generated
	 */
	EEnum getCacheType();

	/**
	 * Returns the meta object for enum '{@link se.eskilson.egeo.LogType <em>Log Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Log Type</em>'.
	 * @see se.eskilson.egeo.LogType
	 * @generated
	 */
	EEnum getLogType();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel create='<%java.util.Date%> _xtrycatchfinallyexpression = null;\ntry\n{\n\t<%java.util.Date%> _xifexpression = null;\n\tboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(it, null));\n\tif (_notEquals)\n\t{\n\t\t<%java.text.SimpleDateFormat%> _simpleDateFormat = new <%java.text.SimpleDateFormat%>(\"yyyy-MM-dd\");\n\t\t<%java.util.Date%> _parse = _simpleDateFormat.parse(it);\n\t\t_xifexpression = _parse;\n\t}\n\t_xtrycatchfinallyexpression = _xifexpression;\n}\ncatch (final Throwable _t) {\n\tif (_t instanceof <%java.text.ParseException%>) {\n\t\tfinal <%java.text.ParseException%> e = (<%java.text.ParseException%>)_t;\n\t\t<%java.lang.RuntimeException%> _runtimeException = new <%java.lang.RuntimeException%>(e);\n\t\tthrow _runtimeException;\n\t}\n\telse\n\t{\n\t\tthrow <%org.eclipse.xtext.xbase.lib.Exceptions%>.sneakyThrow(_t);\n\t}\n}\nreturn _xtrycatchfinallyexpression;' convert='<%java.lang.String%> _xifexpression = null;\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(it, null));\nif (_notEquals)\n{\n\t<%java.text.SimpleDateFormat%> _simpleDateFormat = new <%java.text.SimpleDateFormat%>(\"yyyy-MM-dd\");\n\t<%java.lang.String%> _format = _simpleDateFormat.format(it);\n\t_xifexpression = _format;\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EgeoFactory getEgeoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link se.eskilson.egeo.impl.CacheDBImpl <em>Cache DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.eskilson.egeo.impl.CacheDBImpl
		 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getCacheDB()
		 * @generated
		 */
		EClass CACHE_DB = eINSTANCE.getCacheDB();

		/**
		 * The meta object literal for the '<em><b>Caches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_DB__CACHES = eINSTANCE.getCacheDB_Caches();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_DB__ATTRIBUTES = eINSTANCE.getCacheDB_Attributes();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_DB__USERS = eINSTANCE.getCacheDB_Users();

		/**
		 * The meta object literal for the '{@link se.eskilson.egeo.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.eskilson.egeo.impl.AttributeImpl
		 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Attr Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTR_ID = eINSTANCE.getAttribute_AttrId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '{@link se.eskilson.egeo.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.eskilson.egeo.impl.DescriptionImpl
		 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__TEXT = eINSTANCE.getDescription_Text();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__HTML = eINSTANCE.getDescription_Html();

		/**
		 * The meta object literal for the '{@link se.eskilson.egeo.impl.CoordinateImpl <em>Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.eskilson.egeo.impl.CoordinateImpl
		 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getCoordinate()
		 * @generated
		 */
		EClass COORDINATE = eINSTANCE.getCoordinate();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__LATITUDE = eINSTANCE.getCoordinate_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__LONGITUDE = eINSTANCE.getCoordinate_Longitude();

		/**
		 * The meta object literal for the '{@link se.eskilson.egeo.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.eskilson.egeo.impl.UserImpl
		 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_ID = eINSTANCE.getUser_UserId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '{@link se.eskilson.egeo.impl.CacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.eskilson.egeo.impl.CacheImpl
		 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getCache()
		 * @generated
		 */
		EClass CACHE = eINSTANCE.getCache();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__CODE = eINSTANCE.getCache_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__NAME = eINSTANCE.getCache_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__DESCRIPTION = eINSTANCE.getCache_Description();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__TIME = eINSTANCE.getCache_Time();

		/**
		 * The meta object literal for the '<em><b>Cache Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__CACHE_TYPE = eINSTANCE.getCache_CacheType();

		/**
		 * The meta object literal for the '<em><b>Placed By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__PLACED_BY = eINSTANCE.getCache_PlacedBy();

		/**
		 * The meta object literal for the '<em><b>Owned By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE__OWNED_BY = eINSTANCE.getCache_OwnedBy();

		/**
		 * The meta object literal for the '<em><b>Cont</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__CONT = eINSTANCE.getCache_Cont();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE__ATTRIBUTES = eINSTANCE.getCache_Attributes();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__DIFFICULTY = eINSTANCE.getCache_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Terrain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__TERRAIN = eINSTANCE.getCache_Terrain();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__COUNTRY = eINSTANCE.getCache_Country();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__STATE = eINSTANCE.getCache_State();

		/**
		 * The meta object literal for the '<em><b>Short Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE__SHORT_DESCRIPTION = eINSTANCE
				.getCache_ShortDescription();

		/**
		 * The meta object literal for the '<em><b>Long Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE__LONG_DESCRIPTION = eINSTANCE
				.getCache_LongDescription();

		/**
		 * The meta object literal for the '<em><b>Coordinate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE__COORDINATE = eINSTANCE.getCache_Coordinate();

		/**
		 * The meta object literal for the '<em><b>Logs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE__LOGS = eINSTANCE.getCache_Logs();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__HINT = eINSTANCE.getCache_Hint();

		/**
		 * The meta object literal for the '{@link se.eskilson.egeo.impl.LogImpl <em>Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.eskilson.egeo.impl.LogImpl
		 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getLog()
		 * @generated
		 */
		EClass LOG = eINSTANCE.getLog();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__TEXT = eINSTANCE.getLog_Text();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG__USER = eINSTANCE.getLog_User();

		/**
		 * The meta object literal for the '<em><b>Encoded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__ENCODED = eINSTANCE.getLog_Encoded();

		/**
		 * The meta object literal for the '<em><b>Log Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__LOG_ID = eINSTANCE.getLog_LogId();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__DATE = eINSTANCE.getLog_Date();

		/**
		 * The meta object literal for the '<em><b>Log Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG__LOG_TYPE = eINSTANCE.getLog_LogType();

		/**
		 * The meta object literal for the '{@link se.eskilson.egeo.Container <em>Container</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.eskilson.egeo.Container
		 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getContainer()
		 * @generated
		 */
		EEnum CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '{@link se.eskilson.egeo.CacheType <em>Cache Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.eskilson.egeo.CacheType
		 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getCacheType()
		 * @generated
		 */
		EEnum CACHE_TYPE = eINSTANCE.getCacheType();

		/**
		 * The meta object literal for the '{@link se.eskilson.egeo.LogType <em>Log Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.eskilson.egeo.LogType
		 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getLogType()
		 * @generated
		 */
		EEnum LOG_TYPE = eINSTANCE.getLogType();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see se.eskilson.egeo.impl.EgeoPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //EgeoPackage
