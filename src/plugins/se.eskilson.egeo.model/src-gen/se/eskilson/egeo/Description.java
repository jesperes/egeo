/**
 */
package se.eskilson.egeo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.eskilson.egeo.Description#getText <em>Text</em>}</li>
 *   <li>{@link se.eskilson.egeo.Description#isHtml <em>Html</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.eskilson.egeo.EgeoPackage#getDescription()
 * @model
 * @generated
 */
public interface Description extends EObject
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see se.eskilson.egeo.EgeoPackage#getDescription_Text()
   * @model unique="false"
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link se.eskilson.egeo.Description#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Html</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Html</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Html</em>' attribute.
   * @see #setHtml(boolean)
   * @see se.eskilson.egeo.EgeoPackage#getDescription_Html()
   * @model unique="false"
   * @generated
   */
  boolean isHtml();

  /**
   * Sets the value of the '{@link se.eskilson.egeo.Description#isHtml <em>Html</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Html</em>' attribute.
   * @see #isHtml()
   * @generated
   */
  void setHtml(boolean value);

} // Description
