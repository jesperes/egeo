/**
 */
package egeo;

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
 * @see egeo.EgeoFactory
 * @model kind="package"
 * @generated
 */
public interface EgeoPackage extends EPackage
{
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
  String eNS_URI = "egeo";

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
  EgeoPackage eINSTANCE = egeo.impl.EgeoPackageImpl.init();

  /**
   * The meta object id for the '{@link egeo.impl.CoordinateImpl <em>Coordinate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see egeo.impl.CoordinateImpl
   * @see egeo.impl.EgeoPackageImpl#getCoordinate()
   * @generated
   */
  int COORDINATE = 0;

  /**
   * The feature id for the '<em><b>Lat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATE__LAT = 0;

  /**
   * The feature id for the '<em><b>Lon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATE__LON = 1;

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
   * The meta object id for the '{@link egeo.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see egeo.impl.DescriptionImpl
   * @see egeo.impl.EgeoPackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Html</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__HTML = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__TEXT = 1;

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
   * The meta object id for the '{@link egeo.impl.LogImpl <em>Log</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see egeo.impl.LogImpl
   * @see egeo.impl.EgeoPackageImpl#getLog()
   * @generated
   */
  int LOG = 2;

  /**
   * The feature id for the '<em><b>Log Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__LOG_ID = 0;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__DATE = 1;

  /**
   * The feature id for the '<em><b>Log Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__LOG_TYPE = 2;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__TEXT = 3;

  /**
   * The feature id for the '<em><b>Finder</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__FINDER = 4;

  /**
   * The feature id for the '<em><b>Encoded</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__ENCODED = 5;

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
   * The meta object id for the '{@link egeo.impl.UserImpl <em>User</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see egeo.impl.UserImpl
   * @see egeo.impl.EgeoPackageImpl#getUser()
   * @generated
   */
  int USER = 3;

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
   * The meta object id for the '{@link egeo.impl.GeocacheImpl <em>Geocache</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see egeo.impl.GeocacheImpl
   * @see egeo.impl.EgeoPackageImpl#getGeocache()
   * @generated
   */
  int GEOCACHE = 4;

  /**
   * The feature id for the '<em><b>Cache Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__CACHE_ID = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__CODE = 1;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__TIME = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__NAME = 3;

  /**
   * The feature id for the '<em><b>Available</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__AVAILABLE = 4;

  /**
   * The feature id for the '<em><b>Archived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__ARCHIVED = 5;

  /**
   * The feature id for the '<em><b>Container Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__CONTAINER_TYPE = 6;

  /**
   * The feature id for the '<em><b>Owner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__OWNER = 7;

  /**
   * The feature id for the '<em><b>Placed By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__PLACED_BY = 8;

  /**
   * The feature id for the '<em><b>Cache Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__CACHE_TYPE = 9;

  /**
   * The feature id for the '<em><b>Difficulty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__DIFFICULTY = 10;

  /**
   * The feature id for the '<em><b>Terrain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__TERRAIN = 11;

  /**
   * The feature id for the '<em><b>Country</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__COUNTRY = 12;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__STATE = 13;

  /**
   * The feature id for the '<em><b>Coord</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__COORD = 14;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__URL = 15;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__ATTRIBUTES = 16;

  /**
   * The feature id for the '<em><b>Hint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__HINT = 17;

  /**
   * The feature id for the '<em><b>Short Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__SHORT_TEXT = 18;

  /**
   * The feature id for the '<em><b>Long Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__LONG_TEXT = 19;

  /**
   * The feature id for the '<em><b>Logs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__LOGS = 20;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__SOURCE = 21;

  /**
   * The feature id for the '<em><b>Last Update</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__LAST_UPDATE = 22;

  /**
   * The feature id for the '<em><b>Tags</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE__TAGS = 23;

  /**
   * The number of structural features of the '<em>Geocache</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE_FEATURE_COUNT = 24;

  /**
   * The number of operations of the '<em>Geocache</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEOCACHE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link egeo.CacheType <em>Cache Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see egeo.CacheType
   * @see egeo.impl.EgeoPackageImpl#getCacheType()
   * @generated
   */
  int CACHE_TYPE = 5;

