package arrays_04;

import java.util.Arrays;

public class LeftRotateArrayByD_11 {

    // naive solution:
    /* static void leftRotateOne(int[] arr) {
        int n = arr.length;
        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;
    }

    static void leftRotate(int[] arr, int d) {
        for (int i = 0; i < d; i++) {
            leftRotateOne(arr);
        }
    } */

    // efficient solution: time complexity Θ(n), space complexity: Θ(1)
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverse(int[] arr, int low, int high) {
        while (low < high) {
            swap(arr, low, high);
            low++;
            high--;
        }
    }

    static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;

        System.out.println("Initial array: " + Arrays.toString(arr));

        leftRotate(arr, d);
        System.out.println("After left rotating by " + d + " : " + Arrays.toString(arr));
    }
}
