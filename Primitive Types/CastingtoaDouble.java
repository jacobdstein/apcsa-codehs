import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int int1 = input.nextInt();
        System.out.println("Enter another integer: ");
        int int2 = input.nextInt();
        
        double quotient = (double)int1 / int2;
        System.out.println(quotient);
        

    }
}