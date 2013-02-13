/**
 */
package egeo.gpx.groundspeak;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see egeo.gpx.groundspeak.GroundspeakFactory
 * @model kind="package"
 * @generated
 */
public interface GroundspeakPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "groundspeak";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.groundspeak.com/cache/1/0/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "groundspeak";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GroundspeakPackage eINSTANCE = egeo.gpx.groundspeak.impl.GroundspeakPackageImpl.init();

	/**
	 * The meta object id for the '{@link egeo.gpx.groundspeak.impl.AttributesTypeImpl <em>Attributes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.groundspeak.impl.AttributesTypeImpl
	 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getAttributesType()
	 * @generated
	 */
	int ATTRIBUTES_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TYPE__ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Attributes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attributes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.groundspeak.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.groundspeak.impl.AttributeTypeImpl
	 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__INC = 2;

	/**
	 * The number of structural features of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.groundspeak.impl.CacheTypeImpl <em>Cache Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.groundspeak.impl.CacheTypeImpl
	 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getCacheType()
	 * @generated
	 */
	int CACHE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Placed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__PLACED_BY = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__OWNER = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__ATTRIBUTES = 5;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__DIFFICULTY = 6;

	/**
	 * The feature id for the '<em><b>Terrain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__TERRAIN = 7;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__COUNTRY = 8;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__STATE = 9;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__SHORT_DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__LONG_DESCRIPTION = 11;

	/**
	 * The feature id for the '<em><b>Encoded Hints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__ENCODED_HINTS = 12;

	/**
	 * The feature id for the '<em><b>Logs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__LOGS = 13;

	/**
	 * The feature id for the '<em><b>Travelbugs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__TRAVELBUGS = 14;

	/**
	 * The feature id for the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__ARCHIVED = 15;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__AVAILABLE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE__ID = 17;

	/**
	 * The number of structural features of the '<em>Cache Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Cache Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.groundspeak.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.groundspeak.impl.DocumentRootImpl
	 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CACHE = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.groundspeak.impl.FinderTypeImpl <em>Finder Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.groundspeak.impl.FinderTypeImpl
	 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getFinderType()
	 * @generated
	 */
	int FINDER_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDER_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Finder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Finder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.groundspeak.impl.LogsTypeImpl <em>Logs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.groundspeak.impl.LogsTypeImpl
	 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getLogsType()
	 * @generated
	 */
	int LOGS_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS_TYPE__LOG = 0;

	/**
	 * The number of structural features of the '<em>Logs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Logs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.groundspeak.impl.LogTypeImpl <em>Log Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.groundspeak.impl.LogTypeImpl
	 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getLogType()
	 * @generated
	 */
	int LOG_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TYPE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Finder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TYPE__FINDER = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TYPE__TEXT = 3;

	/**
	 * The feature id for the '<em><b>Log Wpt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TYPE__LOG_WPT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Log Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Log Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.groundspeak.impl.LogWptTypeImpl <em>Log Wpt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.groundspeak.impl.LogWptTypeImpl
	 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getLogWptType()
	 * @generated
	 */
	int LOG_WPT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_WPT_TYPE__LAT = 0;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_WPT_TYPE__LON = 1;

	/**
	 * The number of structural features of the '<em>Log Wpt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_WPT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Log Wpt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_WPT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.groundspeak.impl.LongDescriptionTypeImpl <em>Long Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.groundspeak.impl.LongDescriptionTypeImpl
	 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getLongDescriptionType()
	 * @generated
	 */
	int LONG_DESCRIPTION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DESCRIPTION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DESCRIPTION_TYPE__HTML = 1;

	/**
	 * The number of structural features of the '<em>Long Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DESCRIPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Long Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.groundspeak.impl.OwnerTypeImpl <em>Owner Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.groundspeak.impl.OwnerTypeImpl
	 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getOwnerType()
	 * @generated
	 */
	int OWNER_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Owner Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Owner Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.groundspeak.impl.ShortDescriptionTypeImpl <em>Short Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.groundspeak.impl.ShortDescriptionTypeImpl
	 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getShortDescriptionType()
	 * @generated
	 */
	int SHORT_DESCRIPTION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_DESCRIPTION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_DESCRIPTION_TYPE__HTML = 1;

	/**
	 * The number of structural features of the '<em>Short Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_DESCRIPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Short Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_DESCRIPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.groundspeak.impl.TextTypeImpl <em>Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.groundspeak.impl.TextTypeImpl
	 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getTextType()
	 * @generated
	 */
	int TEXT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Encoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE__ENCODED = 1;

	/**
	 * The number of structural features of the '<em>Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.groundspeak.impl.TravelbugsTypeImpl <em>Travelbugs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.groundspeak.impl.TravelbugsTypeImpl
	 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getTravelbugsType()
	 * @generated
	 */
	int TRAVELBUGS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Travelbug</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELBUGS_TYPE__TRAVELBUG = 0;

	/**
	 * The number of structural features of the '<em>Travelbugs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELBUGS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Travelbugs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELBUGS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.groundspeak.impl.TravelbugTypeImpl <em>Travelbug Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.groundspeak.impl.TravelbugTypeImpl
	 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getTravelbugType()
	 * @generated
	 */
	int TRAVELBUG_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELBUG_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELBUG_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELBUG_TYPE__REF = 2;

	/**
	 * The number of structural features of the '<em>Travelbug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELBUG_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Travelbug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELBUG_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link egeo.gpx.groundspeak.AttributesType <em>Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes Type</em>'.
	 * @see egeo.gpx.groundspeak.AttributesType
	 * @generated
	 */
	EClass getAttributesType();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.groundspeak.AttributesType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see egeo.gpx.groundspeak.AttributesType#getAttribute()
	 * @see #getAttributesType()
	 * @generated
	 */
	EReference getAttributesType_Attribute();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.groundspeak.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type</em>'.
	 * @see egeo.gpx.groundspeak.AttributeType
	 * @generated
	 */
	EClass getAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.AttributeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see egeo.gpx.groundspeak.AttributeType#getValue()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.AttributeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see egeo.gpx.groundspeak.AttributeType#getId()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.AttributeType#getInc <em>Inc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inc</em>'.
	 * @see egeo.gpx.groundspeak.AttributeType#getInc()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Inc();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.groundspeak.CacheType <em>Cache Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Type</em>'.
	 * @see egeo.gpx.groundspeak.CacheType
	 * @generated
	 */
	EClass getCacheType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.CacheType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getName()
	 * @see #getCacheType()
	 * @generated
	 */
	EAttribute getCacheType_Name();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.CacheType#getPlacedBy <em>Placed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placed By</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getPlacedBy()
	 * @see #getCacheType()
	 * @generated
	 */
	EAttribute getCacheType_PlacedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.groundspeak.CacheType#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owner</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getOwner()
	 * @see #getCacheType()
	 * @generated
	 */
	EReference getCacheType_Owner();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.CacheType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getType()
	 * @see #getCacheType()
	 * @generated
	 */
	EAttribute getCacheType_Type();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.CacheType#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getContainer()
	 * @see #getCacheType()
	 * @generated
	 */
	EAttribute getCacheType_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.groundspeak.CacheType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getAttributes()
	 * @see #getCacheType()
	 * @generated
	 */
	EReference getCacheType_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.CacheType#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getDifficulty()
	 * @see #getCacheType()
	 * @generated
	 */
	EAttribute getCacheType_Difficulty();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.CacheType#getTerrain <em>Terrain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terrain</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getTerrain()
	 * @see #getCacheType()
	 * @generated
	 */
	EAttribute getCacheType_Terrain();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.CacheType#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getCountry()
	 * @see #getCacheType()
	 * @generated
	 */
	EAttribute getCacheType_Country();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.CacheType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getState()
	 * @see #getCacheType()
	 * @generated
	 */
	EAttribute getCacheType_State();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.groundspeak.CacheType#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Short Description</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getShortDescription()
	 * @see #getCacheType()
	 * @generated
	 */
	EReference getCacheType_ShortDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.groundspeak.CacheType#getLongDescription <em>Long Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Long Description</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getLongDescription()
	 * @see #getCacheType()
	 * @generated
	 */
	EReference getCacheType_LongDescription();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.CacheType#getEncodedHints <em>Encoded Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoded Hints</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getEncodedHints()
	 * @see #getCacheType()
	 * @generated
	 */
	EAttribute getCacheType_EncodedHints();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.groundspeak.CacheType#getLogs <em>Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logs</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getLogs()
	 * @see #getCacheType()
	 * @generated
	 */
	EReference getCacheType_Logs();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.groundspeak.CacheType#getTravelbugs <em>Travelbugs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Travelbugs</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getTravelbugs()
	 * @see #getCacheType()
	 * @generated
	 */
	EReference getCacheType_Travelbugs();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.CacheType#getArchived <em>Archived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archived</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getArchived()
	 * @see #getCacheType()
	 * @generated
	 */
	EAttribute getCacheType_Archived();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.CacheType#getAvailable <em>Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getAvailable()
	 * @see #getCacheType()
	 * @generated
	 */
	EAttribute getCacheType_Available();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.CacheType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see egeo.gpx.groundspeak.CacheType#getId()
	 * @see #getCacheType()
	 * @generated
	 */
	EAttribute getCacheType_Id();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.groundspeak.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see egeo.gpx.groundspeak.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link egeo.gpx.groundspeak.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see egeo.gpx.groundspeak.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link egeo.gpx.groundspeak.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see egeo.gpx.groundspeak.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link egeo.gpx.groundspeak.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see egeo.gpx.groundspeak.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link egeo.gpx.groundspeak.DocumentRoot#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see egeo.gpx.groundspeak.DocumentRoot#getCache()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Cache();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.groundspeak.FinderType <em>Finder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finder Type</em>'.
	 * @see egeo.gpx.groundspeak.FinderType
	 * @generated
	 */
	EClass getFinderType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.FinderType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see egeo.gpx.groundspeak.FinderType#getValue()
	 * @see #getFinderType()
	 * @generated
	 */
	EAttribute getFinderType_Value();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.FinderType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see egeo.gpx.groundspeak.FinderType#getId()
	 * @see #getFinderType()
	 * @generated
	 */
	EAttribute getFinderType_Id();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.groundspeak.LogsType <em>Logs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logs Type</em>'.
	 * @see egeo.gpx.groundspeak.LogsType
	 * @generated
	 */
	EClass getLogsType();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.groundspeak.LogsType#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log</em>'.
	 * @see egeo.gpx.groundspeak.LogsType#getLog()
	 * @see #getLogsType()
	 * @generated
	 */
	EReference getLogsType_Log();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.groundspeak.LogType <em>Log Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Type</em>'.
	 * @see egeo.gpx.groundspeak.LogType
	 * @generated
	 */
	EClass getLogType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.LogType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see egeo.gpx.groundspeak.LogType#getDate()
	 * @see #getLogType()
	 * @generated
	 */
	EAttribute getLogType_Date();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.LogType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see egeo.gpx.groundspeak.LogType#getType()
	 * @see #getLogType()
	 * @generated
	 */
	EAttribute getLogType_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.groundspeak.LogType#getFinder <em>Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Finder</em>'.
	 * @see egeo.gpx.groundspeak.LogType#getFinder()
	 * @see #getLogType()
	 * @generated
	 */
	EReference getLogType_Finder();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.groundspeak.LogType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see egeo.gpx.groundspeak.LogType#getText()
	 * @see #getLogType()
	 * @generated
	 */
	EReference getLogType_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.groundspeak.LogType#getLogWpt <em>Log Wpt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log Wpt</em>'.
	 * @see egeo.gpx.groundspeak.LogType#getLogWpt()
	 * @see #getLogType()
	 * @generated
	 */
	EReference getLogType_LogWpt();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.LogType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see egeo.gpx.groundspeak.LogType#getId()
	 * @see #getLogType()
	 * @generated
	 */
	EAttribute getLogType_Id();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.groundspeak.LogWptType <em>Log Wpt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Wpt Type</em>'.
	 * @see egeo.gpx.groundspeak.LogWptType
	 * @generated
	 */
	EClass getLogWptType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.LogWptType#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see egeo.gpx.groundspeak.LogWptType#getLat()
	 * @see #getLogWptType()
	 * @generated
	 */
	EAttribute getLogWptType_Lat();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.LogWptType#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see egeo.gpx.groundspeak.LogWptType#getLon()
	 * @see #getLogWptType()
	 * @generated
	 */
	EAttribute getLogWptType_Lon();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.groundspeak.LongDescriptionType <em>Long Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Description Type</em>'.
	 * @see egeo.gpx.groundspeak.LongDescriptionType
	 * @generated
	 */
	EClass getLongDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.LongDescriptionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see egeo.gpx.groundspeak.LongDescriptionType#getValue()
	 * @see #getLongDescriptionType()
	 * @generated
	 */
	EAttribute getLongDescriptionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.LongDescriptionType#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see egeo.gpx.groundspeak.LongDescriptionType#getHtml()
	 * @see #getLongDescriptionType()
	 * @generated
	 */
	EAttribute getLongDescriptionType_Html();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.groundspeak.OwnerType <em>Owner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owner Type</em>'.
	 * @see egeo.gpx.groundspeak.OwnerType
	 * @generated
	 */
	EClass getOwnerType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.OwnerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see egeo.gpx.groundspeak.OwnerType#getValue()
	 * @see #getOwnerType()
	 * @generated
	 */
	EAttribute getOwnerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.OwnerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see egeo.gpx.groundspeak.OwnerType#getId()
	 * @see #getOwnerType()
	 * @generated
	 */
	EAttribute getOwnerType_Id();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.groundspeak.ShortDescriptionType <em>Short Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Description Type</em>'.
	 * @see egeo.gpx.groundspeak.ShortDescriptionType
	 * @generated
	 */
	EClass getShortDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.ShortDescriptionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see egeo.gpx.groundspeak.ShortDescriptionType#getValue()
	 * @see #getShortDescriptionType()
	 * @generated
	 */
	EAttribute getShortDescriptionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.ShortDescriptionType#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see egeo.gpx.groundspeak.ShortDescriptionType#getHtml()
	 * @see #getShortDescriptionType()
	 * @generated
	 */
	EAttribute getShortDescriptionType_Html();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.groundspeak.TextType <em>Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Type</em>'.
	 * @see egeo.gpx.groundspeak.TextType
	 * @generated
	 */
	EClass getTextType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.TextType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see egeo.gpx.groundspeak.TextType#getValue()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Value();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.TextType#getEncoded <em>Encoded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoded</em>'.
	 * @see egeo.gpx.groundspeak.TextType#getEncoded()
	 * @see #getTextType()
	 * @generated
	 */
	EAttribute getTextType_Encoded();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.groundspeak.TravelbugsType <em>Travelbugs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travelbugs Type</em>'.
	 * @see egeo.gpx.groundspeak.TravelbugsType
	 * @generated
	 */
	EClass getTravelbugsType();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.groundspeak.TravelbugsType#getTravelbug <em>Travelbug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Travelbug</em>'.
	 * @see egeo.gpx.groundspeak.TravelbugsType#getTravelbug()
	 * @see #getTravelbugsType()
	 * @generated
	 */
	EReference getTravelbugsType_Travelbug();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.groundspeak.TravelbugType <em>Travelbug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travelbug Type</em>'.
	 * @see egeo.gpx.groundspeak.TravelbugType
	 * @generated
	 */
	EClass getTravelbugType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.TravelbugType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see egeo.gpx.groundspeak.TravelbugType#getName()
	 * @see #getTravelbugType()
	 * @generated
	 */
	EAttribute getTravelbugType_Name();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.TravelbugType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see egeo.gpx.groundspeak.TravelbugType#getId()
	 * @see #getTravelbugType()
	 * @generated
	 */
	EAttribute getTravelbugType_Id();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.groundspeak.TravelbugType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see egeo.gpx.groundspeak.TravelbugType#getRef()
	 * @see #getTravelbugType()
	 * @generated
	 */
	EAttribute getTravelbugType_Ref();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GroundspeakFactory getGroundspeakFactory();

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
		 * The meta object literal for the '{@link egeo.gpx.groundspeak.impl.AttributesTypeImpl <em>Attributes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.groundspeak.impl.AttributesTypeImpl
		 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getAttributesType()
		 * @generated
		 */
		EClass ATTRIBUTES_TYPE = eINSTANCE.getAttributesType();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES_TYPE__ATTRIBUTE = eINSTANCE.getAttributesType_Attribute();

		/**
		 * The meta object literal for the '{@link egeo.gpx.groundspeak.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.groundspeak.impl.AttributeTypeImpl
		 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getAttributeType()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__VALUE = eINSTANCE.getAttributeType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__ID = eINSTANCE.getAttributeType_Id();

		/**
		 * The meta object literal for the '<em><b>Inc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__INC = eINSTANCE.getAttributeType_Inc();

		/**
		 * The meta object literal for the '{@link egeo.gpx.groundspeak.impl.CacheTypeImpl <em>Cache Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.groundspeak.impl.CacheTypeImpl
		 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getCacheType()
		 * @generated
		 */
		EClass CACHE_TYPE = eINSTANCE.getCacheType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_TYPE__NAME = eINSTANCE.getCacheType_Name();

		/**
		 * The meta object literal for the '<em><b>Placed By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_TYPE__PLACED_BY = eINSTANCE.getCacheType_PlacedBy();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_TYPE__OWNER = eINSTANCE.getCacheType_Owner();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_TYPE__TYPE = eINSTANCE.getCacheType_Type();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_TYPE__CONTAINER = eINSTANCE.getCacheType_Container();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_TYPE__ATTRIBUTES = eINSTANCE.getCacheType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_TYPE__DIFFICULTY = eINSTANCE.getCacheType_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Terrain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_TYPE__TERRAIN = eINSTANCE.getCacheType_Terrain();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_TYPE__COUNTRY = eINSTANCE.getCacheType_Country();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_TYPE__STATE = eINSTANCE.getCacheType_State();

		/**
		 * The meta object literal for the '<em><b>Short Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_TYPE__SHORT_DESCRIPTION = eINSTANCE.getCacheType_ShortDescription();

		/**
		 * The meta object literal for the '<em><b>Long Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_TYPE__LONG_DESCRIPTION = eINSTANCE.getCacheType_LongDescription();

		/**
		 * The meta object literal for the '<em><b>Encoded Hints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_TYPE__ENCODED_HINTS = eINSTANCE.getCacheType_EncodedHints();

		/**
		 * The meta object literal for the '<em><b>Logs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_TYPE__LOGS = eINSTANCE.getCacheType_Logs();

		/**
		 * The meta object literal for the '<em><b>Travelbugs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_TYPE__TRAVELBUGS = eINSTANCE.getCacheType_Travelbugs();

		/**
		 * The meta object literal for the '<em><b>Archived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_TYPE__ARCHIVED = eINSTANCE.getCacheType_Archived();

		/**
		 * The meta object literal for the '<em><b>Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_TYPE__AVAILABLE = eINSTANCE.getCacheType_Available();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_TYPE__ID = eINSTANCE.getCacheType_Id();

		/**
		 * The meta object literal for the '{@link egeo.gpx.groundspeak.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.groundspeak.impl.DocumentRootImpl
		 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CACHE = eINSTANCE.getDocumentRoot_Cache();

		/**
		 * The meta object literal for the '{@link egeo.gpx.groundspeak.impl.FinderTypeImpl <em>Finder Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.groundspeak.impl.FinderTypeImpl
		 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getFinderType()
		 * @generated
		 */
		EClass FINDER_TYPE = eINSTANCE.getFinderType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDER_TYPE__VALUE = eINSTANCE.getFinderType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDER_TYPE__ID = eINSTANCE.getFinderType_Id();

		/**
		 * The meta object literal for the '{@link egeo.gpx.groundspeak.impl.LogsTypeImpl <em>Logs Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.groundspeak.impl.LogsTypeImpl
		 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getLogsType()
		 * @generated
		 */
		EClass LOGS_TYPE = eINSTANCE.getLogsType();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGS_TYPE__LOG = eINSTANCE.getLogsType_Log();

		/**
		 * The meta object literal for the '{@link egeo.gpx.groundspeak.impl.LogTypeImpl <em>Log Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.groundspeak.impl.LogTypeImpl
		 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getLogType()
		 * @generated
		 */
		EClass LOG_TYPE = eINSTANCE.getLogType();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_TYPE__DATE = eINSTANCE.getLogType_Date();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_TYPE__TYPE = eINSTANCE.getLogType_Type();

		/**
		 * The meta object literal for the '<em><b>Finder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_TYPE__FINDER = eINSTANCE.getLogType_Finder();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_TYPE__TEXT = eINSTANCE.getLogType_Text();

		/**
		 * The meta object literal for the '<em><b>Log Wpt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_TYPE__LOG_WPT = eINSTANCE.getLogType_LogWpt();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_TYPE__ID = eINSTANCE.getLogType_Id();

		/**
		 * The meta object literal for the '{@link egeo.gpx.groundspeak.impl.LogWptTypeImpl <em>Log Wpt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.groundspeak.impl.LogWptTypeImpl
		 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getLogWptType()
		 * @generated
		 */
		EClass LOG_WPT_TYPE = eINSTANCE.getLogWptType();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_WPT_TYPE__LAT = eINSTANCE.getLogWptType_Lat();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_WPT_TYPE__LON = eINSTANCE.getLogWptType_Lon();

		/**
		 * The meta object literal for the '{@link egeo.gpx.groundspeak.impl.LongDescriptionTypeImpl <em>Long Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.groundspeak.impl.LongDescriptionTypeImpl
		 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getLongDescriptionType()
		 * @generated
		 */
		EClass LONG_DESCRIPTION_TYPE = eINSTANCE.getLongDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_DESCRIPTION_TYPE__VALUE = eINSTANCE.getLongDescriptionType_Value();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_DESCRIPTION_TYPE__HTML = eINSTANCE.getLongDescriptionType_Html();

		/**
		 * The meta object literal for the '{@link egeo.gpx.groundspeak.impl.OwnerTypeImpl <em>Owner Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.groundspeak.impl.OwnerTypeImpl
		 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getOwnerType()
		 * @generated
		 */
		EClass OWNER_TYPE = eINSTANCE.getOwnerType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER_TYPE__VALUE = eINSTANCE.getOwnerType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER_TYPE__ID = eINSTANCE.getOwnerType_Id();

		/**
		 * The meta object literal for the '{@link egeo.gpx.groundspeak.impl.ShortDescriptionTypeImpl <em>Short Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.groundspeak.impl.ShortDescriptionTypeImpl
		 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getShortDescriptionType()
		 * @generated
		 */
		EClass SHORT_DESCRIPTION_TYPE = eINSTANCE.getShortDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_DESCRIPTION_TYPE__VALUE = eINSTANCE.getShortDescriptionType_Value();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_DESCRIPTION_TYPE__HTML = eINSTANCE.getShortDescriptionType_Html();

		/**
		 * The meta object literal for the '{@link egeo.gpx.groundspeak.impl.TextTypeImpl <em>Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.groundspeak.impl.TextTypeImpl
		 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getTextType()
		 * @generated
		 */
		EClass TEXT_TYPE = eINSTANCE.getTextType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TYPE__VALUE = eINSTANCE.getTextType_Value();

		/**
		 * The meta object literal for the '<em><b>Encoded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TYPE__ENCODED = eINSTANCE.getTextType_Encoded();

		/**
		 * The meta object literal for the '{@link egeo.gpx.groundspeak.impl.TravelbugsTypeImpl <em>Travelbugs Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.groundspeak.impl.TravelbugsTypeImpl
		 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getTravelbugsType()
		 * @generated
		 */
		EClass TRAVELBUGS_TYPE = eINSTANCE.getTravelbugsType();

		/**
		 * The meta object literal for the '<em><b>Travelbug</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVELBUGS_TYPE__TRAVELBUG = eINSTANCE.getTravelbugsType_Travelbug();

		/**
		 * The meta object literal for the '{@link egeo.gpx.groundspeak.impl.TravelbugTypeImpl <em>Travelbug Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.groundspeak.impl.TravelbugTypeImpl
		 * @see egeo.gpx.groundspeak.impl.GroundspeakPackageImpl#getTravelbugType()
		 * @generated
		 */
		EClass TRAVELBUG_TYPE = eINSTANCE.getTravelbugType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVELBUG_TYPE__NAME = eINSTANCE.getTravelbugType_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVELBUG_TYPE__ID = eINSTANCE.getTravelbugType_Id();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVELBUG_TYPE__REF = eINSTANCE.getTravelbugType_Ref();

	}

} //GroundspeakPackage
