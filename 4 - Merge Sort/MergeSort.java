/**
 * Chapter 2: Getting Started
 *
 * Merge sort
 *
 * Time complexity:
 * Worst case: Θ(nlgn)
 * Best case: Θ(nlgn)
 *
 * Space complexity:
 * Worst case: Θ(n)
 * Best case: Θ(n)
 *
 * @author Saksham Tiwari
 */

public class MergeSort {
    /**
     * Function that recursively divides the input subarray into two parts.
     * @param array the array we need to sort.
     * @param startIndex starting index of the subarray.
     * @param endIndex ending index of the subarray.
     */
    void mergeSort(final int[] array, final int startIndex, final int endIndex) {
        if (startIndex < endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            mergeSort(array, startIndex, middleIndex);
            mergeSort(array, middleIndex + 1, endIndex);
            merge(array, startIndex, middleIndex, endIndex);
        }
    }

    /**
     * Function that combines two subarrays into one sorted array.
     * @param array the array we need to sort.
     * @param startIndex starting index of the subarray.
     * @param middleIndex middle index of the subarray.
     * @param endIndex ending index of the subarray.
     */
    void merge(final int[] array, final int startIndex, final int middleIndex, final int endIndex) {
        int[] leftArray = new int[middleIndex - startIndex + 1];
        int[] rightArray = new int[endIndex - middleIndex];

        for (int index = 0; index < leftArray.length; index++) {
            leftArray[index] = array[startIndex + index];
        }

        for (int index = 0; index < rightArray.length; index++) {
            rightArray[index] = array[middleIndex + index + 1];
        }

        int arrayIndex = startIndex;
        int leftArrayIndex = 0;
        int rightArrayIndex = 0;

        while (leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length) {
            if (leftArray[leftArrayIndex] < rightArray[rightArrayIndex]) {
                array[arrayIndex++] = leftArray[leftArrayIndex++];
            } else {
                array[arrayIndex++] = rightArray[rightArrayIndex++];
            }
        }

        while (leftArrayIndex < leftArray.length) {
            array[arrayIndex++] = leftArray[leftArrayIndex++];
        }

        while (rightArrayIndex < rightArray.length) {
            array[arrayIndex++] = rightArray[rightArrayIndex++];
        }
    }

    /**
     * Function that uses iterative version of merge sort to sort the input array into non-increasing order.
     * @param array the array we need to sort.
     */
    void iterativeMergeSort(final int[] array) {
        int length = 1;

        while (length <= array.length / 2) {
            for (int leftBound = 0; leftBound < array.length - length; leftBound += 2 * length) {
                int[] leftArray = new int[length];
                int[] rightArray = new int[length];

                for (int index = 0; index < leftArray.length; index++) {
                    leftArray[index] = array[leftBound + index];
                    rightArray[index] = array[leftBound + index + length];
                }

                int arrayIndex = leftBound;
                int leftArrayIndex = 0;
                int rightArrayIndex = 0;

                while (leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length) {
                    if (leftArray[leftArrayIndex] < rightArray[rightArrayIndex]) {
                        array[arrayIndex++] = leftArray[leftArrayIndex++];
                    } else {
                        array[arrayIndex++] = rightArray[rightArrayIndex++];
                    }
                }

                while (leftArrayIndex < leftArray.length) {
                    array[arrayIndex++] = leftArray[leftArrayIndex++];
                }

                while (rightArrayIndex < rightArray.length) {
                    array[arrayIndex++] = rightArray[rightArrayIndex++];
                }
            }

            length *= 2;
        }
    }
}
