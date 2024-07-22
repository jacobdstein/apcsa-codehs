public class Meal
{
    private String name;
    private String course;
    private int numServings;
    public Meal (String theName, String theCourse, int howManyServings) {
        name = theName;
        course = theCourse;
        numServings = howManyServings;
    }
    public String getName () {
        return name;
    }
    
    public String getCourse () {
        return course;
    }
    
    public int getNumberOfServings () {
        return numServings;
    }
    
    public String toString () {
        return name + " (" + course + ")";
    }
}