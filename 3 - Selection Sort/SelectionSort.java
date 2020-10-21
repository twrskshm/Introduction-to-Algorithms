/**
 * Chapter 2: Getting Started
 *
 * Selection sort
 *
 * Time complexity:
 * Worst case: Θ(n^2)
 * Best case: Θ(n^2)
 *
 * Space complexity:
 * Worst case: Θ(1)
 * Best case: Θ(1)
 *
 * @author Saksham Tiwari
 */

public class SelectionSort {
    /**
     * Function that sorts an integer array into non-decreasing order.
     * @param array the array we need to sort.
     */
    void selectionSort(final int[] array) {
        for (int iterator = 0; iterator < array.length - 1; iterator++) {
            int smallestElementIndex = iterator;

            for (int index = iterator + 1; index < array.length; index++) {
                if (array[index] < array[smallestElementIndex]) {
                    smallestElementIndex = index;
                }
            }

            int swapValue = array[iterator];
            array[iterator] = array[smallestElementIndex];
            array[smallestElementIndex] = swapValue;
        }
    }
}
