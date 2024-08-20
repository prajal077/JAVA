abstract class prajal {
    abstract void info ();
}

class human extends prajal {
    public void info () {
        String name = "prajal";
         int age = 19;

        System.out.println("name: "+name);
        System.out.println("age: "+age);

    }
}

public class abstract_class {
    public static void main (String [] args) {
        human object = new human();
        object.info();
    }
}
