/**
 */
package egeo.gpx.groundspeak;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.groundspeak.AttributeType#getValue <em>Value</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.AttributeType#getId <em>Id</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.AttributeType#getInc <em>Inc</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.groundspeak.GroundspeakPackage#getAttributeType()
 * @model extendedMetaData="name='attribute_._type' kind='simple'"
 * @generated
 */
public interface AttributeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getAttributeType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata ColumnName='attribute_Text' Ordinal='1'"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.AttributeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getAttributeType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.AttributeType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inc</em>' attribute.
	 * @see #isSetInc()
	 * @see #unsetInc()
	 * @see #setInc(byte)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getAttributeType_Inc()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='inc'"
	 * @generated
	 */
	byte getInc();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.AttributeType#getInc <em>Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inc</em>' attribute.
	 * @see #isSetInc()
	 * @see #unsetInc()
	 * @see #getInc()
	 * @generated
	 */
	void setInc(byte value);

	/**
	 * Unsets the value of the '{@link egeo.gpx.groundspeak.AttributeType#getInc <em>Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInc()
	 * @see #getInc()
	 * @see #setInc(byte)
	 * @generated
	 */
	void unsetInc();

	/**
	 * Returns whether the value of the '{@link egeo.gpx.groundspeak.AttributeType#getInc <em>Inc</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inc</em>' attribute is set.
	 * @see #unsetInc()
	 * @see #getInc()
	 * @see #setInc(byte)
	 * @generated
	 */
	boolean isSetInc();

} // AttributeType
