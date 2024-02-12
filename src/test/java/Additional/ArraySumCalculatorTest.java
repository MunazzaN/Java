package Additional;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySumCalculatorTest {

    @Test
    public void testCalculateSum() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(15, ArraySumCalculator.calculateSum(array1));

        int[] array2 = {0, 0, 0, 0, 0};
        assertEquals(0, ArraySumCalculator.calculateSum(array2));

        int[] array3 = {-1, 1, -1, 1, -1};
        assertEquals(-1, ArraySumCalculator.calculateSum(array3));

        int[] array4 = {-5, -4, -3, -2, -1};
        assertEquals(-15, ArraySumCalculator.calculateSum(array4));
    }
}

