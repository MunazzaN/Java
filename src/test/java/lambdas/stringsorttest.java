package lambdas;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class stringsorttest {

    @Test
    public void testSortStrings() {
        stringsort sorter = new stringsort();
        String[] inputArray = {"apple", "banana", "cherry", "kiwi", "orange"};
        String[] expected = {"kiwi", "apple", "cherry", "orange", "banana"};
        String[] result = sorter.sortStrings(inputArray);
        assertArrayEquals(expected, result);
    }
}