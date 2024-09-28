package Practise_1st_Term;

import java.io.*;

class Person implements Serializable{
    String name;
    int age;

    Person(String a, int b) {
        this.name = a;
        this.age = b;
    }
}

public class Writing_Reading_object {
    public static void main(String[] args) {
        Person info = new Person("prajal",20);
        try{
            FileOutputStream fout = new FileOutputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(info);
            oos.close();
            System.out.println("object written in file");
        } catch (Exception e) {
            System.out.println("error");
        }

        try {
            FileInputStream fin = new FileInputStream("file.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            Person Info = (Person) ois.readObject();
            System.out.println("name: " +Info.name);
            System.out.println("age: " +Info.age);
            ois.close();
            }catch (Exception e) {
            System.out.println("error");
        }
    }
}
