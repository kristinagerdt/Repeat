package islandOfKnowledge;

import java.util.stream.IntStream;

public class ArrayMaximalAdjacentDifference {
    public static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int maxDiff = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int tempDiff = Math.abs(inputArray[i] - inputArray[i + 1]);
            if (tempDiff > maxDiff) maxDiff = tempDiff;
        }
        return maxDiff;
    }

    public static int arrayMaximalAdjacentDifferenceStream(int[] inputArray) {
        return IntStream
                .range(0, inputArray.length - 1)
                .map(i -> Math.abs(inputArray[i] - inputArray[i + 1]))
                .max()
                .orElse(0);
    }
}