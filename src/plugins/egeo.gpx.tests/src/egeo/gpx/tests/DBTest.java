package egeo.gpx.tests;

import java.io.File;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Environment;
import org.junit.Test;

import egeo.CacheDatabase;
import egeo.EgeoFactory;
import egeo.EgeoPackage;
import egeo.Waypoint;
import egeo.core.parsers.IParser;
import egeo.core.parsers.ParseException;
import egeo.core.parsers.gpx.GpxParser;

public class DBTest {

	private static final Logger logger = Logger.getLogger(DBTest.class);

	@Test
	public void testDatabase() throws ParseException {

		Properties props = new Properties();
		File gpx = new File("5110831.gpx");

		props.setProperty(Environment.DRIVER, "org.hsqldb.jdbcDriver");
		props.setProperty(Environment.USER, "sa");
		props.setProperty(Environment.URL, "jdbc:hsqldb:file:testdb");
		props.setProperty(Environment.PASS, "");
		props.setProperty(Environment.DIALECT,
				org.hibernate.dialect.HSQLDialect.class.getName());

		props.setProperty(PersistenceOptions.PERSISTENCE_XML,
				"egeo.persistance.xml");

		// props.setProperty(PersistenceOptions.DEFAULT_VARCHAR_LENGTH, "512");

		String dataStoreName = "GeocacheDataStore";
		HbDataStore dataStore = HbHelper.INSTANCE
				.createRegisterDataStore(dataStoreName);

		dataStore.setDataStoreProperties(props);
		dataStore.setEPackages(new EPackage[] { EgeoPackage.eINSTANCE });
		dataStore.initialize();

		SessionFactory factory = dataStore.getSessionFactory();
		logger.debug("Opening datastore session: " + factory);
		final Session session = factory.openSession();

		Query q = session.createQuery("FROM CacheDatabase");
		List<?> dblist = q.list();

		if (dblist.size() > 0) {
			CacheDatabase db = (CacheDatabase) dblist.get(0);
			logger.debug(String.format(
					"Database contains %d waypoints and %d users.", db
							.getWaypoints().size(), db.getUsers().size()));

			for (Waypoint wpt : db.getWaypoints()) {
				logger.debug("Waypoint: " + wpt.getUrlname());
			}

		} else {
			try {
				Transaction tx = session.getTransaction();
				tx.begin();

				logger.debug("Parsing GPX file: " + gpx);
				IParser p = new GpxParser();
				CacheDatabase db = EgeoFactory.eINSTANCE.createCacheDatabase();
				p.parse(gpx, db);

				session.save(db);

				logger.debug("Parsing complete. Committing transaction.");
				tx.commit();
			} finally {
				session.close();
			}
		}
	}
}
