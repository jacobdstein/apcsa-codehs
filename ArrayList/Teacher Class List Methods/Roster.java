import java.util.ArrayList;

public class Roster
{
    // Implement the student ArrayList 
    // or copy from previous exercise
    private ArrayList<Student> roster = new ArrayList<Student>();
    
    public static void addStudent(String name, int grade)
    {
        // Create Student
        // or copy from previous exercise
        
        
        // Add to classList
        // or copy from previous exercise
        roster.add(new Student(name, grade));
    }
    
    
    //Add the static methods here:
    
    public Student getLastStudent() {
        return roster.get(roster.size() -1);
    }

    public int getClassSize() {
        return roster.size();
    }
    
    public Student getStudent(int index) {
        return (roster.get(index));
    }

    public static String printClassList()
    {
        String names = "";
        for(Student name: classList)
        {
            names+= name.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }
}