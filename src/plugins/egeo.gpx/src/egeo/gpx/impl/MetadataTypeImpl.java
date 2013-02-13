/**
 */
package egeo.gpx.impl;

import egeo.gpx.BoundsType;
import egeo.gpx.CopyrightType;
import egeo.gpx.ExtensionsType;
import egeo.gpx.GpxPackage;
import egeo.gpx.LinkType;
import egeo.gpx.MetadataType;
import egeo.gpx.PersonType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.gpx.impl.MetadataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link egeo.gpx.impl.MetadataTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link egeo.gpx.impl.MetadataTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link egeo.gpx.impl.MetadataTypeImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link egeo.gpx.impl.MetadataTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link egeo.gpx.impl.MetadataTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link egeo.gpx.impl.MetadataTypeImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link egeo.gpx.impl.MetadataTypeImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link egeo.gpx.impl.MetadataTypeImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetadataTypeImpl extends MinimalEObjectImpl.Container implements MetadataType {
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
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected PersonType author;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected CopyrightType copyright;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkType> link;

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
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected ExtensionsType extensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpxPackage.Literals.METADATA_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.METADATA_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.METADATA_TYPE__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonType getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(PersonType newAuthor, NotificationChain msgs) {
		PersonType oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GpxPackage.METADATA_TYPE__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(PersonType newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GpxPackage.METADATA_TYPE__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GpxPackage.METADATA_TYPE__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.METADATA_TYPE__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyrightType getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(CopyrightType newCopyright, NotificationChain msgs) {
		CopyrightType oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GpxPackage.METADATA_TYPE__COPYRIGHT, oldCopyright, newCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(CopyrightType newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GpxPackage.METADATA_TYPE__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GpxPackage.METADATA_TYPE__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.METADATA_TYPE__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkType> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<LinkType>(LinkType.class, this, GpxPackage.METADATA_TYPE__LINK);
		}
		return link;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.METADATA_TYPE__TIME, oldTime, time));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.METADATA_TYPE__KEYWORDS, oldKeywords, keywords));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GpxPackage.METADATA_TYPE__BOUNDS, oldBounds, newBounds);
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
				msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GpxPackage.METADATA_TYPE__BOUNDS, null, msgs);
			if (newBounds != null)
				msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GpxPackage.METADATA_TYPE__BOUNDS, null, msgs);
			msgs = basicSetBounds(newBounds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.METADATA_TYPE__BOUNDS, newBounds, newBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsType getExtensions() {
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(ExtensionsType newExtensions, NotificationChain msgs) {
		ExtensionsType oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GpxPackage.METADATA_TYPE__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(ExtensionsType newExtensions) {
		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GpxPackage.METADATA_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GpxPackage.METADATA_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.METADATA_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GpxPackage.METADATA_TYPE__AUTHOR:
				return basicSetAuthor(null, msgs);
			case GpxPackage.METADATA_TYPE__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case GpxPackage.METADATA_TYPE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case GpxPackage.METADATA_TYPE__BOUNDS:
				return basicSetBounds(null, msgs);
			case GpxPackage.METADATA_TYPE__EXTENSIONS:
				return basicSetExtensions(null, msgs);
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
			case GpxPackage.METADATA_TYPE__NAME:
				return getName();
			case GpxPackage.METADATA_TYPE__DESC:
				return getDesc();
			case GpxPackage.METADATA_TYPE__AUTHOR:
				return getAuthor();
			case GpxPackage.METADATA_TYPE__COPYRIGHT:
				return getCopyright();
			case GpxPackage.METADATA_TYPE__LINK:
				return getLink();
			case GpxPackage.METADATA_TYPE__TIME:
				return getTime();
			case GpxPackage.METADATA_TYPE__KEYWORDS:
				return getKeywords();
			case GpxPackage.METADATA_TYPE__BOUNDS:
				return getBounds();
			case GpxPackage.METADATA_TYPE__EXTENSIONS:
				return getExtensions();
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
			case GpxPackage.METADATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case GpxPackage.METADATA_TYPE__DESC:
				setDesc((String)newValue);
				return;
			case GpxPackage.METADATA_TYPE__AUTHOR:
				setAuthor((PersonType)newValue);
				return;
			case GpxPackage.METADATA_TYPE__COPYRIGHT:
				setCopyright((CopyrightType)newValue);
				return;
			case GpxPackage.METADATA_TYPE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends LinkType>)newValue);
				return;
			case GpxPackage.METADATA_TYPE__TIME:
				setTime((XMLGregorianCalendar)newValue);
				return;
			case GpxPackage.METADATA_TYPE__KEYWORDS:
				setKeywords((String)newValue);
				return;
			case GpxPackage.METADATA_TYPE__BOUNDS:
				setBounds((BoundsType)newValue);
				return;
			case GpxPackage.METADATA_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
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
			case GpxPackage.METADATA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GpxPackage.METADATA_TYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case GpxPackage.METADATA_TYPE__AUTHOR:
				setAuthor((PersonType)null);
				return;
			case GpxPackage.METADATA_TYPE__COPYRIGHT:
				setCopyright((CopyrightType)null);
				return;
			case GpxPackage.METADATA_TYPE__LINK:
				getLink().clear();
				return;
			case GpxPackage.METADATA_TYPE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case GpxPackage.METADATA_TYPE__KEYWORDS:
				setKeywords(KEYWORDS_EDEFAULT);
				return;
			case GpxPackage.METADATA_TYPE__BOUNDS:
				setBounds((BoundsType)null);
				return;
			case GpxPackage.METADATA_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
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
			case GpxPackage.METADATA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GpxPackage.METADATA_TYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case GpxPackage.METADATA_TYPE__AUTHOR:
				return author != null;
			case GpxPackage.METADATA_TYPE__COPYRIGHT:
				return copyright != null;
			case GpxPackage.METADATA_TYPE__LINK:
				return link != null && !link.isEmpty();
			case GpxPackage.METADATA_TYPE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case GpxPackage.METADATA_TYPE__KEYWORDS:
				return KEYWORDS_EDEFAULT == null ? keywords != null : !KEYWORDS_EDEFAULT.equals(keywords);
			case GpxPackage.METADATA_TYPE__BOUNDS:
				return bounds != null;
			case GpxPackage.METADATA_TYPE__EXTENSIONS:
				return extensions != null;
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
		result.append(", time: ");
		result.append(time);
		result.append(", keywords: ");
		result.append(keywords);
		result.append(')');
		return result.toString();
	}

} //MetadataTypeImpl
