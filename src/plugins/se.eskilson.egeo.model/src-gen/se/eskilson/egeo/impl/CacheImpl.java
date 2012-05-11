/**
 */
package se.eskilson.egeo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.eskilson.egeo.Attribute;
import se.eskilson.egeo.Cache;
import se.eskilson.egeo.CacheType;
import se.eskilson.egeo.Coordinate;
import se.eskilson.egeo.Description;
import se.eskilson.egeo.EgeoPackage;
import se.eskilson.egeo.Log;
import se.eskilson.egeo.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getCode <em>Code</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getName <em>Name</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getTime <em>Time</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getPlacedBy <em>Placed By</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getOwnedBy <em>Owned By</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getCont <em>Cont</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getTerrain <em>Terrain</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getState <em>State</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getCoordinate <em>Coordinate</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getLogs <em>Logs</em>}</li>
 *   <li>{@link se.eskilson.egeo.impl.CacheImpl#getHint <em>Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CacheImpl extends MinimalEObjectImpl.Container implements Cache
{
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
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected static final String TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected String time = TIME_EDEFAULT;

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
   * The cached value of the '{@link #getOwnedBy() <em>Owned By</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedBy()
   * @generated
   * @ordered
   */
  protected User ownedBy;

  /**
   * The default value of the '{@link #getCont() <em>Cont</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCont()
   * @generated
   * @ordered
   */
  protected static final se.eskilson.egeo.Container CONT_EDEFAULT = se.eskilson.egeo.Container.MICRO;

  /**
   * The cached value of the '{@link #getCont() <em>Cont</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCont()
   * @generated
   * @ordered
   */
  protected se.eskilson.egeo.Container cont = CONT_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDifficulty()
   * @generated
   * @ordered
   */
  protected static final int DIFFICULTY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDifficulty()
   * @generated
   * @ordered
   */
  protected int difficulty = DIFFICULTY_EDEFAULT;

  /**
   * The default value of the '{@link #getTerrain() <em>Terrain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerrain()
   * @generated
   * @ordered
   */
  protected static final int TERRAIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTerrain() <em>Terrain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerrain()
   * @generated
   * @ordered
   */
  protected int terrain = TERRAIN_EDEFAULT;

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
   * The cached value of the '{@link #getShortDescription() <em>Short Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortDescription()
   * @generated
   * @ordered
   */
  protected Description shortDescription;

  /**
   * The cached value of the '{@link #getLongDescription() <em>Long Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongDescription()
   * @generated
   * @ordered
   */
  protected Description longDescription;

  /**
   * The cached value of the '{@link #getCoordinate() <em>Coordinate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoordinate()
   * @generated
   * @ordered
   */
  protected Coordinate coordinate;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CacheImpl()
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
    return EgeoPackage.Literals.CACHE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__CODE, oldCode, code));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(String newTime)
  {
    String oldTime = time;
    time = newTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__TIME, oldTime, time));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__CACHE_TYPE, oldCacheType, cacheType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__PLACED_BY, oldPlacedBy, placedBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User getOwnedBy()
  {
    if (ownedBy != null && ownedBy.eIsProxy())
    {
      InternalEObject oldOwnedBy = (InternalEObject)ownedBy;
      ownedBy = (User)eResolveProxy(oldOwnedBy);
      if (ownedBy != oldOwnedBy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EgeoPackage.CACHE__OWNED_BY, oldOwnedBy, ownedBy));
      }
    }
    return ownedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User basicGetOwnedBy()
  {
    return ownedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedBy(User newOwnedBy)
  {
    User oldOwnedBy = ownedBy;
    ownedBy = newOwnedBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__OWNED_BY, oldOwnedBy, ownedBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public se.eskilson.egeo.Container getCont()
  {
    return cont;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCont(se.eskilson.egeo.Container newCont)
  {
    se.eskilson.egeo.Container oldCont = cont;
    cont = newCont == null ? CONT_EDEFAULT : newCont;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__CONT, oldCont, cont));
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
      attributes = new EObjectResolvingEList<Attribute>(Attribute.class, this, EgeoPackage.CACHE__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDifficulty()
  {
    return difficulty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDifficulty(int newDifficulty)
  {
    int oldDifficulty = difficulty;
    difficulty = newDifficulty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__DIFFICULTY, oldDifficulty, difficulty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTerrain()
  {
    return terrain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerrain(int newTerrain)
  {
    int oldTerrain = terrain;
    terrain = newTerrain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__TERRAIN, oldTerrain, terrain));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__COUNTRY, oldCountry, country));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__STATE, oldState, state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description getShortDescription()
  {
    return shortDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShortDescription(Description newShortDescription, NotificationChain msgs)
  {
    Description oldShortDescription = shortDescription;
    shortDescription = newShortDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__SHORT_DESCRIPTION, oldShortDescription, newShortDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortDescription(Description newShortDescription)
  {
    if (newShortDescription != shortDescription)
    {
      NotificationChain msgs = null;
      if (shortDescription != null)
        msgs = ((InternalEObject)shortDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.CACHE__SHORT_DESCRIPTION, null, msgs);
      if (newShortDescription != null)
        msgs = ((InternalEObject)newShortDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.CACHE__SHORT_DESCRIPTION, null, msgs);
      msgs = basicSetShortDescription(newShortDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__SHORT_DESCRIPTION, newShortDescription, newShortDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description getLongDescription()
  {
    return longDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLongDescription(Description newLongDescription, NotificationChain msgs)
  {
    Description oldLongDescription = longDescription;
    longDescription = newLongDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__LONG_DESCRIPTION, oldLongDescription, newLongDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongDescription(Description newLongDescription)
  {
    if (newLongDescription != longDescription)
    {
      NotificationChain msgs = null;
      if (longDescription != null)
        msgs = ((InternalEObject)longDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.CACHE__LONG_DESCRIPTION, null, msgs);
      if (newLongDescription != null)
        msgs = ((InternalEObject)newLongDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.CACHE__LONG_DESCRIPTION, null, msgs);
      msgs = basicSetLongDescription(newLongDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__LONG_DESCRIPTION, newLongDescription, newLongDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coordinate getCoordinate()
  {
    return coordinate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoordinate(Coordinate newCoordinate, NotificationChain msgs)
  {
    Coordinate oldCoordinate = coordinate;
    coordinate = newCoordinate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__COORDINATE, oldCoordinate, newCoordinate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoordinate(Coordinate newCoordinate)
  {
    if (newCoordinate != coordinate)
    {
      NotificationChain msgs = null;
      if (coordinate != null)
        msgs = ((InternalEObject)coordinate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.CACHE__COORDINATE, null, msgs);
      if (newCoordinate != null)
        msgs = ((InternalEObject)newCoordinate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EgeoPackage.CACHE__COORDINATE, null, msgs);
      msgs = basicSetCoordinate(newCoordinate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__COORDINATE, newCoordinate, newCoordinate));
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
      logs = new EObjectContainmentEList<Log>(Log.class, this, EgeoPackage.CACHE__LOGS);
    }
    return logs;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EgeoPackage.CACHE__HINT, oldHint, hint));
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
      case EgeoPackage.CACHE__SHORT_DESCRIPTION:
        return basicSetShortDescription(null, msgs);
      case EgeoPackage.CACHE__LONG_DESCRIPTION:
        return basicSetLongDescription(null, msgs);
      case EgeoPackage.CACHE__COORDINATE:
        return basicSetCoordinate(null, msgs);
      case EgeoPackage.CACHE__LOGS:
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
      case EgeoPackage.CACHE__CODE:
        return getCode();
      case EgeoPackage.CACHE__NAME:
        return getName();
      case EgeoPackage.CACHE__DESCRIPTION:
        return getDescription();
      case EgeoPackage.CACHE__TIME:
        return getTime();
      case EgeoPackage.CACHE__CACHE_TYPE:
        return getCacheType();
      case EgeoPackage.CACHE__PLACED_BY:
        return getPlacedBy();
      case EgeoPackage.CACHE__OWNED_BY:
        if (resolve) return getOwnedBy();
        return basicGetOwnedBy();
      case EgeoPackage.CACHE__CONT:
        return getCont();
      case EgeoPackage.CACHE__ATTRIBUTES:
        return getAttributes();
      case EgeoPackage.CACHE__DIFFICULTY:
        return getDifficulty();
      case EgeoPackage.CACHE__TERRAIN:
        return getTerrain();
      case EgeoPackage.CACHE__COUNTRY:
        return getCountry();
      case EgeoPackage.CACHE__STATE:
        return getState();
      case EgeoPackage.CACHE__SHORT_DESCRIPTION:
        return getShortDescription();
      case EgeoPackage.CACHE__LONG_DESCRIPTION:
        return getLongDescription();
      case EgeoPackage.CACHE__COORDINATE:
        return getCoordinate();
      case EgeoPackage.CACHE__LOGS:
        return getLogs();
      case EgeoPackage.CACHE__HINT:
        return getHint();
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
      case EgeoPackage.CACHE__CODE:
        setCode((String)newValue);
        return;
      case EgeoPackage.CACHE__NAME:
        setName((String)newValue);
        return;
      case EgeoPackage.CACHE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case EgeoPackage.CACHE__TIME:
        setTime((String)newValue);
        return;
      case EgeoPackage.CACHE__CACHE_TYPE:
        setCacheType((CacheType)newValue);
        return;
      case EgeoPackage.CACHE__PLACED_BY:
        setPlacedBy((String)newValue);
        return;
      case EgeoPackage.CACHE__OWNED_BY:
        setOwnedBy((User)newValue);
        return;
      case EgeoPackage.CACHE__CONT:
        setCont((se.eskilson.egeo.Container)newValue);
        return;
      case EgeoPackage.CACHE__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case EgeoPackage.CACHE__DIFFICULTY:
        setDifficulty((Integer)newValue);
        return;
      case EgeoPackage.CACHE__TERRAIN:
        setTerrain((Integer)newValue);
        return;
      case EgeoPackage.CACHE__COUNTRY:
        setCountry((String)newValue);
        return;
      case EgeoPackage.CACHE__STATE:
        setState((String)newValue);
        return;
      case EgeoPackage.CACHE__SHORT_DESCRIPTION:
        setShortDescription((Description)newValue);
        return;
      case EgeoPackage.CACHE__LONG_DESCRIPTION:
        setLongDescription((Description)newValue);
        return;
      case EgeoPackage.CACHE__COORDINATE:
        setCoordinate((Coordinate)newValue);
        return;
      case EgeoPackage.CACHE__LOGS:
        getLogs().clear();
        getLogs().addAll((Collection<? extends Log>)newValue);
        return;
      case EgeoPackage.CACHE__HINT:
        setHint((String)newValue);
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
      case EgeoPackage.CACHE__CODE:
        setCode(CODE_EDEFAULT);
        return;
      case EgeoPackage.CACHE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EgeoPackage.CACHE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case EgeoPackage.CACHE__TIME:
        setTime(TIME_EDEFAULT);
        return;
      case EgeoPackage.CACHE__CACHE_TYPE:
        setCacheType(CACHE_TYPE_EDEFAULT);
        return;
      case EgeoPackage.CACHE__PLACED_BY:
        setPlacedBy(PLACED_BY_EDEFAULT);
        return;
      case EgeoPackage.CACHE__OWNED_BY:
        setOwnedBy((User)null);
        return;
      case EgeoPackage.CACHE__CONT:
        setCont(CONT_EDEFAULT);
        return;
      case EgeoPackage.CACHE__ATTRIBUTES:
        getAttributes().clear();
        return;
      case EgeoPackage.CACHE__DIFFICULTY:
        setDifficulty(DIFFICULTY_EDEFAULT);
        return;
      case EgeoPackage.CACHE__TERRAIN:
        setTerrain(TERRAIN_EDEFAULT);
        return;
      case EgeoPackage.CACHE__COUNTRY:
        setCountry(COUNTRY_EDEFAULT);
        return;
      case EgeoPackage.CACHE__STATE:
        setState(STATE_EDEFAULT);
        return;
      case EgeoPackage.CACHE__SHORT_DESCRIPTION:
        setShortDescription((Description)null);
        return;
      case EgeoPackage.CACHE__LONG_DESCRIPTION:
        setLongDescription((Description)null);
        return;
      case EgeoPackage.CACHE__COORDINATE:
        setCoordinate((Coordinate)null);
        return;
      case EgeoPackage.CACHE__LOGS:
        getLogs().clear();
        return;
      case EgeoPackage.CACHE__HINT:
        setHint(HINT_EDEFAULT);
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
      case EgeoPackage.CACHE__CODE:
        return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
      case EgeoPackage.CACHE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EgeoPackage.CACHE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case EgeoPackage.CACHE__TIME:
        return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
      case EgeoPackage.CACHE__CACHE_TYPE:
        return cacheType != CACHE_TYPE_EDEFAULT;
      case EgeoPackage.CACHE__PLACED_BY:
        return PLACED_BY_EDEFAULT == null ? placedBy != null : !PLACED_BY_EDEFAULT.equals(placedBy);
      case EgeoPackage.CACHE__OWNED_BY:
        return ownedBy != null;
      case EgeoPackage.CACHE__CONT:
        return cont != CONT_EDEFAULT;
      case EgeoPackage.CACHE__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case EgeoPackage.CACHE__DIFFICULTY:
        return difficulty != DIFFICULTY_EDEFAULT;
      case EgeoPackage.CACHE__TERRAIN:
        return terrain != TERRAIN_EDEFAULT;
      case EgeoPackage.CACHE__COUNTRY:
        return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
      case EgeoPackage.CACHE__STATE:
        return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
      case EgeoPackage.CACHE__SHORT_DESCRIPTION:
        return shortDescription != null;
      case EgeoPackage.CACHE__LONG_DESCRIPTION:
        return longDescription != null;
      case EgeoPackage.CACHE__COORDINATE:
        return coordinate != null;
      case EgeoPackage.CACHE__LOGS:
        return logs != null && !logs.isEmpty();
      case EgeoPackage.CACHE__HINT:
        return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
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
    result.append(" (code: ");
    result.append(code);
    result.append(", name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", time: ");
    result.append(time);
    result.append(", cacheType: ");
    result.append(cacheType);
    result.append(", placedBy: ");
    result.append(placedBy);
    result.append(", cont: ");
    result.append(cont);
    result.append(", difficulty: ");
    result.append(difficulty);
    result.append(", terrain: ");
    result.append(terrain);
    result.append(", country: ");
    result.append(country);
    result.append(", state: ");
    result.append(state);
    result.append(", hint: ");
    result.append(hint);
    result.append(')');
    return result.toString();
  }

} //CacheImpl
