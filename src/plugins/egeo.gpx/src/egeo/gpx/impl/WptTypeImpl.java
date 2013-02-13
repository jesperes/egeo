/**
 */
package egeo.gpx.impl;

import egeo.gpx.ExtensionsType;
import egeo.gpx.FixType;
import egeo.gpx.GpxPackage;
import egeo.gpx.LinkType;
import egeo.gpx.WptType;

import java.math.BigDecimal;
import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>Wpt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getEle <em>Ele</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getMagvar <em>Magvar</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getGeoidheight <em>Geoidheight</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getCmt <em>Cmt</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getSym <em>Sym</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getFix <em>Fix</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getSat <em>Sat</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getHdop <em>Hdop</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getVdop <em>Vdop</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getPdop <em>Pdop</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getAgeofdgpsdata <em>Ageofdgpsdata</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getDgpsid <em>Dgpsid</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link egeo.gpx.impl.WptTypeImpl#getLon <em>Lon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WptTypeImpl extends MinimalEObjectImpl.Container implements WptType {
	/**
	 * The default value of the '{@link #getEle() <em>Ele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEle()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ELE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEle() <em>Ele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEle()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal ele = ELE_EDEFAULT;

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
	 * The default value of the '{@link #getMagvar() <em>Magvar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagvar()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MAGVAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMagvar() <em>Magvar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagvar()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal magvar = MAGVAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeoidheight() <em>Geoidheight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoidheight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal GEOIDHEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeoidheight() <em>Geoidheight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoidheight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal geoidheight = GEOIDHEIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getFix() <em>Fix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFix()
	 * @generated
	 * @ordered
	 */
	protected static final FixType FIX_EDEFAULT = FixType.NONE;

	/**
	 * The cached value of the '{@link #getFix() <em>Fix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFix()
	 * @generated
	 * @ordered
	 */
	protected FixType fix = FIX_EDEFAULT;

	/**
	 * This is true if the Fix attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fixESet;

	/**
	 * The default value of the '{@link #getSat() <em>Sat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSat()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSat() <em>Sat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSat()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sat = SAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdop() <em>Hdop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdop()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal HDOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdop() <em>Hdop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdop()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal hdop = HDOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVdop() <em>Vdop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVdop()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VDOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVdop() <em>Vdop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVdop()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal vdop = VDOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPdop() <em>Pdop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPdop()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PDOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPdop() <em>Pdop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPdop()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal pdop = PDOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgeofdgpsdata() <em>Ageofdgpsdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeofdgpsdata()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AGEOFDGPSDATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgeofdgpsdata() <em>Ageofdgpsdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeofdgpsdata()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal ageofdgpsdata = AGEOFDGPSDATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDgpsid() <em>Dgpsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDgpsid()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DGPSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDgpsid() <em>Dgpsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDgpsid()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dgpsid = DGPSID_EDEFAULT;

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
	 * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal lat = LAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal lon = LON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WptTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpxPackage.Literals.WPT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getEle() {
		return ele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEle(BigDecimal newEle) {
		BigDecimal oldEle = ele;
		ele = newEle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__ELE, oldEle, ele));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getMagvar() {
		return magvar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMagvar(BigDecimal newMagvar) {
		BigDecimal oldMagvar = magvar;
		magvar = newMagvar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__MAGVAR, oldMagvar, magvar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getGeoidheight() {
		return geoidheight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeoidheight(BigDecimal newGeoidheight) {
		BigDecimal oldGeoidheight = geoidheight;
		geoidheight = newGeoidheight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__GEOIDHEIGHT, oldGeoidheight, geoidheight));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__CMT, oldCmt, cmt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__DESC, oldDesc, desc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkType> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<LinkType>(LinkType.class, this, GpxPackage.WPT_TYPE__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSym() {
		return sym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSym(String newSym) {
		String oldSym = sym;
		sym = newSym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__SYM, oldSym, sym));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixType getFix() {
		return fix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFix(FixType newFix) {
		FixType oldFix = fix;
		fix = newFix == null ? FIX_EDEFAULT : newFix;
		boolean oldFixESet = fixESet;
		fixESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__FIX, oldFix, fix, !oldFixESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFix() {
		FixType oldFix = fix;
		boolean oldFixESet = fixESet;
		fix = FIX_EDEFAULT;
		fixESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GpxPackage.WPT_TYPE__FIX, oldFix, FIX_EDEFAULT, oldFixESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFix() {
		return fixESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSat() {
		return sat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSat(BigInteger newSat) {
		BigInteger oldSat = sat;
		sat = newSat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__SAT, oldSat, sat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getHdop() {
		return hdop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdop(BigDecimal newHdop) {
		BigDecimal oldHdop = hdop;
		hdop = newHdop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__HDOP, oldHdop, hdop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getVdop() {
		return vdop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVdop(BigDecimal newVdop) {
		BigDecimal oldVdop = vdop;
		vdop = newVdop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__VDOP, oldVdop, vdop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getPdop() {
		return pdop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPdop(BigDecimal newPdop) {
		BigDecimal oldPdop = pdop;
		pdop = newPdop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__PDOP, oldPdop, pdop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getAgeofdgpsdata() {
		return ageofdgpsdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgeofdgpsdata(BigDecimal newAgeofdgpsdata) {
		BigDecimal oldAgeofdgpsdata = ageofdgpsdata;
		ageofdgpsdata = newAgeofdgpsdata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__AGEOFDGPSDATA, oldAgeofdgpsdata, ageofdgpsdata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDgpsid() {
		return dgpsid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDgpsid(BigInteger newDgpsid) {
		BigInteger oldDgpsid = dgpsid;
		dgpsid = newDgpsid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__DGPSID, oldDgpsid, dgpsid));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GpxPackage.WPT_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GpxPackage.WPT_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getLat() {
		return lat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLat(BigDecimal newLat) {
		BigDecimal oldLat = lat;
		lat = newLat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__LAT, oldLat, lat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getLon() {
		return lon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLon(BigDecimal newLon) {
		BigDecimal oldLon = lon;
		lon = newLon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpxPackage.WPT_TYPE__LON, oldLon, lon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GpxPackage.WPT_TYPE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case GpxPackage.WPT_TYPE__EXTENSIONS:
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
			case GpxPackage.WPT_TYPE__ELE:
				return getEle();
			case GpxPackage.WPT_TYPE__TIME:
				return getTime();
			case GpxPackage.WPT_TYPE__MAGVAR:
				return getMagvar();
			case GpxPackage.WPT_TYPE__GEOIDHEIGHT:
				return getGeoidheight();
			case GpxPackage.WPT_TYPE__NAME:
				return getName();
			case GpxPackage.WPT_TYPE__CMT:
				return getCmt();
			case GpxPackage.WPT_TYPE__DESC:
				return getDesc();
			case GpxPackage.WPT_TYPE__SRC:
				return getSrc();
			case GpxPackage.WPT_TYPE__LINK:
				return getLink();
			case GpxPackage.WPT_TYPE__SYM:
				return getSym();
			case GpxPackage.WPT_TYPE__TYPE:
				return getType();
			case GpxPackage.WPT_TYPE__FIX:
				return getFix();
			case GpxPackage.WPT_TYPE__SAT:
				return getSat();
			case GpxPackage.WPT_TYPE__HDOP:
				return getHdop();
			case GpxPackage.WPT_TYPE__VDOP:
				return getVdop();
			case GpxPackage.WPT_TYPE__PDOP:
				return getPdop();
			case GpxPackage.WPT_TYPE__AGEOFDGPSDATA:
				return getAgeofdgpsdata();
			case GpxPackage.WPT_TYPE__DGPSID:
				return getDgpsid();
			case GpxPackage.WPT_TYPE__EXTENSIONS:
				return getExtensions();
			case GpxPackage.WPT_TYPE__LAT:
				return getLat();
			case GpxPackage.WPT_TYPE__LON:
				return getLon();
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
			case GpxPackage.WPT_TYPE__ELE:
				setEle((BigDecimal)newValue);
				return;
			case GpxPackage.WPT_TYPE__TIME:
				setTime((XMLGregorianCalendar)newValue);
				return;
			case GpxPackage.WPT_TYPE__MAGVAR:
				setMagvar((BigDecimal)newValue);
				return;
			case GpxPackage.WPT_TYPE__GEOIDHEIGHT:
				setGeoidheight((BigDecimal)newValue);
				return;
			case GpxPackage.WPT_TYPE__NAME:
				setName((String)newValue);
				return;
			case GpxPackage.WPT_TYPE__CMT:
				setCmt((String)newValue);
				return;
			case GpxPackage.WPT_TYPE__DESC:
				setDesc((String)newValue);
				return;
			case GpxPackage.WPT_TYPE__SRC:
				setSrc((String)newValue);
				return;
			case GpxPackage.WPT_TYPE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends LinkType>)newValue);
				return;
			case GpxPackage.WPT_TYPE__SYM:
				setSym((String)newValue);
				return;
			case GpxPackage.WPT_TYPE__TYPE:
				setType((String)newValue);
				return;
			case GpxPackage.WPT_TYPE__FIX:
				setFix((FixType)newValue);
				return;
			case GpxPackage.WPT_TYPE__SAT:
				setSat((BigInteger)newValue);
				return;
			case GpxPackage.WPT_TYPE__HDOP:
				setHdop((BigDecimal)newValue);
				return;
			case GpxPackage.WPT_TYPE__VDOP:
				setVdop((BigDecimal)newValue);
				return;
			case GpxPackage.WPT_TYPE__PDOP:
				setPdop((BigDecimal)newValue);
				return;
			case GpxPackage.WPT_TYPE__AGEOFDGPSDATA:
				setAgeofdgpsdata((BigDecimal)newValue);
				return;
			case GpxPackage.WPT_TYPE__DGPSID:
				setDgpsid((BigInteger)newValue);
				return;
			case GpxPackage.WPT_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case GpxPackage.WPT_TYPE__LAT:
				setLat((BigDecimal)newValue);
				return;
			case GpxPackage.WPT_TYPE__LON:
				setLon((BigDecimal)newValue);
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
			case GpxPackage.WPT_TYPE__ELE:
				setEle(ELE_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__MAGVAR:
				setMagvar(MAGVAR_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__GEOIDHEIGHT:
				setGeoidheight(GEOIDHEIGHT_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__CMT:
				setCmt(CMT_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__LINK:
				getLink().clear();
				return;
			case GpxPackage.WPT_TYPE__SYM:
				setSym(SYM_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__FIX:
				unsetFix();
				return;
			case GpxPackage.WPT_TYPE__SAT:
				setSat(SAT_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__HDOP:
				setHdop(HDOP_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__VDOP:
				setVdop(VDOP_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__PDOP:
				setPdop(PDOP_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__AGEOFDGPSDATA:
				setAgeofdgpsdata(AGEOFDGPSDATA_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__DGPSID:
				setDgpsid(DGPSID_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case GpxPackage.WPT_TYPE__LAT:
				setLat(LAT_EDEFAULT);
				return;
			case GpxPackage.WPT_TYPE__LON:
				setLon(LON_EDEFAULT);
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
			case GpxPackage.WPT_TYPE__ELE:
				return ELE_EDEFAULT == null ? ele != null : !ELE_EDEFAULT.equals(ele);
			case GpxPackage.WPT_TYPE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case GpxPackage.WPT_TYPE__MAGVAR:
				return MAGVAR_EDEFAULT == null ? magvar != null : !MAGVAR_EDEFAULT.equals(magvar);
			case GpxPackage.WPT_TYPE__GEOIDHEIGHT:
				return GEOIDHEIGHT_EDEFAULT == null ? geoidheight != null : !GEOIDHEIGHT_EDEFAULT.equals(geoidheight);
			case GpxPackage.WPT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GpxPackage.WPT_TYPE__CMT:
				return CMT_EDEFAULT == null ? cmt != null : !CMT_EDEFAULT.equals(cmt);
			case GpxPackage.WPT_TYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case GpxPackage.WPT_TYPE__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
			case GpxPackage.WPT_TYPE__LINK:
				return link != null && !link.isEmpty();
			case GpxPackage.WPT_TYPE__SYM:
				return SYM_EDEFAULT == null ? sym != null : !SYM_EDEFAULT.equals(sym);
			case GpxPackage.WPT_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case GpxPackage.WPT_TYPE__FIX:
				return isSetFix();
			case GpxPackage.WPT_TYPE__SAT:
				return SAT_EDEFAULT == null ? sat != null : !SAT_EDEFAULT.equals(sat);
			case GpxPackage.WPT_TYPE__HDOP:
				return HDOP_EDEFAULT == null ? hdop != null : !HDOP_EDEFAULT.equals(hdop);
			case GpxPackage.WPT_TYPE__VDOP:
				return VDOP_EDEFAULT == null ? vdop != null : !VDOP_EDEFAULT.equals(vdop);
			case GpxPackage.WPT_TYPE__PDOP:
				return PDOP_EDEFAULT == null ? pdop != null : !PDOP_EDEFAULT.equals(pdop);
			case GpxPackage.WPT_TYPE__AGEOFDGPSDATA:
				return AGEOFDGPSDATA_EDEFAULT == null ? ageofdgpsdata != null : !AGEOFDGPSDATA_EDEFAULT.equals(ageofdgpsdata);
			case GpxPackage.WPT_TYPE__DGPSID:
				return DGPSID_EDEFAULT == null ? dgpsid != null : !DGPSID_EDEFAULT.equals(dgpsid);
			case GpxPackage.WPT_TYPE__EXTENSIONS:
				return extensions != null;
			case GpxPackage.WPT_TYPE__LAT:
				return LAT_EDEFAULT == null ? lat != null : !LAT_EDEFAULT.equals(lat);
			case GpxPackage.WPT_TYPE__LON:
				return LON_EDEFAULT == null ? lon != null : !LON_EDEFAULT.equals(lon);
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
		result.append(" (ele: ");
		result.append(ele);
		result.append(", time: ");
		result.append(time);
		result.append(", magvar: ");
		result.append(magvar);
		result.append(", geoidheight: ");
		result.append(geoidheight);
		result.append(", name: ");
		result.append(name);
		result.append(", cmt: ");
		result.append(cmt);
		result.append(", desc: ");
		result.append(desc);
		result.append(", src: ");
		result.append(src);
		result.append(", sym: ");
		result.append(sym);
		result.append(", type: ");
		result.append(type);
		result.append(", fix: ");
		if (fixESet) result.append(fix); else result.append("<unset>");
		result.append(", sat: ");
		result.append(sat);
		result.append(", hdop: ");
		result.append(hdop);
		result.append(", vdop: ");
		result.append(vdop);
		result.append(", pdop: ");
		result.append(pdop);
		result.append(", ageofdgpsdata: ");
		result.append(ageofdgpsdata);
		result.append(", dgpsid: ");
		result.append(dgpsid);
		result.append(", lat: ");
		result.append(lat);
		result.append(", lon: ");
		result.append(lon);
		result.append(')');
		return result.toString();
	}

} //WptTypeImpl
