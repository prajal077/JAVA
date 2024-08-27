package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyContentFromFileToFile {
    public static void main (String [] args) {
        try (FileOutputStream fout = new FileOutputStream("copy.txt"); FileInputStream fin = new FileInputStream("file.txt")) {
            int i;
            while( (i = fin.read())!= -1) {
                System.out.print((char)i);
            }
        }
        catch (Exception e) {
            System.out.println("There is an error");
        }
    }
}
