import java.util.Random;
/**
 * Write a description of class DieTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DieTester
{
    public static void main()
    {
        // Random class requires an import: java.util.Random

        // when creating a Random object, I recommend NOT labeling the variable "number"
        Random generator = new Random();
        int number = generator.nextInt(6);  // generates a random number 0-5
        number = number + 1;

        int number2 = generator.nextInt(6) + 1; // generates a random number 1-6
        
        System.out.print(number);
        
        //int number3 = generator.nextInt(1, 7); // generates a random number 1-6
        
        System.out.print(number);

    }



}
