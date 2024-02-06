package ExceptionHandling;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class exceptiontest {

    @Test
    public void testValidIntegerString() {
        assertEquals(23, exception.convertStringToInteger("23"));
    }

    @Test
    public void testFloatingPointString() {
        assertThrows(IllegalArgumentException.class, () -> {
            exception.convertStringToInteger("45.67");
        });
    }

    @Test
    public void testNonNumericString() {
        assertThrows(IllegalArgumentException.class, () -> {
            exception.convertStringToInteger("test");
        });
    }

    @Test
    public void testAlphaNumericString() {
        assertThrows(IllegalArgumentException.class, () -> {
            exception.convertStringToInteger("123f");
        });
    }
}

