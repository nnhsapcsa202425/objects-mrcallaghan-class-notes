/**
 * Write a description of class Chapter1 here.
 *
 * @author mrcallaghan
 * @version 20aug2024
 * 
 * Every Java program contains one or more classes (e.g., Chapter1).
 * 
 * In general, every source file (e.g., Chapter1.java) conatins
 *  one class (e.g., Chapter1).
 *  
 *  The source file name must match the class name.
 *  
 *  By convention, class names start with an uppercase letter.
 */

import java.awt.Color;

public class Chapter1
{
    
    /*
     * A class contains method.
     * 
     * Most Java programs contain a class with a main method.
     * 
     * The main method is executed when the program starts.
     */
    public static void main(String[] args) 
    {
        System.out.println("Hello, world.");
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        crush.forward(50);
        /*
         * A method contains statements.
         * 
         * Statemenet can invoke other methods (e.g., forward).
         * 
         * In genereal, methods are invoked on objects (e.g., crush)
         * 
         * When invoking a method, arguments are passed in parentheses (e.g., 50).
         */
        crush.forward(99);
        
        /*
         * A statement contains identifiers.
         * 
         * Identifiers may have any combination of:
         * - letters
         * - digits (but not as the first character)
         * - underscores ( _ )
         * - dollar sign ( $ )
         * 
         * These are all valid identifiers:
         */
        int y, x2, X_Y, total$;
        
        // this is not a valid identifier
        //int 2y;
        
        /*
         * Identifiers are case sensitive (case matters)
         * 
         * These are different identifiers:
         */
        
        Turtle squirt, SQUIRT, sQuIrT;
        
        // cannot declare a variable more than once
        //Turtle squirt;
        //squirt = new Turtle(ocean);
        
        /*
         * By convention, constants are all uppercase.
         *   Use an underscore to separate the words.
         */
        int SPEED_OF_LIGHT = 300000000; // m/s
        
        /*
         * By convention, most other identifiers start with a lowercase letter.
         *  Subsequent words starts with an uppercase letter (CamalCase).
         */
        World pacificOcean;
        
        /*
         * This is a compile-time error.  (This code does not compile.)
         * 
         * These are often called syntax errors.
         */
        //crush.forwrd(100);
        
        /*
         * This is a run-time error. (This code code compiles and runs,
         *      but it benerates an exception.  In most cases the program crashes.)
         */
        crush.forward(1/0);
    }

    
    
    
    
    
    
}
