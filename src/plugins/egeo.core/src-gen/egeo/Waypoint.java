/**
 */
package egeo;

import java.net.URL;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Waypoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link egeo.Waypoint#getName <em>Name</em>}</li>
 *   <li>{@link egeo.Waypoint#getTime <em>Time</em>}</li>
 *   <li>{@link egeo.Waypoint#getCmt <em>Cmt</em>}</li>
 *   <li>{@link egeo.Waypoint#getType0 <em>Type0</em>}</li>
 *   <li>{@link egeo.Waypoint#getSym <em>Sym</em>}</li>
 *   <li>{@link egeo.Waypoint#getUrl <em>Url</em>}</li>
 *   <li>{@link egeo.Waypoint#getUrlname <em>Urlname</em>}</li>
 *   <li>{@link egeo.Waypoint#getCoord <em>Coord</em>}</li>
 *   <li>{@link egeo.Waypoint#getLastUpdate <em>Last Update</em>}</li>
 * </ul>
 * </p>
 *
 * @see egeo.EgeoPackage#getWaypoint()
 * @model
 * @generated
 */
public interface Waypoint extends EObject {
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
     * @see egeo.EgeoPackage#getWaypoint_Name()
     * @model unique="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link egeo.Waypoint#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

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
     * @see egeo.EgeoPackage#getWaypoint_Time()
     * @model unique="false" dataType="egeo.Date"
     * @generated
     */
    Date getTime();

    /**
     * Sets the value of the '{@link egeo.Waypoint#getTime <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time</em>' attribute.
     * @see #getTime()
     * @generated
     */
    void setTime(Date value);

    /**
     * Returns the value of the '<em><b>Cmt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cmt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cmt</em>' attribute.
     * @see #setCmt(String)
     * @see egeo.EgeoPackage#getWaypoint_Cmt()
     * @model unique="false"
     * @generated
     */
    String getCmt();

    /**
     * Sets the value of the '{@link egeo.Waypoint#getCmt <em>Cmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cmt</em>' attribute.
     * @see #getCmt()
     * @generated
     */
    void setCmt(String value);

    /**
     * Returns the value of the '<em><b>Type0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type0</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type0</em>' attribute.
     * @see #setType0(String)
     * @see egeo.EgeoPackage#getWaypoint_Type0()
     * @model unique="false"
     * @generated
     */
    String getType0();

    /**
     * Sets the value of the '{@link egeo.Waypoint#getType0 <em>Type0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type0</em>' attribute.
     * @see #getType0()
     * @generated
     */
    void setType0(String value);

    /**
     * Returns the value of the '<em><b>Sym</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sym</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sym</em>' attribute.
     * @see #setSym(String)
     * @see egeo.EgeoPackage#getWaypoint_Sym()
     * @model unique="false"
     * @generated
     */
    String getSym();

    /**
     * Sets the value of the '{@link egeo.Waypoint#getSym <em>Sym</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sym</em>' attribute.
     * @see #getSym()
     * @generated
     */
    void setSym(String value);

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
     * @see egeo.EgeoPackage#getWaypoint_Url()
     * @model unique="false" dataType="egeo.URL"
     * @generated
     */
    URL getUrl();

    /**
     * Sets the value of the '{@link egeo.Waypoint#getUrl <em>Url</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Url</em>' attribute.
     * @see #getUrl()
     * @generated
     */
    void setUrl(URL value);

    /**
     * Returns the value of the '<em><b>Urlname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Urlname</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Urlname</em>' attribute.
     * @see #setUrlname(String)
     * @see egeo.EgeoPackage#getWaypoint_Urlname()
     * @model unique="false"
     * @generated
     */
    String getUrlname();

    /**
     * Sets the value of the '{@link egeo.Waypoint#getUrlname <em>Urlname</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Urlname</em>' attribute.
     * @see #getUrlname()
     * @generated
     */
    void setUrlname(String value);

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
     * @see egeo.EgeoPackage#getWaypoint_Coord()
     * @model containment="true"
     * @generated
     */
    Coordinate getCoord();

    /**
     * Sets the value of the '{@link egeo.Waypoint#getCoord <em>Coord</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Coord</em>' containment reference.
     * @see #getCoord()
     * @generated
     */
    void setCoord(Coordinate value);

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
     * @see egeo.EgeoPackage#getWaypoint_LastUpdate()
     * @model unique="false" dataType="egeo.Date"
     * @generated
     */
    Date getLastUpdate();

    /**
     * Sets the value of the '{@link egeo.Waypoint#getLastUpdate <em>Last Update</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Update</em>' attribute.
     * @see #getLastUpdate()
     * @generated
     */
    void setLastUpdate(Date value);

} // Waypoint
