public class ActivityLog
{
    private double numHours;
    private double numMiles;
    //constructor for ActivityLog
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    /**
     * adds hours to activity log
     * @param hours
     */
    public void addHours(double hours)
    {
        numHours += hours;
    }
    /**
     * adds miles to activity log
     * @param miles
     */
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    /**
     * gets miles
     * @return miles
     */
    public double getMiles()
    {
        return numMiles;
    }
    /**
     * gets hours
     * @return hours
     */
    public double getHours() 
    {
        return numHours;
    }
    
}