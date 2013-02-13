/**
 */
package egeo.gpx.groundspeak.tests;

import egeo.gpx.groundspeak.GroundspeakFactory;
import egeo.gpx.groundspeak.LogType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Log Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogTypeTest extends TestCase {

	/**
	 * The fixture for this Log Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LogTypeTest.class);
	}

	/**
	 * Constructs a new Log Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Log Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LogType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Log Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogType getFixture() {
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
		setFixture(GroundspeakFactory.eINSTANCE.createLogType());
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

} //LogTypeTest
