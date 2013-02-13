/**
 */
package egeo.gpx.impl;

import egeo.gpx.BoundsType;
import egeo.gpx.CopyrightType;
import egeo.gpx.DocumentRoot;
import egeo.gpx.EmailType;
import egeo.gpx.ExtensionsType;
import egeo.gpx.FixType;
import egeo.gpx.GpxFactory;
import egeo.gpx.GpxPackage;
import egeo.gpx.GpxType;
import egeo.gpx.LinkType;
import egeo.gpx.MetadataType;
import egeo.gpx.PersonType;
import egeo.gpx.PtType;
import egeo.gpx.PtsegType;
import egeo.gpx.RteType;
import egeo.gpx.TrkType;
import egeo.gpx.TrksegType;
import egeo.gpx.WptType;

import egeo.gpx.util.GpxValidator;

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
	private EClass copyrightTypeEClass = null;

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
	private EClass emailTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionsTypeEClass = null;

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
	private EClass linkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptsegTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptTypeEClass = null;

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
	public EClass getCopyrightType() {
		return copyrightTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyrightType_Year() {
		return (EAttribute)copyrightTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyrightType_License() {
		return (EAttribute)copyrightTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyrightType_Author() {
		return (EAttribute)copyrightTypeEClass.getEStructuralFeatures().get(2);
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
	public EClass getEmailType() {
		return emailTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailType_Domain() {
		return (EAttribute)emailTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmailType_Id() {
		return (EAttribute)emailTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionsType() {
		return extensionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionsType_Any() {
		return (EAttribute)extensionsTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getGpxType_Metadata() {
		return (EReference)gpxTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpxType_Wpt() {
		return (EReference)gpxTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpxType_Rte() {
		return (EReference)gpxTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpxType_Trk() {
		return (EReference)gpxTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpxType_Extensions() {
		return (EReference)gpxTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpxType_Creator() {
		return (EAttribute)gpxTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpxType_Version() {
		return (EAttribute)gpxTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkType() {
		return linkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_Text() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_Type() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_Href() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataType() {
		return metadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataType_Name() {
		return (EAttribute)metadataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataType_Desc() {
		return (EAttribute)metadataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_Author() {
		return (EReference)metadataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_Copyright() {
		return (EReference)metadataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_Link() {
		return (EReference)metadataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataType_Time() {
		return (EAttribute)metadataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataType_Keywords() {
		return (EAttribute)metadataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_Bounds() {
		return (EReference)metadataTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataType_Extensions() {
		return (EReference)metadataTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonType() {
		return personTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonType_Name() {
		return (EAttribute)personTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_Email() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonType_Link() {
		return (EReference)personTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPtsegType() {
		return ptsegTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPtsegType_Pt() {
		return (EReference)ptsegTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPtType() {
		return ptTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPtType_Ele() {
		return (EAttribute)ptTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPtType_Time() {
		return (EAttribute)ptTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPtType_Lat() {
		return (EAttribute)ptTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPtType_Lon() {
		return (EAttribute)ptTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getRteType_Link() {
		return (EReference)rteTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteType_Number() {
		return (EAttribute)rteTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRteType_Type() {
		return (EAttribute)rteTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRteType_Extensions() {
		return (EReference)rteTypeEClass.getEStructuralFeatures().get(7);
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
	public EReference getTrksegType_Extensions() {
		return (EReference)trksegTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getTrkType_Link() {
		return (EReference)trkTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkType_Number() {
		return (EAttribute)trkTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrkType_Type() {
		return (EAttribute)trkTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrkType_Extensions() {
		return (EReference)trkTypeEClass.getEStructuralFeatures().get(7);
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
	public EReference getWptType_Link() {
		return (EReference)wptTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Sym() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Type() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Fix() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Sat() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Hdop() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Vdop() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Pdop() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Ageofdgpsdata() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Dgpsid() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWptType_Extensions() {
		return (EReference)wptTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Lat() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWptType_Lon() {
		return (EAttribute)wptTypeEClass.getEStructuralFeatures().get(20);
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

		copyrightTypeEClass = createEClass(COPYRIGHT_TYPE);
		createEAttribute(copyrightTypeEClass, COPYRIGHT_TYPE__YEAR);
		createEAttribute(copyrightTypeEClass, COPYRIGHT_TYPE__LICENSE);
		createEAttribute(copyrightTypeEClass, COPYRIGHT_TYPE__AUTHOR);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GPX);

		emailTypeEClass = createEClass(EMAIL_TYPE);
		createEAttribute(emailTypeEClass, EMAIL_TYPE__DOMAIN);
		createEAttribute(emailTypeEClass, EMAIL_TYPE__ID);

		extensionsTypeEClass = createEClass(EXTENSIONS_TYPE);
		createEAttribute(extensionsTypeEClass, EXTENSIONS_TYPE__ANY);

		gpxTypeEClass = createEClass(GPX_TYPE);
		createEReference(gpxTypeEClass, GPX_TYPE__METADATA);
		createEReference(gpxTypeEClass, GPX_TYPE__WPT);
		createEReference(gpxTypeEClass, GPX_TYPE__RTE);
		createEReference(gpxTypeEClass, GPX_TYPE__TRK);
		createEReference(gpxTypeEClass, GPX_TYPE__EXTENSIONS);
		createEAttribute(gpxTypeEClass, GPX_TYPE__CREATOR);
		createEAttribute(gpxTypeEClass, GPX_TYPE__VERSION);

		linkTypeEClass = createEClass(LINK_TYPE);
		createEAttribute(linkTypeEClass, LINK_TYPE__TEXT);
		createEAttribute(linkTypeEClass, LINK_TYPE__TYPE);
		createEAttribute(linkTypeEClass, LINK_TYPE__HREF);

		metadataTypeEClass = createEClass(METADATA_TYPE);
		createEAttribute(metadataTypeEClass, METADATA_TYPE__NAME);
		createEAttribute(metadataTypeEClass, METADATA_TYPE__DESC);
		createEReference(metadataTypeEClass, METADATA_TYPE__AUTHOR);
		createEReference(metadataTypeEClass, METADATA_TYPE__COPYRIGHT);
		createEReference(metadataTypeEClass, METADATA_TYPE__LINK);
		createEAttribute(metadataTypeEClass, METADATA_TYPE__TIME);
		createEAttribute(metadataTypeEClass, METADATA_TYPE__KEYWORDS);
		createEReference(metadataTypeEClass, METADATA_TYPE__BOUNDS);
		createEReference(metadataTypeEClass, METADATA_TYPE__EXTENSIONS);

		personTypeEClass = createEClass(PERSON_TYPE);
		createEAttribute(personTypeEClass, PERSON_TYPE__NAME);
		createEReference(personTypeEClass, PERSON_TYPE__EMAIL);
		createEReference(personTypeEClass, PERSON_TYPE__LINK);

		ptsegTypeEClass = createEClass(PTSEG_TYPE);
		createEReference(ptsegTypeEClass, PTSEG_TYPE__PT);

		ptTypeEClass = createEClass(PT_TYPE);
		createEAttribute(ptTypeEClass, PT_TYPE__ELE);
		createEAttribute(ptTypeEClass, PT_TYPE__TIME);
		createEAttribute(ptTypeEClass, PT_TYPE__LAT);
		createEAttribute(ptTypeEClass, PT_TYPE__LON);

		rteTypeEClass = createEClass(RTE_TYPE);
		createEAttribute(rteTypeEClass, RTE_TYPE__NAME);
		createEAttribute(rteTypeEClass, RTE_TYPE__CMT);
		createEAttribute(rteTypeEClass, RTE_TYPE__DESC);
		createEAttribute(rteTypeEClass, RTE_TYPE__SRC);
		createEReference(rteTypeEClass, RTE_TYPE__LINK);
		createEAttribute(rteTypeEClass, RTE_TYPE__NUMBER);
		createEAttribute(rteTypeEClass, RTE_TYPE__TYPE);
		createEReference(rteTypeEClass, RTE_TYPE__EXTENSIONS);
		createEReference(rteTypeEClass, RTE_TYPE__RTEPT);

		trksegTypeEClass = createEClass(TRKSEG_TYPE);
		createEReference(trksegTypeEClass, TRKSEG_TYPE__TRKPT);
		createEReference(trksegTypeEClass, TRKSEG_TYPE__EXTENSIONS);

		trkTypeEClass = createEClass(TRK_TYPE);
		createEAttribute(trkTypeEClass, TRK_TYPE__NAME);
		createEAttribute(trkTypeEClass, TRK_TYPE__CMT);
		createEAttribute(trkTypeEClass, TRK_TYPE__DESC);
		createEAttribute(trkTypeEClass, TRK_TYPE__SRC);
		createEReference(trkTypeEClass, TRK_TYPE__LINK);
		createEAttribute(trkTypeEClass, TRK_TYPE__NUMBER);
		createEAttribute(trkTypeEClass, TRK_TYPE__TYPE);
		createEReference(trkTypeEClass, TRK_TYPE__EXTENSIONS);
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
		createEReference(wptTypeEClass, WPT_TYPE__LINK);
		createEAttribute(wptTypeEClass, WPT_TYPE__SYM);
		createEAttribute(wptTypeEClass, WPT_TYPE__TYPE);
		createEAttribute(wptTypeEClass, WPT_TYPE__FIX);
		createEAttribute(wptTypeEClass, WPT_TYPE__SAT);
		createEAttribute(wptTypeEClass, WPT_TYPE__HDOP);
		createEAttribute(wptTypeEClass, WPT_TYPE__VDOP);
		createEAttribute(wptTypeEClass, WPT_TYPE__PDOP);
		createEAttribute(wptTypeEClass, WPT_TYPE__AGEOFDGPSDATA);
		createEAttribute(wptTypeEClass, WPT_TYPE__DGPSID);
		createEReference(wptTypeEClass, WPT_TYPE__EXTENSIONS);
		createEAttribute(wptTypeEClass, WPT_TYPE__LAT);
		createEAttribute(wptTypeEClass, WPT_TYPE__LON);

		// Create enums
		fixTypeEEnum = createEEnum(FIX_TYPE);

		// Create data types
		degreesTypeEDataType = createEDataType(DEGREES_TYPE);
		dgpsStationTypeEDataType = createEDataType(DGPS_STATION_TYPE);
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

		initEClass(copyrightTypeEClass, CopyrightType.class, "CopyrightType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCopyrightType_Year(), theXMLTypePackage.getGYear(), "year", null, 0, 1, CopyrightType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyrightType_License(), theXMLTypePackage.getAnyURI(), "license", null, 0, 1, CopyrightType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyrightType_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, CopyrightType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Gpx(), this.getGpxType(), null, "gpx", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(emailTypeEClass, EmailType.class, "EmailType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailType_Domain(), theXMLTypePackage.getString(), "domain", null, 1, 1, EmailType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmailType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, EmailType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionsTypeEClass, ExtensionsType.class, "ExtensionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensionsType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ExtensionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gpxTypeEClass, GpxType.class, "GpxType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGpxType_Metadata(), this.getMetadataType(), null, "metadata", null, 0, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGpxType_Wpt(), this.getWptType(), null, "wpt", null, 0, -1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGpxType_Rte(), this.getRteType(), null, "rte", null, 0, -1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGpxType_Trk(), this.getTrkType(), null, "trk", null, 0, -1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGpxType_Extensions(), this.getExtensionsType(), null, "extensions", null, 0, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpxType_Creator(), theXMLTypePackage.getString(), "creator", null, 1, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGpxType_Version(), theXMLTypePackage.getString(), "version", "1.1", 1, 1, GpxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkTypeEClass, LinkType.class, "LinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkType_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 1, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataTypeEClass, MetadataType.class, "MetadataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadataType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadataType_Desc(), theXMLTypePackage.getString(), "desc", null, 0, 1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataType_Author(), this.getPersonType(), null, "author", null, 0, 1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataType_Copyright(), this.getCopyrightType(), null, "copyright", null, 0, 1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataType_Link(), this.getLinkType(), null, "link", null, 0, -1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadataType_Time(), theXMLTypePackage.getDateTime(), "time", null, 0, 1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadataType_Keywords(), theXMLTypePackage.getString(), "keywords", null, 0, 1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataType_Bounds(), this.getBoundsType(), null, "bounds", null, 0, 1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataType_Extensions(), this.getExtensionsType(), null, "extensions", null, 0, 1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personTypeEClass, PersonType.class, "PersonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Email(), this.getEmailType(), null, "email", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonType_Link(), this.getLinkType(), null, "link", null, 0, 1, PersonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ptsegTypeEClass, PtsegType.class, "PtsegType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPtsegType_Pt(), this.getPtType(), null, "pt", null, 0, -1, PtsegType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ptTypeEClass, PtType.class, "PtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPtType_Ele(), theXMLTypePackage.getDecimal(), "ele", null, 0, 1, PtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPtType_Time(), theXMLTypePackage.getDateTime(), "time", null, 0, 1, PtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPtType_Lat(), this.getLatitudeType(), "lat", null, 1, 1, PtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPtType_Lon(), this.getLongitudeType(), "lon", null, 1, 1, PtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rteTypeEClass, RteType.class, "RteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRteType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteType_Cmt(), theXMLTypePackage.getString(), "cmt", null, 0, 1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteType_Desc(), theXMLTypePackage.getString(), "desc", null, 0, 1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteType_Src(), theXMLTypePackage.getString(), "src", null, 0, 1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteType_Link(), this.getLinkType(), null, "link", null, 0, -1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteType_Number(), theXMLTypePackage.getNonNegativeInteger(), "number", null, 0, 1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRteType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteType_Extensions(), this.getExtensionsType(), null, "extensions", null, 0, 1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRteType_Rtept(), this.getWptType(), null, "rtept", null, 0, -1, RteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trksegTypeEClass, TrksegType.class, "TrksegType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrksegType_Trkpt(), this.getWptType(), null, "trkpt", null, 0, -1, TrksegType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrksegType_Extensions(), this.getExtensionsType(), null, "extensions", null, 0, 1, TrksegType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trkTypeEClass, TrkType.class, "TrkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrkType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkType_Cmt(), theXMLTypePackage.getString(), "cmt", null, 0, 1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkType_Desc(), theXMLTypePackage.getString(), "desc", null, 0, 1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkType_Src(), theXMLTypePackage.getString(), "src", null, 0, 1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrkType_Link(), this.getLinkType(), null, "link", null, 0, -1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkType_Number(), theXMLTypePackage.getNonNegativeInteger(), "number", null, 0, 1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrkType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrkType_Extensions(), this.getExtensionsType(), null, "extensions", null, 0, 1, TrkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getWptType_Link(), this.getLinkType(), null, "link", null, 0, -1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Sym(), theXMLTypePackage.getString(), "sym", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Fix(), this.getFixType(), "fix", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Sat(), theXMLTypePackage.getNonNegativeInteger(), "sat", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Hdop(), theXMLTypePackage.getDecimal(), "hdop", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Vdop(), theXMLTypePackage.getDecimal(), "vdop", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Pdop(), theXMLTypePackage.getDecimal(), "pdop", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Ageofdgpsdata(), theXMLTypePackage.getDecimal(), "ageofdgpsdata", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWptType_Dgpsid(), this.getDgpsStationType(), "dgpsid", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWptType_Extensions(), this.getExtensionsType(), null, "extensions", null, 0, 1, WptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		  (copyrightTypeEClass, 
		   source, 
		   new String[] {
			 "name", "copyrightType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getCopyrightType_Year(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year"
		   });			
		addAnnotation
		  (getCopyrightType_License(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "license"
		   });			
		addAnnotation
		  (getCopyrightType_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "author"
		   });			
		addAnnotation
		  (degreesTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "degreesType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			 "minInclusive", "0.0",
			 "maxExclusive", "360.0"
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
		  (emailTypeEClass, 
		   source, 
		   new String[] {
			 "name", "emailType",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getEmailType_Domain(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "domain"
		   });			
		addAnnotation
		  (getEmailType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });			
		addAnnotation
		  (extensionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "extensionsType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getExtensionsType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
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
			 "name", "gpxType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getGpxType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "metadata"
		   });			
		addAnnotation
		  (getGpxType_Wpt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "wpt"
		   });			
		addAnnotation
		  (getGpxType_Rte(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rte"
		   });			
		addAnnotation
		  (getGpxType_Trk(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "trk"
		   });			
		addAnnotation
		  (getGpxType_Extensions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extensions"
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
		  (linkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "linkType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getLinkType_Text(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text"
		   });			
		addAnnotation
		  (getLinkType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });			
		addAnnotation
		  (getLinkType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href"
		   });			
		addAnnotation
		  (longitudeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "longitudeType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			 "minInclusive", "-180.0",
			 "maxExclusive", "180.0"
		   });			
		addAnnotation
		  (metadataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "metadataType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getMetadataType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getMetadataType_Desc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "desc"
		   });			
		addAnnotation
		  (getMetadataType_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author"
		   });			
		addAnnotation
		  (getMetadataType_Copyright(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "copyright"
		   });			
		addAnnotation
		  (getMetadataType_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "link"
		   });			
		addAnnotation
		  (getMetadataType_Time(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time"
		   });			
		addAnnotation
		  (getMetadataType_Keywords(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keywords"
		   });			
		addAnnotation
		  (getMetadataType_Bounds(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bounds"
		   });			
		addAnnotation
		  (getMetadataType_Extensions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extensions"
		   });			
		addAnnotation
		  (personTypeEClass, 
		   source, 
		   new String[] {
			 "name", "personType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getPersonType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getPersonType_Email(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "email"
		   });			
		addAnnotation
		  (getPersonType_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "link"
		   });			
		addAnnotation
		  (ptsegTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ptsegType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getPtsegType_Pt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pt"
		   });			
		addAnnotation
		  (ptTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ptType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getPtType_Ele(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ele"
		   });			
		addAnnotation
		  (getPtType_Time(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time"
		   });			
		addAnnotation
		  (getPtType_Lat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lat"
		   });			
		addAnnotation
		  (getPtType_Lon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lon"
		   });			
		addAnnotation
		  (rteTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rteType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRteType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getRteType_Cmt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cmt"
		   });			
		addAnnotation
		  (getRteType_Desc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "desc"
		   });			
		addAnnotation
		  (getRteType_Src(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "src"
		   });			
		addAnnotation
		  (getRteType_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "link"
		   });			
		addAnnotation
		  (getRteType_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number"
		   });			
		addAnnotation
		  (getRteType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });			
		addAnnotation
		  (getRteType_Extensions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extensions"
		   });			
		addAnnotation
		  (getRteType_Rtept(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rtept"
		   });			
		addAnnotation
		  (trksegTypeEClass, 
		   source, 
		   new String[] {
			 "name", "trksegType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getTrksegType_Trkpt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "trkpt"
		   });			
		addAnnotation
		  (getTrksegType_Extensions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extensions"
		   });			
		addAnnotation
		  (trkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "trkType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getTrkType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getTrkType_Cmt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cmt"
		   });			
		addAnnotation
		  (getTrkType_Desc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "desc"
		   });			
		addAnnotation
		  (getTrkType_Src(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "src"
		   });			
		addAnnotation
		  (getTrkType_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "link"
		   });			
		addAnnotation
		  (getTrkType_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number"
		   });			
		addAnnotation
		  (getTrkType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });			
		addAnnotation
		  (getTrkType_Extensions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extensions"
		   });			
		addAnnotation
		  (getTrkType_Trkseg(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "trkseg"
		   });			
		addAnnotation
		  (wptTypeEClass, 
		   source, 
		   new String[] {
			 "name", "wptType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getWptType_Ele(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ele"
		   });			
		addAnnotation
		  (getWptType_Time(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time"
		   });			
		addAnnotation
		  (getWptType_Magvar(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "magvar"
		   });			
		addAnnotation
		  (getWptType_Geoidheight(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "geoidheight"
		   });			
		addAnnotation
		  (getWptType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getWptType_Cmt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cmt"
		   });			
		addAnnotation
		  (getWptType_Desc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "desc"
		   });			
		addAnnotation
		  (getWptType_Src(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "src"
		   });			
		addAnnotation
		  (getWptType_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "link"
		   });			
		addAnnotation
		  (getWptType_Sym(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sym"
		   });			
		addAnnotation
		  (getWptType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "type"
		   });			
		addAnnotation
		  (getWptType_Fix(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fix"
		   });			
		addAnnotation
		  (getWptType_Sat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sat"
		   });			
		addAnnotation
		  (getWptType_Hdop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hdop"
		   });			
		addAnnotation
		  (getWptType_Vdop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vdop"
		   });			
		addAnnotation
		  (getWptType_Pdop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pdop"
		   });			
		addAnnotation
		  (getWptType_Ageofdgpsdata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ageofdgpsdata"
		   });			
		addAnnotation
		  (getWptType_Dgpsid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dgpsid"
		   });			
		addAnnotation
		  (getWptType_Extensions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extensions"
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
