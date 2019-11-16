package cs.islandOfKnowledge;

public class AreEquallyStrong {
    public static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return yourLeft == friendsLeft && yourRight == friendsRight ||
                yourLeft == friendsRight && yourRight == friendsLeft;
    }
}