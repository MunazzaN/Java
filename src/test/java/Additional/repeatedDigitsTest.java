import Additional.repeatedDigits;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class repeatedDigitsTest {
    @Test
    public void testFindRepeatedDigits() {
        // Test case: Repeated digits in the number 122345566
        List<Integer> result = repeatedDigits.findRepeatedDigits(122345566);
        assertEquals(List.of(2, 5, 6), result);

        // Test case: No repeated digits in the number 123
        List<Integer> resultNoRepeats = repeatedDigits.findRepeatedDigits(123);
        assertEquals(List.of(), resultNoRepeats);

        // Test case: Repeated digits in the number 112233
        List<Integer> resultRepeatsAgain = repeatedDigits.findRepeatedDigits(112233);
        assertEquals(List.of(1, 2, 3), resultRepeatsAgain);

    }

}