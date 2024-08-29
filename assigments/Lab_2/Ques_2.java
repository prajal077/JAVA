package assigments.Lab_2;

//Multiple inheritance

interface X {
    void show1();
}

interface Y {
    void show2 ();
}

class Child implements X, Y {
    public void show1 () {
        System.out.println("This is method of class X");
    }

    public void show2 () {
        System.out.println("This is method of class Y");
    }

}

public class Ques_2 {
    public static void main (String [] args) {
        Child child =  new Child();
        child.show1();
        child.show2();
    }
}
