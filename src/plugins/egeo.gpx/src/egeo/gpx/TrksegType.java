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
 * <!-- begin-model-doc -->
 * 
 * 				A Track Segment holds a list of Track Points which are logically
 * 				connected in order. To represent a single GPS track where GPS
 * 				reception was lost, or the GPS receiver was turned off, start a new
 * 				Track Segment for each continuous span of track data.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.TrksegType#getTrkpt <em>Trkpt</em>}</li>
 *   <li>{@link egeo.gpx.TrksegType#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.GpxPackage#getTrksegType()
 * @model extendedMetaData="name='trksegType' kind='elementOnly'"
 * @generated
 */
public interface TrksegType extends EObject {
	/**
	 * Returns the value of the '<em><b>Trkpt</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.WptType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						A Track Point holds the coordinates, elevation, timestamp, and
	 * 						metadata for a single point in a track.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trkpt</em>' containment reference list.
	 * @see egeo.gpx.GpxPackage#getTrksegType_Trkpt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trkpt'"
	 * @generated
	 */
	EList<WptType> getTrkpt();

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
	 * @see egeo.gpx.GpxPackage#getTrksegType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extensions'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link egeo.gpx.TrksegType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

} // TrksegType
