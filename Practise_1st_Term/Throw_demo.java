package Practise_1st_Term;
import java.io.IOException;

public class Throw_demo {
    public static void checkNum(int num) throws Exception {
        if(num<0) {
            throw new Exception("negative number deetcted");
        }
    }

    public static void main(String[] args) {
        try {
            checkNum(5);

           // checkNum(-2);
        }catch (Exception e) {
            System.out.println("error detected");
        }
        finally {
            System.out.println("exception checked");
        }
    }
}
