/**
 */
package se.eskilson.egeo;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.eskilson.egeo.Cache#getCode <em>Code</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getIdent <em>Ident</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#isAvailable <em>Available</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#isArchived <em>Archived</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getName <em>Name</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getDescription <em>Description</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getTime <em>Time</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getPlacedBy <em>Placed By</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getUrl <em>Url</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getOwnedBy <em>Owned By</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getCont <em>Cont</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getTerrain <em>Terrain</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getCountry <em>Country</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getState <em>State</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getLogs <em>Logs</em>}</li>
 *   <li>{@link se.eskilson.egeo.Cache#getHint <em>Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.eskilson.egeo.EgeoPackage#getCache()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel labelFeature='description'"
 * @generated
 */
public interface Cache extends EObject {
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
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Code()
	 * @model unique="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ident</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ident</em>' attribute.
	 * @see #setIdent(int)
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Ident()
	 * @model unique="false"
	 * @generated
	 */
	int getIdent();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getIdent <em>Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ident</em>' attribute.
	 * @see #getIdent()
	 * @generated
	 */
	void setIdent(int value);

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
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Available()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAvailable();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#isAvailable <em>Available</em>}' attribute.
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
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Archived()
	 * @model unique="false"
	 * @generated
	 */
	boolean isArchived();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#isArchived <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archived</em>' attribute.
	 * @see #isArchived()
	 * @generated
	 */
	void setArchived(boolean value);

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
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Time()
	 * @model unique="false" dataType="se.eskilson.egeo.Date"
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * Returns the value of the '<em><b>Cache Type</b></em>' attribute.
	 * The literals are from the enumeration {@link se.eskilson.egeo.CacheType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Type</em>' attribute.
	 * @see se.eskilson.egeo.CacheType
	 * @see #setCacheType(CacheType)
	 * @see se.eskilson.egeo.EgeoPackage#getCache_CacheType()
	 * @model unique="false"
	 * @generated
	 */
	CacheType getCacheType();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getCacheType <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Type</em>' attribute.
	 * @see se.eskilson.egeo.CacheType
	 * @see #getCacheType()
	 * @generated
	 */
	void setCacheType(CacheType value);

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
	 * @see se.eskilson.egeo.EgeoPackage#getCache_PlacedBy()
	 * @model unique="false"
	 * @generated
	 */
	String getPlacedBy();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getPlacedBy <em>Placed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placed By</em>' attribute.
	 * @see #getPlacedBy()
	 * @generated
	 */
	void setPlacedBy(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Url()
	 * @model unique="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Owned By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By</em>' reference.
	 * @see #setOwnedBy(User)
	 * @see se.eskilson.egeo.EgeoPackage#getCache_OwnedBy()
	 * @model
	 * @generated
	 */
	User getOwnedBy();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getOwnedBy <em>Owned By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By</em>' reference.
	 * @see #getOwnedBy()
	 * @generated
	 */
	void setOwnedBy(User value);

	/**
	 * Returns the value of the '<em><b>Cont</b></em>' attribute.
	 * The literals are from the enumeration {@link se.eskilson.egeo.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cont</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cont</em>' attribute.
	 * @see se.eskilson.egeo.Container
	 * @see #setCont(Container)
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Cont()
	 * @model unique="false"
	 * @generated
	 */
	Container getCont();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getCont <em>Cont</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cont</em>' attribute.
	 * @see se.eskilson.egeo.Container
	 * @see #getCont()
	 * @generated
	 */
	void setCont(Container value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link se.eskilson.egeo.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Difficulty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty</em>' attribute.
	 * @see #setDifficulty(int)
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Difficulty()
	 * @model unique="false"
	 * @generated
	 */
	int getDifficulty();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(int value);

	/**
	 * Returns the value of the '<em><b>Terrain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terrain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terrain</em>' attribute.
	 * @see #setTerrain(int)
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Terrain()
	 * @model unique="false"
	 * @generated
	 */
	int getTerrain();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getTerrain <em>Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terrain</em>' attribute.
	 * @see #getTerrain()
	 * @generated
	 */
	void setTerrain(int value);

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
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Country()
	 * @model unique="false"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getCountry <em>Country</em>}' attribute.
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
	 * @see se.eskilson.egeo.EgeoPackage#getCache_State()
	 * @model unique="false"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Short Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Description</em>' containment reference.
	 * @see #setShortDescription(Description)
	 * @see se.eskilson.egeo.EgeoPackage#getCache_ShortDescription()
	 * @model containment="true"
	 * @generated
	 */
	Description getShortDescription();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getShortDescription <em>Short Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Description</em>' containment reference.
	 * @see #getShortDescription()
	 * @generated
	 */
	void setShortDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Description</em>' containment reference.
	 * @see #setLongDescription(Description)
	 * @see se.eskilson.egeo.EgeoPackage#getCache_LongDescription()
	 * @model containment="true"
	 * @generated
	 */
	Description getLongDescription();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getLongDescription <em>Long Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Description</em>' containment reference.
	 * @see #getLongDescription()
	 * @generated
	 */
	void setLongDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate</em>' containment reference.
	 * @see #setCoordinate(Coordinate)
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Coordinate()
	 * @model containment="true"
	 * @generated
	 */
	Coordinate getCoordinate();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getCoordinate <em>Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate</em>' containment reference.
	 * @see #getCoordinate()
	 * @generated
	 */
	void setCoordinate(Coordinate value);

	/**
	 * Returns the value of the '<em><b>Logs</b></em>' containment reference list.
	 * The list contents are of type {@link se.eskilson.egeo.Log}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logs</em>' containment reference list.
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Logs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Log> getLogs();

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
	 * @see se.eskilson.egeo.EgeoPackage#getCache_Hint()
	 * @model unique="false"
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Cache#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

} // Cache
