/**
 */
package egeo.gpx.groundspeak;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see egeo.gpx.groundspeak.GroundspeakPackage
 * @generated
 */
public interface GroundspeakFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GroundspeakFactory eINSTANCE = egeo.gpx.groundspeak.impl.GroundspeakFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attributes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attributes Type</em>'.
	 * @generated
	 */
	AttributesType createAttributesType();

	/**
	 * Returns a new object of class '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Type</em>'.
	 * @generated
	 */
	AttributeType createAttributeType();

	/**
	 * Returns a new object of class '<em>Cache Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache Type</em>'.
	 * @generated
	 */
	CacheType createCacheType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Finder Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finder Type</em>'.
	 * @generated
	 */
	FinderType createFinderType();

	/**
	 * Returns a new object of class '<em>Logs Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logs Type</em>'.
	 * @generated
	 */
	LogsType createLogsType();

	/**
	 * Returns a new object of class '<em>Log Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Type</em>'.
	 * @generated
	 */
	LogType createLogType();

	/**
	 * Returns a new object of class '<em>Log Wpt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Wpt Type</em>'.
	 * @generated
	 */
	LogWptType createLogWptType();

	/**
	 * Returns a new object of class '<em>Long Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Description Type</em>'.
	 * @generated
	 */
	LongDescriptionType createLongDescriptionType();

	/**
	 * Returns a new object of class '<em>Owner Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Owner Type</em>'.
	 * @generated
	 */
	OwnerType createOwnerType();

	/**
	 * Returns a new object of class '<em>Short Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Short Description Type</em>'.
	 * @generated
	 */
	ShortDescriptionType createShortDescriptionType();

	/**
	 * Returns a new object of class '<em>Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Type</em>'.
	 * @generated
	 */
	TextType createTextType();

	/**
	 * Returns a new object of class '<em>Travelbugs Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Travelbugs Type</em>'.
	 * @generated
	 */
	TravelbugsType createTravelbugsType();

	/**
	 * Returns a new object of class '<em>Travelbug Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Travelbug Type</em>'.
	 * @generated
	 */
	TravelbugType createTravelbugType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GroundspeakPackage getGroundspeakPackage();

} //GroundspeakFactory
