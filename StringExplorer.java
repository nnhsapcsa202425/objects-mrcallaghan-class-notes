
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
        /*
         * Strings are objects that represent a sequence of characters.
         *      Surround a string with double quotes, just like in Python.
         *      Unlike in Python:
         *          - single quotes are reserved in Java for the char type (primitive)
         *          - no triple-quoted strings
         *          - no f-strings
         *          - Strings can be concatenated with other types of things (e.g., ints) and type
         *              conversion will occur
         */
        String river = new String("Mississippi");
        System.out.println(river);
        
        /*
         * Since Strings are so common, a shortcut way to create them called a string literal.
         *  This is how it worked in Python.
         */
        String river2 = "Nile";
        System.out.println(river2);
        
        river.replace("i", "x");
        System.out.println(river);
        
        /*
         * The replace method returns a reference to a new String object.
         *   It does not change the String object on which it was invoked.
         *   The string class has no mutator methods. It is not possible to alter a String.
         *   
         *   Strings are immutable.
         */
        
        String riverX = river.replace("i", "x");
        /*
         * Using the '+' to add Strings together is called concatenation.
         */
        System.out.println("New String: " + riverX);
        System.out.println("Original String: " + river);
        
        
        
        
        
        
    }
}
