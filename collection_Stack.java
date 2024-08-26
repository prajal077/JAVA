import java.util.Iterator;
import java.util.Stack;

public class collection_Stack {
    public static void main (String [] args) {
        Stack<String> stk = new Stack<>();

        //pushing the element in the stack

        stk.push("prajal");
        stk.push("is");
        stk.push("great");
        stk.push("god");

        //printing the elements of stack

        System.out.println("Stack Elements: ");
        Iterator <String> itr = stk.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();

        //popping the top element of string

        stk.pop();
        System.out.println("After popping: ");
        itr = stk.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();

        System.out.println("Is stack empty?: "+stk.empty());

        System.out.println("Top element (peek) is: "+stk.peek());


        //searching
        int position = stk.search("is");
        if(position!=-1) {
            System.out.println("Found at position: "+position);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
