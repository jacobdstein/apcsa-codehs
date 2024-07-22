public class ClothingTester
{
    public static void main(String[] args)
    {
        Clothing a = new Clothing("a", "a");
        Jeans b = new Jeans("a");
        Sweatshirt c = new Sweatshirt("a", "a", true);
        TShirt d = new TShirt("a", "a", "a");
        
        System.out.println(a.getSize() + a.getColor());
        System.out.println(b.getSize() + b.getColor());
        System.out.println(c.getSize() + c.getColor() + c.hasHood());
        System.out.println(d.getSize() + d.getColor() + d.getFabric());
        
    }
}