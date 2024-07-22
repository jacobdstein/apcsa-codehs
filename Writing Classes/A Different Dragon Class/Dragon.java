public class Dragon 
{
    private String name;
    private int level;
    private boolean canBreatheFire;
    
    // Write the constructor here!
    public Dragon (String theName, int theLevel, boolean breathesFire) {
        name = theName;
        level = theLevel;
        canBreatheFire = breathesFire;
    }
    public Dragon (String theName, int theLevel) {
        name = theName;
        level = theLevel;
        if (level >= 70) {
            canBreatheFire = true;
        } else {
            canBreatheFire = false;
        }
    }
    // Put getters here
    public String getName() {
        return name;
    }
    
    public int getLevel() {
        return level;
    }
    
    public boolean isFireBreather() {
        return canBreatheFire;
    }
    // Put other methods here
    public void attack() {
        if (canBreatheFire || level >=70) {
            System.out.println(">>>>>>>>>>");
            System.out.println(">>>>>>>>>>>>>>");
            System.out.println(">>>>>>>>>>>>>>");
            System.out.println(">>>>>>>>>>");
        } else {
            System.out.println("~ ~ ~");
        }
    }
    
    public void gainExperience() {
        level += 10;
        if (level >= 70) {
            canBreatheFire = true;
        }
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon " + name + " is at level " + level;
    }
}