package assignments.Lab_4;

import java.io.*;
import java.util.Scanner;

class User implements Serializable {
    String name, address;
    int id;

    User(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}

public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (FileOutputStream fout = new FileOutputStream("filee.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fout)) {

            for (int i = 0; i < 5; i++) {
                System.out.println("Enter the id:");
                int id = sc.nextInt();
                sc.nextLine(); // Consume the newline character
                System.out.println("Enter the name:");
                String name = sc.nextLine();
                System.out.println("Enter the address:");
                String address = sc.nextLine();

                User info = new User(id, name, address);
                oos.writeObject(info);
            }
            System.out.println("Objects written successfully.");
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try (FileInputStream fin = new FileInputStream("filee.txt");
             ObjectInputStream ois = new ObjectInputStream(fin)) {

            for (int i = 0; i < 5; i++) {
                User info = (User) ois.readObject();
                System.out.println("ID: " + info.id);
                System.out.println("Name: " + info.name);
                System.out.println("Address: " + info.address);
                System.out.println("-----");
            }
        } catch (Exception e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
