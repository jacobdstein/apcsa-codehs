public class Car {

    // Start here
    private double efficiency;
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    
    public Car (double carEfficiency, double carTankCapacity) {
        efficiency = carEfficiency;
        tankCapacity = carTankCapacity;
    }
    
    public void addGas () {
        gas = tankCapacity;
        System.out.println("Filling up ...");
    }
    
    public void addGas (double amount) {
        if (amount > tankCapacity - gas) {
            addGas();
        } else {
            gas = gas + amount;
            System.out.println("Adding gas ...");
        }
    }
    
    public double getTotalMilesDriven () { return totalMilesDriven; }
    
    public void drive (double distance) {
        if (!canDrive(distance)) {
            System.out.println("Can't drive " + distance + ". That's too far!");
        } else {
            totalMilesDriven += distance;
            gas -= distance / efficiency;
            System.out.println("Driving " + distance);
        }
    }
    
    public boolean canDrive (double distance) {
        return milesAvailable() >= distance;
    }
    
    public double milesAvailable () {
        return efficiency * gas;
    }
    
    public double getGas () {
        return gas;
    }
}