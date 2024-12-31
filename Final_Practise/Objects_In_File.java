package Final_Practise;

import java.io.*;
import java.util.Scanner;


class Person implements Serializable {
    int id;
    String name, address;

    Person (int a, String b, String c) {
        this.id = a;
        this.name = b;
        this.address = c;

    }
        @Override
        public String toString() {
            return "Id: " + id + ", name: " + name + ", address: " + address;
        }

}

public class Objects_In_File {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       try {
           FileOutputStream fout = new FileOutputStream("object.txt");
           ObjectOutputStream oos = new ObjectOutputStream(fout);

           for (int i=0; i<2; i++) {
               System.out.println("Enter the person id: ");
               int id = sc.nextInt();
               sc.nextLine();
               System.out.println("Enter the person name: ");
               String name = sc.nextLine();
               System.out.println("Enter the person address: ");
               String address = sc.nextLine();
               sc.nextLine();

               Person person = new Person(id, name, address);
               oos.writeObject(person);
           }
               oos.close();
               sc.close();
       }catch (Exception e) {
           System.out.println(e.getMessage());
       }

       try {
           FileInputStream fin = new FileInputStream("object.txt");
           ObjectInputStream ois = new ObjectInputStream(fin);

           for (int i=0; i<2; i++) {
               Person personn = (Person) ois.readObject();
               System.out.println(personn);
           }
           ois.close();
       }catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
}


