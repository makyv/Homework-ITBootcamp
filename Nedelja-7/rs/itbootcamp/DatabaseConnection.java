package rs.itbootcamp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private static Connection conn = null;

    static{
        String url = "jdbc:postgresql://localhost:5432/kitchen?user=postgres&password=makyv";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection(){
        return conn;
    }
}