  /**
   * The meta object id for the '{@link egeo.LogType <em>Log Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see egeo.LogType
   * @see egeo.impl.EgeoPackageImpl#getLogType()
   * @generated
   */
  int LOG_TYPE = 6;

  /**
   * The meta object id for the '{@link egeo.Attribute <em>Attribute</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see egeo.Attribute
   * @see egeo.impl.EgeoPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 7;

  /**
   * The meta object id for the '{@link egeo.ContainerType <em>Container Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see egeo.ContainerType
   * @see egeo.impl.EgeoPackageImpl#getContainerType()
   * @generated
   */
  int CONTAINER_TYPE = 8;

  /**
   * The meta object id for the '<em>URI</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.URI
   * @see egeo.impl.EgeoPackageImpl#getURI()
   * @generated
   */
  int URI = 9;

  /**
   * The meta object id for the '<em>URL</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.net.URL
   * @see egeo.impl.EgeoPackageImpl#getURL()
   * @generated
   */
  int URL = 10;

  /**
   * The meta object id for the '<em>Date</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.Date
   * @see egeo.impl.EgeoPackageImpl#getDate()
   * @generated
   */
  int DATE = 11;

  /**
   * The meta object id for the '<em>Big Decimal</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigDecimal
   * @see egeo.impl.EgeoPackageImpl#getBigDecimal()
   * @generated
   */
  int BIG_DECIMAL = 12;


  /**
   * Returns the meta object for class '{@link egeo.Coordinate <em>Coordinate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Coordinate</em>'.
   * @see egeo.Coordinate
   * @generated
   */
  EClass getCoordinate();

  /**
   * Returns the meta object for the attribute '{@link egeo.Coordinate#getLat <em>Lat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lat</em>'.
   * @see egeo.Coordinate#getLat()
   * @see #getCoordinate()
   * @generated
   */
  EAttribute getCoordinate_Lat();

  /**
   * Returns the meta object for the attribute '{@link egeo.Coordinate#getLon <em>Lon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lon</em>'.
   * @see egeo.Coordinate#getLon()
   * @see #getCoordinate()
   * @generated
   */
  EAttribute getCoordinate_Lon();

  /**
   * Returns the meta object for class '{@link egeo.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description</em>'.
   * @see egeo.Description
   * @generated
   */
  EClass getDescription();

  /**
   * Returns the meta object for the attribute '{@link egeo.Description#isHtml <em>Html</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Html</em>'.
   * @see egeo.Description#isHtml()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Html();

  /**
   * Returns the meta object for the attribute '{@link egeo.Description#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see egeo.Description#getText()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Text();

  /**
   * Returns the meta object for class '{@link egeo.Log <em>Log</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Log</em>'.
   * @see egeo.Log
   * @generated
   */
  EClass getLog();

  /**
   * Returns the meta object for the attribute '{@link egeo.Log#getLogId <em>Log Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Log Id</em>'.
   * @see egeo.Log#getLogId()
   * @see #getLog()
   * @generated
   */
  EAttribute getLog_LogId();

  /**
   * Returns the meta object for the attribute '{@link egeo.Log#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see egeo.Log#getDate()
   * @see #getLog()
   * @generated
   */
  EAttribute getLog_Date();

  /**
   * Returns the meta object for the attribute '{@link egeo.Log#getLogType <em>Log Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Log Type</em>'.
   * @see egeo.Log#getLogType()
   * @see #getLog()
   * @generated
   */
  EAttribute getLog_LogType();

  /**
   * Returns the meta object for the attribute '{@link egeo.Log#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see egeo.Log#getText()
   * @see #getLog()
   * @generated
   */
  EAttribute getLog_Text();

  /**
   * Returns the meta object for the containment reference '{@link egeo.Log#getFinder <em>Finder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Finder</em>'.
   * @see egeo.Log#getFinder()
   * @see #getLog()
   * @generated
   */
  EReference getLog_Finder();

