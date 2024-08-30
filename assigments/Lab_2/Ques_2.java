package assigments.Lab_2;

//Multiple inheritance

interface Parent1 {
    void show1();
}

interface Parent2 {
    void show2 ();
}

class Child implements Parent1, Parent2 {
    public void show1 () {
        System.out.println("This is method of class Parent1");
    }

    public void show2 () {
        System.out.println("This is method of class Parent2");
    }

}

public class Ques_2 {
    public static void main (String [] args) {
        Child child =  new Child();
        child.show1();
        child.show2();
    }
}
