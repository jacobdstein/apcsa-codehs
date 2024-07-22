public class Salutations
{
    // Put your code here
    private String name;
    
    public Salutations (String theName)
    {
        name = theName;
    }
    
    public void addressLetter()
    {
        System.out.println("Dear " + name);
    }
    
    public void signLetter()
    {
        System.out.println("Sincerely, \n" + name);
    }
    
    public void addressMemo()
    {
        System.out.println("To whom it may concern");
    }
    
    public void signMemo()
    {
        System.out.println("Best, \n" + name);
    }
}