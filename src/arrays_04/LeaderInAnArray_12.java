package arrays_04;

public class LeaderInAnArray_12 {

    // naive solution: time complexity O(n^2)
    /* static void leader(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(arr[i] + " ");
        }
    } */

    static void leader(int[] arr) {
        int n = arr.length;

        int curr_ldr = arr[n - 1];
        System.out.print(curr_ldr + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (curr_ldr < arr[i]) {
                curr_ldr = arr[i];
                System.out.print(curr_ldr + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 6, 5, 2};

        System.out.print("Leaders are: ");
        leader(arr);
    }
}
