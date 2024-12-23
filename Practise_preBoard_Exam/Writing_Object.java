package Practise_preBoard_Exam;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    String name;
    int age;

    Person (String a, int b) {
        this.name = a;
        this.age = b;
    }
}

public class Writing_Object {
    public static void main(String[] args) {
        Person detail = new Person("shyam", 20);
        try {
            FileOutputStream fout = new FileOutputStream("details.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);

            oos.writeObject(detail);
            System.out.println("object written successfully");
            oos.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
