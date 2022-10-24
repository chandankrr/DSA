package arrays_04;

public class MaximumConsecutive1s_18 {
    // naive approach, time complexity: O(n^2)
    /* public static int maxConsecutive(int[] arr) {
        int n = arr.length;
        int res = 0;

        for(int i = 0; i < n; i++) {
            int curr = 0;

            for(int j = i; j < n; j++) {
                if (arr[j] == 1)
                    curr++;
                else
                    break;
            }

            res = Math.max(res, curr);
        }

        return res;
    } */

    public static int maxConsecutive(int[] arr) {
        int n = arr.length;
        int res = 0, curr = 0;

        for(int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                curr = 0;
            } else {
                curr++;
                res = Math.max(res, curr);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,1,1,0,1,1};

        System.out.println(maxConsecutive(arr));
    }
}
