import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        System.out.println("Enter a word:");
        String word = input.nextLine();
        System.out.println("Enter the letter to be replaced:");
        String remove = input.nextLine();
        System.out.println("Enter the new letter:");
        String replace = input.nextLine();
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
        System.out.println(replaceLetter(word, remove, replace));
    }
    
    // Modify this method so that it will take a third parameter from a user --
    // the String with which they want to replace letterToReplace 
    // 
    // This method should replace all BUT the first occurence of letterToReplace
    // You may find .indexOf to be useful, though there are several ways to solve this problem.
    // This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace, String replaceLetter)
    {
        int count = 0;
        String newWord = "";
        int firstIndex = word.indexOf(letterToReplace);
        for(int i = firstIndex; i < word.length(); i++)
        {
            if(word.substring(i, i+1).equals(letterToReplace))
            {
                count++;
                if (count > 1) {
                newWord += replaceLetter;
                } else {
                    newWord += word.substring(i, i+1);
                }
            } else {
                newWord += word.substring(i, i+1);
            }
            
        }
        return newWord;
    }
}