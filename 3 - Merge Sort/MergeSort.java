/*
Chapter 2: Getting Started
2.3 Merge sort

Time complexities:
Worst case: O(n * lg(n))
Best case: O(n * lg(n))

Space complexity:
O(n)
*/

public class MergeSort {
    // Using recursion.
    private void mergeSort(final int[] array, final int startIndex, final int endIndex) {
        if (startIndex < endIndex) {
            final int middleIndex = (startIndex + endIndex) / 2;
            mergeSort(array, startIndex, middleIndex);
            mergeSort(array, middleIndex + 1, endIndex);
            merge(array, startIndex, middleIndex, endIndex);
        }
    }

    private void merge(final int[] array, final int startIndex, final int middleIndex, final int endIndex) {
        final int[] leftArray = new int[middleIndex - startIndex + 1], rightArray = new int[endIndex - middleIndex];

        for (int leftArrayIndex = 0; leftArrayIndex < leftArray.length; leftArrayIndex++)
            leftArray[leftArrayIndex] = array[startIndex + leftArrayIndex];

        for (int rightArrayIndex = 0; rightArrayIndex < rightArray.length; rightArrayIndex++)
            rightArray[rightArrayIndex] = array[middleIndex + 1 + rightArrayIndex];

        int arrayIndex = startIndex, leftArrayIndex = 0, rightArrayIndex = 0;
        for (; leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length; arrayIndex++) {
            if (leftArray[leftArrayIndex] < rightArray[rightArrayIndex])
                array[arrayIndex] = leftArray[leftArrayIndex++];
            else
                array[arrayIndex] = rightArray[rightArrayIndex++];
        }

        while (leftArrayIndex < leftArray.length)
            array[arrayIndex++] = leftArray[leftArrayIndex++];

        while (rightArrayIndex < rightArray.length)
            array[arrayIndex++] = rightArray[rightArrayIndex++];
    }
}
