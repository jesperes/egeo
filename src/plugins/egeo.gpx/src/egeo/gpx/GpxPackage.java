/**
 */
package egeo.gpx;

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
 * @see egeo.gpx.GpxFactory
 * @model kind="package"
 * @generated
 */
public interface GpxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gpx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topografix.com/GPX/1/0";

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
	GpxPackage eINSTANCE = egeo.gpx.impl.GpxPackageImpl.init();

	/**
	 * The meta object id for the '{@link egeo.gpx.impl.BoundsTypeImpl <em>Bounds Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.impl.BoundsTypeImpl
	 * @see egeo.gpx.impl.GpxPackageImpl#getBoundsType()
	 * @generated
	 */
	int BOUNDS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Maxlat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_TYPE__MAXLAT = 0;

	/**
	 * The feature id for the '<em><b>Maxlon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_TYPE__MAXLON = 1;

	/**
	 * The feature id for the '<em><b>Minlat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_TYPE__MINLAT = 2;

	/**
	 * The feature id for the '<em><b>Minlon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_TYPE__MINLON = 3;

	/**
	 * The number of structural features of the '<em>Bounds Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bounds Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.impl.DocumentRootImpl
	 * @see egeo.gpx.impl.GpxPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

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
	 * The feature id for the '<em><b>Gpx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GPX = 3;

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
	 * The meta object id for the '{@link egeo.gpx.impl.GpxTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.impl.GpxTypeImpl
	 * @see egeo.gpx.impl.GpxPackageImpl#getGpxType()
	 * @generated
	 */
	int GPX_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__URL = 4;

	/**
	 * The feature id for the '<em><b>Urlname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__URLNAME = 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__TIME = 6;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__KEYWORDS = 7;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__BOUNDS = 8;

	/**
	 * The feature id for the '<em><b>Wpt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__WPT = 9;

	/**
	 * The feature id for the '<em><b>Rte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__RTE = 10;

	/**
	 * The feature id for the '<em><b>Trk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__TRK = 11;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__ANY = 12;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__CREATOR = 13;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__VERSION = 14;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.impl.RteptTypeImpl <em>Rtept Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.impl.RteptTypeImpl
	 * @see egeo.gpx.impl.GpxPackageImpl#getRteptType()
	 * @generated
	 */
	int RTEPT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Ele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__ELE = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__TIME = 1;

	/**
	 * The feature id for the '<em><b>Magvar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__MAGVAR = 2;

	/**
	 * The feature id for the '<em><b>Geoidheight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__GEOIDHEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Cmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__CMT = 5;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__DESC = 6;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__SRC = 7;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__URL = 8;

	/**
	 * The feature id for the '<em><b>Urlname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__URLNAME = 9;

	/**
	 * The feature id for the '<em><b>Sym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__SYM = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__TYPE = 11;

	/**
	 * The feature id for the '<em><b>Fix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__FIX = 12;

	/**
	 * The feature id for the '<em><b>Sat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__SAT = 13;

	/**
	 * The feature id for the '<em><b>Hdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__HDOP = 14;

	/**
	 * The feature id for the '<em><b>Vdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__VDOP = 15;

	/**
	 * The feature id for the '<em><b>Pdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__PDOP = 16;

	/**
	 * The feature id for the '<em><b>Ageofdgpsdata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__AGEOFDGPSDATA = 17;

	/**
	 * The feature id for the '<em><b>Dgpsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__DGPSID = 18;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__ANY = 19;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__LAT = 20;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE__LON = 21;

	/**
	 * The number of structural features of the '<em>Rtept Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>Rtept Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTEPT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.impl.RteTypeImpl <em>Rte Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.impl.RteTypeImpl
	 * @see egeo.gpx.impl.GpxPackageImpl#getRteType()
	 * @generated
	 */
	int RTE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__CMT = 1;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__DESC = 2;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__SRC = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__URL = 4;

	/**
	 * The feature id for the '<em><b>Urlname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__URLNAME = 5;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__ANY = 7;

	/**
	 * The feature id for the '<em><b>Rtept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__RTEPT = 8;

	/**
	 * The number of structural features of the '<em>Rte Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Rte Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.impl.TrkptTypeImpl <em>Trkpt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.impl.TrkptTypeImpl
	 * @see egeo.gpx.impl.GpxPackageImpl#getTrkptType()
	 * @generated
	 */
	int TRKPT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Ele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__ELE = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__TIME = 1;

	/**
	 * The feature id for the '<em><b>Course</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__COURSE = 2;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__SPEED = 3;

	/**
	 * The feature id for the '<em><b>Magvar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__MAGVAR = 4;

	/**
	 * The feature id for the '<em><b>Geoidheight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__GEOIDHEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Cmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__CMT = 7;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__DESC = 8;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__SRC = 9;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__URL = 10;

	/**
	 * The feature id for the '<em><b>Urlname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__URLNAME = 11;

	/**
	 * The feature id for the '<em><b>Sym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__SYM = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__TYPE = 13;

	/**
	 * The feature id for the '<em><b>Fix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__FIX = 14;

	/**
	 * The feature id for the '<em><b>Sat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__SAT = 15;

	/**
	 * The feature id for the '<em><b>Hdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__HDOP = 16;

	/**
	 * The feature id for the '<em><b>Vdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__VDOP = 17;

	/**
	 * The feature id for the '<em><b>Pdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__PDOP = 18;

	/**
	 * The feature id for the '<em><b>Ageofdgpsdata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__AGEOFDGPSDATA = 19;

	/**
	 * The feature id for the '<em><b>Dgpsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__DGPSID = 20;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__ANY = 21;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__LAT = 22;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE__LON = 23;

	/**
	 * The number of structural features of the '<em>Trkpt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Trkpt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKPT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.impl.TrksegTypeImpl <em>Trkseg Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.impl.TrksegTypeImpl
	 * @see egeo.gpx.impl.GpxPackageImpl#getTrksegType()
	 * @generated
	 */
	int TRKSEG_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Trkpt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKSEG_TYPE__TRKPT = 0;

	/**
	 * The number of structural features of the '<em>Trkseg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKSEG_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trkseg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKSEG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.impl.TrkTypeImpl <em>Trk Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.impl.TrkTypeImpl
	 * @see egeo.gpx.impl.GpxPackageImpl#getTrkType()
	 * @generated
	 */
	int TRK_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__CMT = 1;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__DESC = 2;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__SRC = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__URL = 4;

	/**
	 * The feature id for the '<em><b>Urlname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__URLNAME = 5;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__ANY = 7;

	/**
	 * The feature id for the '<em><b>Trkseg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__TRKSEG = 8;

	/**
	 * The number of structural features of the '<em>Trk Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Trk Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.impl.WptTypeImpl <em>Wpt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.impl.WptTypeImpl
	 * @see egeo.gpx.impl.GpxPackageImpl#getWptType()
	 * @generated
	 */
	int WPT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Ele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__ELE = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__TIME = 1;

	/**
	 * The feature id for the '<em><b>Magvar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__MAGVAR = 2;

	/**
	 * The feature id for the '<em><b>Geoidheight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__GEOIDHEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Cmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__CMT = 5;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__DESC = 6;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__SRC = 7;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__URL = 8;

	/**
	 * The feature id for the '<em><b>Urlname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__URLNAME = 9;

	/**
	 * The feature id for the '<em><b>Sym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__SYM = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__TYPE = 11;

	/**
	 * The feature id for the '<em><b>Fix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__FIX = 12;

	/**
	 * The feature id for the '<em><b>Sat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__SAT = 13;

	/**
	 * The feature id for the '<em><b>Hdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__HDOP = 14;

	/**
	 * The feature id for the '<em><b>Vdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__VDOP = 15;

	/**
	 * The feature id for the '<em><b>Pdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__PDOP = 16;

	/**
	 * The feature id for the '<em><b>Ageofdgpsdata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__AGEOFDGPSDATA = 17;

	/**
	 * The feature id for the '<em><b>Dgpsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__DGPSID = 18;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__ANY = 19;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__LAT = 20;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__LON = 21;

	/**
	 * The number of structural features of the '<em>Wpt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>Wpt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link egeo.gpx.FixType <em>Fix Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.FixType
	 * @see egeo.gpx.impl.GpxPackageImpl#getFixType()
	 * @generated
	 */
	int FIX_TYPE = 9;

	/**
	 * The meta object id for the '<em>Degrees Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see egeo.gpx.impl.GpxPackageImpl#getDegreesType()
	 * @generated
	 */
	int DEGREES_TYPE = 10;

	/**
	 * The meta object id for the '<em>Dgps Station Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see egeo.gpx.impl.GpxPackageImpl#getDgpsStationType()
	 * @generated
	 */
	int DGPS_STATION_TYPE = 11;

	/**
	 * The meta object id for the '<em>Email Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see egeo.gpx.impl.GpxPackageImpl#getEmailType()
	 * @generated
	 */
	int EMAIL_TYPE = 12;

	/**
	 * The meta object id for the '<em>Fix Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see egeo.gpx.FixType
	 * @see egeo.gpx.impl.GpxPackageImpl#getFixTypeObject()
	 * @generated
	 */
	int FIX_TYPE_OBJECT = 13;

	/**
	 * The meta object id for the '<em>Latitude Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see egeo.gpx.impl.GpxPackageImpl#getLatitudeType()
	 * @generated
	 */
	int LATITUDE_TYPE = 14;

	/**
	 * The meta object id for the '<em>Longitude Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see egeo.gpx.impl.GpxPackageImpl#getLongitudeType()
	 * @generated
	 */
	int LONGITUDE_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link egeo.gpx.BoundsType <em>Bounds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounds Type</em>'.
	 * @see egeo.gpx.BoundsType
	 * @generated
	 */
	EClass getBoundsType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.BoundsType#getMaxlat <em>Maxlat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlat</em>'.
	 * @see egeo.gpx.BoundsType#getMaxlat()
	 * @see #getBoundsType()
	 * @generated
	 */
	EAttribute getBoundsType_Maxlat();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.BoundsType#getMaxlon <em>Maxlon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlon</em>'.
	 * @see egeo.gpx.BoundsType#getMaxlon()
	 * @see #getBoundsType()
	 * @generated
	 */
	EAttribute getBoundsType_Maxlon();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.BoundsType#getMinlat <em>Minlat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minlat</em>'.
	 * @see egeo.gpx.BoundsType#getMinlat()
	 * @see #getBoundsType()
	 * @generated
	 */
	EAttribute getBoundsType_Minlat();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.BoundsType#getMinlon <em>Minlon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minlon</em>'.
	 * @see egeo.gpx.BoundsType#getMinlon()
	 * @see #getBoundsType()
	 * @generated
	 */
	EAttribute getBoundsType_Minlon();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see egeo.gpx.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link egeo.gpx.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see egeo.gpx.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link egeo.gpx.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see egeo.gpx.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link egeo.gpx.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see egeo.gpx.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link egeo.gpx.DocumentRoot#getGpx <em>Gpx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gpx</em>'.
	 * @see egeo.gpx.DocumentRoot#getGpx()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Gpx();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.GpxType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see egeo.gpx.GpxType
	 * @generated
	 */
	EClass getGpxType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.GpxType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see egeo.gpx.GpxType#getName()
	 * @see #getGpxType()
	 * @generated
	 */
	EAttribute getGpxType_Name();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.GpxType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see egeo.gpx.GpxType#getDesc()
	 * @see #getGpxType()
	 * @generated
	 */
	EAttribute getGpxType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.GpxType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see egeo.gpx.GpxType#getAuthor()
	 * @see #getGpxType()
	 * @generated
	 */
	EAttribute getGpxType_Author();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.GpxType#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see egeo.gpx.GpxType#getEmail()
	 * @see #getGpxType()
	 * @generated
	 */
	EAttribute getGpxType_Email();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.GpxType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see egeo.gpx.GpxType#getUrl()
	 * @see #getGpxType()
	 * @generated
	 */
	EAttribute getGpxType_Url();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.GpxType#getUrlname <em>Urlname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urlname</em>'.
	 * @see egeo.gpx.GpxType#getUrlname()
	 * @see #getGpxType()
	 * @generated
	 */
	EAttribute getGpxType_Urlname();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.GpxType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see egeo.gpx.GpxType#getTime()
	 * @see #getGpxType()
	 * @generated
	 */
	EAttribute getGpxType_Time();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.GpxType#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keywords</em>'.
	 * @see egeo.gpx.GpxType#getKeywords()
	 * @see #getGpxType()
	 * @generated
	 */
	EAttribute getGpxType_Keywords();

	/**
	 * Returns the meta object for the containment reference '{@link egeo.gpx.GpxType#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see egeo.gpx.GpxType#getBounds()
	 * @see #getGpxType()
	 * @generated
	 */
	EReference getGpxType_Bounds();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.GpxType#getWpt <em>Wpt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wpt</em>'.
	 * @see egeo.gpx.GpxType#getWpt()
	 * @see #getGpxType()
	 * @generated
	 */
	EReference getGpxType_Wpt();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.GpxType#getRte <em>Rte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte</em>'.
	 * @see egeo.gpx.GpxType#getRte()
	 * @see #getGpxType()
	 * @generated
	 */
	EReference getGpxType_Rte();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.GpxType#getTrk <em>Trk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trk</em>'.
	 * @see egeo.gpx.GpxType#getTrk()
	 * @see #getGpxType()
	 * @generated
	 */
	EReference getGpxType_Trk();

	/**
	 * Returns the meta object for the attribute list '{@link egeo.gpx.GpxType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see egeo.gpx.GpxType#getAny()
	 * @see #getGpxType()
	 * @generated
	 */
	EAttribute getGpxType_Any();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.GpxType#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator</em>'.
	 * @see egeo.gpx.GpxType#getCreator()
	 * @see #getGpxType()
	 * @generated
	 */
	EAttribute getGpxType_Creator();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.GpxType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see egeo.gpx.GpxType#getVersion()
	 * @see #getGpxType()
	 * @generated
	 */
	EAttribute getGpxType_Version();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.RteptType <em>Rtept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtept Type</em>'.
	 * @see egeo.gpx.RteptType
	 * @generated
	 */
	EClass getRteptType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getEle <em>Ele</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ele</em>'.
	 * @see egeo.gpx.RteptType#getEle()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Ele();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see egeo.gpx.RteptType#getTime()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Time();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getMagvar <em>Magvar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Magvar</em>'.
	 * @see egeo.gpx.RteptType#getMagvar()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Magvar();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getGeoidheight <em>Geoidheight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geoidheight</em>'.
	 * @see egeo.gpx.RteptType#getGeoidheight()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Geoidheight();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see egeo.gpx.RteptType#getName()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Name();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getCmt <em>Cmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmt</em>'.
	 * @see egeo.gpx.RteptType#getCmt()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Cmt();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see egeo.gpx.RteptType#getDesc()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see egeo.gpx.RteptType#getSrc()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Src();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see egeo.gpx.RteptType#getUrl()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Url();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getUrlname <em>Urlname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urlname</em>'.
	 * @see egeo.gpx.RteptType#getUrlname()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Urlname();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getSym <em>Sym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sym</em>'.
	 * @see egeo.gpx.RteptType#getSym()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Sym();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see egeo.gpx.RteptType#getType()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Type();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getFix <em>Fix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fix</em>'.
	 * @see egeo.gpx.RteptType#getFix()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Fix();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getSat <em>Sat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sat</em>'.
	 * @see egeo.gpx.RteptType#getSat()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Sat();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getHdop <em>Hdop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hdop</em>'.
	 * @see egeo.gpx.RteptType#getHdop()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Hdop();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getVdop <em>Vdop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vdop</em>'.
	 * @see egeo.gpx.RteptType#getVdop()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Vdop();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getPdop <em>Pdop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pdop</em>'.
	 * @see egeo.gpx.RteptType#getPdop()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Pdop();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getAgeofdgpsdata <em>Ageofdgpsdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ageofdgpsdata</em>'.
	 * @see egeo.gpx.RteptType#getAgeofdgpsdata()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Ageofdgpsdata();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getDgpsid <em>Dgpsid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dgpsid</em>'.
	 * @see egeo.gpx.RteptType#getDgpsid()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Dgpsid();

	/**
	 * Returns the meta object for the attribute list '{@link egeo.gpx.RteptType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see egeo.gpx.RteptType#getAny()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Any();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see egeo.gpx.RteptType#getLat()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Lat();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteptType#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see egeo.gpx.RteptType#getLon()
	 * @see #getRteptType()
	 * @generated
	 */
	EAttribute getRteptType_Lon();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.RteType <em>Rte Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Type</em>'.
	 * @see egeo.gpx.RteType
	 * @generated
	 */
	EClass getRteType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see egeo.gpx.RteType#getName()
	 * @see #getRteType()
	 * @generated
	 */
	EAttribute getRteType_Name();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteType#getCmt <em>Cmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmt</em>'.
	 * @see egeo.gpx.RteType#getCmt()
	 * @see #getRteType()
	 * @generated
	 */
	EAttribute getRteType_Cmt();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see egeo.gpx.RteType#getDesc()
	 * @see #getRteType()
	 * @generated
	 */
	EAttribute getRteType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteType#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see egeo.gpx.RteType#getSrc()
	 * @see #getRteType()
	 * @generated
	 */
	EAttribute getRteType_Src();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see egeo.gpx.RteType#getUrl()
	 * @see #getRteType()
	 * @generated
	 */
	EAttribute getRteType_Url();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteType#getUrlname <em>Urlname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urlname</em>'.
	 * @see egeo.gpx.RteType#getUrlname()
	 * @see #getRteType()
	 * @generated
	 */
	EAttribute getRteType_Urlname();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.RteType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see egeo.gpx.RteType#getNumber()
	 * @see #getRteType()
	 * @generated
	 */
	EAttribute getRteType_Number();

	/**
	 * Returns the meta object for the attribute list '{@link egeo.gpx.RteType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see egeo.gpx.RteType#getAny()
	 * @see #getRteType()
	 * @generated
	 */
	EAttribute getRteType_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.RteType#getRtept <em>Rtept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rtept</em>'.
	 * @see egeo.gpx.RteType#getRtept()
	 * @see #getRteType()
	 * @generated
	 */
	EReference getRteType_Rtept();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.TrkptType <em>Trkpt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trkpt Type</em>'.
	 * @see egeo.gpx.TrkptType
	 * @generated
	 */
	EClass getTrkptType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getEle <em>Ele</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ele</em>'.
	 * @see egeo.gpx.TrkptType#getEle()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Ele();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see egeo.gpx.TrkptType#getTime()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Time();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course</em>'.
	 * @see egeo.gpx.TrkptType#getCourse()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Course();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see egeo.gpx.TrkptType#getSpeed()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Speed();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getMagvar <em>Magvar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Magvar</em>'.
	 * @see egeo.gpx.TrkptType#getMagvar()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Magvar();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getGeoidheight <em>Geoidheight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geoidheight</em>'.
	 * @see egeo.gpx.TrkptType#getGeoidheight()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Geoidheight();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see egeo.gpx.TrkptType#getName()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Name();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getCmt <em>Cmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmt</em>'.
	 * @see egeo.gpx.TrkptType#getCmt()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Cmt();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see egeo.gpx.TrkptType#getDesc()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see egeo.gpx.TrkptType#getSrc()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Src();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see egeo.gpx.TrkptType#getUrl()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Url();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getUrlname <em>Urlname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urlname</em>'.
	 * @see egeo.gpx.TrkptType#getUrlname()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Urlname();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getSym <em>Sym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sym</em>'.
	 * @see egeo.gpx.TrkptType#getSym()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Sym();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see egeo.gpx.TrkptType#getType()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Type();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getFix <em>Fix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fix</em>'.
	 * @see egeo.gpx.TrkptType#getFix()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Fix();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getSat <em>Sat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sat</em>'.
	 * @see egeo.gpx.TrkptType#getSat()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Sat();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getHdop <em>Hdop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hdop</em>'.
	 * @see egeo.gpx.TrkptType#getHdop()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Hdop();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getVdop <em>Vdop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vdop</em>'.
	 * @see egeo.gpx.TrkptType#getVdop()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Vdop();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getPdop <em>Pdop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pdop</em>'.
	 * @see egeo.gpx.TrkptType#getPdop()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Pdop();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getAgeofdgpsdata <em>Ageofdgpsdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ageofdgpsdata</em>'.
	 * @see egeo.gpx.TrkptType#getAgeofdgpsdata()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Ageofdgpsdata();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getDgpsid <em>Dgpsid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dgpsid</em>'.
	 * @see egeo.gpx.TrkptType#getDgpsid()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Dgpsid();

	/**
	 * Returns the meta object for the attribute list '{@link egeo.gpx.TrkptType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see egeo.gpx.TrkptType#getAny()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Any();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see egeo.gpx.TrkptType#getLat()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Lat();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkptType#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see egeo.gpx.TrkptType#getLon()
	 * @see #getTrkptType()
	 * @generated
	 */
	EAttribute getTrkptType_Lon();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.TrksegType <em>Trkseg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trkseg Type</em>'.
	 * @see egeo.gpx.TrksegType
	 * @generated
	 */
	EClass getTrksegType();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.TrksegType#getTrkpt <em>Trkpt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trkpt</em>'.
	 * @see egeo.gpx.TrksegType#getTrkpt()
	 * @see #getTrksegType()
	 * @generated
	 */
	EReference getTrksegType_Trkpt();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.TrkType <em>Trk Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trk Type</em>'.
	 * @see egeo.gpx.TrkType
	 * @generated
	 */
	EClass getTrkType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see egeo.gpx.TrkType#getName()
	 * @see #getTrkType()
	 * @generated
	 */
	EAttribute getTrkType_Name();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkType#getCmt <em>Cmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmt</em>'.
	 * @see egeo.gpx.TrkType#getCmt()
	 * @see #getTrkType()
	 * @generated
	 */
	EAttribute getTrkType_Cmt();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see egeo.gpx.TrkType#getDesc()
	 * @see #getTrkType()
	 * @generated
	 */
	EAttribute getTrkType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkType#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see egeo.gpx.TrkType#getSrc()
	 * @see #getTrkType()
	 * @generated
	 */
	EAttribute getTrkType_Src();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see egeo.gpx.TrkType#getUrl()
	 * @see #getTrkType()
	 * @generated
	 */
	EAttribute getTrkType_Url();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkType#getUrlname <em>Urlname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urlname</em>'.
	 * @see egeo.gpx.TrkType#getUrlname()
	 * @see #getTrkType()
	 * @generated
	 */
	EAttribute getTrkType_Urlname();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.TrkType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see egeo.gpx.TrkType#getNumber()
	 * @see #getTrkType()
	 * @generated
	 */
	EAttribute getTrkType_Number();

	/**
	 * Returns the meta object for the attribute list '{@link egeo.gpx.TrkType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see egeo.gpx.TrkType#getAny()
	 * @see #getTrkType()
	 * @generated
	 */
	EAttribute getTrkType_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link egeo.gpx.TrkType#getTrkseg <em>Trkseg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trkseg</em>'.
	 * @see egeo.gpx.TrkType#getTrkseg()
	 * @see #getTrkType()
	 * @generated
	 */
	EReference getTrkType_Trkseg();

	/**
	 * Returns the meta object for class '{@link egeo.gpx.WptType <em>Wpt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wpt Type</em>'.
	 * @see egeo.gpx.WptType
	 * @generated
	 */
	EClass getWptType();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getEle <em>Ele</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ele</em>'.
	 * @see egeo.gpx.WptType#getEle()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Ele();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see egeo.gpx.WptType#getTime()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Time();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getMagvar <em>Magvar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Magvar</em>'.
	 * @see egeo.gpx.WptType#getMagvar()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Magvar();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getGeoidheight <em>Geoidheight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geoidheight</em>'.
	 * @see egeo.gpx.WptType#getGeoidheight()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Geoidheight();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see egeo.gpx.WptType#getName()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Name();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getCmt <em>Cmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmt</em>'.
	 * @see egeo.gpx.WptType#getCmt()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Cmt();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see egeo.gpx.WptType#getDesc()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see egeo.gpx.WptType#getSrc()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Src();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see egeo.gpx.WptType#getUrl()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Url();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getUrlname <em>Urlname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urlname</em>'.
	 * @see egeo.gpx.WptType#getUrlname()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Urlname();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getSym <em>Sym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sym</em>'.
	 * @see egeo.gpx.WptType#getSym()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Sym();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see egeo.gpx.WptType#getType()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Type();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getFix <em>Fix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fix</em>'.
	 * @see egeo.gpx.WptType#getFix()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Fix();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getSat <em>Sat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sat</em>'.
	 * @see egeo.gpx.WptType#getSat()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Sat();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getHdop <em>Hdop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hdop</em>'.
	 * @see egeo.gpx.WptType#getHdop()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Hdop();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getVdop <em>Vdop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vdop</em>'.
	 * @see egeo.gpx.WptType#getVdop()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Vdop();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getPdop <em>Pdop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pdop</em>'.
	 * @see egeo.gpx.WptType#getPdop()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Pdop();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getAgeofdgpsdata <em>Ageofdgpsdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ageofdgpsdata</em>'.
	 * @see egeo.gpx.WptType#getAgeofdgpsdata()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Ageofdgpsdata();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getDgpsid <em>Dgpsid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dgpsid</em>'.
	 * @see egeo.gpx.WptType#getDgpsid()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Dgpsid();

	/**
	 * Returns the meta object for the attribute list '{@link egeo.gpx.WptType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see egeo.gpx.WptType#getAny()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Any();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see egeo.gpx.WptType#getLat()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Lat();

	/**
	 * Returns the meta object for the attribute '{@link egeo.gpx.WptType#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see egeo.gpx.WptType#getLon()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Lon();

	/**
	 * Returns the meta object for enum '{@link egeo.gpx.FixType <em>Fix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fix Type</em>'.
	 * @see egeo.gpx.FixType
	 * @generated
	 */
	EEnum getFixType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Degrees Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Degrees Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='degreesType' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.0' maxInclusive='360.0'"
	 * @generated
	 */
	EDataType getDegreesType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Dgps Station Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dgps Station Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='dgpsStationType' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='0' maxInclusive='1023'"
	 * @generated
	 */
	EDataType getDgpsStationType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Email Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='emailType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[\\p{L}_]+(\\.[\\p{L}_]+)*@[\\p{L}_]+(\\.[\\p{L}_]+)+'"
	 * @generated
	 */
	EDataType getEmailType();

	/**
	 * Returns the meta object for data type '{@link egeo.gpx.FixType <em>Fix Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fix Type Object</em>'.
	 * @see egeo.gpx.FixType
	 * @model instanceClass="egeo.gpx.FixType"
	 *        extendedMetaData="name='fixType:Object' baseType='fixType'"
	 * @generated
	 */
	EDataType getFixTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Latitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Latitude Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='latitudeType' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='-90.0' maxInclusive='90.0'"
	 * @generated
	 */
	EDataType getLatitudeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Longitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Longitude Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='longitudeType' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='-180.0' maxInclusive='180.0'"
	 * @generated
	 */
	EDataType getLongitudeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GpxFactory getGpxFactory();

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
		 * The meta object literal for the '{@link egeo.gpx.impl.BoundsTypeImpl <em>Bounds Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.impl.BoundsTypeImpl
		 * @see egeo.gpx.impl.GpxPackageImpl#getBoundsType()
		 * @generated
		 */
		EClass BOUNDS_TYPE = eINSTANCE.getBoundsType();

		/**
		 * The meta object literal for the '<em><b>Maxlat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS_TYPE__MAXLAT = eINSTANCE.getBoundsType_Maxlat();

		/**
		 * The meta object literal for the '<em><b>Maxlon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS_TYPE__MAXLON = eINSTANCE.getBoundsType_Maxlon();

		/**
		 * The meta object literal for the '<em><b>Minlat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS_TYPE__MINLAT = eINSTANCE.getBoundsType_Minlat();

		/**
		 * The meta object literal for the '<em><b>Minlon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS_TYPE__MINLON = eINSTANCE.getBoundsType_Minlon();

		/**
		 * The meta object literal for the '{@link egeo.gpx.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.impl.DocumentRootImpl
		 * @see egeo.gpx.impl.GpxPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Gpx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GPX = eINSTANCE.getDocumentRoot_Gpx();

		/**
		 * The meta object literal for the '{@link egeo.gpx.impl.GpxTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.impl.GpxTypeImpl
		 * @see egeo.gpx.impl.GpxPackageImpl#getGpxType()
		 * @generated
		 */
		EClass GPX_TYPE = eINSTANCE.getGpxType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPX_TYPE__NAME = eINSTANCE.getGpxType_Name();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPX_TYPE__DESC = eINSTANCE.getGpxType_Desc();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPX_TYPE__AUTHOR = eINSTANCE.getGpxType_Author();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPX_TYPE__EMAIL = eINSTANCE.getGpxType_Email();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPX_TYPE__URL = eINSTANCE.getGpxType_Url();

		/**
		 * The meta object literal for the '<em><b>Urlname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPX_TYPE__URLNAME = eINSTANCE.getGpxType_Urlname();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPX_TYPE__TIME = eINSTANCE.getGpxType_Time();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPX_TYPE__KEYWORDS = eINSTANCE.getGpxType_Keywords();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPX_TYPE__BOUNDS = eINSTANCE.getGpxType_Bounds();

		/**
		 * The meta object literal for the '<em><b>Wpt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPX_TYPE__WPT = eINSTANCE.getGpxType_Wpt();

		/**
		 * The meta object literal for the '<em><b>Rte</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPX_TYPE__RTE = eINSTANCE.getGpxType_Rte();

		/**
		 * The meta object literal for the '<em><b>Trk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPX_TYPE__TRK = eINSTANCE.getGpxType_Trk();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPX_TYPE__ANY = eINSTANCE.getGpxType_Any();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPX_TYPE__CREATOR = eINSTANCE.getGpxType_Creator();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPX_TYPE__VERSION = eINSTANCE.getGpxType_Version();

		/**
		 * The meta object literal for the '{@link egeo.gpx.impl.RteptTypeImpl <em>Rtept Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.impl.RteptTypeImpl
		 * @see egeo.gpx.impl.GpxPackageImpl#getRteptType()
		 * @generated
		 */
		EClass RTEPT_TYPE = eINSTANCE.getRteptType();

		/**
		 * The meta object literal for the '<em><b>Ele</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__ELE = eINSTANCE.getRteptType_Ele();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__TIME = eINSTANCE.getRteptType_Time();

		/**
		 * The meta object literal for the '<em><b>Magvar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__MAGVAR = eINSTANCE.getRteptType_Magvar();

		/**
		 * The meta object literal for the '<em><b>Geoidheight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__GEOIDHEIGHT = eINSTANCE.getRteptType_Geoidheight();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__NAME = eINSTANCE.getRteptType_Name();

		/**
		 * The meta object literal for the '<em><b>Cmt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__CMT = eINSTANCE.getRteptType_Cmt();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__DESC = eINSTANCE.getRteptType_Desc();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__SRC = eINSTANCE.getRteptType_Src();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__URL = eINSTANCE.getRteptType_Url();

		/**
		 * The meta object literal for the '<em><b>Urlname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__URLNAME = eINSTANCE.getRteptType_Urlname();

		/**
		 * The meta object literal for the '<em><b>Sym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__SYM = eINSTANCE.getRteptType_Sym();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__TYPE = eINSTANCE.getRteptType_Type();

		/**
		 * The meta object literal for the '<em><b>Fix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__FIX = eINSTANCE.getRteptType_Fix();

		/**
		 * The meta object literal for the '<em><b>Sat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__SAT = eINSTANCE.getRteptType_Sat();

		/**
		 * The meta object literal for the '<em><b>Hdop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__HDOP = eINSTANCE.getRteptType_Hdop();

		/**
		 * The meta object literal for the '<em><b>Vdop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__VDOP = eINSTANCE.getRteptType_Vdop();

		/**
		 * The meta object literal for the '<em><b>Pdop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__PDOP = eINSTANCE.getRteptType_Pdop();

		/**
		 * The meta object literal for the '<em><b>Ageofdgpsdata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__AGEOFDGPSDATA = eINSTANCE.getRteptType_Ageofdgpsdata();

		/**
		 * The meta object literal for the '<em><b>Dgpsid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__DGPSID = eINSTANCE.getRteptType_Dgpsid();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__ANY = eINSTANCE.getRteptType_Any();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__LAT = eINSTANCE.getRteptType_Lat();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTEPT_TYPE__LON = eINSTANCE.getRteptType_Lon();

		/**
		 * The meta object literal for the '{@link egeo.gpx.impl.RteTypeImpl <em>Rte Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.impl.RteTypeImpl
		 * @see egeo.gpx.impl.GpxPackageImpl#getRteType()
		 * @generated
		 */
		EClass RTE_TYPE = eINSTANCE.getRteType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_TYPE__NAME = eINSTANCE.getRteType_Name();

		/**
		 * The meta object literal for the '<em><b>Cmt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_TYPE__CMT = eINSTANCE.getRteType_Cmt();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_TYPE__DESC = eINSTANCE.getRteType_Desc();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_TYPE__SRC = eINSTANCE.getRteType_Src();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_TYPE__URL = eINSTANCE.getRteType_Url();

		/**
		 * The meta object literal for the '<em><b>Urlname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_TYPE__URLNAME = eINSTANCE.getRteType_Urlname();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_TYPE__NUMBER = eINSTANCE.getRteType_Number();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_TYPE__ANY = eINSTANCE.getRteType_Any();

		/**
		 * The meta object literal for the '<em><b>Rtept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TYPE__RTEPT = eINSTANCE.getRteType_Rtept();

		/**
		 * The meta object literal for the '{@link egeo.gpx.impl.TrkptTypeImpl <em>Trkpt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.impl.TrkptTypeImpl
		 * @see egeo.gpx.impl.GpxPackageImpl#getTrkptType()
		 * @generated
		 */
		EClass TRKPT_TYPE = eINSTANCE.getTrkptType();

		/**
		 * The meta object literal for the '<em><b>Ele</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__ELE = eINSTANCE.getTrkptType_Ele();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__TIME = eINSTANCE.getTrkptType_Time();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__COURSE = eINSTANCE.getTrkptType_Course();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__SPEED = eINSTANCE.getTrkptType_Speed();

		/**
		 * The meta object literal for the '<em><b>Magvar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__MAGVAR = eINSTANCE.getTrkptType_Magvar();

		/**
		 * The meta object literal for the '<em><b>Geoidheight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__GEOIDHEIGHT = eINSTANCE.getTrkptType_Geoidheight();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__NAME = eINSTANCE.getTrkptType_Name();

		/**
		 * The meta object literal for the '<em><b>Cmt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__CMT = eINSTANCE.getTrkptType_Cmt();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__DESC = eINSTANCE.getTrkptType_Desc();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__SRC = eINSTANCE.getTrkptType_Src();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__URL = eINSTANCE.getTrkptType_Url();

		/**
		 * The meta object literal for the '<em><b>Urlname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__URLNAME = eINSTANCE.getTrkptType_Urlname();

		/**
		 * The meta object literal for the '<em><b>Sym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__SYM = eINSTANCE.getTrkptType_Sym();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__TYPE = eINSTANCE.getTrkptType_Type();

		/**
		 * The meta object literal for the '<em><b>Fix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__FIX = eINSTANCE.getTrkptType_Fix();

		/**
		 * The meta object literal for the '<em><b>Sat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__SAT = eINSTANCE.getTrkptType_Sat();

		/**
		 * The meta object literal for the '<em><b>Hdop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__HDOP = eINSTANCE.getTrkptType_Hdop();

		/**
		 * The meta object literal for the '<em><b>Vdop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__VDOP = eINSTANCE.getTrkptType_Vdop();

		/**
		 * The meta object literal for the '<em><b>Pdop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__PDOP = eINSTANCE.getTrkptType_Pdop();

		/**
		 * The meta object literal for the '<em><b>Ageofdgpsdata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__AGEOFDGPSDATA = eINSTANCE.getTrkptType_Ageofdgpsdata();

		/**
		 * The meta object literal for the '<em><b>Dgpsid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__DGPSID = eINSTANCE.getTrkptType_Dgpsid();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__ANY = eINSTANCE.getTrkptType_Any();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__LAT = eINSTANCE.getTrkptType_Lat();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRKPT_TYPE__LON = eINSTANCE.getTrkptType_Lon();

		/**
		 * The meta object literal for the '{@link egeo.gpx.impl.TrksegTypeImpl <em>Trkseg Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.impl.TrksegTypeImpl
		 * @see egeo.gpx.impl.GpxPackageImpl#getTrksegType()
		 * @generated
		 */
		EClass TRKSEG_TYPE = eINSTANCE.getTrksegType();

		/**
		 * The meta object literal for the '<em><b>Trkpt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRKSEG_TYPE__TRKPT = eINSTANCE.getTrksegType_Trkpt();

		/**
		 * The meta object literal for the '{@link egeo.gpx.impl.TrkTypeImpl <em>Trk Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.impl.TrkTypeImpl
		 * @see egeo.gpx.impl.GpxPackageImpl#getTrkType()
		 * @generated
		 */
		EClass TRK_TYPE = eINSTANCE.getTrkType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRK_TYPE__NAME = eINSTANCE.getTrkType_Name();

		/**
		 * The meta object literal for the '<em><b>Cmt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRK_TYPE__CMT = eINSTANCE.getTrkType_Cmt();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRK_TYPE__DESC = eINSTANCE.getTrkType_Desc();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRK_TYPE__SRC = eINSTANCE.getTrkType_Src();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRK_TYPE__URL = eINSTANCE.getTrkType_Url();

		/**
		 * The meta object literal for the '<em><b>Urlname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRK_TYPE__URLNAME = eINSTANCE.getTrkType_Urlname();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRK_TYPE__NUMBER = eINSTANCE.getTrkType_Number();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRK_TYPE__ANY = eINSTANCE.getTrkType_Any();

		/**
		 * The meta object literal for the '<em><b>Trkseg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRK_TYPE__TRKSEG = eINSTANCE.getTrkType_Trkseg();

		/**
		 * The meta object literal for the '{@link egeo.gpx.impl.WptTypeImpl <em>Wpt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.impl.WptTypeImpl
		 * @see egeo.gpx.impl.GpxPackageImpl#getWptType()
		 * @generated
		 */
		EClass WPT_TYPE = eINSTANCE.getWptType();

		/**
		 * The meta object literal for the '<em><b>Ele</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__ELE = eINSTANCE.getWptType_Ele();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__TIME = eINSTANCE.getWptType_Time();

		/**
		 * The meta object literal for the '<em><b>Magvar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__MAGVAR = eINSTANCE.getWptType_Magvar();

		/**
		 * The meta object literal for the '<em><b>Geoidheight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__GEOIDHEIGHT = eINSTANCE.getWptType_Geoidheight();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__NAME = eINSTANCE.getWptType_Name();

		/**
		 * The meta object literal for the '<em><b>Cmt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__CMT = eINSTANCE.getWptType_Cmt();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__DESC = eINSTANCE.getWptType_Desc();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__SRC = eINSTANCE.getWptType_Src();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__URL = eINSTANCE.getWptType_Url();

		/**
		 * The meta object literal for the '<em><b>Urlname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__URLNAME = eINSTANCE.getWptType_Urlname();

		/**
		 * The meta object literal for the '<em><b>Sym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__SYM = eINSTANCE.getWptType_Sym();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__TYPE = eINSTANCE.getWptType_Type();

		/**
		 * The meta object literal for the '<em><b>Fix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__FIX = eINSTANCE.getWptType_Fix();

		/**
		 * The meta object literal for the '<em><b>Sat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__SAT = eINSTANCE.getWptType_Sat();

		/**
		 * The meta object literal for the '<em><b>Hdop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__HDOP = eINSTANCE.getWptType_Hdop();

		/**
		 * The meta object literal for the '<em><b>Vdop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__VDOP = eINSTANCE.getWptType_Vdop();

		/**
		 * The meta object literal for the '<em><b>Pdop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__PDOP = eINSTANCE.getWptType_Pdop();

		/**
		 * The meta object literal for the '<em><b>Ageofdgpsdata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__AGEOFDGPSDATA = eINSTANCE.getWptType_Ageofdgpsdata();

		/**
		 * The meta object literal for the '<em><b>Dgpsid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__DGPSID = eINSTANCE.getWptType_Dgpsid();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__ANY = eINSTANCE.getWptType_Any();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__LAT = eINSTANCE.getWptType_Lat();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__LON = eINSTANCE.getWptType_Lon();

		/**
		 * The meta object literal for the '{@link egeo.gpx.FixType <em>Fix Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.FixType
		 * @see egeo.gpx.impl.GpxPackageImpl#getFixType()
		 * @generated
		 */
		EEnum FIX_TYPE = eINSTANCE.getFixType();

		/**
		 * The meta object literal for the '<em>Degrees Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see egeo.gpx.impl.GpxPackageImpl#getDegreesType()
		 * @generated
		 */
		EDataType DEGREES_TYPE = eINSTANCE.getDegreesType();

		/**
		 * The meta object literal for the '<em>Dgps Station Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see egeo.gpx.impl.GpxPackageImpl#getDgpsStationType()
		 * @generated
		 */
		EDataType DGPS_STATION_TYPE = eINSTANCE.getDgpsStationType();

		/**
		 * The meta object literal for the '<em>Email Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see egeo.gpx.impl.GpxPackageImpl#getEmailType()
		 * @generated
		 */
		EDataType EMAIL_TYPE = eINSTANCE.getEmailType();

		/**
		 * The meta object literal for the '<em>Fix Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see egeo.gpx.FixType
		 * @see egeo.gpx.impl.GpxPackageImpl#getFixTypeObject()
		 * @generated
		 */
		EDataType FIX_TYPE_OBJECT = eINSTANCE.getFixTypeObject();

		/**
		 * The meta object literal for the '<em>Latitude Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see egeo.gpx.impl.GpxPackageImpl#getLatitudeType()
		 * @generated
		 */
		EDataType LATITUDE_TYPE = eINSTANCE.getLatitudeType();

		/**
		 * The meta object literal for the '<em>Longitude Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see egeo.gpx.impl.GpxPackageImpl#getLongitudeType()
		 * @generated
		 */
		EDataType LONGITUDE_TYPE = eINSTANCE.getLongitudeType();

	}

} //GpxPackage
