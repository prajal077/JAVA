import java.io.*;
interface I1 {
    void a ();
}

interface I2 {
    void b ();
}

class c implements I1, I2 {
    public void a () {
        System.out.println("This is a function");
    }

    public void b () {
        System.out.println("This is b function");
    }
}

public class multiple_inheritance_with_interface {
    public static void main (String [] args) {

        c obj = new c ();
        obj.a();
        obj.b();
    }
}
