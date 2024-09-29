package Practise_1st_Term;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Writing_in_File {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("info.txt");
            String s = "Hello World!";
            String str = "hello prajal!";
            byte[] bytes = s.getBytes();
            byte [] bytess = str.getBytes();
            fout.write(bytes);
            fout.write(bytess);
            fout.close();
            System.out.println("File written successfully");
        } catch (Exception e) { }

        try {
            FileInputStream fin = new FileInputStream("info.txt");
            int i;
            while((i = fin.read())!=-1) {
                System.out.print(" ");
                System.out.print((char)i);
                //System.out.print(" ");
            }
            fin.close();
        }catch (Exception e) {}
    }
}
