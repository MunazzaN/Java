import java.util.ArrayList;

public class arraylisttoarray {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Convert ArrayList to Array
        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);

        // Print the elements of the array
        System.out.println("Array elements:");
        for (String fruit : stringArray) {
            System.out.println(fruit);
        }
    }
}

