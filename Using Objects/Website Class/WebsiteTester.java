public class WebsiteTester
{
    public static void main(String[] args)
    {
        Website defaultWebsite = new Website();
        Website pinecrest = new Website("pinecrest", "edu");
        Website google = new Website("google", "com", 10000000);
        System.out.println(defaultWebsite + "\n" + pinecrest + "\n" + google);
    }
}