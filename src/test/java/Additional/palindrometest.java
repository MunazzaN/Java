package Additional;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class palindrometest {

    @Test
    public void testIsPalindromeWithPalindromeNumber() {
        int palindromeNumber = 12321;
        assertTrue(palin.isPalindrome(palindromeNumber));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeNumber() {
        int nonPalindromeNumber = 12345;
        assertFalse(palin.isPalindrome(nonPalindromeNumber));
    }
}





