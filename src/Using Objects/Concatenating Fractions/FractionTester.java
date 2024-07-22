import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);
        Fraction half = new Fraction(1, 2);
        // Ask for input
        System.out.println("Enter the numerator: ");
        int fractionNumerator = input.nextInt();
        System.out.println("Enter the denominator: ");
        int fractionDenominator = input.nextInt();
        // Create a new Fraction with the user's input
        Fraction fraction = new Fraction(fractionNumerator, fractionDenominator);
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        int numerResult = half.getNumerator() * fraction.getDenominator() + 
            half.getDenominator() * fraction.getNumerator();
        int denomResult = half.getDenominator() * fraction.getDenominator();
        Fraction result = new Fraction(numerResult, denomResult);
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        System.out.println(half + " + " + fraction + " = " + result);
        
    }
}