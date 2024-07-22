public class ExtractDigits
{
    public static void main(String[] args)
    {
        extractDigits(2938724);
        
    }
    
    public static void extractDigits(int num)
    {
        String numAsString = Integer.toString(num);
        int i = numAsString.length();
        while (i > 0) {
            System.out.println(numAsString.substring(i-1, i));
            i--;
        }
    }
}