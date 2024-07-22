public class DogTester
{
    public static void main(String[] args)
    {
        // Start here
        Dog a = new Dog("a");
        a.speak();
        LoudDog b = new LoudDog("b");
        b.speak();
        System.out.println(a.toString());
        System.out.println(b.toString());
        
    }
}