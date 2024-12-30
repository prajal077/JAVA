package Final_Practise;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 6969);

        Scanner sc = new Scanner(System.in);
        Scanner ins = new Scanner(socket.getInputStream());
        PrintWriter outs = new PrintWriter(socket.getOutputStream(), true);

        System.out.println("Enter the number you want factorial of: ");
        int num  = sc.nextInt();

        outs.println(num);
        int fact = ins.nextInt();

        System.out.println("The sended number is: "+num);
        System.out.println("The factorial of given number is: "+fact);

        ins.close();
        outs.close();
        socket.close();
    }
}
