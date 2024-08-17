class base {
    base () {
        System.out.println("This is base");
    }
}

class derived extends base {
    derived () {
        super();
        System.out.println("This is derived");
    }
}
public class super_constructor {
    public static void main (String [] args) {
        derived obj = new derived();
    }
}
