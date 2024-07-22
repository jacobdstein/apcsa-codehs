public class EmployeeTester
{
    public static void main(String[] args)
    {
        // Start here!
        Employee a = new Employee("a", 1);
        HourlyEmployee b = new HourlyEmployee("b", 1, 10);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}