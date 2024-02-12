package Additional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringRotationTest {

    @Test
    public void testIsRotation() {
        assertTrue(StringRotation.isRotation("abcde", "cdeab"));
        assertTrue(StringRotation.isRotation("waterbottle", "erbottlewat"));
        assertTrue(StringRotation.isRotation("12345", "34512"));
        assertFalse(StringRotation.isRotation("hello", "world"));
        assertFalse(StringRotation.isRotation("abc", "def"));
        assertFalse(StringRotation.isRotation("java", "jav"));
        assertFalse(StringRotation.isRotation("", "test"));
        assertFalse(StringRotation.isRotation("test", ""));
        assertFalse(StringRotation.isRotation("", ""));
    }
}

