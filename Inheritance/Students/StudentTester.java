public class StudentTester
{
    public static void main(String[] args)
    {
        
        /**
         * Create a student with id # 123987, GPA: 2.56
         */
         Student a = new Student("a", 123987, 2.56);
         
         /**
         * Create a student athlete with id # 987456, GPA: 3.47,
         * who plays lacrosse for the varsity team 
         */
         StudentAthlete b = new StudentAthlete("b", 987456, 3.47, "Lacrosse", "Varsity");
         
         // Print out both objects
         System.out.println(a);
         System.out.println(b);
         
    }
}