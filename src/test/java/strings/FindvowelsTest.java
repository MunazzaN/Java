package strings;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class FindvowelsTest {

    @Test
    public void testCountVowels() {
        // Test case 1: Valid input with vowels
        assertEquals(3, Findvowels.countVowels("Hello World"));

        // Test case 2: Valid input with no vowels
        assertEquals(0, Findvowels.countVowels("BCDFG"));

        // Test case 3: Empty string
        assertEquals(0, Findvowels.countVowels(""));

        // Test case 4: Null input
        assertEquals(0, Findvowels.countVowels(null));  //failure

        // Test case 5: Valid input with mixed characters
        assertEquals(4, Findvowels.countVowels("Programming"));

        // Test case 6: Valid input with uppercase vowels
        assertEquals(3, Findvowels.countVowels("Java Programming"));

        // Test case 7: Valid input with numbers and special characters
        assertEquals(3, Findvowels.countVowels("123!@#"));

    }
}