package lambdas;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class sumofsquarestest {

    @Test
    public void testCalculateSumOfSquares() {
        sumofsquares calculator = new sumofsquares();
        List<Integer> inputNumbers = Arrays.asList(1, 2, 3, 4, 5);
        int expectedSum = 1 + 4 + 9 + 16 + 25;

        int result = calculator.calculateSumOfSquares(inputNumbers);

        assertEquals(expectedSum, result);
    }

    @Test
    public void testCalculateSumOfSquaresWithNegativeNumbers() {
        sumofsquares calculator = new sumofsquares();
        List<Integer> inputNumbers = Arrays.asList(-1, -2, -3, -4, -5);
        int expectedSum = 0; // No positive integers, so sum of squares should be 0

        int result = calculator.calculateSumOfSquares(inputNumbers);

        assertEquals(expectedSum, result);
    }

    @Test
    public void testCalculateSumOfSquaresWithEmptyList() {
        sumofsquares calculator = new sumofsquares();
        List<Integer> inputNumbers = Arrays.asList();
        int expectedSum = 0; // Empty list, so sum of squares should be 0

        int result = calculator.calculateSumOfSquares(inputNumbers);

        assertEquals(expectedSum, result);
    }
}

