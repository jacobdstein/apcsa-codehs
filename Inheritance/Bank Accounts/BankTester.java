public class BankTester
{
    public static void main(String[] args)
    {
        // Test both of your classes
        // Make sure you call every method you wrote!
        Account a = new Account(1, 1);
        StudentAccount b = new StudentAccount(2, 2);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}