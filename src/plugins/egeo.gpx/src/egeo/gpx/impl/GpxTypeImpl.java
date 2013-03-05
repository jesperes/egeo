/**
 */
package egeo.gpx.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import egeo.gpx.BoundsType;
import egeo.gpx.GpxPackage;
import egeo.gpx.GpxType;
import egeo.gpx.RteType;
import egeo.gpx.TrkType;
import egeo.gpx.WptType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getUrlname <em>Urlname</em>}</li>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getWpt <em>Wpt</em>}</li>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getRte <em>Rte</em>}</li>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getTrk <em>Trk</em>}</li>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link egeo.gpx.impl.GpxTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GpxTypeImpl extends MinimalEObjectImpl.Container implements GpxType {
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
	 * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected String desc = DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

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
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected String keywords = KEYWORDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected BoundsType bounds;

	/**
	 * The cached value of the '{@link #getWpt() <em>Wpt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWpt()
	 * @generated
	 * @ordered
	 */
	protected EList<WptType> wpt;

	/**
	 * The cached value of the '{@link #getRte() <em>Rte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRte()
	 * @generated
	 * @ordered
	 */
	protected EList<RteType> rte;

	/**
	 * The cached value of the '{@link #getTrk() <em>Trk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrk()
	 * @generated
	 * @ordered
	 */
	protected EList<TrkType> trk;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected String creator = CREATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GpxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpxPackage.Literals.GPX_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.GPX_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesc(String newDesc) {
		String oldDesc = desc;
		desc = newDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.GPX_TYPE__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.GPX_TYPE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.GPX_TYPE__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.GPX_TYPE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlname() {
		return urlname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlname(String newUrlname) {
		String oldUrlname = urlname;
		urlname = newUrlname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.GPX_TYPE__URLNAME, oldUrlname, urlname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(XMLGregorianCalendar newTime) {
		XMLGregorianCalendar oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.GPX_TYPE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeywords() {
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywords(String newKeywords) {
		String oldKeywords = keywords;
		keywords = newKeywords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.GPX_TYPE__KEYWORDS, oldKeywords, keywords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundsType getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBounds(BoundsType newBounds, NotificationChain msgs) {
		BoundsType oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GpxPackage.GPX_TYPE__BOUNDS, oldBounds, newBounds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounds(BoundsType newBounds) {
		if (newBounds != bounds) {
			NotificationChain msgs = null;
			if (bounds != null)
				msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GpxPackage.GPX_TYPE__BOUNDS, null, msgs);
			if (newBounds != null)
				msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GpxPackage.GPX_TYPE__BOUNDS, null, msgs);
			msgs = basicSetBounds(newBounds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.GPX_TYPE__BOUNDS, newBounds, newBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WptType> getWpt() {
		if (wpt == null) {
			wpt = new EObjectContainmentEList<WptType>(WptType.class, this, GpxPackage.GPX_TYPE__WPT);
		}
		return wpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteType> getRte() {
		if (rte == null) {
			rte = new EObjectContainmentEList<RteType>(RteType.class, this, GpxPackage.GPX_TYPE__RTE);
		}
		return rte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrkType> getTrk() {
		if (trk == null) {
			trk = new EObjectContainmentEList<TrkType>(TrkType.class, this, GpxPackage.GPX_TYPE__TRK);
		}
		return trk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, GpxPackage.GPX_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(String newCreator) {
		String oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.GPX_TYPE__CREATOR, oldCreator, creator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.GPX_TYPE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GpxPackage.GPX_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GpxPackage.GPX_TYPE__BOUNDS:
				return basicSetBounds(null, msgs);
			case GpxPackage.GPX_TYPE__WPT:
				return ((InternalEList<?>)getWpt()).basicRemove(otherEnd, msgs);
			case GpxPackage.GPX_TYPE__RTE:
				return ((InternalEList<?>)getRte()).basicRemove(otherEnd, msgs);
			case GpxPackage.GPX_TYPE__TRK:
				return ((InternalEList<?>)getTrk()).basicRemove(otherEnd, msgs);
			case GpxPackage.GPX_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case GpxPackage.GPX_TYPE__NAME:
				return getName();
			case GpxPackage.GPX_TYPE__DESC:
				return getDesc();
			case GpxPackage.GPX_TYPE__AUTHOR:
				return getAuthor();
			case GpxPackage.GPX_TYPE__EMAIL:
				return getEmail();
			case GpxPackage.GPX_TYPE__URL:
				return getUrl();
			case GpxPackage.GPX_TYPE__URLNAME:
				return getUrlname();
			case GpxPackage.GPX_TYPE__TIME:
				return getTime();
			case GpxPackage.GPX_TYPE__KEYWORDS:
				return getKeywords();
			case GpxPackage.GPX_TYPE__BOUNDS:
				return getBounds();
			case GpxPackage.GPX_TYPE__WPT:
				return getWpt();
			case GpxPackage.GPX_TYPE__RTE:
				return getRte();
			case GpxPackage.GPX_TYPE__TRK:
				return getTrk();
			case GpxPackage.GPX_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case GpxPackage.GPX_TYPE__CREATOR:
				return getCreator();
			case GpxPackage.GPX_TYPE__VERSION:
				return getVersion();
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
			case GpxPackage.GPX_TYPE__NAME:
				setName((String)newValue);
				return;
			case GpxPackage.GPX_TYPE__DESC:
				setDesc((String)newValue);
				return;
			case GpxPackage.GPX_TYPE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case GpxPackage.GPX_TYPE__EMAIL:
				setEmail((String)newValue);
				return;
			case GpxPackage.GPX_TYPE__URL:
				setUrl((String)newValue);
				return;
			case GpxPackage.GPX_TYPE__URLNAME:
				setUrlname((String)newValue);
				return;
			case GpxPackage.GPX_TYPE__TIME:
				setTime((XMLGregorianCalendar)newValue);
				return;
			case GpxPackage.GPX_TYPE__KEYWORDS:
				setKeywords((String)newValue);
				return;
			case GpxPackage.GPX_TYPE__BOUNDS:
				setBounds((BoundsType)newValue);
				return;
			case GpxPackage.GPX_TYPE__WPT:
				getWpt().clear();
				getWpt().addAll((Collection<? extends WptType>)newValue);
				return;
			case GpxPackage.GPX_TYPE__RTE:
				getRte().clear();
				getRte().addAll((Collection<? extends RteType>)newValue);
				return;
			case GpxPackage.GPX_TYPE__TRK:
				getTrk().clear();
				getTrk().addAll((Collection<? extends TrkType>)newValue);
				return;
			case GpxPackage.GPX_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case GpxPackage.GPX_TYPE__CREATOR:
				setCreator((String)newValue);
				return;
			case GpxPackage.GPX_TYPE__VERSION:
				setVersion((String)newValue);
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
			case GpxPackage.GPX_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GpxPackage.GPX_TYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case GpxPackage.GPX_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case GpxPackage.GPX_TYPE__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case GpxPackage.GPX_TYPE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case GpxPackage.GPX_TYPE__URLNAME:
				setUrlname(URLNAME_EDEFAULT);
				return;
			case GpxPackage.GPX_TYPE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case GpxPackage.GPX_TYPE__KEYWORDS:
				setKeywords(KEYWORDS_EDEFAULT);
				return;
			case GpxPackage.GPX_TYPE__BOUNDS:
				setBounds((BoundsType)null);
				return;
			case GpxPackage.GPX_TYPE__WPT:
				getWpt().clear();
				return;
			case GpxPackage.GPX_TYPE__RTE:
				getRte().clear();
				return;
			case GpxPackage.GPX_TYPE__TRK:
				getTrk().clear();
				return;
			case GpxPackage.GPX_TYPE__ANY:
				getAny().clear();
				return;
			case GpxPackage.GPX_TYPE__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case GpxPackage.GPX_TYPE__VERSION:
				unsetVersion();
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
			case GpxPackage.GPX_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GpxPackage.GPX_TYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case GpxPackage.GPX_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case GpxPackage.GPX_TYPE__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case GpxPackage.GPX_TYPE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case GpxPackage.GPX_TYPE__URLNAME:
				return URLNAME_EDEFAULT == null ? urlname != null : !URLNAME_EDEFAULT.equals(urlname);
			case GpxPackage.GPX_TYPE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case GpxPackage.GPX_TYPE__KEYWORDS:
				return KEYWORDS_EDEFAULT == null ? keywords != null : !KEYWORDS_EDEFAULT.equals(keywords);
			case GpxPackage.GPX_TYPE__BOUNDS:
				return bounds != null;
			case GpxPackage.GPX_TYPE__WPT:
				return wpt != null && !wpt.isEmpty();
			case GpxPackage.GPX_TYPE__RTE:
				return rte != null && !rte.isEmpty();
			case GpxPackage.GPX_TYPE__TRK:
				return trk != null && !trk.isEmpty();
			case GpxPackage.GPX_TYPE__ANY:
				return any != null && !any.isEmpty();
			case GpxPackage.GPX_TYPE__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case GpxPackage.GPX_TYPE__VERSION:
				return isSetVersion();
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
		result.append(", desc: ");
		result.append(desc);
		result.append(", author: ");
		result.append(author);
		result.append(", email: ");
		result.append(email);
		result.append(", url: ");
		result.append(url);
		result.append(", urlname: ");
		result.append(urlname);
		result.append(", time: ");
		result.append(time);
		result.append(", keywords: ");
		result.append(keywords);
		result.append(", any: ");
		result.append(any);
		result.append(", creator: ");
		result.append(creator);
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GpxTypeImpl
