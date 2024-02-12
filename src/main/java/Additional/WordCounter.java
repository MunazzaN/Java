package Additional;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static int countUniqueWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // Remove leading and trailing whitespace, then split the input string into words
        String[] words = input.trim().split("\\s+");

        // Create a HashMap to store unique words
        Map<String, Integer> wordMap = new HashMap<>();

        // Store words in the map with their frequency
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // Return the number of unique words (map size)
        return wordMap.size();
    }
}
