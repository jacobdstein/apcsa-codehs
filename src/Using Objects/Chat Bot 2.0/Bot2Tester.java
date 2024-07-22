import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       System.out.println("Hello! What is your name?");
       Scanner input = new Scanner(System.in);
       String name = input.nextLine();
       Bot2 univac = new Bot2(name);
       univac.greeting();
       System.out.println("What is your favorite animal?");
       String favAnimal = input.nextLine();
       univac.favoriteAnimal(favAnimal);
       System.out.println("If you could visit any place, where would you go? ");
       String favPlace = input.nextLine();
       univac.destination(favPlace);
       System.out.println("What is your favorite number? ");
       int favNumber = input.nextInt();
       univac.favoriteNumber(favNumber);
       System.out.println();
       univac.goodbye();
    }
}