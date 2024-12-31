package SocketProgramming3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)  throws IOException {

        Socket socket = new Socket("localhost", 2000);

        Scanner ins = new Scanner(socket.getInputStream());
        PrintWriter outs = new PrintWriter(socket.getOutputStream(), true);
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the message to send to server: ");
            String Sendmsg = sc.nextLine();
            outs.println(Sendmsg);
            if(Sendmsg.equalsIgnoreCase("goodbye")) {
                System.out.println("you ended the chat");
                break;
            }

            String ReceivedMsg = ins.nextLine();
            System.out.println("Server: "+ReceivedMsg);
            if (ReceivedMsg.equalsIgnoreCase("goodbye")) {
                System.out.println("server ended the chat");
                break;
            }
        }

        outs.close();
        ins.close();
        socket.close();
    }
}
