import java.awt.Color;

/**
 * Chapter 2 class notes on using objects.
 *
 * @author mrcallaghan
 * @version 27aug2024
 */
public class Chapter2
{
    
    public static void drawLine()
    {
        /*
         * Objects are entities in a program.
         *      Obejcts hae attributes
         *      Objects are manipulated by invoking methods.
         *      
         *  In the following code snippet, ocean and crush are variables referencing objects.
         *  
         *  Classes describe a collection of objects. 
         *      All obejcts of a class have the same behavior (i.e., methods)
         *        and they have the same type of attributes
         *        (but may have different values for those attribtes).
         *        
         *   World and turtle are classes.
         *   
         *   We use the new operator to construct (create) an object.
         *   
         *      The class of the object is specified immdiately after the new operator (e.g., Turtle).
         *      
         *      If we need to pass additional info to construct the object,
         *          arguements are specified in parentheses after the class (e.g., ocean).
         */
        
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        Turtle larry = new Turtle(ocean);
        larry.setBodyColor(Color.RED);
        crush.forward(40);
        
        /*
         * Variables store values to be used later.
         *      Variables have types (e.g., int, boolean, Turtle, String, etc.)
         *                      names (e.g., width, crush, ocean, etc.)
         *                      values (e.g., 20, turtle object, "Mr. C", etc.)
         */
        int width;          // declaring a variable
        width = 20;         // assigning a value to a variable
        int xPosition = 50; // both declaring and assigning the variable in one step.
        
        /*
         * Java has several primitive data types:
         *      - int holds an integer number (e.g., 20)
         *      - double holds a real number (floating point, decimal)
         *      - boolean holds a value of true or false
         *      - char holds a single character (e.g., 'c' or '!' )
         */
        
        // here is a boolean
        boolean isSummer = true;
        
        // here is a double
        double salesTaxRate = 0.0775;
        
        // here is a char
        char letter = 'c';
        
        /*
         * When invoking methods, we use the dot operator (i.e., ' . ')
         *   to invoke a method on an object.
         *   
         *  Some methods take no argumets, but we still use parentheses (e.g., penDown)
         *  
         *  Some methods take one or more arguments.  (e.g., forward)
         *    Multiple arguments are separated by commas.
         *    
         *  Mutator methods modify the state of the object.  penDown, forward, setPenColor are all
         *      mutator methods.
         */
        
        crush.penDown();
        crush.setPenColor(Color.BLUE);
        crush.forward(55);
        
        /*
         * Accessor methods return the value of an attribute of the object.
         *  The state of the object does not change.
         */
        width = crush.getPenWidth();
        System.out.println(width);
    }
    
}
