/**
 */
package egeo.gpx.groundspeak.tests;

import egeo.gpx.groundspeak.GroundspeakFactory;
import egeo.gpx.groundspeak.TextType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextTypeTest extends TestCase {

	/**
	 * The fixture for this Text Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextTypeTest.class);
	}

	/**
	 * Constructs a new Text Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Text Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TextType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Text Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextType getFixture() {
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
		setFixture(GroundspeakFactory.eINSTANCE.createTextType());
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

} //TextTypeTest
