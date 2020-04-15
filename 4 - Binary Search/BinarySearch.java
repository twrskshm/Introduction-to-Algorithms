/*
Chapter 2: Getting Started
2.3 Binary Search
*/

public class BinarySearch {
    int binarySearch(final int[] array, final int target) {
        int leftIndex = 0, rightIndex = array.length - 1;

        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;

            if (array[middleIndex] == target)
                return middleIndex;

            if (array[middleIndex] < target)
                leftIndex = middleIndex + 1;
            else
                rightIndex = middleIndex - 1;
        }

        return -1;
    }
}
