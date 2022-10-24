package matrix_07;

public class MatrixAddition_05 {

    // function to print matrix
    static void printMatrix(int[][] arr) {
        int rowSize = arr.length;

        for (int i = 0; i < rowSize; i++) {
            int colSize = arr[i].length;

            for (int j = 0; j < colSize; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    // function to add the two matrices and store in matrix C
    static int[][] add(int[][] A, int[][] B, int size) {
        int[][] C = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C;
    }

    public static void main(String[] args) {
        int size = 4;

        int[][] A = {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};

        // print the matrix A
        System.out.println("\nMatrix A: ");
        printMatrix(A);

        int[][] B = {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};

        // print the matrix B
        System.out.println("\nMatrix B: ");
        printMatrix(B);

        // add the two matrices
        int[][] C = add(A, B, size);

        // print the result
        System.out.println("\nResultant Matrix: ");
        printMatrix(C);

    }
}
