
/**
 * Exploring the String class and its methods.
 *
 * @author mrcallaghan
 * @version 30aug2024
 */
public class StringExplorer
{
    public static void main(String[] args)
    {
        String river = new String("Mississippi");
        System.out.println(river);
        
        /*
         * Since Strings are so common, a shortcut way to construct them is provided 
         *      called a String literal.
         *      This is how we made string in Python also.
         * 
         */
        
        String river2 = "Nile";
        System.out.println(river2);
        
        river.replace("i", "x");
        System.out.println(river);
        
        /*
         * The replace method returns a reference to a new String object.
         * It does not change the String object on which it is invoked (i.e., called).
         * The String class has no mutator methods. It is not possible to change a String object.
         * 
         * Strings are immutable.
         */
        
        String riverX = river.replace("i", "x");
        System.out.println("New String: " + riverX);
        System.out.println("Old String: " + river);
        
        
        
    }
}
