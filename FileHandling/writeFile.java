package FileHandling;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class writeFile {
    public static void main (String [] args) {

        try {
            FileOutputStream fout = new FileOutputStream("test.txt");
            String s = "Hello World!!!";
            byte [] bytes = s.getBytes();

            fout.write(bytes);
            fout.close();
        }

        catch (Exception e){
            System.out.println("Error");
        }

    }
}
