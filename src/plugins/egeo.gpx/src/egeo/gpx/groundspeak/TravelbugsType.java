/**
 */
package egeo.gpx.groundspeak;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Travelbugs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.groundspeak.TravelbugsType#getTravelbug <em>Travelbug</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.groundspeak.GroundspeakPackage#getTravelbugsType()
 * @model extendedMetaData="name='travelbugs_._type' kind='elementOnly'"
 * @generated
 */
public interface TravelbugsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Travelbug</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.groundspeak.TravelbugType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Travelbug</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travelbug</em>' containment reference list.
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getTravelbugsType_Travelbug()
	 * @model containment="true"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='travelbug' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TravelbugType> getTravelbug();

} // TravelbugsType
