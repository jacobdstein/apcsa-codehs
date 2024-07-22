import java.util.Scanner;

public class Scores
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the first test name: ");
        String firstName = input.nextLine();
        System.out.println("Please enter the first test score: ");
        double firstScore = input.nextDouble();
        input.nextLine();
        
        System.out.println("Please enter the second test name: ");
        String secondName = input.nextLine();
        System.out.println("Please enter the second test score: ");
        double secondScore = input.nextDouble();
        input.nextLine();
        
        System.out.println("Please enter the third test name: ");
        String thirdName = input.nextLine();
        System.out.println("Please enter the thirds test score: ");
        double thirdScore = input.nextDouble();
        
        System.out.println("Your average score is: " + (firstScore + secondScore + thirdScore)/3);
        
    }
}