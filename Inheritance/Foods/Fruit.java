public class Fruit extends HealthyFood
{
    private boolean inSeason;
    private String vitamins;
    
    public Fruit(String foodName, int calories, String foodColor, boolean isInSeason, String majorVitamins) {
        super(foodName, calories, "Fruit", foodColor);
        inSeason = isInSeason;
        vitamins = majorVitamins;
    }
    
    public boolean isInSeason() {
        return inSeason;
    }
    public String getVitamins() {
        return vitamins;
    }
    public void setIsInSeason(boolean x) {
        inSeason = x;
    }
    public void setVitamins(String x) {
        vitamins = x;
    }
    
}