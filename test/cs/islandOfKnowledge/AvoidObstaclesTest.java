package cs.islandOfKnowledge;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AvoidObstaclesTest {

    private int[] inputArray;

    @Test
    public void testFiveItemsAvoidObstacles() {
        inputArray = new int[]{5, 3, 6, 7, 9};
        int actual = 4;
        int expected = AvoidObstacles.avoidObstacles(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoItemsAvoidObstacles() {
        inputArray = new int[]{2, 3};
        int actual = 4;
        int expected = AvoidObstacles.avoidObstacles(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testItemMoreNineAvoidObstacles() {
        inputArray = new int[]{1, 4, 10, 6, 2};
        int actual = 7;
        int expected = AvoidObstacles.avoidObstacles(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testLargeItemsAvoidObstacles() {
        inputArray = new int[]{1000, 999};
        int actual = 6;
        int expected = AvoidObstacles.avoidObstacles(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testLargeArrayAvoidObstacles() {
        inputArray = new int[]{460, 397, 91, 542, 326, 929, 592, 721, 547, 155, 975, 307, 426,
                811, 303, 124, 270, 913, 899, 583, 67, 591, 925, 445, 916, 905, 585, 493, 606,
                625, 443, 954, 309, 743, 75, 993, 683, 962, 92, 746, 733, 145, 845, 60, 560,
                181, 934, 421, 964, 278};
        int actual = 19;
        int expected = AvoidObstacles.avoidObstacles(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFiveItemsAvoidObstaclesStream() {
        inputArray = new int[]{5, 3, 6, 7, 9};
        int actual = 4;
        int expected = AvoidObstacles.avoidObstaclesStream(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoItemsAvoidObstaclesStream() {
        inputArray = new int[]{2, 3};
        int actual = 4;
        int expected = AvoidObstacles.avoidObstaclesStream(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testItemMoreNineAvoidObstaclesStream() {
        inputArray = new int[]{1, 4, 10, 6, 2};
        int actual = 7;
        int expected = AvoidObstacles.avoidObstaclesStream(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testLargeItemsAvoidObstaclesStream() {
        inputArray = new int[]{1000, 999};
        int actual = 6;
        int expected = AvoidObstacles.avoidObstaclesStream(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testLargeArrayAvoidObstaclesStream() {
        inputArray = new int[]{460, 397, 91, 542, 326, 929, 592, 721, 547, 155, 975, 307, 426,
                811, 303, 124, 270, 913, 899, 583, 67, 591, 925, 445, 916, 905, 585, 493, 606,
                625, 443, 954, 309, 743, 75, 993, 683, 962, 92, 746, 733, 145, 845, 60, 560,
                181, 934, 421, 964, 278};
        int actual = 19;
        int expected = AvoidObstacles.avoidObstaclesStream(inputArray);
        assertEquals(expected, actual);
    }
}