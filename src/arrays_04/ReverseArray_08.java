package arrays_04;

import java.util.Arrays;

public class ReverseArray_08 {

    // time complexity: Θ(n)
    static void reverse(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {21, 54, 56, 43, 2};

        System.out.println("Initial array: " + Arrays.toString(arr));

        reverse(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
