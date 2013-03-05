/**
 */
package egeo.gpx;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trkseg Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.TrksegType#getTrkpt <em>Trkpt</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.GpxPackage#getTrksegType()
 * @model extendedMetaData="name='trkseg_._type' kind='elementOnly'"
 * @generated
 */
public interface TrksegType extends EObject {
	/**
	 * Returns the value of the '<em><b>Trkpt</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.TrkptType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trkpt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trkpt</em>' containment reference list.
	 * @see egeo.gpx.GpxPackage#getTrksegType_Trkpt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trkpt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TrkptType> getTrkpt();

} // TrksegType
