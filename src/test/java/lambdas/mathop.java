package lambdas;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class mathop {
    @Test
    public void testAddition() {
        MathOperation addition = (a, b) -> a + b;
        int result = addition.operate(10, 5);

        // Verifying the result
        assertEquals(15, result);
    }
}
