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
import se.eskilson.egeo.CacheDB;
import se.eskilson.egeo.EgeoPackage;
import se.eskilson.egeo.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.eskilson.egeo.impl.CacheDBImpl#getCaches <em>Caches</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheDBImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheDBImpl#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CacheDBImpl extends MinimalEObjectImpl.Container implements
		CacheDB {
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
	protected CacheDBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EgeoPackage.Literals.CACHE_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cache> getCaches() {
		if (caches == null) {
			caches = new EObjectContainmentEList<Cache>(Cache.class, this,
					EgeoPackage.CACHE_DB__CACHES);
		}
		return caches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(
					Attribute.class, this, EgeoPackage.CACHE_DB__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this,
					EgeoPackage.CACHE_DB__USERS);
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
		case EgeoPackage.CACHE_DB__CACHES:
			return ((InternalEList<?>) getCaches()).basicRemove(otherEnd, msgs);
		case EgeoPackage.CACHE_DB__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd,
					msgs);
		case EgeoPackage.CACHE_DB__USERS:
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
		case EgeoPackage.CACHE_DB__CACHES:
			return getCaches();
		case EgeoPackage.CACHE_DB__ATTRIBUTES:
			return getAttributes();
		case EgeoPackage.CACHE_DB__USERS:
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
		case EgeoPackage.CACHE_DB__CACHES:
			getCaches().clear();
			getCaches().addAll((Collection<? extends Cache>) newValue);
			return;
		case EgeoPackage.CACHE_DB__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
			return;
		case EgeoPackage.CACHE_DB__USERS:
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
		case EgeoPackage.CACHE_DB__CACHES:
			getCaches().clear();
			return;
		case EgeoPackage.CACHE_DB__ATTRIBUTES:
			getAttributes().clear();
			return;
		case EgeoPackage.CACHE_DB__USERS:
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
		case EgeoPackage.CACHE_DB__CACHES:
			return caches != null && !caches.isEmpty();
		case EgeoPackage.CACHE_DB__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		case EgeoPackage.CACHE_DB__USERS:
			return users != null && !users.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CacheDBImpl
