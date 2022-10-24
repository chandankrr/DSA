package arrays_04;

import java.util.Arrays;

public class LeftRotateArrayByOne_10 {

    static void leftRotateOne(int[] arr) {
        int n = arr.length;
        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Initial array: " + Arrays.toString(arr));

        leftRotateOne(arr);
        System.out.println("After rotation: " + Arrays.toString(arr));

    }
}
