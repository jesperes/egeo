/**
 */
package egeo.gpx.groundspeak.impl;

import egeo.gpx.groundspeak.FinderType;
import egeo.gpx.groundspeak.GroundspeakPackage;
import egeo.gpx.groundspeak.LogType;
import egeo.gpx.groundspeak.LogWptType;
import egeo.gpx.groundspeak.TextType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.gpx.groundspeak.impl.LogTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.LogTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.LogTypeImpl#getFinder <em>Finder</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.LogTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.LogTypeImpl#getLogWpt <em>Log Wpt</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.LogTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogTypeImpl extends MinimalEObjectImpl.Container implements LogType {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFinder() <em>Finder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinder()
	 * @generated
	 * @ordered
	 */
	protected EList<FinderType> finder;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> text;

	/**
	 * The cached value of the '{@link #getLogWpt() <em>Log Wpt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogWpt()
	 * @generated
	 * @ordered
	 */
	protected EList<LogWptType> logWpt;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroundspeakPackage.Literals.LOG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.LOG_TYPE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.LOG_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinderType> getFinder() {
		if (finder == null) {
			finder = new EObjectContainmentEList<FinderType>(FinderType.class, this, GroundspeakPackage.LOG_TYPE__FINDER);
		}
		return finder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getText() {
		if (text == null) {
			text = new EObjectContainmentEList<TextType>(TextType.class, this, GroundspeakPackage.LOG_TYPE__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogWptType> getLogWpt() {
		if (logWpt == null) {
			logWpt = new EObjectContainmentEList<LogWptType>(LogWptType.class, this, GroundspeakPackage.LOG_TYPE__LOG_WPT);
		}
		return logWpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.LOG_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GroundspeakPackage.LOG_TYPE__FINDER:
				return ((InternalEList<?>)getFinder()).basicRemove(otherEnd, msgs);
			case GroundspeakPackage.LOG_TYPE__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
			case GroundspeakPackage.LOG_TYPE__LOG_WPT:
				return ((InternalEList<?>)getLogWpt()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroundspeakPackage.LOG_TYPE__DATE:
				return getDate();
			case GroundspeakPackage.LOG_TYPE__TYPE:
				return getType();
			case GroundspeakPackage.LOG_TYPE__FINDER:
				return getFinder();
			case GroundspeakPackage.LOG_TYPE__TEXT:
				return getText();
			case GroundspeakPackage.LOG_TYPE__LOG_WPT:
				return getLogWpt();
			case GroundspeakPackage.LOG_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GroundspeakPackage.LOG_TYPE__DATE:
				setDate((String)newValue);
				return;
			case GroundspeakPackage.LOG_TYPE__TYPE:
				setType((String)newValue);
				return;
			case GroundspeakPackage.LOG_TYPE__FINDER:
				getFinder().clear();
				getFinder().addAll((Collection<? extends FinderType>)newValue);
				return;
			case GroundspeakPackage.LOG_TYPE__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends TextType>)newValue);
				return;
			case GroundspeakPackage.LOG_TYPE__LOG_WPT:
				getLogWpt().clear();
				getLogWpt().addAll((Collection<? extends LogWptType>)newValue);
				return;
			case GroundspeakPackage.LOG_TYPE__ID:
				setId((String)newValue);
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
			case GroundspeakPackage.LOG_TYPE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case GroundspeakPackage.LOG_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GroundspeakPackage.LOG_TYPE__FINDER:
				getFinder().clear();
				return;
			case GroundspeakPackage.LOG_TYPE__TEXT:
				getText().clear();
				return;
			case GroundspeakPackage.LOG_TYPE__LOG_WPT:
				getLogWpt().clear();
				return;
			case GroundspeakPackage.LOG_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case GroundspeakPackage.LOG_TYPE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case GroundspeakPackage.LOG_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case GroundspeakPackage.LOG_TYPE__FINDER:
				return finder != null && !finder.isEmpty();
			case GroundspeakPackage.LOG_TYPE__TEXT:
				return text != null && !text.isEmpty();
			case GroundspeakPackage.LOG_TYPE__LOG_WPT:
				return logWpt != null && !logWpt.isEmpty();
			case GroundspeakPackage.LOG_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (date: ");
		result.append(date);
		result.append(", type: ");
		result.append(type);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //LogTypeImpl
