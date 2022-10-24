package arrays_04;

public class MajorityElement_22 {

    // naive approach, time complexity: O(n^2)
    /* public static int findMajority(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int count = 1;

            for(int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            if (count > n/2)
                return arr[i];
        }

        return -1;
    } */

    // Boyer-Moore Majority Voting Algorithm, time complexity: O(n)
    public static int findMajority(int[] arr) {
        int n = arr.length;
        int res = 0, count = 1;

        // this will give your majority number
        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                count = 1;
                res = i;
            }
        }

        // this will find the count of majority number
        int ct = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[res]) {
                ct++;
            }
        }

        if (ct <= n / 2)
            return -1;

        return arr[res];
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 4, 8, 8, 4, 8};

        System.out.println(findMajority(arr));
    }
}
