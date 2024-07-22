public class Dragon 
{
    private String attack;
    private int level;
    
    // Write the constructor here!
    public Dragon (int theLevel, String theAttack) {
        level = theLevel;
        attack = theAttack;
    }
    // Put getters here
    public int getLevel() {
        return level;
    }
    
    public String getAttack() {
        return attack;
    }
    // Put other methods here
    public String fight() {
        String fullAttack = "";
        for (int i = 0; i < level; i++) {
            fullAttack += attack;
        }
        return fullAttack;
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}