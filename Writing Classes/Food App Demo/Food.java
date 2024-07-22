public class Food
{
        //Declare instance variables
        private String name;
        private int calories;
        //Create Food Constructor
        public Food (String theName, int cals) {
            name = theName;
            calories = cals;
        }
        //Add getter and setter methods for calories
        public String getName () { return name; }
        public int getCalories () { return calories; }
        public void setName (String newName) { name = newName; }
        public void setCalories (int newCals) { calories = newCals; }
        //Add getter and setter methods for name
        
        
        //Add toString method
        public String toString () { return name + " have " + calories + " calories."; }
    
}