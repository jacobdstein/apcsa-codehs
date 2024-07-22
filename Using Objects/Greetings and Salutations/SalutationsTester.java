import java.util.Scanner;

public class SalutationsTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String myName = input.nextLine();
        Salutations me = new Salutations(myName);
        me.addressLetter();
        me.signLetter();
        me.addressMemo();
        me.signMemo();
    }
}