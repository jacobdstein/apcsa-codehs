public class FallingBodies
{
    public static void main(String[] args)
    {
        int t = 23;
        double g = 9.8;
        double h = 0.5 * g * t * t;
        double v = g * t;
        
        System.out.println("Height: " + h);
        System.out.println("Velocity: " + v);
    }
}