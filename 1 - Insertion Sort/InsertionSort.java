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
     * Function that sorts an integer array into non-decreasing order using iterative approach.
     * @param array The array we need to sort.
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

    /**
     * Function that sorts an integer array into non-decreasing order using recursive approach.
     * @param array The array we need to sort.
     * @param index Last index of the array.
     */
    void recursiveInsertionSort(final int[] array, final int index) {
        if (index > 0) {
            recursiveInsertionSort(array, index - 1);
            insertElement(array, index);
        }
    }

    /**
     * Function that inserts an element in its correct sorted position.
     * @param array The array we need to sort.
     * @param index Index of the element we are currently positioning.
     */
    void insertElement(final int[] array, int index) {
        while (index > 0 && array[index - 1] > array[index]) {
            int temp = array[index - 1];
            array[index - 1] = array[index];
            array[index--] = temp;
        }
    }
}
