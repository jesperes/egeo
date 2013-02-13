/**
 */
package egeo.gpx.groundspeak.tests;

import egeo.gpx.groundspeak.GroundspeakFactory;
import egeo.gpx.groundspeak.OwnerType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Owner Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwnerTypeTest extends TestCase {

	/**
	 * The fixture for this Owner Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwnerType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OwnerTypeTest.class);
	}

	/**
	 * Constructs a new Owner Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnerTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Owner Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OwnerType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Owner Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwnerType getFixture() {
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
		setFixture(GroundspeakFactory.eINSTANCE.createOwnerType());
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

} //OwnerTypeTest
