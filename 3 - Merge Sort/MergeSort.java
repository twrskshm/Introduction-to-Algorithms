/*
Chapter 2: Getting Started
2.3 Merge sort
*/

public class MergeSort {
    void mergeSort(final int[] array, final int startIndex, final int endIndex) {
        if (startIndex < endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            mergeSort(array, startIndex, middleIndex);
            mergeSort(array, middleIndex + 1, endIndex);
            merge(array, startIndex, middleIndex, endIndex);
        }
    }

    void merge(final int[] array, final int startIndex, final int middleIndex, final int endIndex) {
        int[] leftArray = new int[middleIndex - startIndex + 1], rightArray = new int[endIndex - middleIndex];

        for (int index = 0; index < leftArray.length; index++) {
            leftArray[index] = array[startIndex + index];
            rightArray[index] = array[middleIndex + 1 + index];
        }

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
            array[arrayIndex++] = rightArray[leftArrayIndex++];
    }
}
