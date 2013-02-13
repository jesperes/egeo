/**
 */
package egeo.gpx;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extensions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				You can add extend GPX by adding your own elements from another schema
 * 				here.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.ExtensionsType#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.GpxPackage#getExtensionsType()
 * @model extendedMetaData="name='extensionsType' kind='elementOnly'"
 * @generated
 */
public interface ExtensionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						You can add extend GPX by adding your own elements from another
	 * 						schema here.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see egeo.gpx.GpxPackage#getExtensionsType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':0' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // ExtensionsType
