package SocketProgramming2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 2004);

        Scanner sc = new Scanner(System.in);
        Scanner ins = new Scanner(socket.getInputStream());
        PrintWriter outs = new PrintWriter(socket.getOutputStream(), true);

        System.out.println("Enter the message to send to server: ");
        String msg = sc.nextLine();

        outs.println(msg);
        String ReceivedMsg = ins.nextLine();

        System.out.println("The sended message is: "+msg);
        System.out.println("The received message is: "+ReceivedMsg);

        socket.close();
        ins.close();
        outs.close();
    }
}
