/*
Chapter 2: Getting Started
2.2 Selection sort

Worst case: O(n^2)
Best case: O(n^2)
*/

public class SelectionSort {
    // Using iteration.
    void selectionSort(final int[] array) {
        for (int iterator = 0; iterator < array.length - 1; iterator++) {
            int smallestElementIndex = iterator;

            for (int currentIndex = iterator + 1; currentIndex < array.length; currentIndex++)
                if (array[smallestElementIndex] > array[currentIndex])
                    smallestElementIndex = currentIndex;

            int swapValue = array[iterator];
            array[iterator] = array[smallestElementIndex];
            array[smallestElementIndex] = swapValue;
        }
    }

    // Using recursion.
    void selectionSort(final int[] array, final int index) {
        if (index >= 0) {
            selectionSort(array, index - 1);
            swapWithSmallest(array, index);
        }
    }

    void swapWithSmallest(final int[] array, final int index) {
        int smallestElementIndex = index;

        for (int iterator = index + 1; iterator < array.length; iterator++)
            if (array[iterator] < array[smallestElementIndex])
                smallestElementIndex = iterator;

        int swapValue = array[index];
        array[index] = array[smallestElementIndex];
        array[smallestElementIndex] = swapValue;
    }
}
