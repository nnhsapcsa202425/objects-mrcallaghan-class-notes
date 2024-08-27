import java.awt.Color;
/**
 * Chapter 2 Notes on Objects.
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
         *  Objects have attributes.
         *  Objects are manipulated by invoking methods.
         *  
         * Below, ocean and crush are variables taht reference object.
         * 
         * Classes describe a collection of objects. (A class is a template for objects)
         *      All objects of a class have the same behavior (methods)
         *      and they have the same type of attributes
         *          (but may have different values for those)
         *          
         *    e.g., World and Turtle are classes.
         */
        
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        
        /*
         * We use the new operator to costruct (create, instantiate) an object.
         * 
         * The class of teh object is specified immediately after the new operator (e.g., Turtle)
         * 
         * If we need to pass additional information to construct the object,
         *      arguments are specified in parentheses after the class name(e.g., ocean).
         */
        
        crush.penDown();
        crush.forward(100);
        
        /*
         * Variables store values to be used later.
         *   Variables have a type (e.g., int, Turtle)
         *                  a name (e.g., width, crush
         *                  and a value (e.g., 20, ???).
         */
        int width;      // declaring a vairable
        width = 20;     // assigning a value to a variable
        int xPosition = 50; // declaring and assigning a vlaue to a variable
        
        /*
         * Java has several primitive data types:
         *      boolean holds a value of true or false
         *      int holds an integer number
         *      double holds a real number (floating point)
         *      char holds a single character
         */
        
        // here is a boolean
        boolean isSummer = true;   // or false
        
        // here is a double
        double salesTaxRate = 0.0775;
        
        // here is a char
        char letter = 'c';
        
        /*
         * When invoking methods, we use the dot operator (i.e., '.')
         *  to invoke methods on objects.
         *  
         *  Some methods take no arguments, but we still have parentheses (e.g., penDown() )
         *  
         *  Some methods take one or more arguments (e.g., forward() )
         *      multiple arguments are separated by commas.
         *      
         *  Mutator methods modify the state (i.e., value of the attribtues)
         *      of the object. penDown, forward, setPenColor are all mutator methods.
         */
        
        crush.penDown();
        crush.forward(50);
        crush.setPenColor(Color.RED);
        crush.forward(30);
        
        /*
         * Accessor methods return the value of an attribute of the object.
         *  The state of the object does not change.
         *  
         *  getPenWidth is an accessor method.
         */
        
        int penWidth = crush.getPenWidth();
        System.out.println(penWidth);
        
        
        
        
        
        
        
        
        
    }
}
