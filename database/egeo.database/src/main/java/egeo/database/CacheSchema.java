package egeo.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CacheSchema {
    public static void initialize(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute("CREATE TABLE caches(id VARCHAR, name VARCHAR)");

        // statement
        // .execute("INSERT INTO caches (id, name) VALUES (4711, 'Foobar')");
        // statement
        // .execute("INSERT INTO caches (id, name) VALUES (4712, 'Foobar')");
        //
        // statement.execute("SELECT * FROM caches");
        // ResultSet rs = statement.getResultSet();
        // while (rs.next()) {
        // System.out.println(rs.getInt("id"));
        // System.out.println(rs.getString("name"));
        // }
    }
}
