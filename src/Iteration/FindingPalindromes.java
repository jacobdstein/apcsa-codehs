import java.util.Scanner;
public class Palindromes
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your text:");
        String userText = input.nextLine();
        if (isPalindrome(userText)) {
            System.out.println("This word is a palindrome!");
        } else {
        System.out.println("Not a palindrome :(");
        }
    }

    public static boolean isPalindrome(String text)
    {
        if (text.equals(reverse(text))){
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String text)
    {
        String reverseText = "";
        for (int i = text.length(); i > 0; i--) {
            reverseText += text.substring(i-1, i);
        }
        return reverseText;
    }

}