package Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public final class MyConnection {

    private final static String DB_USER = "root";
    private final static String DB_PASSWORD = "12345678";

    private final static String DB_CONNECTION_URL = "jdbc:mysql://localhost:3306/hr";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_CONNECTION_URL, DB_USER, DB_PASSWORD);
    }
}