  /**
   * Returns the meta object for the attribute '{@link egeo.Log#isEncoded <em>Encoded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Encoded</em>'.
   * @see egeo.Log#isEncoded()
   * @see #getLog()
   * @generated
   */
  EAttribute getLog_Encoded();

  /**
   * Returns the meta object for class '{@link egeo.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User</em>'.
   * @see egeo.User
   * @generated
   */
  EClass getUser();

  /**
   * Returns the meta object for the attribute '{@link egeo.User#getUserId <em>User Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User Id</em>'.
   * @see egeo.User#getUserId()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_UserId();

  /**
   * Returns the meta object for the attribute '{@link egeo.User#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see egeo.User#getName()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_Name();

  /**
   * Returns the meta object for class '{@link egeo.Geocache <em>Geocache</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geocache</em>'.
   * @see egeo.Geocache
   * @generated
   */
  EClass getGeocache();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getCacheId <em>Cache Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cache Id</em>'.
   * @see egeo.Geocache#getCacheId()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_CacheId();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see egeo.Geocache#getCode()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_Code();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see egeo.Geocache#getTime()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_Time();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see egeo.Geocache#getName()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_Name();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#isAvailable <em>Available</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Available</em>'.
   * @see egeo.Geocache#isAvailable()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_Available();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#isArchived <em>Archived</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Archived</em>'.
   * @see egeo.Geocache#isArchived()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_Archived();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getContainerType <em>Container Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Container Type</em>'.
   * @see egeo.Geocache#getContainerType()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_ContainerType();

  /**
   * Returns the meta object for the containment reference '{@link egeo.Geocache#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owner</em>'.
   * @see egeo.Geocache#getOwner()
   * @see #getGeocache()
   * @generated
   */
  EReference getGeocache_Owner();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getPlacedBy <em>Placed By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Placed By</em>'.
   * @see egeo.Geocache#getPlacedBy()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_PlacedBy();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getCacheType <em>Cache Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cache Type</em>'.
   * @see egeo.Geocache#getCacheType()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_CacheType();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getDifficulty <em>Difficulty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Difficulty</em>'.
   * @see egeo.Geocache#getDifficulty()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_Difficulty();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getTerrain <em>Terrain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Terrain</em>'.
   * @see egeo.Geocache#getTerrain()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_Terrain();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getCountry <em>Country</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Country</em>'.
   * @see egeo.Geocache#getCountry()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_Country();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see egeo.Geocache#getState()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_State();

  /**
   * Returns the meta object for the containment reference '{@link egeo.Geocache#getCoord <em>Coord</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Coord</em>'.
   * @see egeo.Geocache#getCoord()
   * @see #getGeocache()
   * @generated
   */
  EReference getGeocache_Coord();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see egeo.Geocache#getUrl()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_Url();

  /**
   * Returns the meta object for the attribute list '{@link egeo.Geocache#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Attributes</em>'.
   * @see egeo.Geocache#getAttributes()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_Attributes();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getHint <em>Hint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hint</em>'.
   * @see egeo.Geocache#getHint()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_Hint();

  /**
   * Returns the meta object for the containment reference '{@link egeo.Geocache#getShortText <em>Short Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Short Text</em>'.
   * @see egeo.Geocache#getShortText()
   * @see #getGeocache()
   * @generated
   */
  EReference getGeocache_ShortText();

  /**
   * Returns the meta object for the containment reference '{@link egeo.Geocache#getLongText <em>Long Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Long Text</em>'.
   * @see egeo.Geocache#getLongText()
   * @see #getGeocache()
   * @generated
   */
  EReference getGeocache_LongText();

  /**
   * Returns the meta object for the containment reference list '{@link egeo.Geocache#getLogs <em>Logs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Logs</em>'.
   * @see egeo.Geocache#getLogs()
   * @see #getGeocache()
   * @generated
   */
  EReference getGeocache_Logs();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see egeo.Geocache#getSource()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_Source();

  /**
   * Returns the meta object for the attribute '{@link egeo.Geocache#getLastUpdate <em>Last Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Update</em>'.
   * @see egeo.Geocache#getLastUpdate()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_LastUpdate();

  /**
   * Returns the meta object for the attribute list '{@link egeo.Geocache#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tags</em>'.
   * @see egeo.Geocache#getTags()
   * @see #getGeocache()
   * @generated
   */
  EAttribute getGeocache_Tags();

