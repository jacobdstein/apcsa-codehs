import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Do you want to travel to [P]oland of [J]apan?: ");
        String firstChoice = input.nextLine();
        
        if (firstChoice.toUpperCase().substring(0,1).equals("P")) {
            System.out.print("Do you want to go to the [O]ld town or [E]nergylandia?: ");
            String secondChoice = input.nextLine();
        } else if (firstChoice.toUpperCase().substring(0, 1).equals("J")) {
            System.out.print("Do you want to go to [K]inkakuji Temple or [D]otombori District?: ");
            String secondChoice = input.nextLine();
        } else {
            System.out.println("That was not an option.");
        }
    }
}