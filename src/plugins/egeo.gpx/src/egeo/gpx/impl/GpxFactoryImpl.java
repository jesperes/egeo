/**
 */
package egeo.gpx.impl;

import egeo.gpx.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GpxFactoryImpl extends EFactoryImpl implements GpxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpxFactory init() {
		try {
			GpxFactory theGpxFactory = (GpxFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.topografix.com/GPX/1/0"); 
			if (theGpxFactory != null) {
				return theGpxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GpxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpxFactoryImpl() {
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
			case GpxPackage.BOUNDS_TYPE: return createBoundsType();
			case GpxPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case GpxPackage.GPX_TYPE: return createGpxType();
			case GpxPackage.RTEPT_TYPE: return createRteptType();
			case GpxPackage.RTE_TYPE: return createRteType();
			case GpxPackage.TRKPT_TYPE: return createTrkptType();
			case GpxPackage.TRKSEG_TYPE: return createTrksegType();
			case GpxPackage.TRK_TYPE: return createTrkType();
			case GpxPackage.WPT_TYPE: return createWptType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GpxPackage.FIX_TYPE:
				return createFixTypeFromString(eDataType, initialValue);
			case GpxPackage.DEGREES_TYPE:
				return createDegreesTypeFromString(eDataType, initialValue);
			case GpxPackage.DGPS_STATION_TYPE:
				return createDgpsStationTypeFromString(eDataType, initialValue);
			case GpxPackage.EMAIL_TYPE:
				return createEmailTypeFromString(eDataType, initialValue);
			case GpxPackage.FIX_TYPE_OBJECT:
				return createFixTypeObjectFromString(eDataType, initialValue);
			case GpxPackage.LATITUDE_TYPE:
				return createLatitudeTypeFromString(eDataType, initialValue);
			case GpxPackage.LONGITUDE_TYPE:
				return createLongitudeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GpxPackage.FIX_TYPE:
				return convertFixTypeToString(eDataType, instanceValue);
			case GpxPackage.DEGREES_TYPE:
				return convertDegreesTypeToString(eDataType, instanceValue);
			case GpxPackage.DGPS_STATION_TYPE:
				return convertDgpsStationTypeToString(eDataType, instanceValue);
			case GpxPackage.EMAIL_TYPE:
				return convertEmailTypeToString(eDataType, instanceValue);
			case GpxPackage.FIX_TYPE_OBJECT:
				return convertFixTypeObjectToString(eDataType, instanceValue);
			case GpxPackage.LATITUDE_TYPE:
				return convertLatitudeTypeToString(eDataType, instanceValue);
			case GpxPackage.LONGITUDE_TYPE:
				return convertLongitudeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundsType createBoundsType() {
		BoundsTypeImpl boundsType = new BoundsTypeImpl();
		return boundsType;
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
	public GpxType createGpxType() {
		GpxTypeImpl gpxType = new GpxTypeImpl();
		return gpxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteptType createRteptType() {
		RteptTypeImpl rteptType = new RteptTypeImpl();
		return rteptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RteType createRteType() {
		RteTypeImpl rteType = new RteTypeImpl();
		return rteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrkptType createTrkptType() {
		TrkptTypeImpl trkptType = new TrkptTypeImpl();
		return trkptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrksegType createTrksegType() {
		TrksegTypeImpl trksegType = new TrksegTypeImpl();
		return trksegType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrkType createTrkType() {
		TrkTypeImpl trkType = new TrkTypeImpl();
		return trkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WptType createWptType() {
		WptTypeImpl wptType = new WptTypeImpl();
		return wptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixType createFixTypeFromString(EDataType eDataType, String initialValue) {
		FixType result = FixType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFixTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDegreesTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDegreesTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createDgpsStationTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDgpsStationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEmailTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmailTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixType createFixTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFixTypeFromString(GpxPackage.Literals.FIX_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFixTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFixTypeToString(GpxPackage.Literals.FIX_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLatitudeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLatitudeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createLongitudeTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongitudeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpxPackage getGpxPackage() {
		return (GpxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GpxPackage getPackage() {
		return GpxPackage.eINSTANCE;
	}

} //GpxFactoryImpl
