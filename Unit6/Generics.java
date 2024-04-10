import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        // Creating a generic list of strings
        List<String> stringList = new ArrayList<>();
        
        // Adding elements to the list
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        
        // Iterating through the list
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
