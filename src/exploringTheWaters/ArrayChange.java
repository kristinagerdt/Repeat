package exploringTheWaters;

public class ArrayChange {
    public static int arrayChange(int[] inputArray) {
        int count = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] >= inputArray[i + 1]) {
                int addition = (inputArray[i] - inputArray[i + 1]) + 1;
                count += addition;
                inputArray[i + 1] += addition;
            }
        }
        return count;
    }
}