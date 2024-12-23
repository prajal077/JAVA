package Practise_preBoard_Exam;

import java.io.*;
import java.util.Scanner;

class User implements Serializable {
    String name, address;
    int age;

    User(String a, String b, int c) {
        this.name = a;
        this.address = b;
        this.age = c;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Age: " + age;
    }
}

public class Writing_multiple_objects {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            FileOutputStream fout = new FileOutputStream("user.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);

            for(int i=0; i<5; i++) {
                System.out.println("Enter the name: ");
                String name = sc.nextLine();
                System.out.println("Enter address: ");
                String address = sc.nextLine();
                System.out.println("Enter age: ");
                int age = sc.nextInt();
                sc.nextLine();

                User user = new User(name, address, age);
                oos.writeObject(user);
            }
            oos.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            FileInputStream fin = new FileInputStream("user.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);

            for (int i=0; i<5; i++) {
                User userr = (User) ois.readObject();
                System.out.println(userr);
            }
            ois.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
