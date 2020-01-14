package exploringTheWaters;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayChangeTest {

    private int[] inputArray;

    @Test
    public void testIdenticalItemsArrayChange() {
        inputArray = new int[]{1, 1, 1};
        int actual = 3;
        int expected = ArrayChange.arrayChange(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeItemsArrayChange() {
        inputArray = new int[]{-1000, 0, -2, 0};
        int actual = 5;
        int expected = ArrayChange.arrayChange(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFourItemsArrayChange() {
        inputArray = new int[]{2, 1, 10, 1};
        int actual = 12;
        int expected = ArrayChange.arrayChange(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testManyItemsArrayChange() {
        inputArray = new int[]{2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15};
        int actual = 13;
        int expected = ArrayChange.arrayChange(inputArray);
        assertEquals(expected, actual);
    }
}