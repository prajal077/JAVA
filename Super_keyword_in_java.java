import java.util.*;
import java.io.*;
class parent {
    int speed = 100;
}

class child extends parent {
    int speed  = 120;

    void display () {
        System.out.println("The speed is: " +super.speed);
    }
}


public class Super_keyword_in_java {
    public static void main (String [] args) {
        child obj = new child ();
        obj.display();
    }
}
