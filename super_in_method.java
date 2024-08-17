class parent1 {
    void message  (){
        System.out.println("This is parent");
    }
}

class child1 extends parent1 {
    void message () {
        System.out.println("This is child");
    }

    void display () {
        super.message();
        message();
    }
}
public class super_in_method {
    public static void main (String [] args) {
        child1 obj = new child1 ();
        obj.display();
    }
}
