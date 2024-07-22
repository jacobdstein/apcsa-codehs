public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       // Generate a random number of seconds
        int seconds = (int)(Math.random() * 200);
       // Print the number of seconds
       System.out.println("Microwaving for " + seconds + " seconds");
       if (seconds <= 120) {
           System.out.println("Microwaving for " + seconds + " seconds");
           System.out.println("Rolls will be at the right temperature!");
       } else {
           System.out.println("Rolls will be boiling hot!");
       }
       // Use two if statements to print the temperature
    }
}