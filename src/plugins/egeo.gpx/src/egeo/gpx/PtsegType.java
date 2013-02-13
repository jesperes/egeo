/**
 */
package egeo.gpx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ptseg Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				An ordered sequence of points. (for polygons or polylines, e.g.)
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.PtsegType#getPt <em>Pt</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.GpxPackage#getPtsegType()
 * @model extendedMetaData="name='ptsegType' kind='elementOnly'"
 * @generated
 */
public interface PtsegType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pt</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.PtType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Ordered list of geographic points.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pt</em>' containment reference list.
	 * @see egeo.gpx.GpxPackage#getPtsegType_Pt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pt'"
	 * @generated
	 */
	EList<PtType> getPt();

} // PtsegType
