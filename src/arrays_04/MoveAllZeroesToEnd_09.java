package arrays_04;

import java.util.Arrays;

public class MoveAllZeroesToEnd_09 {

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // naive solution: time complexity O(n^2)
    /* static void moveToEnd(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] != 0)
                        swap(arr, i, j);
                }
            }
        }
    } */

    // efficient solution: time complexity O(n)
    static void moveToEnd(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, count);
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 0, 0, 0, 23, 0};

        System.out.println("Initial array: " + Arrays.toString(arr));

        moveToEnd(arr);
        System.out.println("Move all zeroes to end: " + Arrays.toString(arr));
    }
}
