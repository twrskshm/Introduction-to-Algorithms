/*
Chapter 2: Getting Started
2.2 Selection sort
*/

public class SelectionSort {
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
}
