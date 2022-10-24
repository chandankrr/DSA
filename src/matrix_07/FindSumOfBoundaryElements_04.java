package matrix_07;

public class FindSumOfBoundaryElements_04 {

    static long getBoundarySum(int[][] arr) {
        int m = arr.length;
        long sum = 0;

        for (int i = 0; i < m; i++) {
            int n = arr[i].length;

            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    sum += arr[i][j];
                } else if (i == m - 1) {
                    sum += arr[i][j];
                } else if (j == 0) {
                    sum += arr[i][j];
                } else if (j == n - 1) {
                    sum += arr[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};

        long sum = getBoundarySum(arr);
        System.out.println("Sum of boundary elements is " + sum);
    }
}
