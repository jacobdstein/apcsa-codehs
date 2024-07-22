import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two doubles: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        Calculator calculator = new Calculator();
        System.out.println(num1 + " + " + num2 + " = " + calculator.sum(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + calculator.subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + calculator.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + calculator.divide(num1, num2));
    }
}