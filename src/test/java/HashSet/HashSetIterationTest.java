import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterationTest {

    @Test
    public void testHashSetIteration() {
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Mango");
        stringSet.add("Grapes");
        stringSet.add("Pineapple");
        stringSet.add("Strawberry");
        stringSet.add("Watermelon");
        stringSet.add("Peach");
        stringSet.add("Kiwi");

        // Iterating HashSet using Iterator
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterating HashSet using for loop
        System.out.println("Iterating using for loop:");
        for (String fruit : stringSet) {
            System.out.println(fruit);
        }

        // Iterating HashSet using enhanced for loop
        System.out.println("Iterating using enhanced for loop:");
        stringSet.forEach(System.out::println);

        // JUnit test to verify the size of the HashSet
        assertEquals(10, stringSet.size());
    }
}

