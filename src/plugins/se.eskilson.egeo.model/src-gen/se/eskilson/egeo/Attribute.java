/**
 */
package se.eskilson.egeo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.eskilson.egeo.Attribute#getAttrId <em>Attr Id</em>}</li>
 *   <li>{@link se.eskilson.egeo.Attribute#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.eskilson.egeo.EgeoPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Attr Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr Id</em>' attribute.
   * @see #setAttrId(int)
   * @see se.eskilson.egeo.EgeoPackage#getAttribute_AttrId()
   * @model unique="false"
   * @generated
   */
  int getAttrId();

  /**
   * Sets the value of the '{@link se.eskilson.egeo.Attribute#getAttrId <em>Attr Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr Id</em>' attribute.
   * @see #getAttrId()
   * @generated
   */
  void setAttrId(int value);

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
   * @see se.eskilson.egeo.EgeoPackage#getAttribute_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link se.eskilson.egeo.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Attribute
