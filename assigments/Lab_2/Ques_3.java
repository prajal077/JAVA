package assigments.Lab_2;

//Multilevel Inheritance
class Parent {
    void info () {
        System.out.println("This is Parent class method");
    }
}

class Childd extends Parent {
    void info1 () {
        System.out.println("This is Child class method");
    }
}

class GrandChild extends Childd {
    void info2 () {
        System.out.println("This is method of GrandChild class");
    }
}

public class Ques_3 {
    public static void main (String [] args) {
        GrandChild gc = new GrandChild();
        gc.info();
        gc.info1();
        gc.info2();
    }
}
