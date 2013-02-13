/**
 */
package egeo.gpx.impl;

import egeo.gpx.GpxPackage;
import egeo.gpx.PtType;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.gpx.impl.PtTypeImpl#getEle <em>Ele</em>}</li>
 *   <li>{@link egeo.gpx.impl.PtTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link egeo.gpx.impl.PtTypeImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link egeo.gpx.impl.PtTypeImpl#getLon <em>Lon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PtTypeImpl extends MinimalEObjectImpl.Container implements PtType {
	/**
	 * The default value of the '{@link #getEle() <em>Ele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEle()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ELE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEle() <em>Ele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEle()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal ele = ELE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal lat = LAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal lon = LON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpxPackage.Literals.PT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getEle() {
		return ele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEle(BigDecimal newEle) {
		BigDecimal oldEle = ele;
		ele = newEle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.PT_TYPE__ELE, oldEle, ele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(XMLGregorianCalendar newTime) {
		XMLGregorianCalendar oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.PT_TYPE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getLat() {
		return lat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLat(BigDecimal newLat) {
		BigDecimal oldLat = lat;
		lat = newLat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.PT_TYPE__LAT, oldLat, lat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getLon() {
		return lon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLon(BigDecimal newLon) {
		BigDecimal oldLon = lon;
		lon = newLon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.PT_TYPE__LON, oldLon, lon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GpxPackage.PT_TYPE__ELE:
				return getEle();
			case GpxPackage.PT_TYPE__TIME:
				return getTime();
			case GpxPackage.PT_TYPE__LAT:
				return getLat();
			case GpxPackage.PT_TYPE__LON:
				return getLon();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GpxPackage.PT_TYPE__ELE:
				setEle((BigDecimal)newValue);
				return;
			case GpxPackage.PT_TYPE__TIME:
				setTime((XMLGregorianCalendar)newValue);
				return;
			case GpxPackage.PT_TYPE__LAT:
				setLat((BigDecimal)newValue);
				return;
			case GpxPackage.PT_TYPE__LON:
				setLon((BigDecimal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GpxPackage.PT_TYPE__ELE:
				setEle(ELE_EDEFAULT);
				return;
			case GpxPackage.PT_TYPE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case GpxPackage.PT_TYPE__LAT:
				setLat(LAT_EDEFAULT);
				return;
			case GpxPackage.PT_TYPE__LON:
				setLon(LON_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GpxPackage.PT_TYPE__ELE:
				return ELE_EDEFAULT == null ? ele != null : !ELE_EDEFAULT.equals(ele);
			case GpxPackage.PT_TYPE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case GpxPackage.PT_TYPE__LAT:
				return LAT_EDEFAULT == null ? lat != null : !LAT_EDEFAULT.equals(lat);
			case GpxPackage.PT_TYPE__LON:
				return LON_EDEFAULT == null ? lon != null : !LON_EDEFAULT.equals(lon);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ele: ");
		result.append(ele);
		result.append(", time: ");
		result.append(time);
		result.append(", lat: ");
		result.append(lat);
		result.append(", lon: ");
		result.append(lon);
		result.append(')');
		return result.toString();
	}

} //PtTypeImpl
