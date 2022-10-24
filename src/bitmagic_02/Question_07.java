package bitmagic_02;

import java.util.Arrays;

public class Question_07 {

    public static void main(String[] args) {
        int[] arr = {13, 12, 11, 15, 14, 17};

        System.out.println(missingNum(arr));
    }

    static int missingNum(int[] arr) {
        Arrays.sort(arr);

        int minValue = arr[0];
        int xorNum = 0;

        for (int i : arr) {
            xorNum ^= (minValue ^ i);
            minValue++;
        }

        return xorNum ^ minValue;
    }
}
