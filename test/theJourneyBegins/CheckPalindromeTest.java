package theJourneyBegins;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckPalindromeTest {

    private String inputString;

    @Test
    public void testPalindromeEvenStringCheckPalindrome() {
        inputString = "abba";
        boolean expected = CheckPalindrome.checkPalindrome(inputString);
        assertTrue(expected);
    }

    @Test
    public void testPalindromeOddStringCheckPalindrome() {
        inputString = "abcba";
        boolean expected = CheckPalindrome.checkPalindrome(inputString);
        assertTrue(expected);
    }

    @Test
    public void testNotPalindromeStringCheckPalindrome() {
        inputString = "abab";
        boolean expected = CheckPalindrome.checkPalindrome(inputString);
        assertFalse(expected);
    }

    @Test
    public void testEmptyStringCheckPalindrome() {
        inputString = "";
        boolean expected = CheckPalindrome.checkPalindrome(inputString);
        assertTrue(expected);
    }

    @Test
    public void testNumbersStringCheckPalindrome() {
        inputString = "123321";
        boolean expected = CheckPalindrome.checkPalindrome(inputString);
        assertTrue(expected);
    }
}