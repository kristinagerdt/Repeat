package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = fillRandom();
        print(array);
        sort(array);
        print(array);
    }

    private static void sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static int[] fillRandom() {
        int size = (int) (Math.random() * 9) + 2; //2-10
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 19) + 2; //2-20
        }
        return array;
    }
}