package exception;
import exception.Stringtointeger;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Stringtointegertest {

    @Test
    public void testConvertToIntegerWithValidInput() {
        Stringtointeger converter = new Stringtointeger();
        String input = "23";
        int expected = 23;
        int result = converter.convertToInteger(input);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertToIntegerWithDecimalInput() {
        Stringtointeger converter = new Stringtointeger();
        String input = "45.67";
        try {
            converter.convertToInteger(input);
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            assertEquals("For input string: \"45.67\"", e.getMessage());
        }
    }

    @Test
    public void testConvertToIntegerWithNonNumericInput() {
        Stringtointeger converter = new Stringtointeger();
        String input = "test";
        try {
            converter.convertToInteger(input);
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            assertEquals("For input string: \"test\"", e.getMessage());
        }
    }

    @Test
    public void testConvertToIntegerWithAlphaNumericInput() {
        Stringtointeger converter = new Stringtointeger();
        String input = "123f";
        try {
            converter.convertToInteger(input);
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            assertEquals("For input string: \"123f\"", e.getMessage());
        }
    }
}

