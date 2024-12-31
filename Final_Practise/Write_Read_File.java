package Final_Practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Write_Read_File {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            FileOutputStream fout = new FileOutputStream("WriteRead.txt");
            System.out.println("Enter the word to insert into file: ");
            String msg = sc.nextLine();
            byte[] bytes = msg.getBytes();
            fout.write(bytes);
            System.out.println("Successfully written in file");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            FileInputStream fin = new FileInputStream("WriteRead.txt");
            int i;
            System.out.println("The message in the file is: \n");
            while((i=fin.read()) != -1) {
                System.out.print((char)i);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
