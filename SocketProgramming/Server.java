package SocketProgramming;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server started. Waiting for a client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage, serverMessage;

            while (true) {
                clientMessage = in.readLine();
                if (clientMessage.equalsIgnoreCase("goodbye")) {
                    System.out.println("Client says goodbye. Chat ended.");
                    break;
                }
                System.out.println("Client: " + clientMessage);

                System.out.print("You: ");
                serverMessage = consoleIn.readLine();
                out.println(serverMessage);
                if (serverMessage.equalsIgnoreCase("goodbye")) {
                    System.out.println("You said goodbye. Chat ended.");
                    break;
                }
            }

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
