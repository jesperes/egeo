/**
 */
package egeo.impl;

import egeo.EgeoPackage;
import egeo.Log;
import egeo.LogType;
import egeo.User;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.impl.LogImpl#getLogId <em>Log Id</em>}</li>
 *   <li>{@link egeo.impl.LogImpl#getDate <em>Date</em>}</li>
 *   <li>{@link egeo.impl.LogImpl#getLogType <em>Log Type</em>}</li>
 *   <li>{@link egeo.impl.LogImpl#getText <em>Text</em>}</li>
 *   <li>{@link egeo.impl.LogImpl#getFinder <em>Finder</em>}</li>
 *   <li>{@link egeo.impl.LogImpl#isEncoded <em>Encoded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogImpl extends MinimalEObjectImpl.Container implements Log
{
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
  protected static final Date DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected Date date = DATE_EDEFAULT;

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
   * The cached value of the '{@link #getFinder() <em>Finder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinder()
   * @generated
   * @ordered
   */
  protected User finder;

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
  public Date getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(Date newDate)
  {
    Date oldDate = date;
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
  public User getFinder()
  {
    if (finder != null && finder.eIsProxy())
    {
      InternalEObject oldFinder = (InternalEObject)finder;
      finder = (User)eResolveProxy(oldFinder);
      if (finder != oldFinder)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgeoPackage.LOG__FINDER, oldFinder, finder));
      }
    }
    return finder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User basicGetFinder()
  {
    return finder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinder(User newFinder)
  {
    User oldFinder = finder;
    finder = newFinder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.LOG__FINDER, oldFinder, finder));
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
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EgeoPackage.LOG__LOG_ID:
        return getLogId();
      case EgeoPackage.LOG__DATE:
        return getDate();
      case EgeoPackage.LOG__LOG_TYPE:
        return getLogType();
      case EgeoPackage.LOG__TEXT:
        return getText();
      case EgeoPackage.LOG__FINDER:
        if (resolve) return getFinder();
        return basicGetFinder();
      case EgeoPackage.LOG__ENCODED:
        return isEncoded();
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
      case EgeoPackage.LOG__LOG_ID:
        setLogId((Integer)newValue);
        return;
      case EgeoPackage.LOG__DATE:
        setDate((Date)newValue);
        return;
      case EgeoPackage.LOG__LOG_TYPE:
        setLogType((LogType)newValue);
        return;
      case EgeoPackage.LOG__TEXT:
        setText((String)newValue);
        return;
      case EgeoPackage.LOG__FINDER:
        setFinder((User)newValue);
        return;
      case EgeoPackage.LOG__ENCODED:
        setEncoded((Boolean)newValue);
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
      case EgeoPackage.LOG__LOG_ID:
        setLogId(LOG_ID_EDEFAULT);
        return;
      case EgeoPackage.LOG__DATE:
        setDate(DATE_EDEFAULT);
        return;
      case EgeoPackage.LOG__LOG_TYPE:
        setLogType(LOG_TYPE_EDEFAULT);
        return;
      case EgeoPackage.LOG__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case EgeoPackage.LOG__FINDER:
        setFinder((User)null);
        return;
      case EgeoPackage.LOG__ENCODED:
        setEncoded(ENCODED_EDEFAULT);
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
      case EgeoPackage.LOG__LOG_ID:
        return logId != LOG_ID_EDEFAULT;
      case EgeoPackage.LOG__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case EgeoPackage.LOG__LOG_TYPE:
        return logType != LOG_TYPE_EDEFAULT;
      case EgeoPackage.LOG__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case EgeoPackage.LOG__FINDER:
        return finder != null;
      case EgeoPackage.LOG__ENCODED:
        return encoded != ENCODED_EDEFAULT;
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
    result.append(" (logId: ");
    result.append(logId);
    result.append(", date: ");
    result.append(date);
    result.append(", logType: ");
    result.append(logType);
    result.append(", text: ");
    result.append(text);
    result.append(", encoded: ");
    result.append(encoded);
    result.append(')');
    return result.toString();
  }

} //LogImpl
