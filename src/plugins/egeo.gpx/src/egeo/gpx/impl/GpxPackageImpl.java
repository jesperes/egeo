/**
 */
package egeo.gpx.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import egeo.gpx.BoundsType;
import egeo.gpx.DocumentRoot;
import egeo.gpx.FixType;
import egeo.gpx.GpxFactory;
import egeo.gpx.GpxPackage;
import egeo.gpx.GpxType;
import egeo.gpx.RteType;
import egeo.gpx.RteptType;
import egeo.gpx.TrkType;
import egeo.gpx.TrkptType;
import egeo.gpx.TrksegType;
import egeo.gpx.WptType;
import egeo.gpx.util.GpxValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GpxPackageImpl extends EPackageImpl implements GpxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundsTypeEClass = null;

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
	private EClass gpxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteptTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trkptTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trksegTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wptTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fixTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType degreesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dgpsStationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType emailTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fixTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType latitudeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longitudeTypeEDataType = null;

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
	 * @see egeo.gpx.GpxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GpxPackageImpl() {
		super(eNS_URI, GpxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GpxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GpxPackage init() {
		if (isInited) return (GpxPackage)EPackage.Registry.INSTANCE.getEPackage(GpxPackage.eNS_URI);

		// Obtain or create and register package
		GpxPackageImpl theGpxPackage = (GpxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GpxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GpxPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGpxPackage.createPackageContents();

		// Initialize created meta-data
		theGpxPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGpxPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GpxValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGpxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GpxPackage.eNS_URI, theGpxPackage);
		return theGpxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundsType() {
		return boundsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundsType_Maxlat() {
		return (EAttribute)boundsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundsType_Maxlon() {
		return (EAttribute)boundsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundsType_Minlat() {
		return (EAttribute)boundsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundsType_Minlon() {
		return (EAttribute)boundsTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getDocumentRoot_Gpx() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpxType() {
		return gpxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpxType_Name() {
		return (EAttribute)gpxTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpxType_Desc() {
		return (EAttribute)gpxTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpxType_Author() {
		return (EAttribute)gpxTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpxType_Email() {
		return (EAttribute)gpxTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpxType_Url() {
		return (EAttribute)gpxTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpxType_Urlname() {
		return (EAttribute)gpxTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpxType_Time() {
		return (EAttribute)gpxTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpxType_Keywords() {
		return (EAttribute)gpxTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpxType_Bounds() {
		return (EReference)gpxTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpxType_Wpt() {
		return (EReference)gpxTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpxType_Rte() {
		return (EReference)gpxTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpxType_Trk() {
		return (EReference)gpxTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpxType_Any() {
		return (EAttribute)gpxTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpxType_Creator() {
		return (EAttribute)gpxTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpxType_Version() {
		return (EAttribute)gpxTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteptType() {
		return rteptTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Ele() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Time() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Magvar() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Geoidheight() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Name() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Cmt() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Desc() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Src() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Url() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Urlname() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Sym() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Type() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Fix() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Sat() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Hdop() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Vdop() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Pdop() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Ageofdgpsdata() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Dgpsid() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Any() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Lat() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteptType_Lon() {
		return (EAttribute)rteptTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRteType() {
		return rteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteType_Name() {
		return (EAttribute)rteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteType_Cmt() {
		return (EAttribute)rteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteType_Desc() {
		return (EAttribute)rteTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteType_Src() {
		return (EAttribute)rteTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteType_Url() {
		return (EAttribute)rteTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteType_Urlname() {
		return (EAttribute)rteTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteType_Number() {
		return (EAttribute)rteTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteType_Any() {
		return (EAttribute)rteTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteType_Rtept() {
		return (EReference)rteTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrkptType() {
		return trkptTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Ele() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Time() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Course() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Speed() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Magvar() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Geoidheight() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Name() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Cmt() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Desc() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Src() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Url() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Urlname() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Sym() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Type() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Fix() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Sat() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Hdop() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Vdop() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Pdop() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Ageofdgpsdata() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Dgpsid() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Any() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Lat() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkptType_Lon() {
		return (EAttribute)trkptTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrksegType() {
		return trksegTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrksegType_Trkpt() {
		return (EReference)trksegTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrkType() {
		return trkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkType_Name() {
		return (EAttribute)trkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkType_Cmt() {
		return (EAttribute)trkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkType_Desc() {
		return (EAttribute)trkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkType_Src() {
		return (EAttribute)trkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkType_Url() {
		return (EAttribute)trkTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkType_Urlname() {
		return (EAttribute)trkTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkType_Number() {
		return (EAttribute)trkTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkType_Any() {
		return (EAttribute)trkTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrkType_Trkseg() {
		return (EReference)trkTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWptType() {
		return wptTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Ele() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Time() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Magvar() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Geoidheight() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Name() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Cmt() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Desc() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Src() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Url() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Urlname() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Sym() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Type() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Fix() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Sat() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Hdop() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Vdop() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Pdop() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Ageofdgpsdata() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Dgpsid() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Any() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Lat() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Lon() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFixType() {
		return fixTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDegreesType() {
		return degreesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDgpsStationType() {
		return dgpsStationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEmailType() {
		return emailTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFixTypeObject() {
		return fixTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLatitudeType() {
		return latitudeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLongitudeType() {
		return longitudeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpxFactory getGpxFactory() {
		return (GpxFactory)getEFactoryInstance();
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
		boundsTypeEClass = createEClass(BOUNDS_TYPE);
		createEAttribute(boundsTypeEClass, BOUNDS_TYPE__MAXLAT);
		createEAttribute(boundsTypeEClass, BOUNDS_TYPE__MAXLON);
		createEAttribute(boundsTypeEClass, BOUNDS_TYPE__MINLAT);
		createEAttribute(boundsTypeEClass, BOUNDS_TYPE__MINLON);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GPX);

		gpxTypeEClass = createEClass(GPX_TYPE);
		createEAttribute(gpxTypeEClass, GPX_TYPE__NAME);
		createEAttribute(gpxTypeEClass, GPX_TYPE__DESC);
		createEAttribute(gpxTypeEClass, GPX_TYPE__AUTHOR);
		createEAttribute(gpxTypeEClass, GPX_TYPE__EMAIL);
		createEAttribute(gpxTypeEClass, GPX_TYPE__URL);
		createEAttribute(gpxTypeEClass, GPX_TYPE__URLNAME);
		createEAttribute(gpxTypeEClass, GPX_TYPE__TIME);
		createEAttribute(gpxTypeEClass, GPX_TYPE__KEYWORDS);
		createEReference(gpxTypeEClass, GPX_TYPE__BOUNDS);
		createEReference(gpxTypeEClass, GPX_TYPE__WPT);
		createEReference(gpxTypeEClass, GPX_TYPE__RTE);
		createEReference(gpxTypeEClass, GPX_TYPE__TRK);
		createEAttribute(gpxTypeEClass, GPX_TYPE__ANY);
		createEAttribute(gpxTypeEClass, GPX_TYPE__CREATOR);
		createEAttribute(gpxTypeEClass, GPX_TYPE__VERSION);

		rteptTypeEClass = createEClass(RTEPT_TYPE);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__ELE);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__TIME);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__MAGVAR);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__GEOIDHEIGHT);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__NAME);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__CMT);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__DESC);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__SRC);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__URL);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__URLNAME);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__SYM);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__TYPE);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__FIX);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__SAT);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__HDOP);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__VDOP);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__PDOP);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__AGEOFDGPSDATA);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__DGPSID);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__ANY);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__LAT);
		createEAttribute(rteptTypeEClass, RTEPT_TYPE__LON);

		rteTypeEClass = createEClass(RTE_TYPE);
		createEAttribute(rteTypeEClass, RTE_TYPE__NAME);
		createEAttribute(rteTypeEClass, RTE_TYPE__CMT);
		createEAttribute(rteTypeEClass, RTE_TYPE__DESC);
		createEAttribute(rteTypeEClass, RTE_TYPE__SRC);
		createEAttribute(rteTypeEClass, RTE_TYPE__URL);
		createEAttribute(rteTypeEClass, RTE_TYPE__URLNAME);
		createEAttribute(rteTypeEClass, RTE_TYPE__NUMBER);
		createEAttribute(rteTypeEClass, RTE_TYPE__ANY);
		createEReference(rteTypeEClass, RTE_TYPE__RTEPT);

		trkptTypeEClass = createEClass(TRKPT_TYPE);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__ELE);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__TIME);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__COURSE);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__SPEED);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__MAGVAR);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__GEOIDHEIGHT);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__NAME);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__CMT);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__DESC);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__SRC);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__URL);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__URLNAME);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__SYM);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__TYPE);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__FIX);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__SAT);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__HDOP);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__VDOP);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__PDOP);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__AGEOFDGPSDATA);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__DGPSID);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__ANY);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__LAT);
		createEAttribute(trkptTypeEClass, TRKPT_TYPE__LON);

		trksegTypeEClass = createEClass(TRKSEG_TYPE);
		createEReference(trksegTypeEClass, TRKSEG_TYPE__TRKPT);

		trkTypeEClass = createEClass(TRK_TYPE);
		createEAttribute(trkTypeEClass, TRK_TYPE__NAME);
		createEAttribute(trkTypeEClass, TRK_TYPE__CMT);
		createEAttribute(trkTypeEClass, TRK_TYPE__DESC);
		createEAttribute(trkTypeEClass, TRK_TYPE__SRC);
		createEAttribute(trkTypeEClass, TRK_TYPE__URL);
		createEAttribute(trkTypeEClass, TRK_TYPE__URLNAME);
		createEAttribute(trkTypeEClass, TRK_TYPE__NUMBER);
		createEAttribute(trkTypeEClass, TRK_TYPE__ANY);
		createEReference(trkTypeEClass, TRK_TYPE__TRKSEG);

		wptTypeEClass = createEClass(WPT_TYPE);
		createEAttribute(wptTypeEClass, WPT_TYPE__ELE);
		createEAttribute(wptTypeEClass, WPT_TYPE__TIME);
		createEAttribute(wptTypeEClass, WPT_TYPE__MAGVAR);
		createEAttribute(wptTypeEClass, WPT_TYPE__GEOIDHEIGHT);
		createEAttribute(wptTypeEClass, WPT_TYPE__NAME);
		createEAttribute(wptTypeEClass, WPT_TYPE__CMT);
		createEAttribute(wptTypeEClass, WPT_TYPE__DESC);
		createEAttribute(wptTypeEClass, WPT_TYPE__SRC);
		createEAttribute(wptTypeEClass, WPT_TYPE__URL);
		createEAttribute(wptTypeEClass, WPT_TYPE__URLNAME);
		createEAttribute(wptTypeEClass, WPT_TYPE__SYM);
		createEAttribute(wptTypeEClass, WPT_TYPE__TYPE);
		createEAttribute(wptTypeEClass, WPT_TYPE__FIX);
		createEAttribute(wptTypeEClass, WPT_TYPE__SAT);
		createEAttribute(wptTypeEClass, WPT_TYPE__HDOP);
		createEAttribute(wptTypeEClass, WPT_TYPE__VDOP);
		createEAttribute(wptTypeEClass, WPT_TYPE__PDOP);
		createEAttribute(wptTypeEClass, WPT_TYPE__AGEOFDGPSDATA);
		createEAttribute(wptTypeEClass, WPT_TYPE__DGPSID);
		createEAttribute(wptTypeEClass, WPT_TYPE__ANY);
		createEAttribute(wptTypeEClass, WPT_TYPE__LAT);
		createEAttribute(wptTypeEClass, WPT_TYPE__LON);

		// Create enums
		fixTypeEEnum = createEEnum(FIX_TYPE);

		// Create data types
		degreesTypeEDataType = createEDataType(DEGREES_TYPE);
		dgpsStationTypeEDataType = createEDataType(DGPS_STATION_TYPE);
		emailTypeEDataType = createEDataType(EMAIL_TYPE);
		fixTypeObjectEDataType = createEDataType(FIX_TYPE_OBJECT);
		latitudeTypeEDataType = createEDataType(LATITUDE_TYPE);
		longitudeTypeEDataType = createEDataType(LONGITUDE_TYPE);
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
		initEClass(boundsTypeEClass, BoundsType.class, "BoundsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundsType_Maxlat(), this.getLatitudeType(), "maxlat", null, 1, 1, BoundsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundsType_Maxlon(), this.getLongitudeType(), "maxlon", null, 1, 1, BoundsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundsType_Minlat(), this.getLatitudeType(), "minlat", null, 1, 1, BoundsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundsType_Minlon(), this.getLongitudeType(), "minlon", null, 1, 1, BoundsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Gpx(), this.getGpxType(), null, "gpx", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(gpxTypeEClass, GpxType.class, "GpxType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGpxType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpxType_Desc(), theXMLTypePackage.getString(), "desc", null, 0, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpxType_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpxType_Email(), this.getEmailType(), "email", null, 0, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpxType_Url(), theXMLTypePackage.getAnyURI(), "url", null, 0, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpxType_Urlname(), theXMLTypePackage.getString(), "urlname", null, 0, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpxType_Time(), theXMLTypePackage.getDateTime(), "time", null, 0, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpxType_Keywords(), theXMLTypePackage.getString(), "keywords", null, 0, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGpxType_Bounds(), this.getBoundsType(), null, "bounds", null, 0, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGpxType_Wpt(), this.getWptType(), null, "wpt", null, 0, -1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGpxType_Rte(), this.getRteType(), null, "rte", null, 0, -1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGpxType_Trk(), this.getTrkType(), null, "trk", null, 0, -1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpxType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpxType_Creator(), theXMLTypePackage.getString(), "creator", null, 1, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpxType_Version(), theXMLTypePackage.getString(), "version", "1.0", 1, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteptTypeEClass, RteptType.class, "RteptType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRteptType_Ele(), theXMLTypePackage.getDecimal(), "ele", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Time(), theXMLTypePackage.getDateTime(), "time", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Magvar(), this.getDegreesType(), "magvar", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Geoidheight(), theXMLTypePackage.getDecimal(), "geoidheight", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Cmt(), theXMLTypePackage.getString(), "cmt", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Desc(), theXMLTypePackage.getString(), "desc", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Src(), theXMLTypePackage.getString(), "src", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Url(), theXMLTypePackage.getAnyURI(), "url", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Urlname(), theXMLTypePackage.getString(), "urlname", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Sym(), theXMLTypePackage.getString(), "sym", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Fix(), this.getFixType(), "fix", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Sat(), theXMLTypePackage.getNonNegativeInteger(), "sat", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Hdop(), theXMLTypePackage.getDecimal(), "hdop", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Vdop(), theXMLTypePackage.getDecimal(), "vdop", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Pdop(), theXMLTypePackage.getDecimal(), "pdop", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Ageofdgpsdata(), theXMLTypePackage.getDecimal(), "ageofdgpsdata", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Dgpsid(), this.getDgpsStationType(), "dgpsid", null, 0, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Lat(), this.getLatitudeType(), "lat", null, 1, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteptType_Lon(), this.getLongitudeType(), "lon", null, 1, 1, RteptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteTypeEClass, RteType.class, "RteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRteType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteType_Cmt(), theXMLTypePackage.getString(), "cmt", null, 0, 1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteType_Desc(), theXMLTypePackage.getString(), "desc", null, 0, 1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteType_Src(), theXMLTypePackage.getString(), "src", null, 0, 1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteType_Url(), theXMLTypePackage.getAnyURI(), "url", null, 0, 1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteType_Urlname(), theXMLTypePackage.getString(), "urlname", null, 0, 1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteType_Number(), theXMLTypePackage.getNonNegativeInteger(), "number", null, 0, 1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteType_Rtept(), this.getRteptType(), null, "rtept", null, 0, -1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trkptTypeEClass, TrkptType.class, "TrkptType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrkptType_Ele(), theXMLTypePackage.getDecimal(), "ele", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Time(), theXMLTypePackage.getDateTime(), "time", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Course(), this.getDegreesType(), "course", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Speed(), theXMLTypePackage.getDecimal(), "speed", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Magvar(), this.getDegreesType(), "magvar", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Geoidheight(), theXMLTypePackage.getDecimal(), "geoidheight", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Cmt(), theXMLTypePackage.getString(), "cmt", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Desc(), theXMLTypePackage.getString(), "desc", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Src(), theXMLTypePackage.getString(), "src", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Url(), theXMLTypePackage.getAnyURI(), "url", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Urlname(), theXMLTypePackage.getString(), "urlname", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Sym(), theXMLTypePackage.getString(), "sym", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Fix(), this.getFixType(), "fix", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Sat(), theXMLTypePackage.getNonNegativeInteger(), "sat", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Hdop(), theXMLTypePackage.getDecimal(), "hdop", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Vdop(), theXMLTypePackage.getDecimal(), "vdop", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Pdop(), theXMLTypePackage.getDecimal(), "pdop", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Ageofdgpsdata(), theXMLTypePackage.getDecimal(), "ageofdgpsdata", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Dgpsid(), this.getDgpsStationType(), "dgpsid", null, 0, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Lat(), this.getLatitudeType(), "lat", null, 1, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkptType_Lon(), this.getLongitudeType(), "lon", null, 1, 1, TrkptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trksegTypeEClass, TrksegType.class, "TrksegType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrksegType_Trkpt(), this.getTrkptType(), null, "trkpt", null, 0, -1, TrksegType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trkTypeEClass, TrkType.class, "TrkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrkType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkType_Cmt(), theXMLTypePackage.getString(), "cmt", null, 0, 1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkType_Desc(), theXMLTypePackage.getString(), "desc", null, 0, 1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkType_Src(), theXMLTypePackage.getString(), "src", null, 0, 1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkType_Url(), theXMLTypePackage.getAnyURI(), "url", null, 0, 1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkType_Urlname(), theXMLTypePackage.getString(), "urlname", null, 0, 1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkType_Number(), theXMLTypePackage.getNonNegativeInteger(), "number", null, 0, 1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrkType_Trkseg(), this.getTrksegType(), null, "trkseg", null, 0, -1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wptTypeEClass, WptType.class, "WptType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWptType_Ele(), theXMLTypePackage.getDecimal(), "ele", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Time(), theXMLTypePackage.getDateTime(), "time", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Magvar(), this.getDegreesType(), "magvar", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Geoidheight(), theXMLTypePackage.getDecimal(), "geoidheight", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Cmt(), theXMLTypePackage.getString(), "cmt", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Desc(), theXMLTypePackage.getString(), "desc", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Src(), theXMLTypePackage.getString(), "src", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Url(), theXMLTypePackage.getAnyURI(), "url", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Urlname(), theXMLTypePackage.getString(), "urlname", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Sym(), theXMLTypePackage.getString(), "sym", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Fix(), this.getFixType(), "fix", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Sat(), theXMLTypePackage.getNonNegativeInteger(), "sat", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Hdop(), theXMLTypePackage.getDecimal(), "hdop", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Vdop(), theXMLTypePackage.getDecimal(), "vdop", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Pdop(), theXMLTypePackage.getDecimal(), "pdop", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Ageofdgpsdata(), theXMLTypePackage.getDecimal(), "ageofdgpsdata", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Dgpsid(), this.getDgpsStationType(), "dgpsid", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Lat(), this.getLatitudeType(), "lat", null, 1, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Lon(), this.getLongitudeType(), "lon", null, 1, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fixTypeEEnum, FixType.class, "FixType");
		addEEnumLiteral(fixTypeEEnum, FixType.NONE);
		addEEnumLiteral(fixTypeEEnum, FixType._2D);
		addEEnumLiteral(fixTypeEEnum, FixType._3D);
		addEEnumLiteral(fixTypeEEnum, FixType.DGPS);
		addEEnumLiteral(fixTypeEEnum, FixType.PPS);

		// Initialize data types
		initEDataType(degreesTypeEDataType, BigDecimal.class, "DegreesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dgpsStationTypeEDataType, BigInteger.class, "DgpsStationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(emailTypeEDataType, String.class, "EmailType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fixTypeObjectEDataType, FixType.class, "FixTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(latitudeTypeEDataType, BigDecimal.class, "LatitudeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longitudeTypeEDataType, BigDecimal.class, "LongitudeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (boundsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "boundsType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getBoundsType_Maxlat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxlat"
		   });		
		addAnnotation
		  (getBoundsType_Maxlon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxlon"
		   });		
		addAnnotation
		  (getBoundsType_Minlat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "minlat"
		   });		
		addAnnotation
		  (getBoundsType_Minlon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "minlon"
		   });		
		addAnnotation
		  (degreesTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "degreesType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			 "minInclusive", "0.0",
			 "maxInclusive", "360.0"
		   });		
		addAnnotation
		  (dgpsStationTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "dgpsStationType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "0",
			 "maxInclusive", "1023"
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
		  (getDocumentRoot_Gpx(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "gpx",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (emailTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "emailType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[\\p{L}_]+(\\.[\\p{L}_]+)*@[\\p{L}_]+(\\.[\\p{L}_]+)+"
		   });		
		addAnnotation
		  (fixTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "fixType"
		   });		
		addAnnotation
		  (fixTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "fixType:Object",
			 "baseType", "fixType"
		   });		
		addAnnotation
		  (gpxTypeEClass, 
		   source, 
		   new String[] {
			 "name", "gpx_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGpxType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGpxType_Desc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "desc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGpxType_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGpxType_Email(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "email",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGpxType_Url(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGpxType_Urlname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "urlname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGpxType_Time(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGpxType_Keywords(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keywords",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGpxType_Bounds(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bounds",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGpxType_Wpt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "wpt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGpxType_Rte(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rte",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGpxType_Trk(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "trk",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGpxType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":12",
			 "processing", "strict"
		   });		
		addAnnotation
		  (getGpxType_Creator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "creator"
		   });		
		addAnnotation
		  (getGpxType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (latitudeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "latitudeType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			 "minInclusive", "-90.0",
			 "maxInclusive", "90.0"
		   });		
		addAnnotation
		  (longitudeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "longitudeType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			 "minInclusive", "-180.0",
			 "maxInclusive", "180.0"
		   });		
		addAnnotation
		  (rteptTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rtept_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRteptType_Ele(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ele",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Time(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Magvar(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "magvar",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Geoidheight(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "geoidheight",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Cmt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cmt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Desc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "desc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Src(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "src",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Url(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Urlname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "urlname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Sym(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sym",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Fix(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fix",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Sat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sat",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Hdop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hdop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Vdop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vdop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Pdop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pdop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Ageofdgpsdata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ageofdgpsdata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Dgpsid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dgpsid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteptType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":19",
			 "processing", "strict"
		   });		
		addAnnotation
		  (getRteptType_Lat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lat"
		   });		
		addAnnotation
		  (getRteptType_Lon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lon"
		   });		
		addAnnotation
		  (rteTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rte_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRteType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteType_Cmt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cmt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteType_Desc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "desc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteType_Src(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "src",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteType_Url(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteType_Urlname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "urlname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteType_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRteType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":7",
			 "processing", "strict"
		   });		
		addAnnotation
		  (getRteType_Rtept(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rtept",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (trkptTypeEClass, 
		   source, 
		   new String[] {
			 "name", "trkpt_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTrkptType_Ele(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ele",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Time(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Course(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "course",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Speed(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "speed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Magvar(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "magvar",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Geoidheight(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "geoidheight",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Cmt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cmt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Desc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "desc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Src(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "src",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Url(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Urlname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "urlname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Sym(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sym",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Fix(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fix",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Sat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sat",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Hdop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hdop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Vdop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vdop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Pdop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pdop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Ageofdgpsdata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ageofdgpsdata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Dgpsid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dgpsid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkptType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":21",
			 "processing", "strict"
		   });		
		addAnnotation
		  (getTrkptType_Lat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lat"
		   });		
		addAnnotation
		  (getTrkptType_Lon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lon"
		   });		
		addAnnotation
		  (trksegTypeEClass, 
		   source, 
		   new String[] {
			 "name", "trkseg_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTrksegType_Trkpt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "trkpt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (trkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "trk_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTrkType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkType_Cmt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cmt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkType_Desc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "desc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkType_Src(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "src",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkType_Url(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkType_Urlname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "urlname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkType_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrkType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":7",
			 "processing", "strict"
		   });		
		addAnnotation
		  (getTrkType_Trkseg(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "trkseg",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (wptTypeEClass, 
		   source, 
		   new String[] {
			 "name", "wpt_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getWptType_Ele(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ele",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Time(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Magvar(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "magvar",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Geoidheight(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "geoidheight",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Cmt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cmt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Desc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "desc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Src(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "src",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Url(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Urlname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "urlname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Sym(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sym",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Fix(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fix",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Sat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sat",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Hdop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hdop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Vdop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vdop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Pdop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pdop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Ageofdgpsdata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ageofdgpsdata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Dgpsid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dgpsid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWptType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":19",
			 "processing", "strict"
		   });		
		addAnnotation
		  (getWptType_Lat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lat"
		   });		
		addAnnotation
		  (getWptType_Lon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lon"
		   });
	}

} //GpxPackageImpl
