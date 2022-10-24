package bitmagic_02;

public class CheckNoIsPowerOfTwo_04 {

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPow2(n));
    }

    // naive solution -- time complexity
    /* static boolean isPow2(int n) {
        if (n == 0)
            return false;

        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    } */

    // efficient solution
    /* static boolean isPow2(int n) {
        if (n == 0)
            return false;

        return (n & (n - 1)) == 0;
    } */

    // one line expression
    static boolean isPow2(int n) {
        return (n != 0) && (n & (n - 1)) == 0;
    }
}
