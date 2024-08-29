package assigments.Lab_2;

//Dynamic Method Dispatch

abstract class A {
    abstract void display ();
}

class Child1 extends A {
    void display () {
        System.out.println("This is child 1");
    }
}

class Child2 extends A {
    void display () {
        System.out.println("This is child 2");
    }
}

public class Ques_1 {
    public static void main(String [] atgs) {
        A a = new Child1();
        a.display();

        a = new Child2();
        a.display();
    }
}
