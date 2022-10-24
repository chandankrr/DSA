package searching_05;

public class OrderAgnosticBinarySearchIterative_02 {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // ascending
        // int[] arr = {-49, -23, -9, 0, 3, 10, 13, 21, 44, 89, 111, 143, 166, 173, 199};
        // descending
        int[] arr = {199, 173, 166, 143, 111, 89, 44, 21, 13, 10, 3, 0, -9, -23, -49};
        int target = 10;

        int ans = binarySearch(arr, target);

        if (ans != -1) System.out.println("Element found at index: " + ans);
        else System.out.println("Element not found!");
    }
}
