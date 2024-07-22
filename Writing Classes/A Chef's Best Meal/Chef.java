public class Chef
{
    private String name;
    private String restaurant;
    private Meal bestMeal;
    
    public Chef (String theName, String theRestaurant, Meal theMeal) {
        name = theName;
        restaurant = theRestaurant;
        bestMeal = new Meal(theMeal.getName(), theMeal.getCourse(), theMeal.getNumberOfServings());
    }
    
    public String getName () {
        return name;
    }
    
    public String getRestaurant () {
        return restaurant;
    }
    
    public String getMealName () {
        return bestMeal.getName();
    }
    
    public String getMealCourse () {
        return bestMeal.getCourse();
    }
    
    public int getMealServings () {
        return bestMeal.getNumberOfServings();
    }
    
    public String toString () {
        return name + " works at " + restaurant + 
        " and is best known for " + bestMeal.toString();
    }
}