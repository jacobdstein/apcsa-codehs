import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the latitude of the starting location: ");
        double lat1 = input.nextDouble();
        System.out.print("\nEnter the longitude of the starting location: ");
        double long1 = input.nextDouble();
        GeoLocation start = new GeoLocation(lat1, long1);
        System.out.print("\nEnter the latitude of the ending location: ");
        double lat2 = input.nextDouble();
        System.out.print("\nEnter the longitude of the ending location: ");
        double long2 = input.nextDouble();
        GeoLocation end = new GeoLocation(lat2, long2);
        System.out.println("The distance is " + end.distanceFrom(start) + " miles.");
        
        
    }
}