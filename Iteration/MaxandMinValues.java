import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        // It is useful to plan out your steps before you get started
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number or 0 to quit:");
        int num = input.nextInt();
        int largestNum = num;
        int smallestNum = num;
        
        while (true) {
            if (num == 0) {
                break;
            } else if (num > largestNum) {
                largestNum = num;
            } else if (num < smallestNum) {
                smallestNum = num;
            }
            
            System.out.println("Results so far:");
            System.out.println("Largest number: " + largestNum);
            System.out.println("Smallest number: " + smallestNum);
            System.out.println("Enter a number or 0 to quit:");
            num = input.nextInt();
        }
    }
}