package FileHandling;

import java.io.FileInputStream;

public class readFile {
    public static void main (String [] args) {
        try {
            FileInputStream fin = new FileInputStream("test.txt");
            int i;
            while ((i = fin.read()) != -1){
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println("error");
        }

    }
}
