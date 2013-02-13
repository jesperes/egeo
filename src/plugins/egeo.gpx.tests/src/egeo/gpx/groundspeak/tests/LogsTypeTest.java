/**
 */
package egeo.gpx.groundspeak.tests;

import egeo.gpx.groundspeak.GroundspeakFactory;
import egeo.gpx.groundspeak.LogsType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Logs Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogsTypeTest extends TestCase {

	/**
	 * The fixture for this Logs Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogsType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LogsTypeTest.class);
	}

	/**
	 * Constructs a new Logs Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogsTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Logs Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LogsType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Logs Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogsType getFixture() {
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
		setFixture(GroundspeakFactory.eINSTANCE.createLogsType());
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

} //LogsTypeTest
