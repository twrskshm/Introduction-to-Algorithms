public class InsertionSort {
    public static void insertion_sort(int[] input_array) {
        for(int i = 1; i < input_array.length; i++) {
            int j = i;

            while(j > 0 && input_array[j] < input_array[j - 1]) {
                int temp = input_array[j];
                input_array[j] = input_array[j - 1];
                input_array[j - 1] = temp;

                j--;
            }
        }
    }
}
