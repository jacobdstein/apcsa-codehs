import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a decimal number: ");
        double myDouble = input.nextDouble();
        System.out.println(myDouble);
        int x = (int)myDouble;
        System.out.println(x);
        myDouble += 0.5;
        System.out.println(myDouble);
        int y = (int)(myDouble);
        System.out.println(y);
    }
}