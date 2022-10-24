package arrays_04;

public class RemoveDuplicateElements_08 {

    static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1)
            return n;

        // To store index of next unique element
        int res = 1;

        for (int i = 1; i < n; i++) {
            // If current element is not equal to previous
            // element then store that current element
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 3, 3, 3, 5, 5, 5, 5, 7, 7};
        int n = arr.length;

        n = removeDuplicates(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
