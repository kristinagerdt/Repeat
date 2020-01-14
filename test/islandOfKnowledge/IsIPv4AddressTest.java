package islandOfKnowledge;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class IsIPv4AddressTest {

    private String inputString;

    @Test
    public void testCorrectStringIsIPv4Address() {
        inputString = "172.16.254.1";
        boolean expected = IsIPv4Address.isIPv4Address(inputString);
        assertTrue(expected);
    }

    @Test
    public void testCorrectAllSameStringIsIPv4Address() {
        inputString = "0.0.0.0";
        boolean expected = IsIPv4Address.isIPv4Address(inputString);
        assertTrue(expected);
    }

    @Test
    public void testOneItemOverIsIPv4Address() {
        inputString = "172.316.254.1";
        boolean expected = IsIPv4Address.isIPv4Address(inputString);
        assertFalse(expected);
    }

    @Test
    public void testOneItemEmptyIsIPv4Address() {
        inputString = ".254.255.0";
        boolean expected = IsIPv4Address.isIPv4Address(inputString);
        assertFalse(expected);
    }

    @Test
    public void testOneItemNotCorrectIsIPv4Address() {
        inputString = "1.1.1.1a";
        boolean expected = IsIPv4Address.isIPv4Address(inputString);
        assertFalse(expected);
    }

    @Test
    public void testOneItemIsIPv4Address() {
        inputString = "1";
        boolean expected = IsIPv4Address.isIPv4Address(inputString);
        assertFalse(expected);
    }

    @Test
    public void testFourDotsIsIPv4Address() {
        inputString = "1.23.256..";
        boolean expected = IsIPv4Address.isIPv4Address(inputString);
        assertFalse(expected);
    }

    @Test
    public void testLargeItemIsIPv4Address() {
        inputString = "129380129831213981.255.255.255";
        boolean expected = IsIPv4Address.isIPv4Address(inputString);
        assertFalse(expected);
    }

    @Test
    public void testCorrectStringIsIPv4AddressStream() {
        inputString = "172.16.254.1";
        boolean expected = IsIPv4Address.isIPv4AddressStream(inputString);
        assertTrue(expected);
    }

    @Test
    public void testCorrectAllSameStringIsIPv4AddressStream() {
        inputString = "0.0.0.0";
        boolean expected = IsIPv4Address.isIPv4AddressStream(inputString);
        assertTrue(expected);
    }

    @Test
    public void testOneItemOverIsIPv4AddressStream() {
        inputString = "172.316.254.1";
        boolean expected = IsIPv4Address.isIPv4AddressStream(inputString);
        assertFalse(expected);
    }

    @Test
    public void testOneItemEmptyIsIPv4AddressStream() {
        inputString = ".254.255.0";
        boolean expected = IsIPv4Address.isIPv4AddressStream(inputString);
        assertFalse(expected);
    }

    @Test
    public void testOneItemNotCorrectIsIPv4AddressStream() {
        inputString = "1.1.1.1a";
        boolean expected = IsIPv4Address.isIPv4AddressStream(inputString);
        assertFalse(expected);
    }

    @Test
    public void testOneItemIsIPv4AddressStream() {
        inputString = "1";
        boolean expected = IsIPv4Address.isIPv4AddressStream(inputString);
        assertFalse(expected);
    }

    @Test
    public void testFourDotsIsIPv4AddressStream() {
        inputString = "1.23.256..";
        boolean expected = IsIPv4Address.isIPv4AddressStream(inputString);
        assertFalse(expected);
    }

    @Test
    public void testLargeItemIsIPv4AddressStream() {
        inputString = "129380129831213981.255.255.255";
        boolean expected = IsIPv4Address.isIPv4AddressStream(inputString);
        assertFalse(expected);
    }
}