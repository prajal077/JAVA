package Practise_preBoard_Exam;

abstract class Prajal {
    abstract void details ();
}

class Info extends Prajal {
    void details () {
        String name = "prajal";
        int age = 20;

        System.out.println(name);
        System.out.println(age);
    }
}

public class AbstractClassAndAbstractMethod {
    public static void main(String[] args) {
        Info info = new Info();
        info.details();
    }
}
