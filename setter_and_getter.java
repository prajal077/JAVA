class Getset {
    private String name;

    public String getName () {
        return name;
    }

    public void setName (String N) {
        this.name = N;
    }
}

public class setter_and_getter {
    public static void main (String [] args) {
        Getset obj =  new Getset();
        obj.setName("Prajal");

        System.out.print("The name is: ");
        System.out.print(obj.getName());
    }
}
