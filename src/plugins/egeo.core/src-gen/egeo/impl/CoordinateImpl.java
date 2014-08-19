/**
 */
package egeo.impl;

import egeo.Coordinate;
import egeo.EgeoPackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.impl.CoordinateImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link egeo.impl.CoordinateImpl#getLon <em>Lon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinateImpl extends MinimalEObjectImpl.Container implements Coordinate {
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
    protected CoordinateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EgeoPackage.Literals.COORDINATE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.COORDINATE__LAT, oldLat, lat));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.COORDINATE__LON, oldLon, lon));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EgeoPackage.COORDINATE__LAT:
                return getLat();
            case EgeoPackage.COORDINATE__LON:
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
            case EgeoPackage.COORDINATE__LAT:
                setLat((BigDecimal)newValue);
                return;
            case EgeoPackage.COORDINATE__LON:
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
            case EgeoPackage.COORDINATE__LAT:
                setLat(LAT_EDEFAULT);
                return;
            case EgeoPackage.COORDINATE__LON:
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
            case EgeoPackage.COORDINATE__LAT:
                return LAT_EDEFAULT == null ? lat != null : !LAT_EDEFAULT.equals(lat);
            case EgeoPackage.COORDINATE__LON:
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

} //CoordinateImpl
