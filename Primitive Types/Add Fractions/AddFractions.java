public class AddFractions 
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        int c = 2;
        int d = 5;
        
        int numResult = ( a * d + b * c);
        int denomResult = b * d;
        System.out.println("The sum of 1/2 + 2/5 = " + numResult + "/" + denomResult);
        
    }
}