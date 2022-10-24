package recursion_03;

/**
 * Question: There is a number n and 3 more different numbers a, b, c cut the number n in a way to get maximum cut, and
 * you can cut the n in only a, b, c parts
 */

public class RopeCuttingProblem_11 {

    public static void main(String[] args) {
        int n = 23, a = 11, b = 9, c = 12;
        System.out.println(maxPieces(n, a, b, c));
    }

    // time complexity O(3^n)
    static int maxPieces(int n, int a, int b, int c) {
        if (n == 0)
            return 0;

        if (n < 0)
            return -1;

        int res = Math.max(Math.max(maxPieces(n - a, a, b, c), maxPieces(n - b, a, b, c)), maxPieces(n - c, a, b, c));

        if (res == -1)
            return -1;

        return res + 1;
    }
}
