public class NumberTriangle
{
    public static void main(String[] args)
    {
       // Call makeNumberTriangle 
       makeNumberTriangle();
    }
    
    // Makes an upright triangle with the numbers 1-5
    public static void makeNumberTriangle()
    {
        for (int row = 1; row < 6; row++) {
            for (int num = 1; num < row + 1; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}