
/**
 * Chapter 1 Notes.
 *
 * @author mrcallaghan
 * @version 20aug2024
 * 
 * Every Java program contains one or more classes (e.g., Chapter1).
 * 
 * In general, every source file (e.g., Chapter1.java) contains one class (e.g., Chapter1).
 * 
 * The source file name must match the class name.
 * 
 * By convention, class names start with an uppercase letter.
 * 
 */

import java.awt.Color;

public class Chapter1
{
    
    /*
     * A class contains methods.
     * 
     * Most Java programs contain a class with a main method.
     * 
     * The main method is executed when the program starts.
     */
    public static void main(String[] args)
    {
        System.out.println("Hello, world again.");
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        crush.forward(50);
        /*
         * A method contains statements.
         * 
         * Statments may invoke other methods (e.g., forward).
         * 
         * In general, methods are invoked on objects (e.g., crush).
         * 
         * When invoking a method, arguments are passed in parentheses. (e.g., 50)
         */
        
        crush.forward(60);
        
        /*
         * A statement contains identifiers.
         * 
         * Identifiers may have any combo of:
         *      letters
         *      numbers (but not for the first character)
         *      underscores (_)
         *      dollar signs ($)
         *      
         * These are valid identifiers:
         */
        int y, x2, X_Y, total$;
        
        // this is not a valid identifier
        //int 2x;
        
        /*
         * Identifiers are case sensitive (case matters)
         * 
         * These are different:
         */
        Turtle squirt, SQUIRT, sQuIRt;
        
        // variables cannot be redefined with the same name in the same method
        //Turtle squirt;
        squirt = new Turtle(ocean);
        
        /*
         * By convention, constants are all uppercase.
         *      Use an underscore to separate words.
         */
        int SPEED_OF_LIGHT = 30000000; //m/s
        
        /*
         * By convention, most other identifiers start with a lowercase letter.
         *  Subsequent words start with an uppercase letter (CamalCase).
         */
        World pacificOcean;
        
        /*
         * This is a compile-time error. (This code will not compile.)
         * 
         * These are often called syntax errors.
         */
        //crush.forward(40)
        //crush.forward(40;
        //crush.forwrd(40);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}








