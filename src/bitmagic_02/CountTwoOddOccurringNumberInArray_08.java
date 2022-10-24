package bitmagic_02;

import java.util.Arrays;

public class CountTwoOddOccurringNumberInArray_08 {

    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 4, 5, 4, 4, 6, 7, 7};

        // countOddOccurring(arr);

        System.out.println(Arrays.toString(countOddOccurring(arr)));
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
                System.out.print(i + ", ");
        }
    } */

    // efficient solution -- time complexity O(n)
    static int[] countOddOccurring(int[] arr) {
        int XOR = 0, res1 = 0, res2 = 0;

        for (int j : arr)
            XOR = XOR ^ j;

        // int sn = XOR & ~(XOR - 1);
        int sn = XOR & -XOR;

        for (int i : arr) {
            if ((i & sn) != 0)
                res1 = res1 ^ i;
            else
                res2 = res2 ^ i;
        }

        return new int[]{res1, res2};
    }
}
