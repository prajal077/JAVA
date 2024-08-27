package FileHandling;
import java.io.*;
class Person implements Serializable {
    String name;
    int age;

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class serializable {
    public static void main (String [] args) {
        Person info = new Person("prajal", 19);

        try {
            FileOutputStream fout = new FileOutputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);

            oos.writeObject(info);
            System.out.println("Object written in file successfully");
        }

        catch (Exception e) {
            System.out.println("Error");
        }
    }
}
