package matrix_07;

public class RotateMatrixBy90Degree_08 {

    // function to print matrix
    static void printMatrix(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    // function to rotate a matrix by 90 degree
    static void rotateMatrix(int[][] M) {
        int n = M.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int temp = M[i][j];
                M[i][j] = M[j][i];
                M[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++) {
            int low = 0, high = n - 1;

            while(low < high) {
                int temp = M[low][i];
                M[low][i] = M[high][i];
                M[high][i] = temp;

                low++;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] M = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println("Original Matrix: ");
        printMatrix(M);

        rotateMatrix(M);

        System.out.println("\nAfter rotating by 90 degree: ");
        printMatrix(M);

    }
}
