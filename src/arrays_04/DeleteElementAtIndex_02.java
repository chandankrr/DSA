package arrays_04;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeleteElementAtIndex_02 {

    static public int[] removeTheElement(int[] arr, int index) {
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        // return the resultant array
        return IntStream.range(0, arr.length).filter(i -> i != index).map(i -> arr[i]).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Get the specific index
        int index = 2;

        // Print the index
        System.out.println("Index to be removed: " + index);

        // Remove the element
        arr = removeTheElement(arr, index);

        // Print the resultant array
        System.out.println("Resultant Array: " + Arrays.toString(arr));
    }
}
