package homeworks.level3.homework2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersRepo {
    public User findUserByEmailAndPassword(String email, String password) {
        Connection connection = DataSource.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM users WHERE email = ? AND password = ?"
            );
            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                return new User(
                        rs.getInt("id"),
                        rs.getString("nickname"),
                        rs.getString("email"),
                        rs.getString("password")
                );
            }

            return null;
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW during user fetch", throwables);
        } finally {
            DataSource.close(connection);
        }
    }
}
