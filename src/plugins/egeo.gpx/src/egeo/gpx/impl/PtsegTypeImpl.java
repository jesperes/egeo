/**
 */
package egeo.gpx.impl;

import egeo.gpx.GpxPackage;
import egeo.gpx.PtType;
import egeo.gpx.PtsegType;

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
 * An implementation of the model object '<em><b>Ptseg Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.gpx.impl.PtsegTypeImpl#getPt <em>Pt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PtsegTypeImpl extends MinimalEObjectImpl.Container implements PtsegType {
	/**
	 * The cached value of the '{@link #getPt() <em>Pt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPt()
	 * @generated
	 * @ordered
	 */
	protected EList<PtType> pt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtsegTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpxPackage.Literals.PTSEG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PtType> getPt() {
		if (pt == null) {
			pt = new EObjectContainmentEList<PtType>(PtType.class, this, GpxPackage.PTSEG_TYPE__PT);
		}
		return pt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GpxPackage.PTSEG_TYPE__PT:
				return ((InternalEList<?>)getPt()).basicRemove(otherEnd, msgs);
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
			case GpxPackage.PTSEG_TYPE__PT:
				return getPt();
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
			case GpxPackage.PTSEG_TYPE__PT:
				getPt().clear();
				getPt().addAll((Collection<? extends PtType>)newValue);
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
			case GpxPackage.PTSEG_TYPE__PT:
				getPt().clear();
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
			case GpxPackage.PTSEG_TYPE__PT:
				return pt != null && !pt.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PtsegTypeImpl
