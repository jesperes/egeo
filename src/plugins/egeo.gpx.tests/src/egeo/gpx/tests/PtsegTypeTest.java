/**
 */
package egeo.gpx.tests;

import egeo.gpx.GpxFactory;
import egeo.gpx.PtsegType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ptseg Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtsegTypeTest extends TestCase {

	/**
	 * The fixture for this Ptseg Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtsegType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PtsegTypeTest.class);
	}

	/**
	 * Constructs a new Ptseg Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtsegTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ptseg Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PtsegType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ptseg Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtsegType getFixture() {
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
		setFixture(GpxFactory.eINSTANCE.createPtsegType());
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

} //PtsegTypeTest
