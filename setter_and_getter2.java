import org.w3c.dom.ls.LSOutput;

class Person {
    private String name;
    private int age;

    public String getName () {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }
    public int getAge () {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }
}

public class setter_and_getter2 {
    public static void main (String [] args) {
        Person obj = new Person();
        obj.setName("Prajal");
        System.out.print("The name is: ");
        System.out.println(obj.getName());
        obj.setAge(19);
        System.out.print("The age is: ");
        System.out.println(obj.getAge());
    }


}
