package homeworks.level3.homework2;

public class AuthenticationService {
    private UsersRepo usersDataBase;

    public AuthenticationService(UsersRepo usersDataBase) {
        this.usersDataBase = usersDataBase;
    }

    public User doAuth(String email, String password) {
        return usersDataBase.findUserByEmailAndPassword(email, password);
    }
}
