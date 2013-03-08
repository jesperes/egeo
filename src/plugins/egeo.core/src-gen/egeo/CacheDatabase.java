/**
 */
package egeo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.CacheDatabase#getCaches <em>Caches</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.EgeoPackage#getCacheDatabase()
 * @model
 * @generated
 */
public interface CacheDatabase extends EObject
{
  /**
   * Returns the value of the '<em><b>Caches</b></em>' containment reference list.
   * The list contents are of type {@link egeo.Geocache}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caches</em>' containment reference list.
   * @see egeo.EgeoPackage#getCacheDatabase_Caches()
   * @model containment="true"
   * @generated
   */
  EList<Geocache> getCaches();

} // CacheDatabase
