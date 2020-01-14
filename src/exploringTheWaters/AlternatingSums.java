package exploringTheWaters;

import java.util.stream.IntStream;

public class AlternatingSums {
    public static int[] alternatingSums(int[] a) {
        int[] result = new int[2];
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                result[0] += a[i];
            } else {
                result[1] += a[i];
            }
        }
        return result;
    }

    public static int[] alternatingSumsStream(int[] a) {
        int[] result = new int[2];
        result[0] = IntStream
                .range(0, a.length)
                .filter(i -> i % 2 == 0)
                .map(i -> a[i])
                .sum();
        result[1] = IntStream
                .range(0, a.length)
                .filter(i -> i % 2 != 0)
                .map(i -> a[i])
                .sum();
        return result;
    }
}