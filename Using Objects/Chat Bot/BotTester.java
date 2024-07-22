import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Bot univac = new Bot(name);
        System.out.println("Hello! What is your name? ");
        System.out.println("\nTell me Bot, which countries use the imperial system?");
        System.out.println("\nTell me Bot, what was the first computer bug?");
        univac.greeting();
        univac.help();
        System.out.println();
        univac.imperialCountries();
        System.out.println();
        univac.firstBug();
        System.out.println();
        univac.goodbye();
        
    }
}