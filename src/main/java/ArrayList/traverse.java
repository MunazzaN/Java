import java.util.ArrayList;

public class traverse {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Using regular for loop
        System.out.println("Using regular for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        // Using enhanced for loop (for-each loop)
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }
}

