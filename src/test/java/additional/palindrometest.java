package additional;
import org.junit.Test;
import additional.palin;
import static org.junit.Assert.*;
public class palindrometest {

    @Test
    public void testIsPalindromeTrue() {
        assertTrue(additional.palin.isPalindrome(1221));
    }

    @Test
    public void testIsPalindromeFalse() {
        assertFalse(additional.palin.isPalindrome(12345));
    }
}