  /**
   * Returns the meta object for enum '{@link egeo.CacheType <em>Cache Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cache Type</em>'.
   * @see egeo.CacheType
   * @generated
   */
  EEnum getCacheType();

  /**
   * Returns the meta object for enum '{@link egeo.LogType <em>Log Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Log Type</em>'.
   * @see egeo.LogType
   * @generated
   */
  EEnum getLogType();

  /**
   * Returns the meta object for enum '{@link egeo.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute</em>'.
   * @see egeo.Attribute
   * @generated
   */
  EEnum getAttribute();

  /**
   * Returns the meta object for enum '{@link egeo.ContainerType <em>Container Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Container Type</em>'.
   * @see egeo.ContainerType
   * @generated
   */
  EEnum getContainerType();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>URI</em>'.
   * @see org.eclipse.emf.common.util.URI
   * @model instanceClass="org.eclipse.emf.common.util.URI"
   * @generated
   */
  EDataType getURI();

  /**
   * Returns the meta object for data type '{@link java.net.URL <em>URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>URL</em>'.
   * @see java.net.URL
   * @model instanceClass="java.net.URL"
   * @generated
   */
  EDataType getURL();

  /**
   * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Date</em>'.
   * @see java.util.Date
   * @model instanceClass="java.util.Date"
   * @generated
   */
  EDataType getDate();

  /**
   * Returns the meta object for data type '{@link java.math.BigDecimal <em>Big Decimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Big Decimal</em>'.
   * @see java.math.BigDecimal
   * @model instanceClass="java.math.BigDecimal"
   * @generated
   */
  EDataType getBigDecimal();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link egeo.impl.CoordinateImpl <em>Coordinate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see egeo.impl.CoordinateImpl
     * @see egeo.impl.EgeoPackageImpl#getCoordinate()
     * @generated
     */
    EClass COORDINATE = eINSTANCE.getCoordinate();

    /**
     * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COORDINATE__LAT = eINSTANCE.getCoordinate_Lat();

    /**
     * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COORDINATE__LON = eINSTANCE.getCoordinate_Lon();

    /**
     * The meta object literal for the '{@link egeo.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see egeo.impl.DescriptionImpl
     * @see egeo.impl.EgeoPackageImpl#getDescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDescription();

    /**
     * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__HTML = eINSTANCE.getDescription_Html();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__TEXT = eINSTANCE.getDescription_Text();

    /**
     * The meta object literal for the '{@link egeo.impl.LogImpl <em>Log</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see egeo.impl.LogImpl
     * @see egeo.impl.EgeoPackageImpl#getLog()
     * @generated
     */
    EClass LOG = eINSTANCE.getLog();

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
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG__TEXT = eINSTANCE.getLog_Text();

    /**
     * The meta object literal for the '<em><b>Finder</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOG__FINDER = eINSTANCE.getLog_Finder();

    /**
     * The meta object literal for the '<em><b>Encoded</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG__ENCODED = eINSTANCE.getLog_Encoded();

    /**
     * The meta object literal for the '{@link egeo.impl.UserImpl <em>User</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see egeo.impl.UserImpl
     * @see egeo.impl.EgeoPackageImpl#getUser()
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
     * The meta object literal for the '{@link egeo.impl.GeocacheImpl <em>Geocache</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see egeo.impl.GeocacheImpl
     * @see egeo.impl.EgeoPackageImpl#getGeocache()
     * @generated
     */
    EClass GEOCACHE = eINSTANCE.getGeocache();

