package hashing_08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CountDistinctElements_03 {

    // naive solution
    /* public static int countDist(int[] arr) {
        int n = arr.length;
        int res = 0;

        for (int i = 0; i < n; i++) {
            boolean flag = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                res++;
        }

        return res;
    } */

    // efficient solution
    /* public static int countDist(int[] arr) {
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>(arr.length);

        for (int a : arr) {
            hs.add(a);
        }

        return hs.size();
    } */

    // more efficient solution
    public static int countDist(int[] arr) {
        HashSet<Integer> hs = new HashSet<>(List.of(Arrays.stream(arr).boxed().toArray(Integer[]::new)));

        return hs.size();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 20, 30};

        System.out.println(countDist(arr));
    }
}
