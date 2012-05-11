/**
 */
package se.eskilson.egeo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.eskilson.egeo.Coordinate#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link se.eskilson.egeo.Coordinate#getLongitude <em>Longitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.eskilson.egeo.EgeoPackage#getCoordinate()
 * @model
 * @generated
 */
public interface Coordinate extends EObject
{
  /**
   * Returns the value of the '<em><b>Latitude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Latitude</em>' attribute.
   * @see #setLatitude(double)
   * @see se.eskilson.egeo.EgeoPackage#getCoordinate_Latitude()
   * @model unique="false"
   * @generated
   */
  double getLatitude();

  /**
   * Sets the value of the '{@link se.eskilson.egeo.Coordinate#getLatitude <em>Latitude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Latitude</em>' attribute.
   * @see #getLatitude()
   * @generated
   */
  void setLatitude(double value);

  /**
   * Returns the value of the '<em><b>Longitude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Longitude</em>' attribute.
   * @see #setLongitude(double)
   * @see se.eskilson.egeo.EgeoPackage#getCoordinate_Longitude()
   * @model unique="false"
   * @generated
   */
  double getLongitude();

  /**
   * Sets the value of the '{@link se.eskilson.egeo.Coordinate#getLongitude <em>Longitude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Longitude</em>' attribute.
   * @see #getLongitude()
   * @generated
   */
  void setLongitude(double value);

} // Coordinate
