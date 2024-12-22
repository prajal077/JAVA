package Practise_preBoard_Exam;

interface A {
    void a();
}

interface B {
    void b();
}

class C implements A, B {
    public void a() {
        System.out.println("This is interface A method");
    }
    public void b () {
        System.out.println("This is inteface B method");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.a();
        obj.b();
    }
}
