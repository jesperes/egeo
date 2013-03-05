/**
 */
package egeo.gpx.groundspeak.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import egeo.gpx.groundspeak.GroundspeakPackage;
import egeo.gpx.groundspeak.LogWptType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Wpt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.gpx.groundspeak.impl.LogWptTypeImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.LogWptTypeImpl#getLon <em>Lon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogWptTypeImpl extends MinimalEObjectImpl.Container implements LogWptType {
	/**
	 * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected static final String LAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected String lat = LAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected static final String LON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected String lon = LON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogWptTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroundspeakPackage.Literals.LOG_WPT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLat() {
		return lat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLat(String newLat) {
		String oldLat = lat;
		lat = newLat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.LOG_WPT_TYPE__LAT, oldLat, lat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLon() {
		return lon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLon(String newLon) {
		String oldLon = lon;
		lon = newLon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.LOG_WPT_TYPE__LON, oldLon, lon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroundspeakPackage.LOG_WPT_TYPE__LAT:
				return getLat();
			case GroundspeakPackage.LOG_WPT_TYPE__LON:
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
			case GroundspeakPackage.LOG_WPT_TYPE__LAT:
				setLat((String)newValue);
				return;
			case GroundspeakPackage.LOG_WPT_TYPE__LON:
				setLon((String)newValue);
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
			case GroundspeakPackage.LOG_WPT_TYPE__LAT:
				setLat(LAT_EDEFAULT);
				return;
			case GroundspeakPackage.LOG_WPT_TYPE__LON:
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
			case GroundspeakPackage.LOG_WPT_TYPE__LAT:
				return LAT_EDEFAULT == null ? lat != null : !LAT_EDEFAULT.equals(lat);
			case GroundspeakPackage.LOG_WPT_TYPE__LON:
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
		result.append(" (lat: ");
		result.append(lat);
		result.append(", lon: ");
		result.append(lon);
		result.append(')');
		return result.toString();
	}

} //LogWptTypeImpl
