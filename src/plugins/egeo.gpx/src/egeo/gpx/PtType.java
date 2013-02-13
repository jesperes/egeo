/**
 */
package egeo.gpx;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				A geographic point with optional elevation and time. Available for
 * 				use by other schemas.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.PtType#getEle <em>Ele</em>}</li>
 *   <li>{@link egeo.gpx.PtType#getTime <em>Time</em>}</li>
 *   <li>{@link egeo.gpx.PtType#getLat <em>Lat</em>}</li>
 *   <li>{@link egeo.gpx.PtType#getLon <em>Lon</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.GpxPackage#getPtType()
 * @model extendedMetaData="name='ptType' kind='elementOnly'"
 * @generated
 */
public interface PtType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						The elevation (in meters) of the point.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ele</em>' attribute.
	 * @see #setEle(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getPtType_Ele()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='ele'"
	 * @generated
	 */
	BigDecimal getEle();

	/**
	 * Sets the value of the '{@link egeo.gpx.PtType#getEle <em>Ele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ele</em>' attribute.
	 * @see #getEle()
	 * @generated
	 */
	void setEle(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						The time that the point was recorded.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(XMLGregorianCalendar)
	 * @see egeo.gpx.GpxPackage#getPtType_Time()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='time'"
	 * @generated
	 */
	XMLGregorianCalendar getTime();

	/**
	 * Sets the value of the '{@link egeo.gpx.PtType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					The latitude of the point. Decimal degrees, WGS84 datum.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getPtType_Lat()
	 * @model dataType="egeo.gpx.LatitudeType" required="true"
	 *        extendedMetaData="kind='attribute' name='lat'"
	 * @generated
	 */
	BigDecimal getLat();

	/**
	 * Sets the value of the '{@link egeo.gpx.PtType#getLat <em>Lat</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					The latitude of the point. Decimal degrees, WGS84 datum.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lon</em>' attribute.
	 * @see #setLon(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getPtType_Lon()
	 * @model dataType="egeo.gpx.LongitudeType" required="true"
	 *        extendedMetaData="kind='attribute' name='lon'"
	 * @generated
	 */
	BigDecimal getLon();

	/**
	 * Sets the value of the '{@link egeo.gpx.PtType#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lon</em>' attribute.
	 * @see #getLon()
	 * @generated
	 */
	void setLon(BigDecimal value);

} // PtType
