package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = fillRandom();
        print(array);
        sort(array, 0, array.length - 1);
        print(array);
    }

    private static void sort(int[] array, int low, int high) {
        if (low < high) {
            int pIndex = partition(array, low, high);
            sort(array, low, pIndex - 1);
            sort(array, pIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
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