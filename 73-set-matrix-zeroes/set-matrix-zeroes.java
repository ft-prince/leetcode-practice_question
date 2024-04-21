class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length; // number of rows
        int n = matrix[0].length; // number of columns
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if the first row and column need to be zeroed out
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                firstRowZero = true;
                break;
            }
        }
        for (int j = 0; j < m; j++) {
            if (matrix[j][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Mark zeros on first row and column
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Set zeros based on marks in the first row and column
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero out the first row if necessary
        if (firstRowZero) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }

        // Zero out the first column if necessary
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}


/**

  int n = matrix.length; // number of rows
        int m = matrix[0].length; // number of columns

        int[] row = new int[n]; // row array
        int[] col = new int[m]; // col array

        // Traverse the matrix:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // mark ith index of row with 1:
                    row[i] = 1;
                    // mark jth index of col with 1:
                    col[j] = 1;
                }
            }
        }

        // Finally, mark all (i, j) as 0
        // if row[i] or col[j] is marked with 1.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
 */



/**
         int n = matrix.length;
        int m = matrix[0].length;

        // Mark rows and columns that need to be zeroed out
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, n, m, i);
                    markCol(matrix, n, m, j);
                }
            }
        }

        // Finally, mark all -1 as 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    static void markRow(int[][] matrix, int n, int m, int i) {
        // Set all non-zero elements as -1 in the row i
        for (int j = 0; j < m; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    static void markCol(int[][] matrix, int n, int m, int j) {
        // Set all non-zero elements as -1 in the col j
        for (int i = 0; i < n; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }

 */
