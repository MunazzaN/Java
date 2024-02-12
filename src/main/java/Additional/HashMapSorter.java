package Additional;
import java.util.*;

public class HashMapSorter {

    public static Map<String, Integer> sortHashMap(Map<String, Integer> unsortedMap) {
        // Convert HashMap entries to a List
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());

        // Sort the list based on values (Integer in this case)
        entryList.sort(Map.Entry.comparingByValue());

        // Create a LinkedHashMap to preserve the order of sorted entries
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}

