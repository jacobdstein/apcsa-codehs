import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        System.out.println("How much does your dinner cost? ");
        double dinner = input.nextDouble() * 3;
        System.out.println("How much does your laser tag cost?");
        double laserTag = input.nextDouble() * 2;
        System.out.println("How much does your ice cream cost? ");
        double iceCream = input.nextDouble() * 4 / 3;
        
        System.out.println("Dinner: $" + dinner + "\nLaser Tag: $" + laserTag + "\nIce Cream: $" + iceCream + "\nGrand Total: $" + (dinner + laserTag + iceCream));
    }
}