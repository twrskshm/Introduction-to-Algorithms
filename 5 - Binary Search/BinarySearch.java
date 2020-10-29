/**
 * Chapter 2: Getting Started
 *
 * Binary Search
 *
 * Time complexity:
 * Worst case: Θ(lgn)
 * Best case: Θ(1)
 *
 * Space complexity:
 * Worst case: Θ(1)
 * Best case: Θ(1)
 *
 * @author Saksham Tiwari
 */

public class BinarySearch {
    /**
     * Function that checks if an element is present in an array using iteration.
     * @param array The array we need to search.
     * @param target The target value we are looking for.
     * @return Returns the index of the target element if present, if not, returns -1.
     */
    int binarySearch(final int[] array, final int target) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;

            if (array[middleIndex] == target) {
                return middleIndex;
            }

            if (array[middleIndex] < target) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }

        return -1;
    }

    /**
     * Function that checks if an element is present in an array by calling itself recursively.
     * @param array The array we need to search.
     * @param leftIndex The index we want to begin our search from.
     * @param rightIndex The index we want to end our search at.
     * @param target The target value we are looking for.
     * @return Returns the index of the target element if present, if not, returns -1.
     */
    int recursiveBinarySearch(final int[] array, final int leftIndex, final int rightIndex, final int target) {
        if (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;

            if (array[middleIndex] == target) {
                return middleIndex;
            }

            if (array[middleIndex] < target) {
                return recursiveBinarySearch(array, middleIndex + 1, rightIndex, target);
            } else {
                return recursiveBinarySearch(array, leftIndex, middleIndex - 1, target);
            }
        }

        return -1;
    }
}
