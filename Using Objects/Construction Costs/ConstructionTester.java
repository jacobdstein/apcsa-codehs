import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sales tax rate: ");
        double taxRate = input.nextDouble();
        System.out.println("How many boards do you need? ");
        int numBoards = input.nextInt();
        System.out.println("How many windows do you need? ");
        int numWindows = input.nextInt();
        Construction construction = new Construction(8, 11, taxRate);
        double total = construction.lumberCost(numBoards) + construction.windowCost(numWindows);
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + construction.grandTotal(total));
    }
}