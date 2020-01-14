package islandOfKnowledge;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AvoidObstacles {
    public static int avoidObstacles(int[] inputArray) {
        int div = 2, i = 0;
        while (i != inputArray.length) {
            for (i = 0; i < inputArray.length; i++) {
                if (inputArray[i] % div == 0) {
                    div++;
                    break;
                }
            }
        }
        return div;
    }

    public static int avoidObstaclesFor(int[] inputArray) {
        int div, i;
        for (div = 2; div <= 1000; div++) {
            for (i = 0; i < inputArray.length; i++) {
                if (inputArray[i] % div == 0) break;
            }
            if (i == inputArray.length) break;
        }
        return div;
    }

    public static int avoidObstaclesStream(int[] inputArray) {
        return IntStream
                .range(2, Arrays.stream(inputArray).max().getAsInt() + 2)
                .filter(div -> Arrays.stream(inputArray).allMatch(item -> item % div != 0))
                .min()
                .orElse(-1);
    }
}