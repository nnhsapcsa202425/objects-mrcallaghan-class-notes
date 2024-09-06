import java.util.Random;
/**
 * Write a description of class DieSimulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DieSimulator
{
    public static void main()
    {
        // Random class needs to be imported: java.util.Random
        Random generator = new Random();
        
        int number = generator.nextInt(6);  // returns an integer in the range 0-5
        number = number + 1;            // returns an integer in the range 1-6
        
        int number2 = generator.nextInt(6) + 1;  // returns an integer in the range 1-6
        
        //int die = generator.nextInt(1,7); // option if ussing newer version of java
        
    }
}
