package hu.unideb.inf.dressmaker.core.service.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {

    /*
    private static String driverName = "oracle.jdbc.OracleDriver";
    private static String url = "jdbc:oracle:thin:@codd.inf.unideb.hu:1521:ora12c";
    private static String userName = "u_u37ml1";
    private static String password = "secret";*/

    private static String driverName = "oracle.jdbc.OracleDriver";
    private static String url = "jdbc:h2:mem:test";
    private static String userName = "sa";
    private static String password = "";

    static {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not load Jdbc driver class");
        }
    }

    public static Connection createConnection(){

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection(Connection connection){

        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
