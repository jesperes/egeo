/**
 */
package egeo.gpx.groundspeak.impl;

import egeo.gpx.groundspeak.AttributesType;
import egeo.gpx.groundspeak.CacheType;
import egeo.gpx.groundspeak.GroundspeakPackage;
import egeo.gpx.groundspeak.LogsType;
import egeo.gpx.groundspeak.LongDescriptionType;
import egeo.gpx.groundspeak.OwnerType;
import egeo.gpx.groundspeak.ShortDescriptionType;
import egeo.gpx.groundspeak.TravelbugsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getPlacedBy <em>Placed By</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getTerrain <em>Terrain</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getState <em>State</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getEncodedHints <em>Encoded Hints</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getLogs <em>Logs</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getTravelbugs <em>Travelbugs</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getArchived <em>Archived</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getAvailable <em>Available</em>}</li>
 *   <li>{@link egeo.gpx.groundspeak.impl.CacheTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CacheTypeImpl extends MinimalEObjectImpl.Container implements CacheType {
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
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected EList<OwnerType> owner;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected String container = CONTAINER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributesType> attributes;

	/**
	 * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected static final String DIFFICULTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulty()
	 * @generated
	 * @ordered
	 */
	protected String difficulty = DIFFICULTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerrain() <em>Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerrain()
	 * @generated
	 * @ordered
	 */
	protected static final String TERRAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerrain() <em>Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerrain()
	 * @generated
	 * @ordered
	 */
	protected String terrain = TERRAIN_EDEFAULT;

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
	 * The cached value of the '{@link #getShortDescription() <em>Short Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<ShortDescriptionType> shortDescription;

	/**
	 * The cached value of the '{@link #getLongDescription() <em>Long Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<LongDescriptionType> longDescription;

	/**
	 * The default value of the '{@link #getEncodedHints() <em>Encoded Hints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodedHints()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODED_HINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncodedHints() <em>Encoded Hints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodedHints()
	 * @generated
	 * @ordered
	 */
	protected String encodedHints = ENCODED_HINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogs() <em>Logs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogs()
	 * @generated
	 * @ordered
	 */
	protected EList<LogsType> logs;

	/**
	 * The cached value of the '{@link #getTravelbugs() <em>Travelbugs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelbugs()
	 * @generated
	 * @ordered
	 */
	protected EList<TravelbugsType> travelbugs;

	/**
	 * The default value of the '{@link #getArchived() <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchived()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchived() <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchived()
	 * @generated
	 * @ordered
	 */
	protected String archived = ARCHIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailable()
	 * @generated
	 * @ordered
	 */
	protected String available = AVAILABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroundspeakPackage.Literals.CACHE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.CACHE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlacedBy() {
		return placedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacedBy(String newPlacedBy) {
		String oldPlacedBy = placedBy;
		placedBy = newPlacedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.CACHE_TYPE__PLACED_BY, oldPlacedBy, placedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwnerType> getOwner() {
		if (owner == null) {
			owner = new EObjectContainmentEList<OwnerType>(OwnerType.class, this, GroundspeakPackage.CACHE_TYPE__OWNER);
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.CACHE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(String newContainer) {
		String oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.CACHE_TYPE__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributesType> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributesType>(AttributesType.class, this, GroundspeakPackage.CACHE_TYPE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDifficulty() {
		return difficulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDifficulty(String newDifficulty) {
		String oldDifficulty = difficulty;
		difficulty = newDifficulty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.CACHE_TYPE__DIFFICULTY, oldDifficulty, difficulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerrain() {
		return terrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerrain(String newTerrain) {
		String oldTerrain = terrain;
		terrain = newTerrain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.CACHE_TYPE__TERRAIN, oldTerrain, terrain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.CACHE_TYPE__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.CACHE_TYPE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShortDescriptionType> getShortDescription() {
		if (shortDescription == null) {
			shortDescription = new EObjectContainmentEList<ShortDescriptionType>(ShortDescriptionType.class, this, GroundspeakPackage.CACHE_TYPE__SHORT_DESCRIPTION);
		}
		return shortDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LongDescriptionType> getLongDescription() {
		if (longDescription == null) {
			longDescription = new EObjectContainmentEList<LongDescriptionType>(LongDescriptionType.class, this, GroundspeakPackage.CACHE_TYPE__LONG_DESCRIPTION);
		}
		return longDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncodedHints() {
		return encodedHints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncodedHints(String newEncodedHints) {
		String oldEncodedHints = encodedHints;
		encodedHints = newEncodedHints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.CACHE_TYPE__ENCODED_HINTS, oldEncodedHints, encodedHints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogsType> getLogs() {
		if (logs == null) {
			logs = new EObjectContainmentEList<LogsType>(LogsType.class, this, GroundspeakPackage.CACHE_TYPE__LOGS);
		}
		return logs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TravelbugsType> getTravelbugs() {
		if (travelbugs == null) {
			travelbugs = new EObjectContainmentEList<TravelbugsType>(TravelbugsType.class, this, GroundspeakPackage.CACHE_TYPE__TRAVELBUGS);
		}
		return travelbugs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchived() {
		return archived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchived(String newArchived) {
		String oldArchived = archived;
		archived = newArchived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.CACHE_TYPE__ARCHIVED, oldArchived, archived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailable() {
		return available;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailable(String newAvailable) {
		String oldAvailable = available;
		available = newAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.CACHE_TYPE__AVAILABLE, oldAvailable, available));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroundspeakPackage.CACHE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GroundspeakPackage.CACHE_TYPE__OWNER:
				return ((InternalEList<?>)getOwner()).basicRemove(otherEnd, msgs);
			case GroundspeakPackage.CACHE_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case GroundspeakPackage.CACHE_TYPE__SHORT_DESCRIPTION:
				return ((InternalEList<?>)getShortDescription()).basicRemove(otherEnd, msgs);
			case GroundspeakPackage.CACHE_TYPE__LONG_DESCRIPTION:
				return ((InternalEList<?>)getLongDescription()).basicRemove(otherEnd, msgs);
			case GroundspeakPackage.CACHE_TYPE__LOGS:
				return ((InternalEList<?>)getLogs()).basicRemove(otherEnd, msgs);
			case GroundspeakPackage.CACHE_TYPE__TRAVELBUGS:
				return ((InternalEList<?>)getTravelbugs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroundspeakPackage.CACHE_TYPE__NAME:
				return getName();
			case GroundspeakPackage.CACHE_TYPE__PLACED_BY:
				return getPlacedBy();
			case GroundspeakPackage.CACHE_TYPE__OWNER:
				return getOwner();
			case GroundspeakPackage.CACHE_TYPE__TYPE:
				return getType();
			case GroundspeakPackage.CACHE_TYPE__CONTAINER:
				return getContainer();
			case GroundspeakPackage.CACHE_TYPE__ATTRIBUTES:
				return getAttributes();
			case GroundspeakPackage.CACHE_TYPE__DIFFICULTY:
				return getDifficulty();
			case GroundspeakPackage.CACHE_TYPE__TERRAIN:
				return getTerrain();
			case GroundspeakPackage.CACHE_TYPE__COUNTRY:
				return getCountry();
			case GroundspeakPackage.CACHE_TYPE__STATE:
				return getState();
			case GroundspeakPackage.CACHE_TYPE__SHORT_DESCRIPTION:
				return getShortDescription();
			case GroundspeakPackage.CACHE_TYPE__LONG_DESCRIPTION:
				return getLongDescription();
			case GroundspeakPackage.CACHE_TYPE__ENCODED_HINTS:
				return getEncodedHints();
			case GroundspeakPackage.CACHE_TYPE__LOGS:
				return getLogs();
			case GroundspeakPackage.CACHE_TYPE__TRAVELBUGS:
				return getTravelbugs();
			case GroundspeakPackage.CACHE_TYPE__ARCHIVED:
				return getArchived();
			case GroundspeakPackage.CACHE_TYPE__AVAILABLE:
				return getAvailable();
			case GroundspeakPackage.CACHE_TYPE__ID:
				return getId();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GroundspeakPackage.CACHE_TYPE__NAME:
				setName((String)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__PLACED_BY:
				setPlacedBy((String)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__OWNER:
				getOwner().clear();
				getOwner().addAll((Collection<? extends OwnerType>)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__TYPE:
				setType((String)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__CONTAINER:
				setContainer((String)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributesType>)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__DIFFICULTY:
				setDifficulty((String)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__TERRAIN:
				setTerrain((String)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__COUNTRY:
				setCountry((String)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__STATE:
				setState((String)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__SHORT_DESCRIPTION:
				getShortDescription().clear();
				getShortDescription().addAll((Collection<? extends ShortDescriptionType>)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__LONG_DESCRIPTION:
				getLongDescription().clear();
				getLongDescription().addAll((Collection<? extends LongDescriptionType>)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__ENCODED_HINTS:
				setEncodedHints((String)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__LOGS:
				getLogs().clear();
				getLogs().addAll((Collection<? extends LogsType>)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__TRAVELBUGS:
				getTravelbugs().clear();
				getTravelbugs().addAll((Collection<? extends TravelbugsType>)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__ARCHIVED:
				setArchived((String)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__AVAILABLE:
				setAvailable((String)newValue);
				return;
			case GroundspeakPackage.CACHE_TYPE__ID:
				setId((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GroundspeakPackage.CACHE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GroundspeakPackage.CACHE_TYPE__PLACED_BY:
				setPlacedBy(PLACED_BY_EDEFAULT);
				return;
			case GroundspeakPackage.CACHE_TYPE__OWNER:
				getOwner().clear();
				return;
			case GroundspeakPackage.CACHE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GroundspeakPackage.CACHE_TYPE__CONTAINER:
				setContainer(CONTAINER_EDEFAULT);
				return;
			case GroundspeakPackage.CACHE_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case GroundspeakPackage.CACHE_TYPE__DIFFICULTY:
				setDifficulty(DIFFICULTY_EDEFAULT);
				return;
			case GroundspeakPackage.CACHE_TYPE__TERRAIN:
				setTerrain(TERRAIN_EDEFAULT);
				return;
			case GroundspeakPackage.CACHE_TYPE__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case GroundspeakPackage.CACHE_TYPE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case GroundspeakPackage.CACHE_TYPE__SHORT_DESCRIPTION:
				getShortDescription().clear();
				return;
			case GroundspeakPackage.CACHE_TYPE__LONG_DESCRIPTION:
				getLongDescription().clear();
				return;
			case GroundspeakPackage.CACHE_TYPE__ENCODED_HINTS:
				setEncodedHints(ENCODED_HINTS_EDEFAULT);
				return;
			case GroundspeakPackage.CACHE_TYPE__LOGS:
				getLogs().clear();
				return;
			case GroundspeakPackage.CACHE_TYPE__TRAVELBUGS:
				getTravelbugs().clear();
				return;
			case GroundspeakPackage.CACHE_TYPE__ARCHIVED:
				setArchived(ARCHIVED_EDEFAULT);
				return;
			case GroundspeakPackage.CACHE_TYPE__AVAILABLE:
				setAvailable(AVAILABLE_EDEFAULT);
				return;
			case GroundspeakPackage.CACHE_TYPE__ID:
				setId(ID_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GroundspeakPackage.CACHE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GroundspeakPackage.CACHE_TYPE__PLACED_BY:
				return PLACED_BY_EDEFAULT == null ? placedBy != null : !PLACED_BY_EDEFAULT.equals(placedBy);
			case GroundspeakPackage.CACHE_TYPE__OWNER:
				return owner != null && !owner.isEmpty();
			case GroundspeakPackage.CACHE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case GroundspeakPackage.CACHE_TYPE__CONTAINER:
				return CONTAINER_EDEFAULT == null ? container != null : !CONTAINER_EDEFAULT.equals(container);
			case GroundspeakPackage.CACHE_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case GroundspeakPackage.CACHE_TYPE__DIFFICULTY:
				return DIFFICULTY_EDEFAULT == null ? difficulty != null : !DIFFICULTY_EDEFAULT.equals(difficulty);
			case GroundspeakPackage.CACHE_TYPE__TERRAIN:
				return TERRAIN_EDEFAULT == null ? terrain != null : !TERRAIN_EDEFAULT.equals(terrain);
			case GroundspeakPackage.CACHE_TYPE__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case GroundspeakPackage.CACHE_TYPE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case GroundspeakPackage.CACHE_TYPE__SHORT_DESCRIPTION:
				return shortDescription != null && !shortDescription.isEmpty();
			case GroundspeakPackage.CACHE_TYPE__LONG_DESCRIPTION:
				return longDescription != null && !longDescription.isEmpty();
			case GroundspeakPackage.CACHE_TYPE__ENCODED_HINTS:
				return ENCODED_HINTS_EDEFAULT == null ? encodedHints != null : !ENCODED_HINTS_EDEFAULT.equals(encodedHints);
			case GroundspeakPackage.CACHE_TYPE__LOGS:
				return logs != null && !logs.isEmpty();
			case GroundspeakPackage.CACHE_TYPE__TRAVELBUGS:
				return travelbugs != null && !travelbugs.isEmpty();
			case GroundspeakPackage.CACHE_TYPE__ARCHIVED:
				return ARCHIVED_EDEFAULT == null ? archived != null : !ARCHIVED_EDEFAULT.equals(archived);
			case GroundspeakPackage.CACHE_TYPE__AVAILABLE:
				return AVAILABLE_EDEFAULT == null ? available != null : !AVAILABLE_EDEFAULT.equals(available);
			case GroundspeakPackage.CACHE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", placedBy: ");
		result.append(placedBy);
		result.append(", type: ");
		result.append(type);
		result.append(", container: ");
		result.append(container);
		result.append(", difficulty: ");
		result.append(difficulty);
		result.append(", terrain: ");
		result.append(terrain);
		result.append(", country: ");
		result.append(country);
		result.append(", state: ");
		result.append(state);
		result.append(", encodedHints: ");
		result.append(encodedHints);
		result.append(", archived: ");
		result.append(archived);
		result.append(", available: ");
		result.append(available);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CacheTypeImpl
