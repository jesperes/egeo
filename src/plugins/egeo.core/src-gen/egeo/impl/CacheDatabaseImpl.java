/**
 */
package egeo.impl;

import egeo.CacheDatabase;
import egeo.EgeoPackage;
import egeo.Geocache;

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
 * An implementation of the model object '<em><b>Cache Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.impl.CacheDatabaseImpl#getCaches <em>Caches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CacheDatabaseImpl extends MinimalEObjectImpl.Container implements CacheDatabase
{
  /**
   * The cached value of the '{@link #getCaches() <em>Caches</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaches()
   * @generated
   * @ordered
   */
  protected EList<Geocache> caches;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CacheDatabaseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EgeoPackage.Literals.CACHE_DATABASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Geocache> getCaches()
  {
    if (caches == null)
    {
      caches = new EObjectContainmentEList<Geocache>(Geocache.class, this, EgeoPackage.CACHE_DATABASE__CACHES);
    }
    return caches;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EgeoPackage.CACHE_DATABASE__CACHES:
        return ((InternalEList<?>)getCaches()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EgeoPackage.CACHE_DATABASE__CACHES:
        return getCaches();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EgeoPackage.CACHE_DATABASE__CACHES:
        getCaches().clear();
        getCaches().addAll((Collection<? extends Geocache>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EgeoPackage.CACHE_DATABASE__CACHES:
        getCaches().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EgeoPackage.CACHE_DATABASE__CACHES:
        return caches != null && !caches.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CacheDatabaseImpl
