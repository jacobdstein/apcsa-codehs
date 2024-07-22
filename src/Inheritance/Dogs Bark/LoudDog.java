public class LoudDog extends Dog
{
   
   public LoudDog(String name){
       super(name);
   }
   
   // Override the speak method here
   public String speak() {
       return "BARK!";
   }
   
   //Override the toString here.
   //Remember, you can access the name using super.getName()
   public String toString() {
       return getName() + " is loud and likes to BARK!";
   }
}