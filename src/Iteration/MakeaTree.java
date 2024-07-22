public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    {
        String spaces = "";
        for (int star = 9; star > 0; star--) {
            System.out.print(spaces);
            for (int row = star; row > 0; row--) {
                System.out.print("* ");
            }
            spaces += " ";
            System.out.println();
        }
    }
}