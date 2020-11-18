package homeworks.level2.homework7.server;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Objects;

public class ClientHandler {
    private Server server;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private String name;
    private boolean isAuthFinish;

    public ClientHandler(Server server, Socket socket) {
        try {
            this.server = server;
            this.socket = socket;
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            doListen();
            doPersonCorrespondent();
        } catch (IOException e) {
            throw new RuntimeException("SWW", e); // Something Went Wrong - SWW
        }
    }

    public String getName() {
        return name;
    }

    private void doListen() {
        new Thread(() -> {
            try {
                doAuth();
                receiveMessage();
            } catch (Exception e) {
                throw new RuntimeException("SWW", e);
            } finally {
                server.unsubscribe(this);
            }

        }).start();
    }

    //
    private void doPersonorrespondent () {
        try {
            while (true) {
                String posting = in.readUTF();
                /**
                 * Input posting sample
                 * "/w nick3 Привет"
                 */
                if (posting.startsWith("/w ")) {
                    /**
                     * After splitting sample
                     * array of ["/w" "nick3" "Привет"]
                     */
                    String[] postingValues = posting.split("\\s");
                    server
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("SWW", e);
        }
    }
    private void doAuth(){
        try {
            while (true) {
                String credentials = in.readUTF();
                /**
                 * Input credentials sample
                 * "-auth n1@mail.com 1"
                 */
                if (credentials.startsWith("-auth")) {
                    /**
                     * After splitting sample
                     * array of ["-auth" "n1@mail.com" "1"]
                     */
                    String[] credentialValues = credentials.split("\\s");
                    server.getAuthenticationService()
                            .doAuth(credentialValues[1], credentialValues[2])
                            .ifPresentOrElse(
                                    user -> {
                                        if (!server.isLoggedIn(user.getNickname())) {
                                            sendMessage("cmd auth: Status OK");
                                            name = user.getNickname();
                                            server.broadcastMessage(name + "is logged in");
                                            server.subscribe(this);
                                        } else {
                                            sendMessage("Current user already logged in!");
                                        }
                                    },
                                    new Runnable() {
                                        @Override
                                        public void run() {
                                            sendMessage("No such user by email and password");
                                        }
                                    }
                            );
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("SWW", e); // Something Went Wrong - SWW
        }
    }
    /**
     * * Receives input data from {@link ClientHandler#in} and then broadcast via {@link Server#broadcastMessage(String)}
     * */
    private void receiveMessage() {
        try {
            while (true) {
                String message = in.readUTF();
                if (message.equals("-exit")) {
                    return;

                }
                server.broadcastMessage(message);
                if (message.startsWith("/w")) {
                    return;
                }
                    server.personalMessage(message);
                }
        } catch (IOException e) {
            throw new RuntimeException("SWW", e);
        }
    }


    public void sendMessage(String message) {
        try {
            out.writeUTF(message);
        } catch (IOException e) {
            throw new RuntimeException("SWW", e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientHandler that = (ClientHandler) o;
        return Objects.equals(server, that.server) &&
                Objects.equals(socket, that.socket) &&
                Objects.equals(in, that.in) &&
                Objects.equals(out, that.out) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, socket, in, out, name);
    }
}
