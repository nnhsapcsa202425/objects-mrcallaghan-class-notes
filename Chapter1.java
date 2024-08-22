/**
 * Chapter 1 Notes Project
 *
 * @author mrcallaghan
 * @version 20aug2024
 */
/*
 * In general, every source file, (e.g., Chapter1.java) contains one or more classes (e.g., Chapter1).
 * 
 * Every Java program contains one or more classes (e.g., Chapter1).
 * 
 * The source file name and the class name must match.
 * 
 * By convention, class names must start with an uppercase.
 */

import java.awt.Color;

public class Chapter1
{
    /*
     * A class contains methods.
     * 
     * Most Java programs contain a main method.
     * 
     * The main method is executed when the program starts.
     */
    public static void main(String[] args)
    {
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        crush.forward(50);
        /*
         * A method contains statements.
         * 
         * Statements may invoke other methods (e.g., forward).
         * 
         * In general, methods are invoked on objects. (e.g., crush)
         * 
         * When invoking a method, arguments are passed in parentheses (e.g., 50).
         */
        crush.forward(99);
        
        /*
         * A statement contain identifiers.
         * 
         * Identifier may have any combination of:
         * - letters
         * - digits (but not as the first character)
         * - underscores( _ )
         * - dollar sign ( $ )
         * 
         * These are valid identifiers:
         * 
         */
        int y, x2, X_Y, total$;  
        
        //int 2y;  // this is not a valid identifier
        
        /*
         * Identifiers are case sensitive (cas matters)
         * 
         * These are different:
         */
        
        Turtle squirt, SQUIRT, SqUIrt;
        
        
        /*
         * By convention, constants are all uppercase.
         * 
         *  Use an underscore to separate words.
         */
        int SPEED_OF_LIGHT = 300000000; // m/s
        
        /*
         * By convention, most other identifiers start with a lowercas letter.
         *  Subsequent words start with an uppercase letter (CamalCase)
         */
        World pacificOcean;
        
        /*
         * This is a compile time error. (This code doesn't compile)
         * 
         *  These are often called syntax errors.
         */
        
        //crush.forwrd(50);
        
        /*
         * This is a run-time error. (This code compiles and runs,
         *  but generates an exception.  In most cases, the program crashes.)
         */
        //crush.forward(1/0);
        
        /*
         * This is also a run-time error. (This code comiles and runs,
         *      but doesn't produce the hexpected output.)
         *      
         *      This is a logical error as the turtle turns right instead of left.
         */
        
        // have the turtle turn left and move forward
        crush.turn(90);
        crush.forward(50);
        
    }
    
    
    
    
    
}










