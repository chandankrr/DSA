package hashing_08;

import java.util.HashSet;

public class IntersectionOfTwoArrays_05 {

    // naive solution
    /* public static int intersection(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int res = 0;

        for (int i = 0; i < m; i++) {
            boolean flag = false;

            for (int j = 0; j < i - 1; j++) {
                if (a[j] == a[i]) {
                    flag = true;
                    break;
                }
            }

            if (flag)
                continue;

            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    res++;
                    break;
                }
            }
        }

        return res;
    } */

    // efficient solution
    public static int intersection(int[] a, int[] b) {
        HashSet<Integer> hs = new HashSet<>();

        for (int x : a) {
            hs.add(x);
        }

        int res = 0;

        for (int y : b) {
            if (hs.contains(y)) {
                res++;
                hs.remove(y);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {10, 15, 20, 15, 30, 30, 5};
        int[] b = {30, 5, 30, 80};

        System.out.println(intersection(a, b));
    }
}
