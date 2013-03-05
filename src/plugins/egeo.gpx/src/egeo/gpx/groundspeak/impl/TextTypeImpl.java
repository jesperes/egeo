/**
 */
package egeo.gpx.groundspeak.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import egeo.gpx.groundspeak.GroundspeakPackage;
import egeo.gpx.groundspeak.TextType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.gpx.groundspeak.impl.TextTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.TextTypeImpl#getEncoded <em>Encoded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextTypeImpl extends MinimalEObjectImpl.Container implements TextType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoded() <em>Encoded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoded()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoded() <em>Encoded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoded()
	 * @generated
	 * @ordered
	 */
	protected String encoded = ENCODED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroundspeakPackage.Literals.TEXT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.TEXT_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoded() {
		return encoded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoded(String newEncoded) {
		String oldEncoded = encoded;
		encoded = newEncoded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.TEXT_TYPE__ENCODED, oldEncoded, encoded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroundspeakPackage.TEXT_TYPE__VALUE:
				return getValue();
			case GroundspeakPackage.TEXT_TYPE__ENCODED:
				return getEncoded();
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
			case GroundspeakPackage.TEXT_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case GroundspeakPackage.TEXT_TYPE__ENCODED:
				setEncoded((String)newValue);
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
			case GroundspeakPackage.TEXT_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GroundspeakPackage.TEXT_TYPE__ENCODED:
				setEncoded(ENCODED_EDEFAULT);
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
			case GroundspeakPackage.TEXT_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case GroundspeakPackage.TEXT_TYPE__ENCODED:
				return ENCODED_EDEFAULT == null ? encoded != null : !ENCODED_EDEFAULT.equals(encoded);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", encoded: ");
		result.append(encoded);
		result.append(')');
		return result.toString();
	}

} //TextTypeImpl
