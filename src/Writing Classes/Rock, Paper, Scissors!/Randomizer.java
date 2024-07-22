//Copy over your code from the Randomizer class exercise

public class Randomizer
{
    public static int nextInt()
    {
        return (int)(Math.random() * 9) + 1;
    }
    
    public static int nextInt(int min, int max)
    {
        return (int)(Math.random() * (max - min)) + min;
    }
}