import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start by listing the steps you need to take
        System.out.println("Enter player one's name:");
        String player1 = input.nextLine();
        System.out.println("Enter player two's name:");
        String player2 = input.nextLine();
        System.out.println("Enter " + player1 + "'s score");
        int player1score = input.nextInt();
        System.out.println("Enter " + player2 + "'s score");
        int player2score = input.nextInt();
        if (player1.compareTo(player2) > 0){
            System.out.println(player2 + " scored " + player2score + " points");
            System.out.println(player1 + " scored " + player1score + " points");
        } else {
            System.out.println(player1 + " scored " + player1score + " points");
            System.out.println(player2 + " scored " + player2score + " points");
        }
        if (player1score > player2score) {
            System.out.println(player1 + " wins!");
        } else {
            System.out.println(player2 + " wins!");
        }
        
    }
}