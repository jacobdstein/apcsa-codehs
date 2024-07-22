public class Team
{
    // Static Variables
    // ...
    public static int totalTeams = 0;
    public static int minTeams = 6;
    // Public Methods
    public Team() 
    {
        // Some code here...
        totalTeams += 1;
    }
    
    // Static Methods 
    // ...
    public static boolean tournamentReady () {
        return totalTeams >= minTeams;
    }
}