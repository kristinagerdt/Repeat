package islandOfKnowledge;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayMaximalAdjacentDifferenceTest {

    private int[] inputArray;

    @Test
    public void testFourDifferentItemsArrayMaximalAdjacentDifference() {
        inputArray = new int[]{2, 4, 1, 0};
        int actual = 3;
        int expected = ArrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFourSameItemsArrayMaximalAdjacentDifference() {
        inputArray = new int[]{1, 1, 1, 1};
        int actual = 0;
        int expected = ArrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testWithNegativeItemsArrayMaximalAdjacentDifference() {
        inputArray = new int[]{-1, 4, 10, 3, -2};
        int actual = 7;
        int expected = ArrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFourDifferentItemsArrayMaximalAdjacentDifferenceStream() {
        inputArray = new int[]{2, 4, 1, 0};
        int actual = 3;
        int expected = ArrayMaximalAdjacentDifference.arrayMaximalAdjacentDifferenceStream(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFourSameItemsArrayMaximalAdjacentDifferenceStream() {
        inputArray = new int[]{1, 1, 1, 1};
        int actual = 0;
        int expected = ArrayMaximalAdjacentDifference.arrayMaximalAdjacentDifferenceStream(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testWithNegativeItemsArrayMaximalAdjacentDifferenceStream() {
        inputArray = new int[]{-1, 4, 10, 3, -2};
        int actual = 7;
        int expected = ArrayMaximalAdjacentDifference.arrayMaximalAdjacentDifferenceStream(inputArray);
        assertEquals(expected, actual);
    }
}