package searching_05;

public class BinarySearchIterative_01 {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else
                return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-49, -23, -9, 0, 3, 10, 13, 21, 44, 89, 111, 143, 166, 173, 199};
        int target = 10;

        int ans = binarySearch(arr, target);

        if (ans != -1)
            System.out.println("Element found at index: " + ans);
        else
            System.out.println("Element not found!");

    }
}
