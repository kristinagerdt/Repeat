package islandOfKnowledge;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AreEquallyStrongTest {

    private int yourLeft;
    private int yourRight;
    private int friendsLeft;
    private int friendsRight;

    @Test
    public void testTrueAreEquallyStrong() {
        yourLeft = 10;
        yourRight = 15;
        friendsLeft = 15;
        friendsRight = 10;
        boolean expected = AreEquallyStrong.areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight);
        assertTrue(expected);
    }

    @Test
    public void testFalseAreEquallyStrong() {
        yourLeft = 10;
        yourRight = 15;
        friendsLeft = 15;
        friendsRight = 9;
        boolean expected = AreEquallyStrong.areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight);
        assertFalse(expected);
    }
}