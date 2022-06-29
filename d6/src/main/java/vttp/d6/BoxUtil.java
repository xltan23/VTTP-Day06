//printBox method to check element type in the Box 

package vttp.d6;

public class BoxUtil {

    public static void printBox(Box b) {
        
        Object c = b.getContent();

        if (c instanceof String) {
            System.out.println("This is a string.");
        } else if (c instanceof Integer) {
            System.out.println("This is an integer.");
        }
        
    }
}
