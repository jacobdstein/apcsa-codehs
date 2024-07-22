public class Food
{
    private String name;
    private int calories;
    
    public Food(String foodName, int theCalories) {
        name = foodName;
        calories = theCalories;
    }
    
    public String getName() {
        return name;
    }
    public int getCalories() {
        return calories;
    }
    public void setName(String x) {
        name = x;
    }
    public void setCalories(int x) {
        calories = x;
    }
    
    public String toString() {
        return getName() + " has " + calories + " calories";
    }
}