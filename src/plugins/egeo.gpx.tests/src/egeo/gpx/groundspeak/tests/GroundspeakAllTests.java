/**
 */
package egeo.gpx.groundspeak.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Groundspeak</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroundspeakAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new GroundspeakAllTests("Groundspeak Tests");
		suite.addTest(GroundspeakTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundspeakAllTests(String name) {
		super(name);
	}

} //GroundspeakAllTests
