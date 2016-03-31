
 
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
 
public class Collectionsdemo3 {
 
    public static void main(String[] args) {
        System.out.println("Creating the list...");
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        printElements(list);
        System.out.println("Reversing the elements...");
        Collections.reverse(list);
        printElements(list);
 
        System.out.println("Swapping the elements around...");
        Collections.swap(list, 0, 3);
        Collections.swap(list, 2, 0);
        printElements(list);
 
        System.out.println("Alphabetically sorting the elements...");
        Collections.sort(list);
        printElements(list);
    }
 
    private static void printElements(List<String> list) {
        for (Object o : list) {
            System.out.println(o.toString());
        }
    }
}