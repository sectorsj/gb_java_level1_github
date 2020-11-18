package homeworks.level2.homework7.server;

import homeworks.level2.homework7.auth.AuthenticationService;
import homeworks.level2.homework7.auth.BasicAuthenicationServce;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatServer implements Server {
    private Set <ClientHandler> clients;
    private AuthenticationService authenticationService;

    public ChatServer() {
        try {
            System.out.println("Server is starting up...");
            ServerSocket serverSocket = new ServerSocket(8888);
            clients = new HashSet<>();
            authenticationService = new BasicAuthenicationServce();
            System.out.println("Server is started up!");

            while (true) {
                System.out.println("Server is (waiting) listening for clients...");
                Socket socket = serverSocket.accept();
                System.out.println("Client accepted " + socket);
                new ClientHandler(this, socket);
            }
        }catch (IOException e) {
            throw new RuntimeException("SWW", e);
        }
    }

    @Override
    public synchronized void broadcastMessage(String message) {
        clients.forEach(client -> client.sendMessage(message));
        }

    @Override
    public synchronized void personalMessage(String message) {
        clients.forEach(client -> client.sendMessage(message));
    }

    @Override
    public synchronized boolean isLoggedIn(String nickname) {
        return clients.stream()
                .filter(clientHandler -> clientHandler.getName().equals(nickname))
                .findFirst()
                .isPresent();
    }

    @Override
    public synchronized void subscribe(ClientHandler client) {
        clients.add(client);
    }

    @Override
    public synchronized void unsubscribe(ClientHandler client) {
        clients.remove(client);
    }

    @Override
    public AuthenticationService getAuthenticationService() {
        return authenticationService;
    }

}
