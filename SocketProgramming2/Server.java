package SocketProgramming2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket s = new ServerSocket(2004);
        Socket clientSocket = s.accept();

        Scanner sc = new Scanner(System.in);
        Scanner ins = new Scanner(clientSocket.getInputStream());
        PrintWriter outs = new PrintWriter(clientSocket.getOutputStream(), true);

        String msg = ins.nextLine();

        System.out.println("Enter the message to send to client: ");
        String sendMsg = sc.nextLine();

        outs.println(sendMsg);

        System.out.println("Received message is: "+msg);
        System.out.println("sent message is: "+sendMsg);

        s.close();
        ins.close();
        outs.close();
    }
}
