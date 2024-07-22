public class FirstArray
{
    public static void main(String[] args)
    {
      // Create the 3 arrays here
        String[] cities = {"Las Vegas", "Minsk", "Sao Paulo"};
        int[] cityPops = {667501, 2038822, 12330000};
        double[] avgMinSun = {8.11, 1.36, 6.05};
      // Print all 3 arrays according to the output in the description
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "'s population is " + cityPops[i] + ".");
        }
        System.out.println();
        for (int i = 0; i < avgMinSun.length; i++) {
            System.out.println("The least amount of sunshine " 
            + cities[i] + " gets is " + avgMinSun[i] + " hours a day.");
        }
    }
}