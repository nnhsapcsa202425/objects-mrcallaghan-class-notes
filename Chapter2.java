

import java.awt.Color;


/**
 * Chapter 2 Notes
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
         * 
         *      Objects have attributes.
         *      Objects are manipulated by methods.
         *      
         *      in the following code snippet, ocean and crush are variables that reference objects.
         *      
         *      Classes describe a collection of objects.  (A class is a template for creating objects)
         *          All objects of a class have the same behavior (methods)
         *          and they the same type of attributes
         *          (but may have different values for them).
         *          
         *      World and Turtle are classes.
         *      
         *      We use the new operator to construct (create, instantiate) an object.
         *      
         *      The class of the object is specified immediately after the new operator.
         *      
         *      If we need to pass additional information to a class, we use arguments (e.g., ocean).
         */
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.forward(50);
        
        /*
         * Variables store values to be used later.
         *  Variables have a type: (e.g., int, double, String, Turtle)
         *                 a name: (e.g., number, crush, ???)
         *                 a value: (e.g., 20, 5.5, true, turtle object, etc.)
         * 
         */
        int width;  // declaring a variable
        width = 20; // assigning a value to a variable
        int xPosition = 50; // declaring and assigning the variable in one line
        
        /*
         * Java has several primitive data types:
         *      - boolean holds a value of true or false
         *      - int hold an integer number
         *      - double holds a real number (floating point, decimal)
         *      - others include char (e.g., 'c' ), float, long, etc.
         */
        
        // here is a boolean
        boolean isSummer = true;
        
        // here is a double
        double salesTaxRate = 0.0775;
        
        // here is a char
        char letter = 'c';
        
        /*
         * When invoking methods, we use the dot operator (i.e., ' . ')
         *      to invoke a method on an object.
         *      
         *      Some methods take no arguments, but we stil need the parentheses (e.g., penDown)
         *      
         *      Some methods take one or more arguments (e.g., forward).
         *          Multiple arguments are separated by commas.
         *          
         *  Mutator methods modif the state of an object (e.g., setPenColor).
         */
        crush.penDown();
        crush.setPenColor(Color.RED);
        crush.forward(33);
        
        /*
         * Accessor method return the value of an attribute of the object.
         *  The state of the object doesn't change.
         *  
         *  getPenWidth is an example of an accessor method.
         */
        width = crush.getPenWidth();
        System.out.println(width);
    }
    
    
}
