abstract class Subject {
    Subject () {
        System.out.println("There are five subjects");
    }
    abstract void syllabus ();

    void learn () {
        System.out.println("iam learning");
    }
}

class IT extends Subject {
    void syllabus () {
        System.out.println("The syllabus is small");
    }
}
public class abstractClassWithConstructor_method_variable {
    public static void main (String [] args) {
        Subject ob = new IT();
        ob.syllabus();
        ob.learn();
    }
}
