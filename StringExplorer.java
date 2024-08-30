
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
         * Strings are object that represent a sequence of characters.
         *  Surround a String with double quotes, just like Python.
         *  Unlike Python:
         *      - single quote are reserved for char literals (primitives)
         *      - no triple-quoted
         *      - no f-strings
         *      - Strings can be concatenated with other type of things (e.g., ints, doubles) and
         *       type conversion will occur.
         */
        String river = new String("Mississippi");
        System.out.println(river);
        
        /*
         * Since Strings are so common, a shortcut way exists to create Strings called a string literal.
         *  This is just like Python.
         */
        String river2 = "Nile";
        /*
         * Concatenation invoves adding two Strings together to make a third, larger String.
         */
        System.out.println("Another river: " + river2);
        
        river.replace("i", "x");
        System.out.println(river);
        
        /*
         * The replace method returns a reference to a new String object.
         * It doe not change the original String on which it is invoked.
         * The String class has no mutator methods. It is not possible to 
         * change a String.
         * 
         * Strings are immutable.
         */
        String riverX = river.replace("i", "x");
        System.out.println("Newly created version of String: " + riverX);
        System.out.println("Original String is unhanged: " + river);
        
        
        
        
        
        
        
        
    }
}
