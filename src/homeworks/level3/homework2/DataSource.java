package homeworks.level3.homework2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    private DataSource() {}

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/users",
                    "root",
                    "123456"
            );
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW during a connection", throwables);
        }
    }

    public static void close(Connection connection){
        try {
            connection.close();
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW during connection.close", throwables);
        }
    }
}