    /**
     * The meta object literal for the '<em><b>Cache Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__CACHE_ID = eINSTANCE.getGeocache_CacheId();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__CODE = eINSTANCE.getGeocache_Code();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__TIME = eINSTANCE.getGeocache_Time();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__NAME = eINSTANCE.getGeocache_Name();

    /**
     * The meta object literal for the '<em><b>Available</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__AVAILABLE = eINSTANCE.getGeocache_Available();

    /**
     * The meta object literal for the '<em><b>Archived</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__ARCHIVED = eINSTANCE.getGeocache_Archived();

    /**
     * The meta object literal for the '<em><b>Container Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__CONTAINER_TYPE = eINSTANCE.getGeocache_ContainerType();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEOCACHE__OWNER = eINSTANCE.getGeocache_Owner();

    /**
     * The meta object literal for the '<em><b>Placed By</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__PLACED_BY = eINSTANCE.getGeocache_PlacedBy();

    /**
     * The meta object literal for the '<em><b>Cache Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__CACHE_TYPE = eINSTANCE.getGeocache_CacheType();

    /**
     * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__DIFFICULTY = eINSTANCE.getGeocache_Difficulty();

    /**
     * The meta object literal for the '<em><b>Terrain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__TERRAIN = eINSTANCE.getGeocache_Terrain();

    /**
     * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__COUNTRY = eINSTANCE.getGeocache_Country();

    /**
     * The meta object literal for the '<em><b>State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__STATE = eINSTANCE.getGeocache_State();

    /**
     * The meta object literal for the '<em><b>Coord</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEOCACHE__COORD = eINSTANCE.getGeocache_Coord();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__URL = eINSTANCE.getGeocache_Url();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__ATTRIBUTES = eINSTANCE.getGeocache_Attributes();

    /**
     * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__HINT = eINSTANCE.getGeocache_Hint();

    /**
     * The meta object literal for the '<em><b>Short Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEOCACHE__SHORT_TEXT = eINSTANCE.getGeocache_ShortText();

    /**
     * The meta object literal for the '<em><b>Long Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEOCACHE__LONG_TEXT = eINSTANCE.getGeocache_LongText();

    /**
     * The meta object literal for the '<em><b>Logs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEOCACHE__LOGS = eINSTANCE.getGeocache_Logs();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__SOURCE = eINSTANCE.getGeocache_Source();

    /**
     * The meta object literal for the '<em><b>Last Update</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__LAST_UPDATE = eINSTANCE.getGeocache_LastUpdate();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GEOCACHE__TAGS = eINSTANCE.getGeocache_Tags();

    /**
     * The meta object literal for the '{@link egeo.CacheType <em>Cache Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see egeo.CacheType
     * @see egeo.impl.EgeoPackageImpl#getCacheType()
     * @generated
     */
    EEnum CACHE_TYPE = eINSTANCE.getCacheType();

    /**
     * The meta object literal for the '{@link egeo.LogType <em>Log Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see egeo.LogType
     * @see egeo.impl.EgeoPackageImpl#getLogType()
     * @generated
     */
    EEnum LOG_TYPE = eINSTANCE.getLogType();

    /**
     * The meta object literal for the '{@link egeo.Attribute <em>Attribute</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see egeo.Attribute
     * @see egeo.impl.EgeoPackageImpl#getAttribute()
     * @generated
     */
    EEnum ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '{@link egeo.ContainerType <em>Container Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see egeo.ContainerType
     * @see egeo.impl.EgeoPackageImpl#getContainerType()
     * @generated
     */
    EEnum CONTAINER_TYPE = eINSTANCE.getContainerType();

    /**
     * The meta object literal for the '<em>URI</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.URI
     * @see egeo.impl.EgeoPackageImpl#getURI()
     * @generated
     */
    EDataType URI = eINSTANCE.getURI();

    /**
     * The meta object literal for the '<em>URL</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.net.URL
     * @see egeo.impl.EgeoPackageImpl#getURL()
     * @generated
     */
    EDataType URL = eINSTANCE.getURL();

    /**
     * The meta object literal for the '<em>Date</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.Date
     * @see egeo.impl.EgeoPackageImpl#getDate()
     * @generated
     */
    EDataType DATE = eINSTANCE.getDate();

    /**
     * The meta object literal for the '<em>Big Decimal</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.math.BigDecimal
     * @see egeo.impl.EgeoPackageImpl#getBigDecimal()
     * @generated
     */
    EDataType BIG_DECIMAL = eINSTANCE.getBigDecimal();

  }

} //EgeoPackage
