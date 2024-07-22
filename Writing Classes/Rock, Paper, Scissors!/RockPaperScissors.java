import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
        
    public static String getWinner(String user, String computer)
    {
        if (user.equals(computer)) {
            return TIE;
        } else if (user.equals("rock")) {
            if (computer.equals("paper")) {
                return COMPUTER_PLAYER;
            } else {
                return USER_PLAYER;
            }
        } else if (user.equals("paper")) {
            if (computer.equals("scissors")) {
                return COMPUTER_PLAYER;
            } else {
                return USER_PLAYER;
            }
        } else if (user.equals("scissors")) {
            if (computer.equals("rock")) {
                return COMPUTER_PLAYER;
            } else {
                return USER_PLAYER;
            }
        }
        
        return "That wasn't one of the options";
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String userChoice = "";
        while (true) {
            int num = Randomizer.nextInt(1, 3);
            String computerChoice = "";
            
            if (num == 1) {
                computerChoice = "rock";
            } else if (num == 2) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }
            
            System.out.println("Enter your choice (rock, paper, or scissors):");
            if (input.hasNextLine()) {
                userChoice = input.nextLine();
            } else {
                break;
            }
            if (userChoice.equals("stop")) {
                System.out.println("Thanks for playing");
                break;
            }
            System.out.println("User: " + userChoice);
            System.out.println("Computer: " + computerChoice);
            System.out.println(getWinner(userChoice, computerChoice));
        }
    }
}