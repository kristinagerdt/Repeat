package cs.smoothSailing;

import java.util.ArrayList;
import java.util.List;

public class IsLucky {
    public static boolean isLucky(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        int sumF = 0, sumL = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() / 2) {
                sumF += list.get(i);
            } else {
                sumL += list.get(i);
            }
        }
        return sumF == sumL;
    }
}