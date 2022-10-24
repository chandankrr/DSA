package arrays_04;

public class CheckIsArraySorted_07 {

    // naive approach: time complexity O(n^2)
    /* static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    } */

    // efficient approach: time complexity O(n)
    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {32, 54, 1, 23, 54, 56, 66};

        System.out.println("Is array sorted: " + isSorted(arr));
    }
}
