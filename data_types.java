public class data_types {
    public static void main (String [] args) {

        //Below are the Examples of Primitive data types.

       /* byte- takes 1 byte  range[-128 to 127]
        short- takes 2 bytes
        int- takes 4 bytes
        float- takes 4 bytes
        char- takes 2 bytes
        long- takes 8 bytes
        double- takes 8 bytes
        boolean- takes 1 bytes  true/flase   */


        byte age = 30;
        int number = 98765432;   //red underline determines the out of range or any other error
        int number2 = 987654321;
        float number3 = 3.14F;     //We must write capital or small F in the end of number so that compiler understands it as a float number
        long number4 = 9876543210L; //same as above with L
        char letter = 'p';
        boolean isPrajal = true;


        //Below is the example of non-primitive data type

        String name = "Bhattarai";
        System.out.println(name.length()); //we have already existed length() function that calculates length of a string. It only works in Non-Primitive data type
                                            // we use dot(.) operator to call a function as above in name.length()
    }
}
