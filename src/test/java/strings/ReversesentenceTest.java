package strings;

import org.junit.Test;
//import strings.ReverseString;
import static org.junit.Assert.assertEquals;

public class ReversesentenceTest {

    @Test
    public void testReverseWords() {
        // Test case 1: Basic reversal
        assertEquals("123!@# dcba", Reversesentence.reverseWords("123!@# abcd"));

        assertEquals("avaJ E2J Reverse eM", Reversesentence.reverseWords("Java J2EE Reverse Me"));

        // Test case 2: Reversal with different lengths and spaces
        assertEquals("edoc taht a peek I", Reversesentence.reverseWords("code that a keep I"));

        // Test case 3: Reversal with numbers and special characters

        // Test case 4: Empty input
        assertEquals("", Reversesentence.reverseWords(""));

        // Test case 5: Null input
        assertEquals("", Reversesentence.reverseWords(null));

        // Add more test cases as needed
    }
}