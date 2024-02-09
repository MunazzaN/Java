package FunctionalInterface;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void find() {

        assertEquals(1, FactorialCalculator.findfactorial(0));
        assertEquals(1, FactorialCalculator.findfactorial(1));
        assertEquals(2, FactorialCalculator.findfactorial(2));
        assertEquals(6, FactorialCalculator.findfactorial(3));
        assertEquals(24, FactorialCalculator.findfactorial(4));
        assertEquals(120, FactorialCalculator.findfactorial(5));
        assertEquals(720, FactorialCalculator.findfactorial(6));

        //System.out.println(Factorial.findfactorial(5));
    }
}

