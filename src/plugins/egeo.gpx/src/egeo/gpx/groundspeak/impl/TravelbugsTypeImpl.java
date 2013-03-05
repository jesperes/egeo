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
import egeo.gpx.groundspeak.TravelbugType;
import egeo.gpx.groundspeak.TravelbugsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Travelbugs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.gpx.groundspeak.impl.TravelbugsTypeImpl#getTravelbug <em>Travelbug</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TravelbugsTypeImpl extends MinimalEObjectImpl.Container implements TravelbugsType {
	/**
	 * The cached value of the '{@link #getTravelbug() <em>Travelbug</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelbug()
	 * @generated
	 * @ordered
	 */
	protected EList<TravelbugType> travelbug;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelbugsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroundspeakPackage.Literals.TRAVELBUGS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TravelbugType> getTravelbug() {
		if (travelbug == null) {
			travelbug = new EObjectContainmentEList<TravelbugType>(TravelbugType.class, this, GroundspeakPackage.TRAVELBUGS_TYPE__TRAVELBUG);
		}
		return travelbug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GroundspeakPackage.TRAVELBUGS_TYPE__TRAVELBUG:
				return ((InternalEList<?>)getTravelbug()).basicRemove(otherEnd, msgs);
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
			case GroundspeakPackage.TRAVELBUGS_TYPE__TRAVELBUG:
				return getTravelbug();
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
			case GroundspeakPackage.TRAVELBUGS_TYPE__TRAVELBUG:
				getTravelbug().clear();
				getTravelbug().addAll((Collection<? extends TravelbugType>)newValue);
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
			case GroundspeakPackage.TRAVELBUGS_TYPE__TRAVELBUG:
				getTravelbug().clear();
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
			case GroundspeakPackage.TRAVELBUGS_TYPE__TRAVELBUG:
				return travelbug != null && !travelbug.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TravelbugsTypeImpl
