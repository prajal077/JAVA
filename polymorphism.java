class operation {
    static int multiply (int a, int b) {
        return a*b;
    }

    static float multiply (float a, float b) {
        return a*b;
    }
}
public class polymorphism {
    public static void main (String [] args) {
        System.out.println(operation.multiply(2,4));
        System.out.println(operation.multiply(2.4f, 2.5f));
    }
}
