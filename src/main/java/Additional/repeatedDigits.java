package Additional;
import java.util.*;

public class repeatedDigits {
    public static List<Integer> findRepeatedDigits(int number) {
        HashMap<Character, Integer> digitCount = new HashMap<>();
        List<Integer> repeatedDigits = new ArrayList<>();

        // Convert the number to a string to iterate through its digits
        String numberStr = Integer.toString(number);

        // Count the occurrences of each digit
        for (char digit : numberStr.toCharArray()) {
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
        }

        // Check for repeated digits
        for (char digit : digitCount.keySet()) {
            if (digitCount.get(digit) > 1) {
                repeatedDigits.add(Character.getNumericValue(digit));
            }
        }

        return repeatedDigits;
    }

}