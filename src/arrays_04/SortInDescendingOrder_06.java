package arrays_04;

import java.util.Arrays;
import java.util.Collections;

public class SortInDescendingOrder_06 {

    public static void main(String[] args) {
        int[] arr = {324, 54, 6, 75, 4242, 6, 65};

        Integer[] newArr = new Integer[arr.length];
        int i = 0;
        for (int value : arr) {
            newArr[i++] = value;
        }

        System.out.println("Initial array: " + Arrays.toString(arr));

        Arrays.sort(newArr, Collections.reverseOrder());
        System.out.println("Sorted array: " + Arrays.toString(newArr));
    }
}
