/**
 */
package se.eskilson.egeo;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.eskilson.egeo.Log#getText <em>Text</em>}</li>
 *   <li>{@link se.eskilson.egeo.Log#getUser <em>User</em>}</li>
 *   <li>{@link se.eskilson.egeo.Log#isEncoded <em>Encoded</em>}</li>
 *   <li>{@link se.eskilson.egeo.Log#getLogId <em>Log Id</em>}</li>
 *   <li>{@link se.eskilson.egeo.Log#getDate <em>Date</em>}</li>
 *   <li>{@link se.eskilson.egeo.Log#getLogType <em>Log Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.eskilson.egeo.EgeoPackage#getLog()
 * @model
 * @generated
 */
public interface Log extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see se.eskilson.egeo.EgeoPackage#getLog_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Log#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see se.eskilson.egeo.EgeoPackage#getLog_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Log#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Encoded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoded</em>' attribute.
	 * @see #setEncoded(boolean)
	 * @see se.eskilson.egeo.EgeoPackage#getLog_Encoded()
	 * @model unique="false"
	 * @generated
	 */
	boolean isEncoded();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Log#isEncoded <em>Encoded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoded</em>' attribute.
	 * @see #isEncoded()
	 * @generated
	 */
	void setEncoded(boolean value);

	/**
	 * Returns the value of the '<em><b>Log Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Id</em>' attribute.
	 * @see #setLogId(int)
	 * @see se.eskilson.egeo.EgeoPackage#getLog_LogId()
	 * @model unique="false"
	 * @generated
	 */
	int getLogId();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Log#getLogId <em>Log Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Id</em>' attribute.
	 * @see #getLogId()
	 * @generated
	 */
	void setLogId(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see se.eskilson.egeo.EgeoPackage#getLog_Date()
	 * @model unique="false" dataType="se.eskilson.egeo.Date"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Log#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Log Type</b></em>' attribute.
	 * The literals are from the enumeration {@link se.eskilson.egeo.LogType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Type</em>' attribute.
	 * @see se.eskilson.egeo.LogType
	 * @see #setLogType(LogType)
	 * @see se.eskilson.egeo.EgeoPackage#getLog_LogType()
	 * @model unique="false"
	 * @generated
	 */
	LogType getLogType();

	/**
	 * Sets the value of the '{@link se.eskilson.egeo.Log#getLogType <em>Log Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Type</em>' attribute.
	 * @see se.eskilson.egeo.LogType
	 * @see #getLogType()
	 * @generated
	 */
	void setLogType(LogType value);

} // Log
