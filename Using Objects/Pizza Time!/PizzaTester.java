public class PizzaTester 
{
    public static void main(String[] args)
    {
        // Test your Pizza class here.
        Pizza margarita = new Pizza(
            "Margarita", "Mozzarella and Basil", 12);
        
        Pizza cheese = new Pizza(
            "Cheese", "Cheese", 12);
            
        Pizza pepperoni = new Pizza(
            "Pepperoni", "Pepperoni", 12);
            
        System.out.println(margarita);
        System.out.println(cheese);
        System.out.println(pepperoni);
        
    }
}