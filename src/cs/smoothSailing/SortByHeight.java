package cs.smoothSailing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByHeight {
    public static int[] sortByHeight(int[] a) {
        int[] result = new int[a.length];
        List<Integer> treesIndex = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                treesIndex.add(i);
            }
        }
        Arrays.sort(a);
        for (int i = 0, j = treesIndex.size(); i < result.length; i++) {
            if (!treesIndex.contains(i)) {
                result[i] = a[j];
                j++;
            } else {
                result[i] = -1;
            }
        }
        return result;
    }
}