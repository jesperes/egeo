/**
 */
package egeo.gpx.tests;

import egeo.gpx.GpxFactory;
import egeo.gpx.TrkType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Trk Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrkTypeTest extends TestCase {

	/**
	 * The fixture for this Trk Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrkType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TrkTypeTest.class);
	}

	/**
	 * Constructs a new Trk Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrkTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Trk Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TrkType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Trk Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrkType getFixture() {
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
		setFixture(GpxFactory.eINSTANCE.createTrkType());
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

} //TrkTypeTest
