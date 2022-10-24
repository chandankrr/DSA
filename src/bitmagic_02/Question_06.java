package bitmagic_02;

/* given an array of n number that has values in range [1...n+1]. Every mo. appear exactly once.
Hence, one no. is missing. Find the missing no. */

public class Question_06 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3};

        System.out.println(missingNum(arr));
    }

    // naive solution -- time complexity O(n)
    /* static int missingNum(int[] arr) {
        Arrays.sort(arr);

        int max = arr[arr.length - 1];
        int sumOfSeries = max * (max + 1) / 2;

        int sumOfArr = 0;
        for (int i : arr) {
            sumOfArr += i;
        }

        return sumOfSeries - sumOfArr;
    } */

    // efficient solution using XOR operator -- time complexity O(n), space complexity O(1)
    static int missingNum(int[] arr) {
        int x1 = arr[0];
        int x2 = 1;

        for (int i = 1; i < arr.length; i++)
            x1 ^= arr[i];

        for (int i = 2; i <= arr.length + 1; i++) {
            x2 = x2 ^ i;
        }

        return x1 - x2;
    }
}
