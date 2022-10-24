package arrays_04;

public class MaximumCircularSum_21 {

    // naive approach, time complexity: O(n^2)
    /* public static int maxCircularSum(int[] arr) {
        int n = arr.length;
        int res = arr[0];

        for (int i = 0; i < n; i++) {
            int currMax = arr[i];
            int currSum = arr[i];

            for (int j = 1; j < n; j++) {
                int index = (i + j) % n;
                currSum += arr[index];
                currMax = Math.max(currSum, currMax);
            }

            res = Math.max(res, currMax);
        }

        return res;
    } */

    public static int maxCircularSum(int[] arr) {
        int n = arr.length;

        int maxNormal = normalMaxSum(arr);
        if (maxNormal < 0) {
            return maxNormal;
        }

        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
            arr[i] = -arr[i];
        }
        int maxCircular = arrSum + normalMaxSum(arr);
        return Math.max(maxNormal, maxCircular);
    }

    public static int normalMaxSum(int[] arr) {
        int n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            res = Math.max(res, maxEnding);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 3, 4};

        System.out.println(maxCircularSum(arr));
    }
}
