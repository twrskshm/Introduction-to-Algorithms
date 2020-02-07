public class MergeSort {
    public static void merge(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++) {
            L[i] = array[p + i];
        }

        for(int i = 0; i < n2; i++) {
            R[i] = array[q + i + 1];
        }

        int i = 0, j = 0, k = p;

        for(; i < n1 && j < n2; k++) {
            if(L[i] < R[j]) {
                array[k] = L[i++];
            } else {
                array[k] = R[j++];
            }
        }

        while(i < n1) {
            array[k++] = L[i++];
        }

        while(j < n2) {
            array[k++] = R[j++];
        }
    }

    public static void merge_sort(int[] array, int p, int r) {
        if(p < r) {
            int q = (p + r) / 2;
            merge_sort(array, p, q);
            merge_sort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }
}