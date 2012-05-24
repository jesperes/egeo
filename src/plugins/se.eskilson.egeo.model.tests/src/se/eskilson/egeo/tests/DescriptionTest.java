/**
 */
package se.eskilson.egeo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import se.eskilson.egeo.Description;
import se.eskilson.egeo.EgeoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptionTest extends TestCase {

	/**
	 * The fixture for this Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Description fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DescriptionTest.class);
	}

	/**
	 * Constructs a new Description test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Description fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Description test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Description getFixture() {
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
		setFixture(EgeoFactory.eINSTANCE.createDescription());
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

} //DescriptionTest
