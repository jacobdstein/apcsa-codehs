public class CompanyTester
{
    public static void main(String[] args)
    {
        Company a = new Company("a", "a", "a", "a");
        OnlineCompany b = new OnlineCompany("b", "b");
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}