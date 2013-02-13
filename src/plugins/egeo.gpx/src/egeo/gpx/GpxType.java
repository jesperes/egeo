/**
 */
package egeo.gpx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				GPX documents contain a metadata header, followed by waypoints, routes,
 * 				and tracks. You can add your own elements
 * 				to the extensions section of the GPX document.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.GpxType#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link egeo.gpx.GpxType#getWpt <em>Wpt</em>}</li>
 *   <li>{@link egeo.gpx.GpxType#getRte <em>Rte</em>}</li>
 *   <li>{@link egeo.gpx.GpxType#getTrk <em>Trk</em>}</li>
 *   <li>{@link egeo.gpx.GpxType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link egeo.gpx.GpxType#getCreator <em>Creator</em>}</li>
 *   <li>{@link egeo.gpx.GpxType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.GpxPackage#getGpxType()
 * @model extendedMetaData="name='gpxType' kind='elementOnly'"
 * @generated
 */
public interface GpxType extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						Metadata about the file.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(MetadataType)
	 * @see egeo.gpx.GpxPackage#getGpxType_Metadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metadata'"
	 * @generated
	 */
	MetadataType getMetadata();

	/**
	 * Sets the value of the '{@link egeo.gpx.GpxType#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(MetadataType value);

	/**
	 * Returns the value of the '<em><b>Wpt</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.WptType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						A list of waypoints.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wpt</em>' containment reference list.
	 * @see egeo.gpx.GpxPackage#getGpxType_Wpt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wpt'"
	 * @generated
	 */
	EList<WptType> getWpt();

	/**
	 * Returns the value of the '<em><b>Rte</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.RteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						A list of routes.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rte</em>' containment reference list.
	 * @see egeo.gpx.GpxPackage#getGpxType_Rte()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rte'"
	 * @generated
	 */
	EList<RteType> getRte();

	/**
	 * Returns the value of the '<em><b>Trk</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.TrkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						A list of tracks.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trk</em>' containment reference list.
	 * @see egeo.gpx.GpxPackage#getGpxType_Trk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trk'"
	 * @generated
	 */
	EList<TrkType> getTrk();

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
	 * @see egeo.gpx.GpxPackage#getGpxType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extensions'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link egeo.gpx.GpxType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					You must include the name or URL of the software that created your GPX
	 * 					document. This allows others to
	 * 					inform the creator of a GPX instance document that fails to validate.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creator</em>' attribute.
	 * @see #setCreator(String)
	 * @see egeo.gpx.GpxPackage#getGpxType_Creator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='creator'"
	 * @generated
	 */
	String getCreator();

	/**
	 * Sets the value of the '{@link egeo.gpx.GpxType#getCreator <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' attribute.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					You must include the version number in your GPX document.
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see egeo.gpx.GpxPackage#getGpxType_Version()
	 * @model default="1.1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link egeo.gpx.GpxType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link egeo.gpx.GpxType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link egeo.gpx.GpxType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // GpxType
