package FunctionalInterface;
import org.junit.Test;

import static org.junit.Assert.*;
public class palindrometest {

    @Test
    public void testIsPalindromeTrue() {
        assertTrue(FunctionalInterface.palin.isPalindrome(1221));
    }

    @Test
    public void testIsPalindromeFalse() {
        assertFalse(FunctionalInterface.palin.isPalindrome(12345));
    }
}




