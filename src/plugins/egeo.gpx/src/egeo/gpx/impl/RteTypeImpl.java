/**
 */
package egeo.gpx.impl;

import egeo.gpx.ExtensionsType;
import egeo.gpx.GpxPackage;
import egeo.gpx.LinkType;
import egeo.gpx.RteType;
import egeo.gpx.WptType;

import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>Rte Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.gpx.impl.RteTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link egeo.gpx.impl.RteTypeImpl#getCmt <em>Cmt</em>}</li>
 *   <li>{@link egeo.gpx.impl.RteTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link egeo.gpx.impl.RteTypeImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link egeo.gpx.impl.RteTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link egeo.gpx.impl.RteTypeImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link egeo.gpx.impl.RteTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link egeo.gpx.impl.RteTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link egeo.gpx.impl.RteTypeImpl#getRtept <em>Rtept</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RteTypeImpl extends MinimalEObjectImpl.Container implements RteType {
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
	 * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected String src = SRC_EDEFAULT;

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
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger number = NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected ExtensionsType extensions;

	/**
	 * The cached value of the '{@link #getRtept() <em>Rtept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtept()
	 * @generated
	 * @ordered
	 */
	protected EList<WptType> rtept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpxPackage.Literals.RTE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.RTE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCmt() {
		return cmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmt(String newCmt) {
		String oldCmt = cmt;
		cmt = newCmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.RTE_TYPE__CMT, oldCmt, cmt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.RTE_TYPE__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(String newSrc) {
		String oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.RTE_TYPE__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkType> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<LinkType>(LinkType.class, this, GpxPackage.RTE_TYPE__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(BigInteger newNumber) {
		BigInteger oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.RTE_TYPE__NUMBER, oldNumber, number));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.RTE_TYPE__TYPE, oldType, type));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GpxPackage.RTE_TYPE__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GpxPackage.RTE_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GpxPackage.RTE_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.RTE_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WptType> getRtept() {
		if (rtept == null) {
			rtept = new EObjectContainmentEList<WptType>(WptType.class, this, GpxPackage.RTE_TYPE__RTEPT);
		}
		return rtept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GpxPackage.RTE_TYPE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case GpxPackage.RTE_TYPE__EXTENSIONS:
				return basicSetExtensions(null, msgs);
			case GpxPackage.RTE_TYPE__RTEPT:
				return ((InternalEList<?>)getRtept()).basicRemove(otherEnd, msgs);
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
			case GpxPackage.RTE_TYPE__NAME:
				return getName();
			case GpxPackage.RTE_TYPE__CMT:
				return getCmt();
			case GpxPackage.RTE_TYPE__DESC:
				return getDesc();
			case GpxPackage.RTE_TYPE__SRC:
				return getSrc();
			case GpxPackage.RTE_TYPE__LINK:
				return getLink();
			case GpxPackage.RTE_TYPE__NUMBER:
				return getNumber();
			case GpxPackage.RTE_TYPE__TYPE:
				return getType();
			case GpxPackage.RTE_TYPE__EXTENSIONS:
				return getExtensions();
			case GpxPackage.RTE_TYPE__RTEPT:
				return getRtept();
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
			case GpxPackage.RTE_TYPE__NAME:
				setName((String)newValue);
				return;
			case GpxPackage.RTE_TYPE__CMT:
				setCmt((String)newValue);
				return;
			case GpxPackage.RTE_TYPE__DESC:
				setDesc((String)newValue);
				return;
			case GpxPackage.RTE_TYPE__SRC:
				setSrc((String)newValue);
				return;
			case GpxPackage.RTE_TYPE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends LinkType>)newValue);
				return;
			case GpxPackage.RTE_TYPE__NUMBER:
				setNumber((BigInteger)newValue);
				return;
			case GpxPackage.RTE_TYPE__TYPE:
				setType((String)newValue);
				return;
			case GpxPackage.RTE_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case GpxPackage.RTE_TYPE__RTEPT:
				getRtept().clear();
				getRtept().addAll((Collection<? extends WptType>)newValue);
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
			case GpxPackage.RTE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GpxPackage.RTE_TYPE__CMT:
				setCmt(CMT_EDEFAULT);
				return;
			case GpxPackage.RTE_TYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case GpxPackage.RTE_TYPE__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case GpxPackage.RTE_TYPE__LINK:
				getLink().clear();
				return;
			case GpxPackage.RTE_TYPE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case GpxPackage.RTE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GpxPackage.RTE_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case GpxPackage.RTE_TYPE__RTEPT:
				getRtept().clear();
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
			case GpxPackage.RTE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GpxPackage.RTE_TYPE__CMT:
				return CMT_EDEFAULT == null ? cmt != null : !CMT_EDEFAULT.equals(cmt);
			case GpxPackage.RTE_TYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case GpxPackage.RTE_TYPE__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
			case GpxPackage.RTE_TYPE__LINK:
				return link != null && !link.isEmpty();
			case GpxPackage.RTE_TYPE__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case GpxPackage.RTE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case GpxPackage.RTE_TYPE__EXTENSIONS:
				return extensions != null;
			case GpxPackage.RTE_TYPE__RTEPT:
				return rtept != null && !rtept.isEmpty();
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
		result.append(", cmt: ");
		result.append(cmt);
		result.append(", desc: ");
		result.append(desc);
		result.append(", src: ");
		result.append(src);
		result.append(", number: ");
		result.append(number);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RteTypeImpl
