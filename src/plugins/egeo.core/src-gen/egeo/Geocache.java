/**
 */
package egeo;

import java.net.URL;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geocache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.Geocache#getCacheId <em>Cache Id</em>}</li>
 *   <li>{@link egeo.Geocache#getCode <em>Code</em>}</li>
 *   <li>{@link egeo.Geocache#getTime <em>Time</em>}</li>
 *   <li>{@link egeo.Geocache#getName <em>Name</em>}</li>
 *   <li>{@link egeo.Geocache#isAvailable <em>Available</em>}</li>
 *   <li>{@link egeo.Geocache#isArchived <em>Archived</em>}</li>
 *   <li>{@link egeo.Geocache#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link egeo.Geocache#getOwner <em>Owner</em>}</li>
 *   <li>{@link egeo.Geocache#getPlacedBy <em>Placed By</em>}</li>
 *   <li>{@link egeo.Geocache#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link egeo.Geocache#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link egeo.Geocache#getTerrain <em>Terrain</em>}</li>
 *   <li>{@link egeo.Geocache#getCountry <em>Country</em>}</li>
 *   <li>{@link egeo.Geocache#getState <em>State</em>}</li>
 *   <li>{@link egeo.Geocache#getCoord <em>Coord</em>}</li>
 *   <li>{@link egeo.Geocache#getUrl <em>Url</em>}</li>
 *   <li>{@link egeo.Geocache#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link egeo.Geocache#getHint <em>Hint</em>}</li>
 *   <li>{@link egeo.Geocache#getShortText <em>Short Text</em>}</li>
 *   <li>{@link egeo.Geocache#getLongText <em>Long Text</em>}</li>
 *   <li>{@link egeo.Geocache#getLogs <em>Logs</em>}</li>
 *   <li>{@link egeo.Geocache#getSource <em>Source</em>}</li>
 *   <li>{@link egeo.Geocache#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link egeo.Geocache#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.EgeoPackage#getGeocache()
 * @model
 * @generated
 */
public interface Geocache extends EObject
{
  /**
   * Returns the value of the '<em><b>Cache Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cache Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cache Id</em>' attribute.
   * @see #setCacheId(long)
   * @see egeo.EgeoPackage#getGeocache_CacheId()
   * @model unique="false"
   * @generated
   */
  long getCacheId();

  /**
   * Sets the value of the '{@link egeo.Geocache#getCacheId <em>Cache Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cache Id</em>' attribute.
   * @see #getCacheId()
   * @generated
   */
  void setCacheId(long value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' attribute.
   * @see #setCode(String)
   * @see egeo.EgeoPackage#getGeocache_Code()
   * @model unique="false"
   * @generated
   */
  String getCode();

  /**
   * Sets the value of the '{@link egeo.Geocache#getCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #getCode()
   * @generated
   */
  void setCode(String value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(Date)
   * @see egeo.EgeoPackage#getGeocache_Time()
   * @model unique="false" dataType="egeo.Date"
   * @generated
   */
  Date getTime();

  /**
   * Sets the value of the '{@link egeo.Geocache#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(Date value);

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
   * @see egeo.EgeoPackage#getGeocache_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link egeo.Geocache#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Available</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Available</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Available</em>' attribute.
   * @see #setAvailable(boolean)
   * @see egeo.EgeoPackage#getGeocache_Available()
   * @model unique="false"
   * @generated
   */
  boolean isAvailable();

  /**
   * Sets the value of the '{@link egeo.Geocache#isAvailable <em>Available</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Available</em>' attribute.
   * @see #isAvailable()
   * @generated
   */
  void setAvailable(boolean value);

  /**
   * Returns the value of the '<em><b>Archived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Archived</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Archived</em>' attribute.
   * @see #setArchived(boolean)
   * @see egeo.EgeoPackage#getGeocache_Archived()
   * @model unique="false"
   * @generated
   */
  boolean isArchived();

  /**
   * Sets the value of the '{@link egeo.Geocache#isArchived <em>Archived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Archived</em>' attribute.
   * @see #isArchived()
   * @generated
   */
  void setArchived(boolean value);

  /**
   * Returns the value of the '<em><b>Container Type</b></em>' attribute.
   * The literals are from the enumeration {@link egeo.ContainerType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container Type</em>' attribute.
   * @see egeo.ContainerType
   * @see #setContainerType(ContainerType)
   * @see egeo.EgeoPackage#getGeocache_ContainerType()
   * @model unique="false"
   * @generated
   */
  ContainerType getContainerType();

  /**
   * Sets the value of the '{@link egeo.Geocache#getContainerType <em>Container Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container Type</em>' attribute.
   * @see egeo.ContainerType
   * @see #getContainerType()
   * @generated
   */
  void setContainerType(ContainerType value);

  /**
   * Returns the value of the '<em><b>Owner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' containment reference.
   * @see #setOwner(User)
   * @see egeo.EgeoPackage#getGeocache_Owner()
   * @model containment="true"
   * @generated
   */
  User getOwner();

  /**
   * Sets the value of the '{@link egeo.Geocache#getOwner <em>Owner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' containment reference.
   * @see #getOwner()
   * @generated
   */
  void setOwner(User value);

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
   * @see egeo.EgeoPackage#getGeocache_PlacedBy()
   * @model unique="false"
   * @generated
   */
  String getPlacedBy();

  /**
   * Sets the value of the '{@link egeo.Geocache#getPlacedBy <em>Placed By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Placed By</em>' attribute.
   * @see #getPlacedBy()
   * @generated
   */
  void setPlacedBy(String value);

  /**
   * Returns the value of the '<em><b>Cache Type</b></em>' attribute.
   * The literals are from the enumeration {@link egeo.CacheType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cache Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cache Type</em>' attribute.
   * @see egeo.CacheType
   * @see #setCacheType(CacheType)
   * @see egeo.EgeoPackage#getGeocache_CacheType()
   * @model unique="false"
   * @generated
   */
  CacheType getCacheType();

  /**
   * Sets the value of the '{@link egeo.Geocache#getCacheType <em>Cache Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cache Type</em>' attribute.
   * @see egeo.CacheType
   * @see #getCacheType()
   * @generated
   */
  void setCacheType(CacheType value);

  /**
   * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Difficulty</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Difficulty</em>' attribute.
   * @see #setDifficulty(double)
   * @see egeo.EgeoPackage#getGeocache_Difficulty()
   * @model unique="false"
   * @generated
   */
  double getDifficulty();

  /**
   * Sets the value of the '{@link egeo.Geocache#getDifficulty <em>Difficulty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Difficulty</em>' attribute.
   * @see #getDifficulty()
   * @generated
   */
  void setDifficulty(double value);

  /**
   * Returns the value of the '<em><b>Terrain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terrain</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terrain</em>' attribute.
   * @see #setTerrain(double)
   * @see egeo.EgeoPackage#getGeocache_Terrain()
   * @model unique="false"
   * @generated
   */
  double getTerrain();

  /**
   * Sets the value of the '{@link egeo.Geocache#getTerrain <em>Terrain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Terrain</em>' attribute.
   * @see #getTerrain()
   * @generated
   */
  void setTerrain(double value);

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
   * @see egeo.EgeoPackage#getGeocache_Country()
   * @model unique="false"
   * @generated
   */
  String getCountry();

  /**
   * Sets the value of the '{@link egeo.Geocache#getCountry <em>Country</em>}' attribute.
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
   * @see egeo.EgeoPackage#getGeocache_State()
   * @model unique="false"
   * @generated
   */
  String getState();

  /**
   * Sets the value of the '{@link egeo.Geocache#getState <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' attribute.
   * @see #getState()
   * @generated
   */
  void setState(String value);

  /**
   * Returns the value of the '<em><b>Coord</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coord</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coord</em>' containment reference.
   * @see #setCoord(Coordinate)
   * @see egeo.EgeoPackage#getGeocache_Coord()
   * @model containment="true"
   * @generated
   */
  Coordinate getCoord();

  /**
   * Sets the value of the '{@link egeo.Geocache#getCoord <em>Coord</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coord</em>' containment reference.
   * @see #getCoord()
   * @generated
   */
  void setCoord(Coordinate value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(URL)
   * @see egeo.EgeoPackage#getGeocache_Url()
   * @model unique="false" dataType="egeo.URL"
   * @generated
   */
  URL getUrl();

  /**
   * Sets the value of the '{@link egeo.Geocache#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(URL value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
   * The list contents are of type {@link egeo.Attribute}.
   * The literals are from the enumeration {@link egeo.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' attribute list.
   * @see egeo.Attribute
   * @see egeo.EgeoPackage#getGeocache_Attributes()
   * @model unique="false"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Hint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hint</em>' attribute.
   * @see #setHint(String)
   * @see egeo.EgeoPackage#getGeocache_Hint()
   * @model unique="false"
   * @generated
   */
  String getHint();

  /**
   * Sets the value of the '{@link egeo.Geocache#getHint <em>Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hint</em>' attribute.
   * @see #getHint()
   * @generated
   */
  void setHint(String value);

  /**
   * Returns the value of the '<em><b>Short Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Short Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Short Text</em>' containment reference.
   * @see #setShortText(Description)
   * @see egeo.EgeoPackage#getGeocache_ShortText()
   * @model containment="true"
   * @generated
   */
  Description getShortText();

  /**
   * Sets the value of the '{@link egeo.Geocache#getShortText <em>Short Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Text</em>' containment reference.
   * @see #getShortText()
   * @generated
   */
  void setShortText(Description value);

  /**
   * Returns the value of the '<em><b>Long Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long Text</em>' containment reference.
   * @see #setLongText(Description)
   * @see egeo.EgeoPackage#getGeocache_LongText()
   * @model containment="true"
   * @generated
   */
  Description getLongText();

  /**
   * Sets the value of the '{@link egeo.Geocache#getLongText <em>Long Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Text</em>' containment reference.
   * @see #getLongText()
   * @generated
   */
  void setLongText(Description value);

  /**
   * Returns the value of the '<em><b>Logs</b></em>' containment reference list.
   * The list contents are of type {@link egeo.Log}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logs</em>' containment reference list.
   * @see egeo.EgeoPackage#getGeocache_Logs()
   * @model containment="true"
   * @generated
   */
  EList<Log> getLogs();

  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(URI)
   * @see egeo.EgeoPackage#getGeocache_Source()
   * @model unique="false" dataType="egeo.URI"
   * @generated
   */
  URI getSource();

  /**
   * Sets the value of the '{@link egeo.Geocache#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
  void setSource(URI value);

  /**
   * Returns the value of the '<em><b>Last Update</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last Update</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last Update</em>' attribute.
   * @see #setLastUpdate(Date)
   * @see egeo.EgeoPackage#getGeocache_LastUpdate()
   * @model unique="false" dataType="egeo.Date"
   * @generated
   */
  Date getLastUpdate();

  /**
   * Sets the value of the '{@link egeo.Geocache#getLastUpdate <em>Last Update</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Update</em>' attribute.
   * @see #getLastUpdate()
   * @generated
   */
  void setLastUpdate(Date value);

  /**
   * Returns the value of the '<em><b>Tags</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tags</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' attribute list.
   * @see egeo.EgeoPackage#getGeocache_Tags()
   * @model unique="false"
   * @generated
   */
  EList<String> getTags();

} // Geocache
