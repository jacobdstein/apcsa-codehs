public class Routine
{
    private double school;
    private double sleep;
    private double friends;
    private double hobbies;
    
    public Routine (double hrsSchool, double hrsSleep, double hrsFriends, double hrsHobbies) {
        school = hrsSchool;
        sleep = hrsSleep;
        friends = hrsFriends;
        hobbies = hrsHobbies;
    }
    
    public Routine () {
        
    }
    public double getSchool() {
        return school;
    }
    
    public double getSleep() {
        return sleep;
    }
    
    public double getFriends() {
        return friends;
    }
    
    public double getHobbies() {
        return hobbies;
    }
    
    public void setSchool(double x) {
        school = x;
    }
    
    public void setSleep(double x) {
        sleep = x;
    }
    
    public void setFriends(double x) {
        friends = x;
    }
    
    public void setHobbies(double x) {
        hobbies = x;
    }
    
    public void printTotal() {
        System.out.println("How You Spend Your Week\nAt School: " + school * 7 + 
        "\nSleeping: " + sleep * 7 + "\nWith Friends: " + friends * 7 + 
        "\nDoing fun stuff: " + hobbies * 7 + "\nYou're busy " +
        (school + sleep + friends + hobbies ) * 7 + " hours a week!");
    }
}