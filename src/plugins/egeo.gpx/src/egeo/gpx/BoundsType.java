/**
 */
package egeo.gpx;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounds Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.BoundsType#getMaxlat <em>Maxlat</em>}</li>
 *   <li>{@link egeo.gpx.BoundsType#getMaxlon <em>Maxlon</em>}</li>
 *   <li>{@link egeo.gpx.BoundsType#getMinlat <em>Minlat</em>}</li>
 *   <li>{@link egeo.gpx.BoundsType#getMinlon <em>Minlon</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.GpxPackage#getBoundsType()
 * @model extendedMetaData="name='boundsType' kind='empty'"
 * @generated
 */
public interface BoundsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Maxlat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxlat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxlat</em>' attribute.
	 * @see #setMaxlat(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getBoundsType_Maxlat()
	 * @model dataType="egeo.gpx.LatitudeType" required="true"
	 *        extendedMetaData="kind='attribute' name='maxlat'"
	 * @generated
	 */
	BigDecimal getMaxlat();

	/**
	 * Sets the value of the '{@link egeo.gpx.BoundsType#getMaxlat <em>Maxlat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxlat</em>' attribute.
	 * @see #getMaxlat()
	 * @generated
	 */
	void setMaxlat(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Maxlon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxlon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxlon</em>' attribute.
	 * @see #setMaxlon(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getBoundsType_Maxlon()
	 * @model dataType="egeo.gpx.LongitudeType" required="true"
	 *        extendedMetaData="kind='attribute' name='maxlon'"
	 * @generated
	 */
	BigDecimal getMaxlon();

	/**
	 * Sets the value of the '{@link egeo.gpx.BoundsType#getMaxlon <em>Maxlon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxlon</em>' attribute.
	 * @see #getMaxlon()
	 * @generated
	 */
	void setMaxlon(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Minlat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minlat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minlat</em>' attribute.
	 * @see #setMinlat(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getBoundsType_Minlat()
	 * @model dataType="egeo.gpx.LatitudeType" required="true"
	 *        extendedMetaData="kind='attribute' name='minlat'"
	 * @generated
	 */
	BigDecimal getMinlat();

	/**
	 * Sets the value of the '{@link egeo.gpx.BoundsType#getMinlat <em>Minlat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minlat</em>' attribute.
	 * @see #getMinlat()
	 * @generated
	 */
	void setMinlat(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Minlon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minlon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minlon</em>' attribute.
	 * @see #setMinlon(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getBoundsType_Minlon()
	 * @model dataType="egeo.gpx.LongitudeType" required="true"
	 *        extendedMetaData="kind='attribute' name='minlon'"
	 * @generated
	 */
	BigDecimal getMinlon();

	/**
	 * Sets the value of the '{@link egeo.gpx.BoundsType#getMinlon <em>Minlon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minlon</em>' attribute.
	 * @see #getMinlon()
	 * @generated
	 */
	void setMinlon(BigDecimal value);

} // BoundsType
