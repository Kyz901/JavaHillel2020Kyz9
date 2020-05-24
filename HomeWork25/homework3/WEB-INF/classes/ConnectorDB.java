package MyServlets;

import java.sql.*;

public class ConnectorDB {

    private static final String driverClassName = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/student?useSSH=false&useUnicode=true&serverTimezone=UTC";
    private static final String username = "root";
    private static final String password = "IgorKyzmin@))!";
    private static Connection connection = null;


    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null) {
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url, username, password);
        };
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        };
    }



}
