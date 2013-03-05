/**
 */
package egeo.gpx.groundspeak;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.groundspeak.LogsType#getLog <em>Log</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.groundspeak.GroundspeakPackage#getLogsType()
 * @model extendedMetaData="name='logs_._type' kind='elementOnly'"
 * @generated
 */
public interface LogsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Log</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.groundspeak.LogType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' containment reference list.
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getLogsType_Log()
	 * @model containment="true"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='log' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LogType> getLog();

} // LogsType
