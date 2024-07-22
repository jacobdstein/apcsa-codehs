import java.util.Scanner;

public class PersonTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Person's name: ");
        String name1 = input.nextLine();
        System.out.print("Please enter the Person's birthday: ");
        String bday1 = input.nextLine();
        Person one = new Person(name1, bday1);
        System.out.print("Please enter the Student's name: ");
        String name2 = input.nextLine();
        System.out.print("Please enter the Student's birthday: ");
        String bday2 = input.nextLine();
        System.out.print("Please enter the Student's grade: ");
        int grade = input.nextInt();
        Person two = new Student(name2, bday2, grade);
        System.out.println("Same: " + one.equals(two));
    }
}