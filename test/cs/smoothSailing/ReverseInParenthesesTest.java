package cs.smoothSailing;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseInParenthesesTest {

    private String inputString;

    @Test
    public void testOneBracketReverseInParentheses() {
        inputString = "(bar)";
        String actual = "rab";
        String expected = ReverseInParentheses.reverseInParentheses(inputString);
        assertEquals(expected, actual);
    }

    @Test
    public void testOneBracket2ReverseInParentheses() {
        inputString = "foo(bar)baz";
        String actual = "foorabbaz";
        String expected = ReverseInParentheses.reverseInParentheses(inputString);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoBracketsInsideReverseInParentheses() {
        inputString = "foo(bar(baz))blim";
        String actual = "foobazrabblim";
        String expected = ReverseInParentheses.reverseInParentheses(inputString);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoBracketsSeparateReverseInParentheses() {
        inputString = "foo(bar)baz(blim)";
        String actual = "foorabbazmilb";
        String expected = ReverseInParentheses.reverseInParentheses(inputString);
        assertEquals(expected, actual);
    }

    @Test
    public void testWithoutBracketsReverseInParentheses() {
        inputString = "baz";
        String actual = "baz";
        String expected = ReverseInParentheses.reverseInParentheses(inputString);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyStringReverseInParentheses() {
        inputString = "";
        String actual = "";
        String expected = ReverseInParentheses.reverseInParentheses(inputString);
        assertEquals(expected, actual);
    }
}