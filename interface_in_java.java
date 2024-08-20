interface i {
    int  a =10;
    void display();
}

class Test implements i {
    public void display () {
        System.out.println("This is interface method");
    }
}

public class interface_in_java {
    public static void main (String [] args) {
        Test objj = new Test ();
        objj.display();
        System.out.println(objj.a);
    }
}
