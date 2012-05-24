/**
 */
package se.eskilson.egeo.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.emf.common.util.URI;

import se.eskilson.egeo.Cache;
import se.eskilson.egeo.CacheDB;
import se.eskilson.egeo.EgeoFactory;
import se.eskilson.egeo.gpx.GpxParser;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Cache DB</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class CacheDBTest extends TestCase {

	/**
	 * The fixture for this Cache DB test case.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected CacheDB fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CacheDBTest.class);
	}

	/**
	 * Constructs a new Cache DB test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CacheDBTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cache DB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CacheDB fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cache DB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheDB getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EgeoFactory.eINSTANCE.createCacheDB());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	public void testGpxImport() {
		GpxParser parser = new GpxParser();

		URI uri = URI.createPlatformPluginURI(
				"/se.eskilson.egeo.model.tests/testdata/test.gpx", false);

		parser.importCaches(getFixture(), uri);

		CacheDB db = getFixture();
		for (Cache cache : db.getCaches()) {
			System.out.println("Cache: " + cache);
		}
	}
} // CacheDBTest
