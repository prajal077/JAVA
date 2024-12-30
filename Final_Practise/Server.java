package Final_Practise;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    static int fact (int a) {
        if (a==0) {
            return 1;
        }
        else {
            return a*fact(a-1);
        }
    }
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(6969);
        Socket clientSocket = s.accept();

        Scanner ins = new Scanner(clientSocket.getInputStream());
        PrintWriter outs = new PrintWriter(clientSocket.getOutputStream(), true);

        int num = ins.nextInt();
        outs.println(fact(num));

        System.out.println("successfull");
        outs.close();
        ins.close();
        s.close();
        clientSocket.close();

    }
}
