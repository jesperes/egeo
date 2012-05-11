/**
 */
package se.eskilson.egeo.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.eskilson.egeo.EgeoPackage;
import se.eskilson.egeo.Log;
import se.eskilson.egeo.LogType;
import se.eskilson.egeo.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.eskilson.egeo.impl.LogImpl#getText <em>Text</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.LogImpl#getUser <em>User</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.LogImpl#isEncoded <em>Encoded</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.LogImpl#getLogId <em>Log Id</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.LogImpl#getDate <em>Date</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.LogImpl#getLogType <em>Log Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogImpl extends MinimalEObjectImpl.Container implements Log
{
  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * The cached value of the '{@link #getUser() <em>User</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUser()
   * @generated
   * @ordered
   */
  protected User user;

  /**
   * The default value of the '{@link #isEncoded() <em>Encoded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEncoded()
   * @generated
   * @ordered
   */
  protected static final boolean ENCODED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEncoded() <em>Encoded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEncoded()
   * @generated
   * @ordered
   */
  protected boolean encoded = ENCODED_EDEFAULT;

  /**
   * The default value of the '{@link #getLogId() <em>Log Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogId()
   * @generated
   * @ordered
   */
  protected static final int LOG_ID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLogId() <em>Log Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogId()
   * @generated
   * @ordered
   */
  protected int logId = LOG_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected static final String DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected String date = DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getLogType() <em>Log Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogType()
   * @generated
   * @ordered
   */
  protected static final LogType LOG_TYPE_EDEFAULT = LogType.FOUND_IT;

  /**
   * The cached value of the '{@link #getLogType() <em>Log Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogType()
   * @generated
   * @ordered
   */
  protected LogType logType = LOG_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EgeoPackage.Literals.LOG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.LOG__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User getUser()
  {
    if (user != null && user.eIsProxy())
    {
      InternalEObject oldUser = (InternalEObject)user;
      user = (User)eResolveProxy(oldUser);
      if (user != oldUser)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgeoPackage.LOG__USER, oldUser, user));
      }
    }
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User basicGetUser()
  {
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUser(User newUser)
  {
    User oldUser = user;
    user = newUser;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.LOG__USER, oldUser, user));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEncoded()
  {
    return encoded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEncoded(boolean newEncoded)
  {
    boolean oldEncoded = encoded;
    encoded = newEncoded;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.LOG__ENCODED, oldEncoded, encoded));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLogId()
  {
    return logId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogId(int newLogId)
  {
    int oldLogId = logId;
    logId = newLogId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.LOG__LOG_ID, oldLogId, logId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(String newDate)
  {
    String oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.LOG__DATE, oldDate, date));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogType getLogType()
  {
    return logType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogType(LogType newLogType)
  {
    LogType oldLogType = logType;
    logType = newLogType == null ? LOG_TYPE_EDEFAULT : newLogType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.LOG__LOG_TYPE, oldLogType, logType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EgeoPackage.LOG__TEXT:
        return getText();
      case EgeoPackage.LOG__USER:
        if (resolve) return getUser();
        return basicGetUser();
      case EgeoPackage.LOG__ENCODED:
        return isEncoded();
      case EgeoPackage.LOG__LOG_ID:
        return getLogId();
      case EgeoPackage.LOG__DATE:
        return getDate();
      case EgeoPackage.LOG__LOG_TYPE:
        return getLogType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EgeoPackage.LOG__TEXT:
        setText((String)newValue);
        return;
      case EgeoPackage.LOG__USER:
        setUser((User)newValue);
        return;
      case EgeoPackage.LOG__ENCODED:
        setEncoded((Boolean)newValue);
        return;
      case EgeoPackage.LOG__LOG_ID:
        setLogId((Integer)newValue);
        return;
      case EgeoPackage.LOG__DATE:
        setDate((String)newValue);
        return;
      case EgeoPackage.LOG__LOG_TYPE:
        setLogType((LogType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EgeoPackage.LOG__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case EgeoPackage.LOG__USER:
        setUser((User)null);
        return;
      case EgeoPackage.LOG__ENCODED:
        setEncoded(ENCODED_EDEFAULT);
        return;
      case EgeoPackage.LOG__LOG_ID:
        setLogId(LOG_ID_EDEFAULT);
        return;
      case EgeoPackage.LOG__DATE:
        setDate(DATE_EDEFAULT);
        return;
      case EgeoPackage.LOG__LOG_TYPE:
        setLogType(LOG_TYPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EgeoPackage.LOG__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case EgeoPackage.LOG__USER:
        return user != null;
      case EgeoPackage.LOG__ENCODED:
        return encoded != ENCODED_EDEFAULT;
      case EgeoPackage.LOG__LOG_ID:
        return logId != LOG_ID_EDEFAULT;
      case EgeoPackage.LOG__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case EgeoPackage.LOG__LOG_TYPE:
        return logType != LOG_TYPE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (text: ");
    result.append(text);
    result.append(", encoded: ");
    result.append(encoded);
    result.append(", logId: ");
    result.append(logId);
    result.append(", date: ");
    result.append(date);
    result.append(", logType: ");
    result.append(logType);
    result.append(')');
    return result.toString();
  }

} //LogImpl
