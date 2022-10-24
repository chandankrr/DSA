package recursion_03;

/**
 * Question: In this problem we have to check that, is sum is equal to the sum of any subset of arr. If any subset is equal to sum
 * return 1 otherwise return 0
 */

public class SubsetSumProblem_12 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 15};
        int sum = 25;

        System.out.println(countSubsets(arr, arr.length, sum));
    }

    static int countSubsets(int[] arr, int n, int sum) {
        if (n == 0)
            return sum == 0 ? 1 : 0;

        return countSubsets(arr, n - 1, sum) + countSubsets(arr, n - 1, sum - arr[n - 1]);
    }
}
