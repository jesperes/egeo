/**
 */
package egeo.gpx.groundspeak;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.groundspeak.LogType#getDate <em>Date</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.LogType#getType <em>Type</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.LogType#getFinder <em>Finder</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.LogType#getText <em>Text</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.LogType#getLogWpt <em>Log Wpt</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.LogType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.groundspeak.GroundspeakPackage#getLogType()
 * @model extendedMetaData="name='log_._type' kind='elementOnly'"
 * @generated
 */
public interface LogType extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getLogType_Date()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='0' Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.LogType#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

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
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getLogType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='1' Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.LogType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Finder</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.groundspeak.FinderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finder</em>' containment reference list.
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getLogType_Finder()
	 * @model containment="true"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='finder' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FinderType> getFinder();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.groundspeak.TextType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getLogType_Text()
	 * @model containment="true"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getText();

	/**
	 * Returns the value of the '<em><b>Log Wpt</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.groundspeak.LogWptType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Wpt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Wpt</em>' containment reference list.
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getLogType_LogWpt()
	 * @model containment="true"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='log_wpt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LogWptType> getLogWpt();

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
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getLogType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.LogType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // LogType
