public class RegularMatrixMultiplication {
    public static int[][] regular_matrix_multiplication(int[][] array_one, int[][] array_two) {
        int n = array_one.length;
        int[][] result = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    result[i][j] += array_one[i][k] * array_two[k][j];
                }
            }
        }

        return result;
    }
}
