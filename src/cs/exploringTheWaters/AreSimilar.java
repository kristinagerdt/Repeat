package cs.exploringTheWaters;

import java.util.ArrayList;
import java.util.List;

public class AreSimilar {
    public static boolean areSimilar(int[] a, int[] b) {
        int count = 0;
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                count++;
                indexes.add(i);
            }
        }
        return (count == 0 || (count == 2 && a[indexes.get(0)] == b[indexes.get(1)] &&
                a[indexes.get(1)] == b[indexes.get(0)]));
    }
}