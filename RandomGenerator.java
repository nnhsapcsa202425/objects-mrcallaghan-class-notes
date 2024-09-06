import java.util.Random;

/**
 * Write a description of class RandomGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomGenerator
{
    public static void main()
    {
        Random generator = new Random();
        
        int roll = generator.nextInt(6); // generates the range of numbers 0-5
        roll = roll + 1;
        
        //int roll2 = generator.nextInt(1,7); // generates the range of numbers 1-6 in newer versions on Java
        
        System.out.print(roll);
        //System.out.print(roll2);
    }
    
}
