package bitmagic_02;

public class CountOneOddOccurringNumberInArray_05 {

    public static void main(String[] args) {
        int[] arr = {4, 3, 4, 4, 4, 5, 5, 3, 3};
        // countOddOccurring(arr);
        System.out.println(countOddOccurring(arr));
    }

    // naive solution -- time complexity O(n^2)
    /* static void countOddOccurring(int[] arr) {
        for (int i : arr) {
            int count = 0;
            for (int j : arr) {
                if (j == i)
                    count++;
            }
            if (count % 2 != 0)
                System.out.println(i);
        }
    } */

    // efficient solution using XOR operator -- time complexity O(n) and Auxiliary space O(1)
    // some property of XOR
    // x ^ 0 = x
    // x ^ y = y ^ x
    // x ^ (y ^ z) = (x ^ y) ^ z
    // x ^ x = 0
    static int countOddOccurring(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res = res ^ i;
        }

        return res;
    }
}
