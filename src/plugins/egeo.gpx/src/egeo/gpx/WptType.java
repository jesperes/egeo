/**
 */
package egeo.gpx;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wpt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				wpt represents a waypoint, point of interest, or named feature on a
 * 				map.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.WptType#getEle <em>Ele</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getTime <em>Time</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getMagvar <em>Magvar</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getGeoidheight <em>Geoidheight</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getName <em>Name</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getCmt <em>Cmt</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getDesc <em>Desc</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getSrc <em>Src</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getLink <em>Link</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getSym <em>Sym</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getType <em>Type</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getFix <em>Fix</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getSat <em>Sat</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getHdop <em>Hdop</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getVdop <em>Vdop</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getPdop <em>Pdop</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getAgeofdgpsdata <em>Ageofdgpsdata</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getDgpsid <em>Dgpsid</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getLat <em>Lat</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getLon <em>Lon</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.GpxPackage#getWptType()
 * @model extendedMetaData="name='wptType' kind='elementOnly'"
 * @generated
 */
public interface WptType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Elevation (in meters) of the point.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ele</em>' attribute.
	 * @see #setEle(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getWptType_Ele()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='ele'"
	 * @generated
	 */
	BigDecimal getEle();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getEle <em>Ele</em>}' attribute.
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
	 * 						Creation/modification timestamp for element. Date and time in are in Univeral
	 * 						Coordinated Time (UTC), not local time! Conforms to ISO 8601
	 * 						specification for date/time representation. Fractional seconds are
	 * 						allowed for millisecond timing in tracklogs.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(XMLGregorianCalendar)
	 * @see egeo.gpx.GpxPackage#getWptType_Time()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='time'"
	 * @generated
	 */
	XMLGregorianCalendar getTime();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Magvar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Magnetic variation (in degrees) at the point
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Magvar</em>' attribute.
	 * @see #setMagvar(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getWptType_Magvar()
	 * @model dataType="egeo.gpx.DegreesType"
	 *        extendedMetaData="kind='element' name='magvar'"
	 * @generated
	 */
	BigDecimal getMagvar();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getMagvar <em>Magvar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magvar</em>' attribute.
	 * @see #getMagvar()
	 * @generated
	 */
	void setMagvar(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Geoidheight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Height (in meters) of geoid (mean sea level) above WGS84 earth
	 * 						ellipsoid. As defined in NMEA GGA message.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geoidheight</em>' attribute.
	 * @see #setGeoidheight(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getWptType_Geoidheight()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='geoidheight'"
	 * @generated
	 */
	BigDecimal getGeoidheight();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getGeoidheight <em>Geoidheight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geoidheight</em>' attribute.
	 * @see #getGeoidheight()
	 * @generated
	 */
	void setGeoidheight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						The GPS name of the waypoint. This field will be transferred to and
	 * 						from the GPS. GPX does not place restrictions on the length of
	 * 						this field or the characters contained in it. It is up to the
	 * 						receiving application to validate the field before sending it to
	 * 						the GPS.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see egeo.gpx.GpxPackage#getWptType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						GPS waypoint comment. Sent to GPS as comment.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cmt</em>' attribute.
	 * @see #setCmt(String)
	 * @see egeo.gpx.GpxPackage#getWptType_Cmt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='cmt'"
	 * @generated
	 */
	String getCmt();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getCmt <em>Cmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmt</em>' attribute.
	 * @see #getCmt()
	 * @generated
	 */
	void setCmt(String value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						A text description of the element. Holds additional information
	 * 						about the element intended for the user, not the GPS.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see egeo.gpx.GpxPackage#getWptType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='desc'"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Source of data. Included to give user some idea of reliability and
	 * 						accuracy of data. "Garmin eTrex", "USGS quad Boston North", e.g.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see egeo.gpx.GpxPackage#getWptType_Src()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='src'"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Link to additional information about the waypoint.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see egeo.gpx.GpxPackage#getWptType_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link'"
	 * @generated
	 */
	EList<LinkType> getLink();

	/**
	 * Returns the value of the '<em><b>Sym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Text of GPS symbol name. For interchange with other programs, use the
	 * 						exact spelling of the symbol as displayed on the GPS. If the GPS
	 * 						abbreviates words, spell them out.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sym</em>' attribute.
	 * @see #setSym(String)
	 * @see egeo.gpx.GpxPackage#getWptType_Sym()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='sym'"
	 * @generated
	 */
	String getSym();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getSym <em>Sym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sym</em>' attribute.
	 * @see #getSym()
	 * @generated
	 */
	void setSym(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Type (classification) of the waypoint.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see egeo.gpx.GpxPackage#getWptType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Fix</b></em>' attribute.
	 * The literals are from the enumeration {@link egeo.gpx.FixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Type of GPX fix.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fix</em>' attribute.
	 * @see egeo.gpx.FixType
	 * @see #isSetFix()
	 * @see #unsetFix()
	 * @see #setFix(FixType)
	 * @see egeo.gpx.GpxPackage#getWptType_Fix()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='fix'"
	 * @generated
	 */
	FixType getFix();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getFix <em>Fix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fix</em>' attribute.
	 * @see egeo.gpx.FixType
	 * @see #isSetFix()
	 * @see #unsetFix()
	 * @see #getFix()
	 * @generated
	 */
	void setFix(FixType value);

	/**
	 * Unsets the value of the '{@link egeo.gpx.WptType#getFix <em>Fix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFix()
	 * @see #getFix()
	 * @see #setFix(FixType)
	 * @generated
	 */
	void unsetFix();

	/**
	 * Returns whether the value of the '{@link egeo.gpx.WptType#getFix <em>Fix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fix</em>' attribute is set.
	 * @see #unsetFix()
	 * @see #getFix()
	 * @see #setFix(FixType)
	 * @generated
	 */
	boolean isSetFix();

	/**
	 * Returns the value of the '<em><b>Sat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Number of satellites used to calculate the GPX fix.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sat</em>' attribute.
	 * @see #setSat(BigInteger)
	 * @see egeo.gpx.GpxPackage#getWptType_Sat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='sat'"
	 * @generated
	 */
	BigInteger getSat();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getSat <em>Sat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sat</em>' attribute.
	 * @see #getSat()
	 * @generated
	 */
	void setSat(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Hdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Horizontal dilution of precision.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hdop</em>' attribute.
	 * @see #setHdop(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getWptType_Hdop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='hdop'"
	 * @generated
	 */
	BigDecimal getHdop();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getHdop <em>Hdop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdop</em>' attribute.
	 * @see #getHdop()
	 * @generated
	 */
	void setHdop(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Vdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Vertical dilution of precision.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vdop</em>' attribute.
	 * @see #setVdop(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getWptType_Vdop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='vdop'"
	 * @generated
	 */
	BigDecimal getVdop();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getVdop <em>Vdop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vdop</em>' attribute.
	 * @see #getVdop()
	 * @generated
	 */
	void setVdop(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Pdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Position dilution of precision.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pdop</em>' attribute.
	 * @see #setPdop(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getWptType_Pdop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='pdop'"
	 * @generated
	 */
	BigDecimal getPdop();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getPdop <em>Pdop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pdop</em>' attribute.
	 * @see #getPdop()
	 * @generated
	 */
	void setPdop(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Ageofdgpsdata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Number of seconds since last DGPS update.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ageofdgpsdata</em>' attribute.
	 * @see #setAgeofdgpsdata(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getWptType_Ageofdgpsdata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='ageofdgpsdata'"
	 * @generated
	 */
	BigDecimal getAgeofdgpsdata();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getAgeofdgpsdata <em>Ageofdgpsdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ageofdgpsdata</em>' attribute.
	 * @see #getAgeofdgpsdata()
	 * @generated
	 */
	void setAgeofdgpsdata(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Dgpsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						ID of DGPS station used in differential correction.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dgpsid</em>' attribute.
	 * @see #setDgpsid(BigInteger)
	 * @see egeo.gpx.GpxPackage#getWptType_Dgpsid()
	 * @model dataType="egeo.gpx.DgpsStationType"
	 *        extendedMetaData="kind='element' name='dgpsid'"
	 * @generated
	 */
	BigInteger getDgpsid();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getDgpsid <em>Dgpsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dgpsid</em>' attribute.
	 * @see #getDgpsid()
	 * @generated
	 */
	void setDgpsid(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						You can add extend GPX by adding your own elements from another
	 * 						schema here.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see egeo.gpx.GpxPackage#getWptType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extensions'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

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
	 * @see egeo.gpx.GpxPackage#getWptType_Lat()
	 * @model dataType="egeo.gpx.LatitudeType" required="true"
	 *        extendedMetaData="kind='attribute' name='lat'"
	 * @generated
	 */
	BigDecimal getLat();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getLat <em>Lat</em>}' attribute.
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
	 * @see egeo.gpx.GpxPackage#getWptType_Lon()
	 * @model dataType="egeo.gpx.LongitudeType" required="true"
	 *        extendedMetaData="kind='attribute' name='lon'"
	 * @generated
	 */
	BigDecimal getLon();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lon</em>' attribute.
	 * @see #getLon()
	 * @generated
	 */
	void setLon(BigDecimal value);

} // WptType
