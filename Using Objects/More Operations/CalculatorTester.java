import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Calculator calculator = new Calculator();
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        calculator.add(num1, num2);
        calculator.subtract(num1, num2);
        calculator.multiply(num1, num2);
        calculator.divide(num1, num2);
    }
}