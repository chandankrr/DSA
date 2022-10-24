package arrays_04;

import java.util.Arrays;

public class SortInAscendingOrder_05 {

    public static void main(String[] args) {
        int[] arr = {32, 5, 456, 44, 87, 9765};

        System.out.println("Initial array: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
