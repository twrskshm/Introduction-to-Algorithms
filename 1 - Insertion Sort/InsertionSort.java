/*
Chapter 2: Getting Started
2.1 Insertion sort
*/

public class InsertionSort {
    void insertionSort(final int[] array) {
        for (int startingIndex = 1; startingIndex < array.length; startingIndex++) {
            int currentIndex = startingIndex;

            while (currentIndex > 0 && array[currentIndex - 1] > array[currentIndex]) {
                int swapValue = array[currentIndex - 1];
                array[currentIndex - 1] = array[currentIndex];
                array[currentIndex--] = swapValue;
            }
        }
    }
}
