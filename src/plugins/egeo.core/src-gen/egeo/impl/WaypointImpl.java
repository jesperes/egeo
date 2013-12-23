/**
 */
package egeo.impl;

import egeo.Coordinate;
import egeo.EgeoPackage;
import egeo.Waypoint;

import java.net.URL;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waypoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.impl.WaypointImpl#getName <em>Name</em>}</li>
 *   <li>{@link egeo.impl.WaypointImpl#getTime <em>Time</em>}</li>
 *   <li>{@link egeo.impl.WaypointImpl#getCmt <em>Cmt</em>}</li>
 *   <li>{@link egeo.impl.WaypointImpl#getType0 <em>Type0</em>}</li>
 *   <li>{@link egeo.impl.WaypointImpl#getSym <em>Sym</em>}</li>
 *   <li>{@link egeo.impl.WaypointImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link egeo.impl.WaypointImpl#getUrlname <em>Urlname</em>}</li>
 *   <li>{@link egeo.impl.WaypointImpl#getCoord <em>Coord</em>}</li>
 *   <li>{@link egeo.impl.WaypointImpl#getLastUpdate <em>Last Update</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaypointImpl extends MinimalEObjectImpl.Container implements Waypoint
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected static final Date TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected Date time = TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getCmt() <em>Cmt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmt()
   * @generated
   * @ordered
   */
  protected static final String CMT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCmt() <em>Cmt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmt()
   * @generated
   * @ordered
   */
  protected String cmt = CMT_EDEFAULT;

  /**
   * The default value of the '{@link #getType0() <em>Type0</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType0()
   * @generated
   * @ordered
   */
  protected static final String TYPE0_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType0() <em>Type0</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType0()
   * @generated
   * @ordered
   */
  protected String type0 = TYPE0_EDEFAULT;

  /**
   * The default value of the '{@link #getSym() <em>Sym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSym()
   * @generated
   * @ordered
   */
  protected static final String SYM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSym() <em>Sym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSym()
   * @generated
   * @ordered
   */
  protected String sym = SYM_EDEFAULT;

  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final URL URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected URL url = URL_EDEFAULT;

  /**
   * The default value of the '{@link #getUrlname() <em>Urlname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrlname()
   * @generated
   * @ordered
   */
  protected static final String URLNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrlname() <em>Urlname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrlname()
   * @generated
   * @ordered
   */
  protected String urlname = URLNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getCoord() <em>Coord</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoord()
   * @generated
   * @ordered
   */
  protected Coordinate coord;

  /**
   * The default value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastUpdate()
   * @generated
   * @ordered
   */
  protected static final Date LAST_UPDATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastUpdate()
   * @generated
   * @ordered
   */
  protected Date lastUpdate = LAST_UPDATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WaypointImpl()
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
    return EgeoPackage.Literals.WAYPOINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.WAYPOINT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(Date newTime)
  {
    Date oldTime = time;
    time = newTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.WAYPOINT__TIME, oldTime, time));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCmt()
  {
    return cmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmt(String newCmt)
  {
    String oldCmt = cmt;
    cmt = newCmt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.WAYPOINT__CMT, oldCmt, cmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType0()
  {
    return type0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType0(String newType0)
  {
    String oldType0 = type0;
    type0 = newType0;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.WAYPOINT__TYPE0, oldType0, type0));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSym()
  {
    return sym;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSym(String newSym)
  {
    String oldSym = sym;
    sym = newSym;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.WAYPOINT__SYM, oldSym, sym));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URL getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(URL newUrl)
  {
    URL oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.WAYPOINT__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrlname()
  {
    return urlname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrlname(String newUrlname)
  {
    String oldUrlname = urlname;
    urlname = newUrlname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.WAYPOINT__URLNAME, oldUrlname, urlname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coordinate getCoord()
  {
    return coord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoord(Coordinate newCoord, NotificationChain msgs)
  {
    Coordinate oldCoord = coord;
    coord = newCoord;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EgeoPackage.WAYPOINT__COORD, oldCoord, newCoord);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoord(Coordinate newCoord)
  {
    if (newCoord != coord)
    {
      NotificationChain msgs = null;
      if (coord != null)
        msgs = ((InternalEObject)coord).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.WAYPOINT__COORD, null, msgs);
      if (newCoord != null)
        msgs = ((InternalEObject)newCoord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.WAYPOINT__COORD, null, msgs);
      msgs = basicSetCoord(newCoord, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.WAYPOINT__COORD, newCoord, newCoord));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getLastUpdate()
  {
    return lastUpdate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLastUpdate(Date newLastUpdate)
  {
    Date oldLastUpdate = lastUpdate;
    lastUpdate = newLastUpdate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.WAYPOINT__LAST_UPDATE, oldLastUpdate, lastUpdate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EgeoPackage.WAYPOINT__COORD:
        return basicSetCoord(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EgeoPackage.WAYPOINT__NAME:
        return getName();
      case EgeoPackage.WAYPOINT__TIME:
        return getTime();
      case EgeoPackage.WAYPOINT__CMT:
        return getCmt();
      case EgeoPackage.WAYPOINT__TYPE0:
        return getType0();
      case EgeoPackage.WAYPOINT__SYM:
        return getSym();
      case EgeoPackage.WAYPOINT__URL:
        return getUrl();
      case EgeoPackage.WAYPOINT__URLNAME:
        return getUrlname();
      case EgeoPackage.WAYPOINT__COORD:
        return getCoord();
      case EgeoPackage.WAYPOINT__LAST_UPDATE:
        return getLastUpdate();
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
      case EgeoPackage.WAYPOINT__NAME:
        setName((String)newValue);
        return;
      case EgeoPackage.WAYPOINT__TIME:
        setTime((Date)newValue);
        return;
      case EgeoPackage.WAYPOINT__CMT:
        setCmt((String)newValue);
        return;
      case EgeoPackage.WAYPOINT__TYPE0:
        setType0((String)newValue);
        return;
      case EgeoPackage.WAYPOINT__SYM:
        setSym((String)newValue);
        return;
      case EgeoPackage.WAYPOINT__URL:
        setUrl((URL)newValue);
        return;
      case EgeoPackage.WAYPOINT__URLNAME:
        setUrlname((String)newValue);
        return;
      case EgeoPackage.WAYPOINT__COORD:
        setCoord((Coordinate)newValue);
        return;
      case EgeoPackage.WAYPOINT__LAST_UPDATE:
        setLastUpdate((Date)newValue);
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
      case EgeoPackage.WAYPOINT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EgeoPackage.WAYPOINT__TIME:
        setTime(TIME_EDEFAULT);
        return;
      case EgeoPackage.WAYPOINT__CMT:
        setCmt(CMT_EDEFAULT);
        return;
      case EgeoPackage.WAYPOINT__TYPE0:
        setType0(TYPE0_EDEFAULT);
        return;
      case EgeoPackage.WAYPOINT__SYM:
        setSym(SYM_EDEFAULT);
        return;
      case EgeoPackage.WAYPOINT__URL:
        setUrl(URL_EDEFAULT);
        return;
      case EgeoPackage.WAYPOINT__URLNAME:
        setUrlname(URLNAME_EDEFAULT);
        return;
      case EgeoPackage.WAYPOINT__COORD:
        setCoord((Coordinate)null);
        return;
      case EgeoPackage.WAYPOINT__LAST_UPDATE:
        setLastUpdate(LAST_UPDATE_EDEFAULT);
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
      case EgeoPackage.WAYPOINT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EgeoPackage.WAYPOINT__TIME:
        return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
      case EgeoPackage.WAYPOINT__CMT:
        return CMT_EDEFAULT == null ? cmt != null : !CMT_EDEFAULT.equals(cmt);
      case EgeoPackage.WAYPOINT__TYPE0:
        return TYPE0_EDEFAULT == null ? type0 != null : !TYPE0_EDEFAULT.equals(type0);
      case EgeoPackage.WAYPOINT__SYM:
        return SYM_EDEFAULT == null ? sym != null : !SYM_EDEFAULT.equals(sym);
      case EgeoPackage.WAYPOINT__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case EgeoPackage.WAYPOINT__URLNAME:
        return URLNAME_EDEFAULT == null ? urlname != null : !URLNAME_EDEFAULT.equals(urlname);
      case EgeoPackage.WAYPOINT__COORD:
        return coord != null;
      case EgeoPackage.WAYPOINT__LAST_UPDATE:
        return LAST_UPDATE_EDEFAULT == null ? lastUpdate != null : !LAST_UPDATE_EDEFAULT.equals(lastUpdate);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", time: ");
    result.append(time);
    result.append(", cmt: ");
    result.append(cmt);
    result.append(", type0: ");
    result.append(type0);
    result.append(", sym: ");
    result.append(sym);
    result.append(", url: ");
    result.append(url);
    result.append(", urlname: ");
    result.append(urlname);
    result.append(", lastUpdate: ");
    result.append(lastUpdate);
    result.append(')');
    return result.toString();
  }

} //WaypointImpl
