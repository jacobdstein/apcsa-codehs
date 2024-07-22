import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        Hello translate = new Hello(name);
        translate.english();
        translate.spanish();
        translate.russian();
    }
}