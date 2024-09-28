package Practise_1st_Term;

interface A {
    void a ();
}

interface B {
    void b();
}

class C implements A,B {
    public void a () {
        System.out.println("This is interface A method");
    }

    public void b () {
        System.out.println("This is interface B method");
    }
}

public class multiple_inheritance {
    public static void main(String[] args) {
        C c = new C();
        c.a();
        c.b();
    }
}
