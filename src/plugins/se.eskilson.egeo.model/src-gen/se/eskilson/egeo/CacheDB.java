/**
 */
package se.eskilson.egeo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.eskilson.egeo.CacheDB#getCaches <em>Caches</em>}</li>
 *   <li>{@link se.eskilson.egeo.CacheDB#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link se.eskilson.egeo.CacheDB#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.eskilson.egeo.EgeoPackage#getCacheDB()
 * @model
 * @generated
 */
public interface CacheDB extends EObject {
	/**
	 * Returns the value of the '<em><b>Caches</b></em>' containment reference list.
	 * The list contents are of type {@link se.eskilson.egeo.Cache}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caches</em>' containment reference list.
	 * @see se.eskilson.egeo.EgeoPackage#getCacheDB_Caches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cache> getCaches();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link se.eskilson.egeo.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see se.eskilson.egeo.EgeoPackage#getCacheDB_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link se.eskilson.egeo.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see se.eskilson.egeo.EgeoPackage#getCacheDB_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

} // CacheDB
