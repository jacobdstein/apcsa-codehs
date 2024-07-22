public class PlayerTester
{
    public static void main(String[] args) {
       
       CricketPlayer solo = new CricketPlayer("Brian");
       CricketPlayer team = new CricketPlayer("Fabian", "Red");
       
       solo.addMatch(1, 2);
       solo.addMatch(3, 7);
       solo.addMatch(2, 6);
       solo.addMatch(8, 4);
       team.addMatch(7, 6);
       team.addMatch(5,4);
       team.addMatch(3, 6);
       team.addMatch(2, 1);
       
       System.out.println("Brian's stats:");
       solo.printRunsScored();
       solo.printBallsBowled();
       System.out.println(solo);
       System.out.println("Fabian's stats: ");
       team.printRunsScored();
       team.printBallsBowled();
       System.out.println(team);
    }
}