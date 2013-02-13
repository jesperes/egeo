/**
 */
package egeo.gpx.tests;

import egeo.gpx.GpxFactory;
import egeo.gpx.WptType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wpt Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WptTypeTest extends TestCase {

	/**
	 * The fixture for this Wpt Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WptType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WptTypeTest.class);
	}

	/**
	 * Constructs a new Wpt Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WptTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Wpt Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WptType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Wpt Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WptType getFixture() {
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
		setFixture(GpxFactory.eINSTANCE.createWptType());
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

} //WptTypeTest
