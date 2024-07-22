import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        System.out.println("Enter a word");
        String usersWord = input.nextLine();
        WordGames wordGames = new WordGames(usersWord);
        // Scramble it
        // Print out scrambled word
        System.out.println(wordGames.scramble());
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter a random word: ");
        String randomWord = input.nextLine();
        
        // Add random word at index
        // Print out the word
        System.out.println(wordGames.bananaSplit(idx, randomWord));
        // Ask for a character (store as a String)
        System.out.println("Enter a character: ");
        String character = input.nextLine();
        // Ask for random word
        System.out.println("Enter another random word");
        String randomWord2 = input.nextLine();
        // Add random word at character
        // Print out the word
        System.out.println(wordGames.bananaSplit(character, randomWord2));
        
        
        
    }
}