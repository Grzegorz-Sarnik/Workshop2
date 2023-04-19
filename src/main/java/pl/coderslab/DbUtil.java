package pl.coderslab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static final String URL = "jdbc:mysql://localhost:3306";
    private static final String USER = "root";
    private static final String PASSWORD = "coderslab";

    public static Connection connection(String dbName) throws  SQLException{
        String url = URL + "/" + dbName;
        return DriverManager.getConnection(url,USER,PASSWORD);
    }
}