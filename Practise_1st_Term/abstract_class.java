package Practise_1st_Term;

abstract class prajal {
    abstract void info();
}

class human extends prajal {
    void info () {
        String name = "prajal";
        int age = 19;

        System.out.println(name);
        System.out.println(age);
    }
}

public class abstract_class {
    public static void main(String[] args) {
        human h = new human();
        h.info();
    }
}
