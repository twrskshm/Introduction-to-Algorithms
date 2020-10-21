/**
 * Chapter 2: Getting Started
 *
 * Linear search
 *
 * Time complexity:
 * Worst case: Θ(n)
 * Best case: Θ(1)
 *
 * Space complexity:
 * Worst case: Θ(1)
 * Best case: Θ(1)
 *
 * @author Saksham Tiwari
 */

public class LinearSearch {
    /**
     * Function that scans an integer array to check if it contains a target value.
     * @param array the array we need to search.
     * @param value the value we are looking for in the array.
     * @return returns the index of the target value, if found, else returns -1.
     */
    int linearSearch(final int[] array, final int value) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                return index;
            }
        }

        // Returns -1 since the value we were looking for was not found.
        return -1;
    }
}
