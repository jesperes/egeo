/**
 */
package egeo.gpx.groundspeak;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Short Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.groundspeak.ShortDescriptionType#getValue <em>Value</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.ShortDescriptionType#getHtml <em>Html</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.groundspeak.GroundspeakPackage#getShortDescriptionType()
 * @model extendedMetaData="name='short_description_._type' kind='simple'"
 * @generated
 */
public interface ShortDescriptionType extends EObject {
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
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getShortDescriptionType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata ColumnName='short_description_Text' Ordinal='1'"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.ShortDescriptionType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Html</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html</em>' attribute.
	 * @see #setHtml(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getShortDescriptionType_Html()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='html'"
	 * @generated
	 */
	String getHtml();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.ShortDescriptionType#getHtml <em>Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html</em>' attribute.
	 * @see #getHtml()
	 * @generated
	 */
	void setHtml(String value);

} // ShortDescriptionType