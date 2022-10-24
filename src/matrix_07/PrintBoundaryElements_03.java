package matrix_07;

public class PrintBoundaryElements_03 {

    // time complexity: O(n*n)
    static void boundaryTraversal(int[][] arr) {
        int m = arr.length;

        for (int i = 0; i < m; i++) {
            int n = arr[i].length;

            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == m - 1) {
                    System.out.print(arr[i][j] + " ");
                } else if (j == 0) {
                    System.out.print(arr[i][j] + " ");
                } else if (j == n - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};

        boundaryTraversal(arr);
    }
}
