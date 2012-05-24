/**
 */
package se.eskilson.egeo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import se.eskilson.egeo.Cache;
import se.eskilson.egeo.EgeoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CacheTest extends TestCase {

	/**
	 * The fixture for this Cache test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cache fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CacheTest.class);
	}

	/**
	 * Constructs a new Cache test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cache test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Cache fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cache test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cache getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EgeoFactory.eINSTANCE.createCache());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CacheTest
