package matrix_07;

public class MatrixMultiplication_06 {

    // function to print matrix
    static void printMatrix(int[][] M, int rowSize, int colSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    // function to multiply two matrices
    static void multiplyMatrix(int row1, int col1, int[][] A, int row2, int col2, int[][] B) {
        // check if multiplication is possible
        if (row2 != col1) {
            System.out.println("\nMultiplication is not possible");
            return;
        }

        // Matrix to store the result
        // The product matrix will be of size row1 x col2
        int[][] C = new int[row1][col2];

        // multiply two matrices
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print the result
        System.out.println("\nResultant Matrix:");
        printMatrix(C, row1, col2);
    }

    public static void main(String[] args) {
        int row1 = 4, col1 = 3, row2 = 3, col2 = 4;

        int[][] A = {{1, 1, 1},
                {2, 2, 2},
                {3, 3, 3},
                {4, 4, 4}};

        int[][] B = {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3}};

        // Print the matrices A and B
        System.out.println("\nMatrix A:");
        printMatrix(A, row1, col1);
        System.out.println("\nMatrix B:");
        printMatrix(B, row2, col2);

        multiplyMatrix(row1, col1, A,
                row2, col2, B);
    }
}

