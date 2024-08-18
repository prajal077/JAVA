class baseA {
    void print () {
        System.out.println("This is base class");
    }
}

class childA extends baseA {
    void print () {
        System.out.println("This is child A class");
    }
}

class childB extends baseA {
    void print () {
        System.out.println("This is child B class");
    }
}

public class Runtime_polymorphism {
    public static void main (String [] args) {
        baseA obj;
        obj  = new childA();
        obj.print();


        obj = new childB();
        obj.print();
    }
}
