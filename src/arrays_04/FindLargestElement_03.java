package arrays_04;

public class FindLargestElement_03 {

    public static int getLargest(int[] arr) {
        int max = arr[0];

        for (int j : arr) {
            if (j > max) max = j;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 324, 45, 90, 9808};

        System.out.println("Largest in given array is " + getLargest(arr));
    }
}
