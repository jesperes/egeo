package egeo.database.tests;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import egeo.database.CacheSchema;
import egeo.database.GpxParser;

public class GpxParseTest {
    private Connection connection;

    static {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Before
    public void before() throws SQLException {
        connection = DriverManager.getConnection("jdbc:hsqldb:mem:testdb",
                "SA", "");
        CacheSchema.initialize(connection);
    }

    @After
    public void after() throws SQLException {
        connection.close();
    }

    @Test
    public void testGpxImport() throws IOException, SQLException {
        URL url = getClass().getResource("/5110831.gpx");
        File file = new File(url.getPath());
        GpxParser gpx = new GpxParser();
        gpx.parse(file, connection);

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM caches");
        int i = 0;
        while (rs.next()) {
            i++;
            System.out.format("%s: %s\n", rs.getString(1), rs.getString(2));
        }

        assertEquals(1149, i);
    }
}
