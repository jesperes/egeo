/**
 */
package egeo.gpx.groundspeak.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import egeo.gpx.groundspeak.GroundspeakPackage;
import egeo.gpx.groundspeak.LogType;
import egeo.gpx.groundspeak.LogsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.gpx.groundspeak.impl.LogsTypeImpl#getLog <em>Log</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogsTypeImpl extends MinimalEObjectImpl.Container implements LogsType {
	/**
	 * The cached value of the '{@link #getLog() <em>Log</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected EList<LogType> log;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroundspeakPackage.Literals.LOGS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogType> getLog() {
		if (log == null) {
			log = new EObjectContainmentEList<LogType>(LogType.class, this, GroundspeakPackage.LOGS_TYPE__LOG);
		}
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GroundspeakPackage.LOGS_TYPE__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
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
			case GroundspeakPackage.LOGS_TYPE__LOG:
				return getLog();
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
			case GroundspeakPackage.LOGS_TYPE__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends LogType>)newValue);
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
			case GroundspeakPackage.LOGS_TYPE__LOG:
				getLog().clear();
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
			case GroundspeakPackage.LOGS_TYPE__LOG:
				return log != null && !log.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogsTypeImpl
