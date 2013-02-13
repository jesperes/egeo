/**
 */
package egeo.gpx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see egeo.gpx.GpxPackage
 * @generated
 */
public interface GpxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GpxFactory eINSTANCE = egeo.gpx.impl.GpxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bounds Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounds Type</em>'.
	 * @generated
	 */
	BoundsType createBoundsType();

	/**
	 * Returns a new object of class '<em>Copyright Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copyright Type</em>'.
	 * @generated
	 */
	CopyrightType createCopyrightType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Email Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email Type</em>'.
	 * @generated
	 */
	EmailType createEmailType();

	/**
	 * Returns a new object of class '<em>Extensions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extensions Type</em>'.
	 * @generated
	 */
	ExtensionsType createExtensionsType();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	GpxType createGpxType();

	/**
	 * Returns a new object of class '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Type</em>'.
	 * @generated
	 */
	LinkType createLinkType();

	/**
	 * Returns a new object of class '<em>Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata Type</em>'.
	 * @generated
	 */
	MetadataType createMetadataType();

	/**
	 * Returns a new object of class '<em>Person Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Type</em>'.
	 * @generated
	 */
	PersonType createPersonType();

	/**
	 * Returns a new object of class '<em>Ptseg Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ptseg Type</em>'.
	 * @generated
	 */
	PtsegType createPtsegType();

	/**
	 * Returns a new object of class '<em>Pt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pt Type</em>'.
	 * @generated
	 */
	PtType createPtType();

	/**
	 * Returns a new object of class '<em>Rte Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rte Type</em>'.
	 * @generated
	 */
	RteType createRteType();

	/**
	 * Returns a new object of class '<em>Trkseg Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trkseg Type</em>'.
	 * @generated
	 */
	TrksegType createTrksegType();

	/**
	 * Returns a new object of class '<em>Trk Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trk Type</em>'.
	 * @generated
	 */
	TrkType createTrkType();

	/**
	 * Returns a new object of class '<em>Wpt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wpt Type</em>'.
	 * @generated
	 */
	WptType createWptType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GpxPackage getGpxPackage();

} //GpxFactory
