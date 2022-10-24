package bitmagic_02;

public class CountSetBit_02 {

    public static void main(String[] args) {
        int n = 13;
        System.out.println("Binary representation of " + n + ": " + Integer.toString(n, 2));
        System.out.println(countSet(n));
    }

    // naive solution -- time complexity Θ(total bits in n)
    /* static int countSet(int n) {
        int res = 0;
        while (n > 0) {
            res = res + (n & 1);
            n = n >> 1;
        }

        return res;
    } */

    // Brian Kernighan's algorithm -- time complexity Θ(set bits in n)
    static int countSet(int n) {
        int res = 0;

        while (n > 0) {
            n = (n & (n - 1));
            res++;
        }

        return res;
    }
}
