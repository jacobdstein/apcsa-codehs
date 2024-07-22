import java.util.Scanner;

public class Grammar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        System.out.println("Enter a sentence that uses 2 instead of to:");
        String improperText = input.nextLine();
        // Call the method useProperGrammar to process the string according to 
        // the directions.
        System.out.println(useProperGrammar(improperText));
    }
    
    public static String useProperGrammar(String theText)
    {
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
        String properText = "";
        int count = 0;
        for (int i = 0; i < theText.length(); i++) {
            if (theText.charAt(i) == '2') {
                properText += "to";
                count++;
            } else {
                properText += theText.substring(i, i + 1);
            }
        }
        System.out.println("Fixed " + count + " grammatical errors:");
        return properText;
    }
}