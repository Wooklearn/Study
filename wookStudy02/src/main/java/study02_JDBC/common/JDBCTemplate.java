package study02_JDBC.common;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCTemplate {
    public static Connection getConnection() {

        Connection con = null;

        Properties prop = new Properties();


        try {
            prop.load(new FileReader(
                    "src/main/java/study02_JDBC/config/config-query.properties"
            ));

            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");

            Class.forName(driver);

            con = DriverManager.getConnection(url, prop);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return con;
    }

    // (Connection, Statement, ResultSet)
    public static void close (Connection con) {
        try {
            if (con != null & con.isClosed()) {

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void close (Statement stmt) {
        try {
            if (stmt != null & stmt.isClosed()) {

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void close (ResultSet rset) {
        try {
            if (rset != null & rset.isClosed()) {

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
