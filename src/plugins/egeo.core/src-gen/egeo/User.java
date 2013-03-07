/**
 */
package egeo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.User#getUserId <em>User Id</em>}</li>
 *   <li>{@link egeo.User#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.EgeoPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject
{
  /**
   * Returns the value of the '<em><b>User Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Id</em>' attribute.
   * @see #setUserId(long)
   * @see egeo.EgeoPackage#getUser_UserId()
   * @model unique="false"
   * @generated
   */
  long getUserId();

  /**
   * Sets the value of the '{@link egeo.User#getUserId <em>User Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User Id</em>' attribute.
   * @see #getUserId()
   * @generated
   */
  void setUserId(long value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see egeo.EgeoPackage#getUser_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link egeo.User#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // User
