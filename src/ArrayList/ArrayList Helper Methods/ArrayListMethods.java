import java.util.ArrayList;

public class ArrayListMethods
{
    public static void print(ArrayList<Double> arrList) {
        for (double num : arrList) {
            System.out.println(num);
        }
    }
    
    public static void condense(ArrayList<Double> arrList) {
        for (int i = 1; i < arrList.size(); i++) {
            arrList.set(i, (arrList.get(i) * arrList.get(i-1)));
            arrList.remove(i-1);
        }
    }
    
    public static void duplicate(ArrayList<Double> arrList) {
        int size = arrList.size();
        for (int i = 0; i < size; i++) {
            arrList.add(arrList.get(i));
        }
    }
}