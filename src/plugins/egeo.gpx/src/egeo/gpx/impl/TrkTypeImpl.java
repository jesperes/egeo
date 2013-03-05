/**
 */
package egeo.gpx.impl;

import java.math.BigInteger;
import java.util.Collection;

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

import egeo.gpx.GpxPackage;
import egeo.gpx.TrkType;
import egeo.gpx.TrksegType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trk Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.gpx.impl.TrkTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link egeo.gpx.impl.TrkTypeImpl#getCmt <em>Cmt</em>}</li>
 *   <li>{@link egeo.gpx.impl.TrkTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link egeo.gpx.impl.TrkTypeImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link egeo.gpx.impl.TrkTypeImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link egeo.gpx.impl.TrkTypeImpl#getUrlname <em>Urlname</em>}</li>
 *   <li>{@link egeo.gpx.impl.TrkTypeImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link egeo.gpx.impl.TrkTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link egeo.gpx.impl.TrkTypeImpl#getTrkseg <em>Trkseg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrkTypeImpl extends MinimalEObjectImpl.Container implements TrkType {
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
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The cached value of the '{@link #getTrkseg() <em>Trkseg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrkseg()
	 * @generated
	 * @ordered
	 */
	protected EList<TrksegType> trkseg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpxPackage.Literals.TRK_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.TRK_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.TRK_TYPE__CMT, oldCmt, cmt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.TRK_TYPE__DESC, oldDesc, desc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.TRK_TYPE__SRC, oldSrc, src));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.TRK_TYPE__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.TRK_TYPE__URLNAME, oldUrlname, urlname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.TRK_TYPE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, GpxPackage.TRK_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrksegType> getTrkseg() {
		if (trkseg == null) {
			trkseg = new EObjectContainmentEList<TrksegType>(TrksegType.class, this, GpxPackage.TRK_TYPE__TRKSEG);
		}
		return trkseg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GpxPackage.TRK_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case GpxPackage.TRK_TYPE__TRKSEG:
				return ((InternalEList<?>)getTrkseg()).basicRemove(otherEnd, msgs);
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
			case GpxPackage.TRK_TYPE__NAME:
				return getName();
			case GpxPackage.TRK_TYPE__CMT:
				return getCmt();
			case GpxPackage.TRK_TYPE__DESC:
				return getDesc();
			case GpxPackage.TRK_TYPE__SRC:
				return getSrc();
			case GpxPackage.TRK_TYPE__URL:
				return getUrl();
			case GpxPackage.TRK_TYPE__URLNAME:
				return getUrlname();
			case GpxPackage.TRK_TYPE__NUMBER:
				return getNumber();
			case GpxPackage.TRK_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case GpxPackage.TRK_TYPE__TRKSEG:
				return getTrkseg();
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
			case GpxPackage.TRK_TYPE__NAME:
				setName((String)newValue);
				return;
			case GpxPackage.TRK_TYPE__CMT:
				setCmt((String)newValue);
				return;
			case GpxPackage.TRK_TYPE__DESC:
				setDesc((String)newValue);
				return;
			case GpxPackage.TRK_TYPE__SRC:
				setSrc((String)newValue);
				return;
			case GpxPackage.TRK_TYPE__URL:
				setUrl((String)newValue);
				return;
			case GpxPackage.TRK_TYPE__URLNAME:
				setUrlname((String)newValue);
				return;
			case GpxPackage.TRK_TYPE__NUMBER:
				setNumber((BigInteger)newValue);
				return;
			case GpxPackage.TRK_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case GpxPackage.TRK_TYPE__TRKSEG:
				getTrkseg().clear();
				getTrkseg().addAll((Collection<? extends TrksegType>)newValue);
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
			case GpxPackage.TRK_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GpxPackage.TRK_TYPE__CMT:
				setCmt(CMT_EDEFAULT);
				return;
			case GpxPackage.TRK_TYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case GpxPackage.TRK_TYPE__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case GpxPackage.TRK_TYPE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case GpxPackage.TRK_TYPE__URLNAME:
				setUrlname(URLNAME_EDEFAULT);
				return;
			case GpxPackage.TRK_TYPE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case GpxPackage.TRK_TYPE__ANY:
				getAny().clear();
				return;
			case GpxPackage.TRK_TYPE__TRKSEG:
				getTrkseg().clear();
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
			case GpxPackage.TRK_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GpxPackage.TRK_TYPE__CMT:
				return CMT_EDEFAULT == null ? cmt != null : !CMT_EDEFAULT.equals(cmt);
			case GpxPackage.TRK_TYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case GpxPackage.TRK_TYPE__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
			case GpxPackage.TRK_TYPE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case GpxPackage.TRK_TYPE__URLNAME:
				return URLNAME_EDEFAULT == null ? urlname != null : !URLNAME_EDEFAULT.equals(urlname);
			case GpxPackage.TRK_TYPE__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case GpxPackage.TRK_TYPE__ANY:
				return any != null && !any.isEmpty();
			case GpxPackage.TRK_TYPE__TRKSEG:
				return trkseg != null && !trkseg.isEmpty();
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
		result.append(", url: ");
		result.append(url);
		result.append(", urlname: ");
		result.append(urlname);
		result.append(", number: ");
		result.append(number);
		result.append(", any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //TrkTypeImpl
