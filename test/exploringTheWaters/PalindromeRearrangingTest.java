package exploringTheWaters;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class PalindromeRearrangingTest {

    private String inputString;

    @Test
    public void testFourCharsPalindromeRearranging() {
        inputString = "aabb";
        boolean expected = PalindromeRearranging.palindromeRearranging(inputString);
        assertTrue(expected);
    }

    @Test
    public void testManySameCharsPalindromeRearranging() {
        inputString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
        boolean expected = PalindromeRearranging.palindromeRearranging(inputString);
        assertFalse(expected);
    }

    @Test
    public void testOneCharPalindromeRearranging() {
        inputString = "z";
        boolean expected = PalindromeRearranging.palindromeRearranging(inputString);
        assertTrue(expected);
    }

    @Test
    public void testFourCharsPalindromeRearrangingStream() {
        inputString = "aabb";
        boolean expected = PalindromeRearranging.palindromeRearrangingStream(inputString);
        assertTrue(expected);
    }

    @Test
    public void testManySameCharsPalindromeRearrangingStream() {
        inputString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
        boolean expected = PalindromeRearranging.palindromeRearrangingStream(inputString);
        assertFalse(expected);
    }

    @Test
    public void testOneCharPalindromeRearrangingStream() {
        inputString = "z";
        boolean expected = PalindromeRearranging.palindromeRearrangingStream(inputString);
        assertTrue(expected);
    }
}