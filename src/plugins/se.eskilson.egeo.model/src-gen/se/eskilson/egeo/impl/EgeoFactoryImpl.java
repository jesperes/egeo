/**
 */
package se.eskilson.egeo.impl;

import com.google.common.base.Objects;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.xbase.lib.Exceptions;

import se.eskilson.egeo.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EgeoFactoryImpl extends EFactoryImpl implements EgeoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EgeoFactory init() {
		try {
			EgeoFactory theEgeoFactory = (EgeoFactory) EPackage.Registry.INSTANCE
					.getEFactory("se.eskilson.egeo");
			if (theEgeoFactory != null) {
				return theEgeoFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EgeoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EgeoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EgeoPackage.CACHE_DB:
			return createCacheDB();
		case EgeoPackage.ATTRIBUTE:
			return createAttribute();
		case EgeoPackage.DESCRIPTION:
			return createDescription();
		case EgeoPackage.COORDINATE:
			return createCoordinate();
		case EgeoPackage.USER:
			return createUser();
		case EgeoPackage.CACHE:
			return createCache();
		case EgeoPackage.LOG:
			return createLog();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case EgeoPackage.CONTAINER:
			return createContainerFromString(eDataType, initialValue);
		case EgeoPackage.CACHE_TYPE:
			return createCacheTypeFromString(eDataType, initialValue);
		case EgeoPackage.LOG_TYPE:
			return createLogTypeFromString(eDataType, initialValue);
		case EgeoPackage.DATE:
			return createDateFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case EgeoPackage.CONTAINER:
			return convertContainerToString(eDataType, instanceValue);
		case EgeoPackage.CACHE_TYPE:
			return convertCacheTypeToString(eDataType, instanceValue);
		case EgeoPackage.LOG_TYPE:
			return convertLogTypeToString(eDataType, instanceValue);
		case EgeoPackage.DATE:
			return convertDateToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CacheDB createCacheDB() {
		CacheDBImpl cacheDB = new CacheDBImpl();
		return cacheDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coordinate createCoordinate() {
		CoordinateImpl coordinate = new CoordinateImpl();
		return coordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cache createCache() {
		CacheImpl cache = new CacheImpl();
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Log createLog() {
		LogImpl log = new LogImpl();
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public se.eskilson.egeo.Container createContainerFromString(
			EDataType eDataType, String initialValue) {
		se.eskilson.egeo.Container result = se.eskilson.egeo.Container
				.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainerToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheType createCacheTypeFromString(EDataType eDataType,
			String initialValue) {
		CacheType result = CacheType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogType createLogTypeFromString(EDataType eDataType,
			String initialValue) {
		LogType result = LogType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate(String it) {
		Date _xtrycatchfinallyexpression = null;
		try {
			Date _xifexpression = null;
			boolean _notEquals = (!Objects.equal(it, null));
			if (_notEquals) {
				SimpleDateFormat _simpleDateFormat = new SimpleDateFormat(
						"yyyy-MM-dd");
				Date _parse = _simpleDateFormat.parse(it);
				_xifexpression = _parse;
			}
			_xtrycatchfinallyexpression = _xifexpression;
		} catch (final Throwable _t) {
			if (_t instanceof ParseException) {
				final ParseException e = (ParseException) _t;
				RuntimeException _runtimeException = new RuntimeException(e);
				throw _runtimeException;
			} else {
				throw Exceptions.sneakyThrow(_t);
			}
		}
		return _xtrycatchfinallyexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return createDate(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDate(Date it) {
		String _xifexpression = null;
		boolean _notEquals = (!Objects.equal(it, null));
		if (_notEquals) {
			SimpleDateFormat _simpleDateFormat = new SimpleDateFormat(
					"yyyy-MM-dd");
			String _format = _simpleDateFormat.format(it);
			_xifexpression = _format;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return convertDate((Date) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EgeoPackage getEgeoPackage() {
		return (EgeoPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EgeoPackage getPackage() {
		return EgeoPackage.eINSTANCE;
	}

} //EgeoFactoryImpl
