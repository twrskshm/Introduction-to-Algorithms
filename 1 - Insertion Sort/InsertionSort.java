/*
Chapter 2: Getting Started
2.1 Insertion sort

Worst case: O(n^2)
Best case: O(n)
*/

public class InsertionSort {
    // Using iteration.
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

    // Using recursion.
    void insertionSort(final int[] array, final int index) {
        if (index > 0) {
            insertionSort(array, index - 1);
            insertElement(array, index);
        }
    }

    void insertElement(final int[] array, int index) {
        while (index > 0 && array[index - 1] > array[index]) {
            int swapValue = array[index - 1];
            array[index - 1] = array[index];
            array[index--] = swapValue;
        }
    }
}
