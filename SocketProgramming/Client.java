package SocketProgramming;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Connected to the server.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage, serverMessage;

            while (true) {
                System.out.print("You: ");
                clientMessage = consoleIn.readLine();
                out.println(clientMessage);
                if (clientMessage.equalsIgnoreCase("goodbye")) {
                    System.out.println("You said goodbye. Chat ended.");
                    break;
                }

                serverMessage = in.readLine();
                if (serverMessage.equalsIgnoreCase("goodbye")) {
                    System.out.println("Server says goodbye. Chat ended.");
                    break;
                }
                System.out.println("Server: " + serverMessage);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
