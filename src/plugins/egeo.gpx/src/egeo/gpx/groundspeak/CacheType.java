/**
 */
package egeo.gpx.groundspeak;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getName <em>Name</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getPlacedBy <em>Placed By</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getOwner <em>Owner</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getType <em>Type</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getContainer <em>Container</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getTerrain <em>Terrain</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getCountry <em>Country</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getState <em>State</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getEncodedHints <em>Encoded Hints</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getLogs <em>Logs</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getTravelbugs <em>Travelbugs</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getArchived <em>Archived</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getAvailable <em>Available</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.CacheType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType()
 * @model extendedMetaData="name='cache_._type' kind='elementOnly'"
 * @generated
 */
public interface CacheType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='0' Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.CacheType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Placed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placed By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placed By</em>' attribute.
	 * @see #setPlacedBy(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_PlacedBy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='1' Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='placed_by' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPlacedBy();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.CacheType#getPlacedBy <em>Placed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placed By</em>' attribute.
	 * @see #getPlacedBy()
	 * @generated
	 */
	void setPlacedBy(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.groundspeak.OwnerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference list.
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_Owner()
	 * @model containment="true"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='owner' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OwnerType> getOwner();

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
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='3' Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.CacheType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see #setContainer(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_Container()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='4' Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='container' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContainer();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.CacheType#getContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.groundspeak.AttributesType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_Attributes()
	 * @model containment="true"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='attributes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributesType> getAttributes();

	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficulty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty</em>' attribute.
	 * @see #setDifficulty(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_Difficulty()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='5' Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='difficulty' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDifficulty();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.CacheType#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(String value);

	/**
	 * Returns the value of the '<em><b>Terrain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terrain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terrain</em>' attribute.
	 * @see #setTerrain(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_Terrain()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='6' Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='terrain' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTerrain();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.CacheType#getTerrain <em>Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terrain</em>' attribute.
	 * @see #getTerrain()
	 * @generated
	 */
	void setTerrain(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_Country()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='7' Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.CacheType#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_State()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='8' Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.CacheType#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Short Description</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.groundspeak.ShortDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Description</em>' containment reference list.
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_ShortDescription()
	 * @model containment="true"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='short_description' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ShortDescriptionType> getShortDescription();

	/**
	 * Returns the value of the '<em><b>Long Description</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.groundspeak.LongDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Description</em>' containment reference list.
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_LongDescription()
	 * @model containment="true"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='long_description' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LongDescriptionType> getLongDescription();

	/**
	 * Returns the value of the '<em><b>Encoded Hints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoded Hints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoded Hints</em>' attribute.
	 * @see #setEncodedHints(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_EncodedHints()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Ordinal='9' Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='encoded_hints' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEncodedHints();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.CacheType#getEncodedHints <em>Encoded Hints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoded Hints</em>' attribute.
	 * @see #getEncodedHints()
	 * @generated
	 */
	void setEncodedHints(String value);

	/**
	 * Returns the value of the '<em><b>Logs</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.groundspeak.LogsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logs</em>' containment reference list.
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_Logs()
	 * @model containment="true"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='logs' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LogsType> getLogs();

	/**
	 * Returns the value of the '<em><b>Travelbugs</b></em>' containment reference list.
	 * The list contents are of type {@link egeo.gpx.groundspeak.TravelbugsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Travelbugs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travelbugs</em>' containment reference list.
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_Travelbugs()
	 * @model containment="true"
	 *        annotation="urn:schemas-microsoft-com:xml-msdata Prefix='groundspeak'"
	 *        extendedMetaData="kind='element' name='travelbugs' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TravelbugsType> getTravelbugs();

	/**
	 * Returns the value of the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archived</em>' attribute.
	 * @see #setArchived(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_Archived()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='archived'"
	 * @generated
	 */
	String getArchived();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.CacheType#getArchived <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archived</em>' attribute.
	 * @see #getArchived()
	 * @generated
	 */
	void setArchived(String value);

	/**
	 * Returns the value of the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available</em>' attribute.
	 * @see #setAvailable(String)
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_Available()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='available'"
	 * @generated
	 */
	String getAvailable();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.CacheType#getAvailable <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available</em>' attribute.
	 * @see #getAvailable()
	 * @generated
	 */
	void setAvailable(String value);

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
	 * @see egeo.gpx.groundspeak.GroundspeakPackage#getCacheType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link egeo.gpx.groundspeak.CacheType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // CacheType
