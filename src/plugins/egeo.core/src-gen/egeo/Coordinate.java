/**
 */
package egeo;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.Coordinate#getLat <em>Lat</em>}</li>
 *   <li>{@link egeo.Coordinate#getLon <em>Lon</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.EgeoPackage#getCoordinate()
 * @model
 * @generated
 */
public interface Coordinate extends EObject
{
  /**
   * Returns the value of the '<em><b>Lat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lat</em>' attribute.
   * @see #setLat(BigDecimal)
   * @see egeo.EgeoPackage#getCoordinate_Lat()
   * @model unique="false" dataType="egeo.BigDecimal"
   * @generated
   */
  BigDecimal getLat();

  /**
   * Sets the value of the '{@link egeo.Coordinate#getLat <em>Lat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lat</em>' attribute.
   * @see #getLat()
   * @generated
   */
  void setLat(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Lon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lon</em>' attribute.
   * @see #setLon(BigDecimal)
   * @see egeo.EgeoPackage#getCoordinate_Lon()
   * @model unique="false" dataType="egeo.BigDecimal"
   * @generated
   */
  BigDecimal getLon();

  /**
   * Sets the value of the '{@link egeo.Coordinate#getLon <em>Lon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lon</em>' attribute.
   * @see #getLon()
   * @generated
   */
  void setLon(BigDecimal value);

} // Coordinate
