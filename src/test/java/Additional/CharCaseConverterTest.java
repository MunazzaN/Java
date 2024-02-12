package Additional;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharCaseConverterTest {

    @Test
    public void testConvertCase() {
        assertEquals("hELLO wORLD", CharacterCaseConverter.convertCase("Hello World"));
        assertEquals("12345", CharacterCaseConverter.convertCase("12345"));
        assertEquals("eXAMPLE", CharacterCaseConverter.convertCase("Example"));
        assertEquals("tEST cASE", CharacterCaseConverter.convertCase("Test Case"));
        assertEquals("jAVa", CharacterCaseConverter.convertCase("Java"));
    }
}

