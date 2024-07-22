import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        Food hamburger = new Food ("Hamburger", 600);
        Food frenchFries = new Food ("French Fries", 350);
        Food coke = new Food ("Coke", 200);
        
        System.out.println(hamburger.toString());
        System.out.println("How many would you like?");
        int numBurgers = input.nextInt();
        System.out.println(frenchFries.toString());
        System.out.println("How many would you like?");
        int numFries = input.nextInt();
        System.out.println(coke.toString());
        System.out.println("How many would you like?");
        int numCokes = input.nextInt();
        
        System.out.println("Your meal will have a total of " + 
        (numBurgers * hamburger.getCalories() + 
        numFries * frenchFries.getCalories() + 
        numCokes * coke.getCalories()) + " calories");
    }
}