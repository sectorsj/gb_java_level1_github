package homeworks.level2.homework7.auth;

import homeworks.level2.homework7.entity.User;

import java.util.Optional;

public interface AuthenticationService {
    Optional<User> doAuth(String login, String password);
}
