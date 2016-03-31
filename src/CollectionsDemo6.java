
 
import java.util.List;
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.collections.ListChangeListener;
import javafx.collections.FXCollections;
 
public class CollectionsDemo6 {
 
    public static void main(String[] args) {
 
        // Use Java Collections to create the List
        List<String> list = new ArrayList<String>();
        list.add("d");
        list.add("b");
        list.add("a");
        list.add("c");
        
        // Now add observability by wrapping it with ObservableList
       ObservableList<String> observableList = FXCollections.observableList(list);
        observableList.addListener(new ListChangeListener() {
         /*   @Override
            public void onChanged(ListChangeListener.Change change) {
                System.out.println("Detected a change! ");
            }
        });
        */
            @Override
public void onChanged(ListChangeListener.Change change) {
    System.out.println("Detected a change! ");
    while (change.next()) {
        System.out.println("Was added? " + change.wasAdded());
        System.out.println("Was removed? " + change.wasRemoved());
        System.out.println("Was replaced? " + change.wasReplaced());
        System.out.println("Was permutated? " + change.wasPermutated());
        }
    }
});
            
            
        // Sort using FXCollections
        FXCollections.sort(observableList);
        
    }
}