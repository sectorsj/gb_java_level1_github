package homeworks.level2.homework6.lesson6.chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private DataInputStream in;
    private DataOutputStream out;

    public Server() {
        try {
            System.out.println("Server is starting up...");
            serverSocket = new ServerSocket(8888);

            System.out.println("Server is waiting for connection...");
            clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket);

            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());

            while (true) {
                String incomingMessage = in.readUTF();
                if(incomingMessage.contains("-exit")) {
                    out.writeUTF("cmd Exit");
                    break;
                }
                out.writeUTF("Echo: " + incomingMessage);
            }

            System.out.println("Socket shutdown");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeConection(){
        try {
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
