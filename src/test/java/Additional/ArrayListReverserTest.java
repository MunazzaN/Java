package Additional;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListReverserTest {

    @Test
    public void testReverseArrayList() {
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);

        ArrayList<Integer> expectedReversed = new ArrayList<>();
        expectedReversed.add(5);
        expectedReversed.add(4);
        expectedReversed.add(3);
        expectedReversed.add(2);
        expectedReversed.add(1);

        ArrayListReverser.reverseArrayList(originalList);

        assertEquals(expectedReversed, originalList);
    }
}

