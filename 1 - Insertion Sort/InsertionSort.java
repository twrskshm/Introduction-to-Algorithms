/**
 * Chapter 2: Getting Started
 *
 * Insertion sort
 *
 * Time complexity:
 * Worst case: Θ(n^2)
 * Best case: Θ(n)
 *
 * Space complexity:
 * Worst case: Θ(1)
 * Best case: Θ(1)
 *
 * @author Saksham Tiwari
 */

public class InsertionSort {
    /**
     * Function that sorts an integer array into non-decreasing order.
     * @param array the array we need to sort.
     */
    void insertionSort(final int[] array) {
        for (int iterator = 1; iterator < array.length; iterator++) {
            int index = iterator;

            while (index > 0 && array[index - 1] > array[index]) {
                int swapValue = array[index - 1];
                array[index - 1] = array[index];
                array[index--] = swapValue;
            }
        }
    }
}
