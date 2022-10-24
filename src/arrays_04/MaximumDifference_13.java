package arrays_04;

public class MaximumDifference_13 {

    // naive solution: time complexity theta(n^2)
    /* static int maxDiff(int[] arr){
        int n = arr.length;
        int res = arr[1] - arr[0];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                res = Math.max(res, arr[j] - arr[i]);
            }
        }

        return res;
    } */

    // efficient solution: theta(n)
    // maximum value of arr[j] - arr[i] such that j > i
    static int maxDiff(int[] arr) {
        int n = arr.length;
        int res = arr[1] - arr[0];
        int minVal = arr[0];

        for (int j = 1; j < n; j++) {
            res = Math.max(res, arr[j] - minVal);
            minVal = Math.min(minVal, arr[j]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};

        System.out.println("Maximum Difference: " + maxDiff(arr));
    }
}
