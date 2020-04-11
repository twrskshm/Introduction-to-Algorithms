/*
Chapter 2: Getting Started
2.1 Insertion sort
*/

public class InsertionSort {
    void insertionSort(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;

            while (j > 0 && array[j - 1] > array[j]) {
                int swapValue = array[j - 1];
                array[j - 1] = array[j];
                array[j--] = swapValue;
            }
        }
    }
}
