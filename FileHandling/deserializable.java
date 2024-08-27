package FileHandling;
import java.io.*;
public class deserializable {
    public static void main (String [] args) {

        try {
            FileInputStream fin = new FileInputStream("file.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);

            Person info = (Person) ois.readObject();
            System.out.println("name: "+info.name);
            System.out.println("age: "+info.age);
        }

        catch(Exception e) {
            System.out.println("Error");
        }
    }
}
