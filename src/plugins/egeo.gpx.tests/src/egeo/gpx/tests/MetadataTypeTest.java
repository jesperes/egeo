/**
 */
package egeo.gpx.tests;

import egeo.gpx.GpxFactory;
import egeo.gpx.MetadataType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetadataTypeTest extends TestCase {

	/**
	 * The fixture for this Metadata Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MetadataTypeTest.class);
	}

	/**
	 * Constructs a new Metadata Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Metadata Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MetadataType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Metadata Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataType getFixture() {
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
		setFixture(GpxFactory.eINSTANCE.createMetadataType());
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

} //MetadataTypeTest
