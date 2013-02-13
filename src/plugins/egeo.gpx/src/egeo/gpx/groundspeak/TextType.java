/**
 */
package egeo.gpx.groundspeak;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.groundspeak.TextType#getValue <em>Value</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.TextType#getEncoded <em>Encoded</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.groundspeak.GroundspeakPackage#getTextType()
 * @model extendedMetaData="name='text_._type' kind='simple'"
 * @generated
 */
public interface TextType extends EObject {
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
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getTextType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata ColumnName='text_Text' Ordinal='1'"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.TextType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Encoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoded</em>' attribute.
	 * @see #setEncoded(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getTextType_Encoded()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoded'"
	 * @generated
	 */
	String getEncoded();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.TextType#getEncoded <em>Encoded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoded</em>' attribute.
	 * @see #getEncoded()
	 * @generated
	 */
	void setEncoded(String value);

} // TextType
