/**
 */
package egeo.gpx;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wpt Type</b></em>'.
 * <!-- end-user-doc -->
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
 *   <li>{@link egeo.gpx.WptType#getUrl <em>Url</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getUrlname <em>Urlname</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getSym <em>Sym</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getType <em>Type</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getFix <em>Fix</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getSat <em>Sat</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getHdop <em>Hdop</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getVdop <em>Vdop</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getPdop <em>Pdop</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getAgeofdgpsdata <em>Ageofdgpsdata</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getDgpsid <em>Dgpsid</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getAny <em>Any</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getLat <em>Lat</em>}</li>
 *   <li>{@link egeo.gpx.WptType#getLon <em>Lon</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.GpxPackage#getWptType()
 * @model extendedMetaData="name='wpt_._type' kind='elementOnly'"
 * @generated
 */
public interface WptType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ele</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ele</em>' attribute.
	 * @see #setEle(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getWptType_Ele()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='ele' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(XMLGregorianCalendar)
	 * @see egeo.gpx.GpxPackage#getWptType_Time()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Magvar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Magvar</em>' attribute.
	 * @see #setMagvar(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getWptType_Magvar()
	 * @model dataType="egeo.gpx.DegreesType"
	 *        extendedMetaData="kind='element' name='magvar' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Geoidheight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geoidheight</em>' attribute.
	 * @see #setGeoidheight(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getWptType_Geoidheight()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='geoidheight' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see egeo.gpx.GpxPackage#getWptType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Cmt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmt</em>' attribute.
	 * @see #setCmt(String)
	 * @see egeo.gpx.GpxPackage#getWptType_Cmt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='cmt' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see egeo.gpx.GpxPackage#getWptType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='desc' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see egeo.gpx.GpxPackage#getWptType_Src()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='src' namespace='##targetNamespace'"
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
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see egeo.gpx.GpxPackage#getWptType_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Urlname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urlname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urlname</em>' attribute.
	 * @see #setUrlname(String)
	 * @see egeo.gpx.GpxPackage#getWptType_Urlname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='urlname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrlname();

	/**
	 * Sets the value of the '{@link egeo.gpx.WptType#getUrlname <em>Urlname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urlname</em>' attribute.
	 * @see #getUrlname()
	 * @generated
	 */
	void setUrlname(String value);

	/**
	 * Returns the value of the '<em><b>Sym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sym</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sym</em>' attribute.
	 * @see #setSym(String)
	 * @see egeo.gpx.GpxPackage#getWptType_Sym()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='sym' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see egeo.gpx.GpxPackage#getWptType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Fix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fix</em>' attribute.
	 * @see egeo.gpx.FixType
	 * @see #isSetFix()
	 * @see #unsetFix()
	 * @see #setFix(FixType)
	 * @see egeo.gpx.GpxPackage#getWptType_Fix()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='fix' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Sat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sat</em>' attribute.
	 * @see #setSat(BigInteger)
	 * @see egeo.gpx.GpxPackage#getWptType_Sat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='sat' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Hdop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdop</em>' attribute.
	 * @see #setHdop(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getWptType_Hdop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='hdop' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Vdop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vdop</em>' attribute.
	 * @see #setVdop(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getWptType_Vdop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='vdop' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Pdop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pdop</em>' attribute.
	 * @see #setPdop(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getWptType_Pdop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='pdop' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Ageofdgpsdata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ageofdgpsdata</em>' attribute.
	 * @see #setAgeofdgpsdata(BigDecimal)
	 * @see egeo.gpx.GpxPackage#getWptType_Ageofdgpsdata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='ageofdgpsdata' namespace='##targetNamespace'"
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
	 * <p>
	 * If the meaning of the '<em>Dgpsid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dgpsid</em>' attribute.
	 * @see #setDgpsid(BigInteger)
	 * @see egeo.gpx.GpxPackage#getWptType_Dgpsid()
	 * @model dataType="egeo.gpx.DgpsStationType"
	 *        extendedMetaData="kind='element' name='dgpsid' namespace='##targetNamespace'"
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
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see egeo.gpx.GpxPackage#getWptType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':19' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

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
	 * <p>
	 * If the meaning of the '<em>Lon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
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
