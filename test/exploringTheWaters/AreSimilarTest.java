package exploringTheWaters;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class AreSimilarTest {

    private int[] a;
    private int[] b;

    @Test
    public void testEqualArraysAreSimilar() {
        a = new int[]{1, 2, 3};
        b = new int[]{1, 2, 3};
        boolean expected = AreSimilar.areSimilar(a, b);
        assertTrue(expected);
    }

    @Test
    public void testThreeItemsSimilarArraysAreSimilar() {
        a = new int[]{1, 2, 3};
        b = new int[]{2, 1, 3};
        boolean expected = AreSimilar.areSimilar(a, b);
        assertTrue(expected);
    }

    @Test
    public void testManyItemsSimilarArraysAreSimilar() {
        a = new int[]{832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        b = new int[]{832, 998, 148, 570, 533, 561, 455, 147, 894, 279};
        boolean expected = AreSimilar.areSimilar(a, b);
        assertTrue(expected);
    }

    @Test
    public void testThreeItemsNotSimilarArraysAreSimilar() {
        a = new int[]{1, 2, 2};
        b = new int[]{2, 1, 1};
        boolean expected = AreSimilar.areSimilar(a, b);
        assertFalse(expected);
    }

    @Test
    public void testFourItemsNotSimilarArraysAreSimilar() {
        a = new int[]{1, 2, 3, 5};
        b = new int[]{2, 10, 2, 8};
        boolean expected = AreSimilar.areSimilar(a, b);
        assertFalse(expected);
    }

    @Test
    public void testEmptyArraysAreSimilar() {
        a = new int[]{};
        b = new int[]{};
        boolean expected = AreSimilar.areSimilar(a, b);
        assertTrue(expected);
    }
}