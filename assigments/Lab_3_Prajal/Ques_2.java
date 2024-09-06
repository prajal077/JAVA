package assigments.Lab_3_Prajal;
import java.util.*;
public class Ques_2 {
        public static void main (String args[] ) {

            try {
                int [] nums = {1, 2, 3, 4};
                System.out.println(nums[10]);
            }
            catch (Exception e) {
                System.out.println("There is an error");
            }
            finally {
                System.out.println("The Exception has been checked");
            }

        }
    }
