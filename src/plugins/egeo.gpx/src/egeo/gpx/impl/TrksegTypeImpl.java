/**
 */
package egeo.gpx.impl;

import egeo.gpx.GpxPackage;
import egeo.gpx.TrkptType;
import egeo.gpx.TrksegType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trkseg Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.gpx.impl.TrksegTypeImpl#getTrkpt <em>Trkpt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrksegTypeImpl extends MinimalEObjectImpl.Container implements TrksegType {
	/**
	 * The cached value of the '{@link #getTrkpt() <em>Trkpt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrkpt()
	 * @generated
	 * @ordered
	 */
	protected EList<TrkptType> trkpt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrksegTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpxPackage.Literals.TRKSEG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrkptType> getTrkpt() {
		if (trkpt == null) {
			trkpt = new EObjectContainmentEList<TrkptType>(TrkptType.class, this, GpxPackage.TRKSEG_TYPE__TRKPT);
		}
		return trkpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GpxPackage.TRKSEG_TYPE__TRKPT:
				return ((InternalEList<?>)getTrkpt()).basicRemove(otherEnd, msgs);
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
			case GpxPackage.TRKSEG_TYPE__TRKPT:
				return getTrkpt();
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
			case GpxPackage.TRKSEG_TYPE__TRKPT:
				getTrkpt().clear();
				getTrkpt().addAll((Collection<? extends TrkptType>)newValue);
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
			case GpxPackage.TRKSEG_TYPE__TRKPT:
				getTrkpt().clear();
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
			case GpxPackage.TRKSEG_TYPE__TRKPT:
				return trkpt != null && !trkpt.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrksegTypeImpl
