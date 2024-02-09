package lambdas;

import org.junit.Test;

public class vowelstest {
    @Test
    public void testPrintStringsWithVowels() {
        vowels manipulator = new vowels();
        String[] inputArray = {"banana", "apple", "Cherry"};
        manipulator.printStringsWithVowels(inputArray);
    }
}
