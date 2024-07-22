public class SnapShot
{
    public static void main(String[] args)
    {
        String[] text = {"Welcome", "to", "the snap shot", "app!"};
        for (int i = 0; i < text.length; i++) {
            System.out.println(text[i]);
        }
        text[0] = "Upgrade";
        text[3] = "premium app!";
        System.out.println();
        for (int i = 0; i < text.length; i++) {
            System.out.println(text[i]);
        }
    }
}