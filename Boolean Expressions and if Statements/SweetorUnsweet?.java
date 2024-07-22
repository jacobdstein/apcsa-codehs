import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to drink?");
        String drink = input.nextLine();
        System.out.println("How many teaspoons of sugar do you want?");
        int teaspoons = input.nextInt();
        System.out.println("Confirming your order. You wanted:");
        if (teaspoons > 0) {
            System.out.println(drink + " with sugar");
        } else {
            System.out.println(drink);
        }
        // Start here!
        // You'll find it helpful to list the steps you
        // need to take, then write the code
    }
}