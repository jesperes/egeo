/**
 */
package egeo.impl;

import egeo.Attribute;
import egeo.CacheType;
import egeo.ContainerType;
import egeo.Coordinate;
import egeo.Description;
import egeo.EgeoPackage;
import egeo.Geocache;
import egeo.Log;
import egeo.User;

import java.net.URL;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geocache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.impl.GeocacheImpl#getCacheId <em>Cache Id</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getCode <em>Code</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getTime <em>Time</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getName <em>Name</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#isAvailable <em>Available</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#isArchived <em>Archived</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getPlacedBy <em>Placed By</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getTerrain <em>Terrain</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getState <em>State</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getCoord <em>Coord</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getShortText <em>Short Text</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getLongText <em>Long Text</em>}</li>
 *   <li>{@link egeo.impl.GeocacheImpl#getLogs <em>Logs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeocacheImpl extends MinimalEObjectImpl.Container implements Geocache
{
  /**
   * The default value of the '{@link #getCacheId() <em>Cache Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCacheId()
   * @generated
   * @ordered
   */
  protected static final long CACHE_ID_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getCacheId() <em>Cache Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCacheId()
   * @generated
   * @ordered
   */
  protected long cacheId = CACHE_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected static final String CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected String code = CODE_EDEFAULT;

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
   * The default value of the '{@link #isAvailable() <em>Available</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAvailable()
   * @generated
   * @ordered
   */
  protected static final boolean AVAILABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAvailable() <em>Available</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAvailable()
   * @generated
   * @ordered
   */
  protected boolean available = AVAILABLE_EDEFAULT;

  /**
   * The default value of the '{@link #isArchived() <em>Archived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArchived()
   * @generated
   * @ordered
   */
  protected static final boolean ARCHIVED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isArchived() <em>Archived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArchived()
   * @generated
   * @ordered
   */
  protected boolean archived = ARCHIVED_EDEFAULT;

  /**
   * The default value of the '{@link #getContainerType() <em>Container Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerType()
   * @generated
   * @ordered
   */
  protected static final ContainerType CONTAINER_TYPE_EDEFAULT = ContainerType.MICRO;

  /**
   * The cached value of the '{@link #getContainerType() <em>Container Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerType()
   * @generated
   * @ordered
   */
  protected ContainerType containerType = CONTAINER_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwner()
   * @generated
   * @ordered
   */
  protected User owner;

  /**
   * The default value of the '{@link #getPlacedBy() <em>Placed By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlacedBy()
   * @generated
   * @ordered
   */
  protected static final String PLACED_BY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPlacedBy() <em>Placed By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlacedBy()
   * @generated
   * @ordered
   */
  protected String placedBy = PLACED_BY_EDEFAULT;

  /**
   * The default value of the '{@link #getCacheType() <em>Cache Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCacheType()
   * @generated
   * @ordered
   */
  protected static final CacheType CACHE_TYPE_EDEFAULT = CacheType.TRADITIONAL;

  /**
   * The cached value of the '{@link #getCacheType() <em>Cache Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCacheType()
   * @generated
   * @ordered
   */
  protected CacheType cacheType = CACHE_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDifficulty()
   * @generated
   * @ordered
   */
  protected static final double DIFFICULTY_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDifficulty()
   * @generated
   * @ordered
   */
  protected double difficulty = DIFFICULTY_EDEFAULT;

  /**
   * The default value of the '{@link #getTerrain() <em>Terrain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerrain()
   * @generated
   * @ordered
   */
  protected static final double TERRAIN_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getTerrain() <em>Terrain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerrain()
   * @generated
   * @ordered
   */
  protected double terrain = TERRAIN_EDEFAULT;

  /**
   * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountry()
   * @generated
   * @ordered
   */
  protected static final String COUNTRY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountry()
   * @generated
   * @ordered
   */
  protected String country = COUNTRY_EDEFAULT;

  /**
   * The default value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected static final String STATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected String state = STATE_EDEFAULT;

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
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The default value of the '{@link #getHint() <em>Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHint()
   * @generated
   * @ordered
   */
  protected static final String HINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHint() <em>Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHint()
   * @generated
   * @ordered
   */
  protected String hint = HINT_EDEFAULT;

  /**
   * The cached value of the '{@link #getShortText() <em>Short Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortText()
   * @generated
   * @ordered
   */
  protected Description shortText;

  /**
   * The cached value of the '{@link #getLongText() <em>Long Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongText()
   * @generated
   * @ordered
   */
  protected Description longText;

  /**
   * The cached value of the '{@link #getLogs() <em>Logs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogs()
   * @generated
   * @ordered
   */
  protected EList<Log> logs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeocacheImpl()
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
    return EgeoPackage.Literals.GEOCACHE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getCacheId()
  {
    return cacheId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCacheId(long newCacheId)
  {
    long oldCacheId = cacheId;
    cacheId = newCacheId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__CACHE_ID, oldCacheId, cacheId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCode()
  {
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCode(String newCode)
  {
    String oldCode = code;
    code = newCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__CODE, oldCode, code));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__TIME, oldTime, time));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAvailable()
  {
    return available;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAvailable(boolean newAvailable)
  {
    boolean oldAvailable = available;
    available = newAvailable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__AVAILABLE, oldAvailable, available));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isArchived()
  {
    return archived;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArchived(boolean newArchived)
  {
    boolean oldArchived = archived;
    archived = newArchived;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__ARCHIVED, oldArchived, archived));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerType getContainerType()
  {
    return containerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainerType(ContainerType newContainerType)
  {
    ContainerType oldContainerType = containerType;
    containerType = newContainerType == null ? CONTAINER_TYPE_EDEFAULT : newContainerType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__CONTAINER_TYPE, oldContainerType, containerType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User getOwner()
  {
    return owner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwner(User newOwner, NotificationChain msgs)
  {
    User oldOwner = owner;
    owner = newOwner;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__OWNER, oldOwner, newOwner);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwner(User newOwner)
  {
    if (newOwner != owner)
    {
      NotificationChain msgs = null;
      if (owner != null)
        msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.GEOCACHE__OWNER, null, msgs);
      if (newOwner != null)
        msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.GEOCACHE__OWNER, null, msgs);
      msgs = basicSetOwner(newOwner, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__OWNER, newOwner, newOwner));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPlacedBy()
  {
    return placedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlacedBy(String newPlacedBy)
  {
    String oldPlacedBy = placedBy;
    placedBy = newPlacedBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__PLACED_BY, oldPlacedBy, placedBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CacheType getCacheType()
  {
    return cacheType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCacheType(CacheType newCacheType)
  {
    CacheType oldCacheType = cacheType;
    cacheType = newCacheType == null ? CACHE_TYPE_EDEFAULT : newCacheType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__CACHE_TYPE, oldCacheType, cacheType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getDifficulty()
  {
    return difficulty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDifficulty(double newDifficulty)
  {
    double oldDifficulty = difficulty;
    difficulty = newDifficulty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__DIFFICULTY, oldDifficulty, difficulty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getTerrain()
  {
    return terrain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerrain(double newTerrain)
  {
    double oldTerrain = terrain;
    terrain = newTerrain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__TERRAIN, oldTerrain, terrain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCountry()
  {
    return country;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCountry(String newCountry)
  {
    String oldCountry = country;
    country = newCountry;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__COUNTRY, oldCountry, country));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(String newState)
  {
    String oldState = state;
    state = newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__STATE, oldState, state));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__COORD, oldCoord, newCoord);
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
        msgs = ((InternalEObject)coord).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.GEOCACHE__COORD, null, msgs);
      if (newCoord != null)
        msgs = ((InternalEObject)newCoord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.GEOCACHE__COORD, null, msgs);
      msgs = basicSetCoord(newCoord, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__COORD, newCoord, newCoord));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EDataTypeEList<Attribute>(Attribute.class, this, EgeoPackage.GEOCACHE__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHint()
  {
    return hint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHint(String newHint)
  {
    String oldHint = hint;
    hint = newHint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__HINT, oldHint, hint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description getShortText()
  {
    return shortText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShortText(Description newShortText, NotificationChain msgs)
  {
    Description oldShortText = shortText;
    shortText = newShortText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__SHORT_TEXT, oldShortText, newShortText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortText(Description newShortText)
  {
    if (newShortText != shortText)
    {
      NotificationChain msgs = null;
      if (shortText != null)
        msgs = ((InternalEObject)shortText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.GEOCACHE__SHORT_TEXT, null, msgs);
      if (newShortText != null)
        msgs = ((InternalEObject)newShortText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.GEOCACHE__SHORT_TEXT, null, msgs);
      msgs = basicSetShortText(newShortText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__SHORT_TEXT, newShortText, newShortText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description getLongText()
  {
    return longText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLongText(Description newLongText, NotificationChain msgs)
  {
    Description oldLongText = longText;
    longText = newLongText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__LONG_TEXT, oldLongText, newLongText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongText(Description newLongText)
  {
    if (newLongText != longText)
    {
      NotificationChain msgs = null;
      if (longText != null)
        msgs = ((InternalEObject)longText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.GEOCACHE__LONG_TEXT, null, msgs);
      if (newLongText != null)
        msgs = ((InternalEObject)newLongText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.GEOCACHE__LONG_TEXT, null, msgs);
      msgs = basicSetLongText(newLongText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.GEOCACHE__LONG_TEXT, newLongText, newLongText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Log> getLogs()
  {
    if (logs == null)
    {
      logs = new EObjectContainmentEList<Log>(Log.class, this, EgeoPackage.GEOCACHE__LOGS);
    }
    return logs;
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
      case EgeoPackage.GEOCACHE__OWNER:
        return basicSetOwner(null, msgs);
      case EgeoPackage.GEOCACHE__COORD:
        return basicSetCoord(null, msgs);
      case EgeoPackage.GEOCACHE__SHORT_TEXT:
        return basicSetShortText(null, msgs);
      case EgeoPackage.GEOCACHE__LONG_TEXT:
        return basicSetLongText(null, msgs);
      case EgeoPackage.GEOCACHE__LOGS:
        return ((InternalEList<?>)getLogs()).basicRemove(otherEnd, msgs);
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
      case EgeoPackage.GEOCACHE__CACHE_ID:
        return getCacheId();
      case EgeoPackage.GEOCACHE__CODE:
        return getCode();
      case EgeoPackage.GEOCACHE__TIME:
        return getTime();
      case EgeoPackage.GEOCACHE__NAME:
        return getName();
      case EgeoPackage.GEOCACHE__AVAILABLE:
        return isAvailable();
      case EgeoPackage.GEOCACHE__ARCHIVED:
        return isArchived();
      case EgeoPackage.GEOCACHE__CONTAINER_TYPE:
        return getContainerType();
      case EgeoPackage.GEOCACHE__OWNER:
        return getOwner();
      case EgeoPackage.GEOCACHE__PLACED_BY:
        return getPlacedBy();
      case EgeoPackage.GEOCACHE__CACHE_TYPE:
        return getCacheType();
      case EgeoPackage.GEOCACHE__DIFFICULTY:
        return getDifficulty();
      case EgeoPackage.GEOCACHE__TERRAIN:
        return getTerrain();
      case EgeoPackage.GEOCACHE__COUNTRY:
        return getCountry();
      case EgeoPackage.GEOCACHE__STATE:
        return getState();
      case EgeoPackage.GEOCACHE__COORD:
        return getCoord();
      case EgeoPackage.GEOCACHE__URL:
        return getUrl();
      case EgeoPackage.GEOCACHE__ATTRIBUTES:
        return getAttributes();
      case EgeoPackage.GEOCACHE__HINT:
        return getHint();
      case EgeoPackage.GEOCACHE__SHORT_TEXT:
        return getShortText();
      case EgeoPackage.GEOCACHE__LONG_TEXT:
        return getLongText();
      case EgeoPackage.GEOCACHE__LOGS:
        return getLogs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EgeoPackage.GEOCACHE__CACHE_ID:
        setCacheId((Long)newValue);
        return;
      case EgeoPackage.GEOCACHE__CODE:
        setCode((String)newValue);
        return;
      case EgeoPackage.GEOCACHE__TIME:
        setTime((Date)newValue);
        return;
      case EgeoPackage.GEOCACHE__NAME:
        setName((String)newValue);
        return;
      case EgeoPackage.GEOCACHE__AVAILABLE:
        setAvailable((Boolean)newValue);
        return;
      case EgeoPackage.GEOCACHE__ARCHIVED:
        setArchived((Boolean)newValue);
        return;
      case EgeoPackage.GEOCACHE__CONTAINER_TYPE:
        setContainerType((ContainerType)newValue);
        return;
      case EgeoPackage.GEOCACHE__OWNER:
        setOwner((User)newValue);
        return;
      case EgeoPackage.GEOCACHE__PLACED_BY:
        setPlacedBy((String)newValue);
        return;
      case EgeoPackage.GEOCACHE__CACHE_TYPE:
        setCacheType((CacheType)newValue);
        return;
      case EgeoPackage.GEOCACHE__DIFFICULTY:
        setDifficulty((Double)newValue);
        return;
      case EgeoPackage.GEOCACHE__TERRAIN:
        setTerrain((Double)newValue);
        return;
      case EgeoPackage.GEOCACHE__COUNTRY:
        setCountry((String)newValue);
        return;
      case EgeoPackage.GEOCACHE__STATE:
        setState((String)newValue);
        return;
      case EgeoPackage.GEOCACHE__COORD:
        setCoord((Coordinate)newValue);
        return;
      case EgeoPackage.GEOCACHE__URL:
        setUrl((URL)newValue);
        return;
      case EgeoPackage.GEOCACHE__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case EgeoPackage.GEOCACHE__HINT:
        setHint((String)newValue);
        return;
      case EgeoPackage.GEOCACHE__SHORT_TEXT:
        setShortText((Description)newValue);
        return;
      case EgeoPackage.GEOCACHE__LONG_TEXT:
        setLongText((Description)newValue);
        return;
      case EgeoPackage.GEOCACHE__LOGS:
        getLogs().clear();
        getLogs().addAll((Collection<? extends Log>)newValue);
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
      case EgeoPackage.GEOCACHE__CACHE_ID:
        setCacheId(CACHE_ID_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__CODE:
        setCode(CODE_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__TIME:
        setTime(TIME_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__AVAILABLE:
        setAvailable(AVAILABLE_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__ARCHIVED:
        setArchived(ARCHIVED_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__CONTAINER_TYPE:
        setContainerType(CONTAINER_TYPE_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__OWNER:
        setOwner((User)null);
        return;
      case EgeoPackage.GEOCACHE__PLACED_BY:
        setPlacedBy(PLACED_BY_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__CACHE_TYPE:
        setCacheType(CACHE_TYPE_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__DIFFICULTY:
        setDifficulty(DIFFICULTY_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__TERRAIN:
        setTerrain(TERRAIN_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__COUNTRY:
        setCountry(COUNTRY_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__STATE:
        setState(STATE_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__COORD:
        setCoord((Coordinate)null);
        return;
      case EgeoPackage.GEOCACHE__URL:
        setUrl(URL_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__ATTRIBUTES:
        getAttributes().clear();
        return;
      case EgeoPackage.GEOCACHE__HINT:
        setHint(HINT_EDEFAULT);
        return;
      case EgeoPackage.GEOCACHE__SHORT_TEXT:
        setShortText((Description)null);
        return;
      case EgeoPackage.GEOCACHE__LONG_TEXT:
        setLongText((Description)null);
        return;
      case EgeoPackage.GEOCACHE__LOGS:
        getLogs().clear();
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
      case EgeoPackage.GEOCACHE__CACHE_ID:
        return cacheId != CACHE_ID_EDEFAULT;
      case EgeoPackage.GEOCACHE__CODE:
        return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
      case EgeoPackage.GEOCACHE__TIME:
        return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
      case EgeoPackage.GEOCACHE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EgeoPackage.GEOCACHE__AVAILABLE:
        return available != AVAILABLE_EDEFAULT;
      case EgeoPackage.GEOCACHE__ARCHIVED:
        return archived != ARCHIVED_EDEFAULT;
      case EgeoPackage.GEOCACHE__CONTAINER_TYPE:
        return containerType != CONTAINER_TYPE_EDEFAULT;
      case EgeoPackage.GEOCACHE__OWNER:
        return owner != null;
      case EgeoPackage.GEOCACHE__PLACED_BY:
        return PLACED_BY_EDEFAULT == null ? placedBy != null : !PLACED_BY_EDEFAULT.equals(placedBy);
      case EgeoPackage.GEOCACHE__CACHE_TYPE:
        return cacheType != CACHE_TYPE_EDEFAULT;
      case EgeoPackage.GEOCACHE__DIFFICULTY:
        return difficulty != DIFFICULTY_EDEFAULT;
      case EgeoPackage.GEOCACHE__TERRAIN:
        return terrain != TERRAIN_EDEFAULT;
      case EgeoPackage.GEOCACHE__COUNTRY:
        return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
      case EgeoPackage.GEOCACHE__STATE:
        return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
      case EgeoPackage.GEOCACHE__COORD:
        return coord != null;
      case EgeoPackage.GEOCACHE__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case EgeoPackage.GEOCACHE__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case EgeoPackage.GEOCACHE__HINT:
        return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
      case EgeoPackage.GEOCACHE__SHORT_TEXT:
        return shortText != null;
      case EgeoPackage.GEOCACHE__LONG_TEXT:
        return longText != null;
      case EgeoPackage.GEOCACHE__LOGS:
        return logs != null && !logs.isEmpty();
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
    result.append(" (cacheId: ");
    result.append(cacheId);
    result.append(", code: ");
    result.append(code);
    result.append(", time: ");
    result.append(time);
    result.append(", name: ");
    result.append(name);
    result.append(", available: ");
    result.append(available);
    result.append(", archived: ");
    result.append(archived);
    result.append(", containerType: ");
    result.append(containerType);
    result.append(", placedBy: ");
    result.append(placedBy);
    result.append(", cacheType: ");
    result.append(cacheType);
    result.append(", difficulty: ");
    result.append(difficulty);
    result.append(", terrain: ");
    result.append(terrain);
    result.append(", country: ");
    result.append(country);
    result.append(", state: ");
    result.append(state);
    result.append(", url: ");
    result.append(url);
    result.append(", attributes: ");
    result.append(attributes);
    result.append(", hint: ");
    result.append(hint);
    result.append(')');
    return result.toString();
  }

} //GeocacheImpl
