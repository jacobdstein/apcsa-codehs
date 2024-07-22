public class ActivityTracker
{
    public static void main(String[] args)
    {
        ActivityLog mylog = new ActivityLog(); // makes mylog object
        
        mylog.addMiles(5); // adds miles to mylog
        mylog.addHours(1); // adds hours to mylog
        
        System.out.print("Total Miles: "); // prints message
        System.out.println(mylog.getMiles()); // prints mylog miles
        
        double hoursToday = mylog.getHours(); // stores mylog hours into variable
        
        mylog.addHours(1.5); // adds hours
        mylog.addHours(3);
        
        double increase = mylog.getHours() - hoursToday;
        
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}