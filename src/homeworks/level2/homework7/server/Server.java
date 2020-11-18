package homeworks.level2.homework7.server;

import homeworks.level2.homework7.auth.AuthenticationService;

public interface Server {
    void broadcastMessage(String message);
    void personalMessage(String message);
    boolean isLoggedIn(String nickname);
    void subscribe(ClientHandler client);
    void unsubscribe(ClientHandler client);
    AuthenticationService getAuthenticationService();
    //PostService getPostService();
}
