package Additional;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMapSorterTest {

    @Test
    public void HashMapSorterTest() {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("apple", 5);
        unsortedMap.put("banana", 2);
        unsortedMap.put("orange", 8);
        unsortedMap.put("grape", 3);

        Map<String, Integer> sortedMap = HashMapSorter.sortHashMap(unsortedMap);

        // Verify the sorted order
        assertEquals("banana", sortedMap.keySet().toArray()[0]);
        assertEquals("grape", sortedMap.keySet().toArray()[1]);
        assertEquals("apple", sortedMap.keySet().toArray()[2]);
        assertEquals("orange", sortedMap.keySet().toArray()[3]);

        // Verify the corresponding values
        assertEquals(2, sortedMap.get("banana"));
        assertEquals(3, sortedMap.get("grape"));
        assertEquals(5, sortedMap.get("apple"));
        assertEquals(8, sortedMap.get("orange"));
    }
}
