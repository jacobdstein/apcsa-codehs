public class IntegerOverflow
{
    public static void main(String[] args)
    {
        int minNum = Integer.MIN_VALUE;
        int maxNum = Integer.MAX_VALUE;
        
        System.out.println(minNum);
        System.out.println(maxNum);
        System.out.println(--minNum);
        System.out.println(++maxNum);
        
    }
}