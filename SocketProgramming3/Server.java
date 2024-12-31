package SocketProgramming3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket s = new ServerSocket(2000);
        Socket ClientSocket = s.accept();

        Scanner ins = new Scanner(ClientSocket.getInputStream());
        PrintWriter outs = new PrintWriter(ClientSocket.getOutputStream(), true);
        Scanner sc = new Scanner(System.in);

        while(true) {
            String ReceivedMsg = ins.nextLine();
            System.out.println("client: "+ReceivedMsg);
            if (ReceivedMsg.equalsIgnoreCase("goodbye")) {
                System.out.println("Client ended the chat");
                break;
            }

            System.out.println("Enter the message to send to client: ");
            String SendMsg = sc.nextLine();
            outs.println(SendMsg);
            if (SendMsg.equalsIgnoreCase("goodbye")) {
                System.out.println("server ended the chat");
                break;
            }
        }

        ins.close();
        outs.close();
        s.close();
    }
}
