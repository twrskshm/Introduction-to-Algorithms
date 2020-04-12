/*
Chapter 2: Getting Started
2.1 Insertion sort
*/

public class InsertionSort {
    void insertionSort(final int[] array) {
        for (int iterator = 1; iterator < array.length; iterator++) {
            int currentIndex = iterator;

            while (currentIndex > 0 && array[currentIndex - 1] > array[currentIndex]) {
                int swapValue = array[currentIndex - 1];
                array[currentIndex - 1] = array[currentIndex];
                array[currentIndex--] = swapValue;
            }
        }
    }
}
