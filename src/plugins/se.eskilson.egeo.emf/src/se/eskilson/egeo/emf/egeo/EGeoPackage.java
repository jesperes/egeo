/**
 */
package se.eskilson.egeo.emf.egeo;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.eskilson.egeo.emf.egeo.EGeoFactory
 * @model kind="package"
 * @generated
 */
public interface EGeoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "egeo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eskilson.se/egeo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "egeo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EGeoPackage eINSTANCE = se.eskilson.egeo.emf.egeo.impl.EGeoPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.eskilson.egeo.emf.egeo.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.eskilson.egeo.emf.egeo.impl.CacheImpl
	 * @see se.eskilson.egeo.emf.egeo.impl.EGeoPackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 0;

	/**
	 * The number of structural features of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link se.eskilson.egeo.emf.egeo.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see se.eskilson.egeo.emf.egeo.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EGeoFactory getEGeoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link se.eskilson.egeo.emf.egeo.impl.CacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.eskilson.egeo.emf.egeo.impl.CacheImpl
		 * @see se.eskilson.egeo.emf.egeo.impl.EGeoPackageImpl#getCache()
		 * @generated
		 */
		EClass CACHE = eINSTANCE.getCache();

	}

} //EGeoPackage
