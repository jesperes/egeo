/**
 */
package se.eskilson.egeo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.eskilson.egeo.Attribute;
import se.eskilson.egeo.Cache;
import se.eskilson.egeo.Database;
import se.eskilson.egeo.EgeoPackage;
import se.eskilson.egeo.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.eskilson.egeo.impl.DatabaseImpl#getCaches <em>Caches</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.DatabaseImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.DatabaseImpl#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseImpl extends MinimalEObjectImpl.Container implements
		Database {
	/**
	 * The cached value of the '{@link #getCaches() <em>Caches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaches()
	 * @generated
	 * @ordered
	 */
	protected EList<Cache> caches;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgeoPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cache> getCaches() {
		if (caches == null) {
			caches = new EObjectContainmentEList<Cache>(Cache.class, this,
					EgeoPackage.DATABASE__CACHES);
		}
		return caches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(
					Attribute.class, this, EgeoPackage.DATABASE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this,
					EgeoPackage.DATABASE__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EgeoPackage.DATABASE__CACHES:
			return ((InternalEList<?>) getCaches()).basicRemove(otherEnd, msgs);
		case EgeoPackage.DATABASE__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd,
					msgs);
		case EgeoPackage.DATABASE__USERS:
			return ((InternalEList<?>) getUsers()).basicRemove(otherEnd, msgs);
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
		case EgeoPackage.DATABASE__CACHES:
			return getCaches();
		case EgeoPackage.DATABASE__ATTRIBUTES:
			return getAttributes();
		case EgeoPackage.DATABASE__USERS:
			return getUsers();
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
		case EgeoPackage.DATABASE__CACHES:
			getCaches().clear();
			getCaches().addAll((Collection<? extends Cache>) newValue);
			return;
		case EgeoPackage.DATABASE__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
			return;
		case EgeoPackage.DATABASE__USERS:
			getUsers().clear();
			getUsers().addAll((Collection<? extends User>) newValue);
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
		case EgeoPackage.DATABASE__CACHES:
			getCaches().clear();
			return;
		case EgeoPackage.DATABASE__ATTRIBUTES:
			getAttributes().clear();
			return;
		case EgeoPackage.DATABASE__USERS:
			getUsers().clear();
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
		case EgeoPackage.DATABASE__CACHES:
			return caches != null && !caches.isEmpty();
		case EgeoPackage.DATABASE__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		case EgeoPackage.DATABASE__USERS:
			return users != null && !users.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabaseImpl
