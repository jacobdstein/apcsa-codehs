import java.util.ArrayList;

public class PieTester
{
    public static void main(String[] args)
    {
        // Start here!
        Pie[] arr = new Pie[3];
        arr[0] = new Pie("a", 10);
        arr[1] = new PecanPie(10, "b");
        arr[2] = new ApplePie(10);
        
        for (Pie pie : arr) {
            System.out.println(pie.getSlices() + " slices " + pie.getType());
        }
    }
}