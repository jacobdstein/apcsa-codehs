import java.util.Scanner;

public class FindMedian 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask the user for three ints and 
        // print out the median.
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        System.out.print("\nEnter the second integer: ");
        int num2 = input.nextInt();
        System.out.print("\nEnter the third integer: ");
        int num3 = input.nextInt();
        
        System.out.print("\n The median is ");
        if (num1 > num2 && num1 < num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 < num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
}