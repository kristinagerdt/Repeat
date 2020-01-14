package theJourneyBegins;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddTest {

    private int a;
    private int b;

    @Test
    public void testAdd() {
        a = 4;
        b = 2;
        int actual = a + b;
        int expected = Add.add(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testNullAdd() {
        a = 0;
        b = 0;
        int actual = a + b;
        int expected = Add.add(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeAdd() {
        a = -1;
        b = -3;
        int actual = a + b;
        int expected = Add.add(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testBigIntsAdd() {
        a = 10000;
        b = 20000;
        int actual = a + b;
        int expected = Add.add(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testMixAdd() {
        a = -100000;
        b = 20000;
        int actual = a + b;
        int expected = Add.add(a, b);
        assertEquals(expected, actual);
    }
}