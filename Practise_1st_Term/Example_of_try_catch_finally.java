package Practise_1st_Term;

public class Example_of_try_catch_finally {
    public static void main(String[] args) {
        try {
            int []arr = {1,2,3};
            System.out.println(arr[10]);
        }catch (Exception e) {
            System.out.println("error found");
        }
        finally {
            System.out.println("the try and catch block are executed");
        }
    }
}
