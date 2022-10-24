package mathematics_01;

public class GCD_06 {

    public static void main(String[] args) {
        int a = 10, b = 15;

        System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b));
    }

    // naive solution
    /* public static int gcd(int a, int b) {
        int res = Math.min(a, b);

        while (res > 0) {
            if (a % res == 0 && b % res == 0)
                break;

            res--;
        }

        return res;
    } */

    // euclidean algorithm
    /* public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    } */

    // euclidean algorithm -- optimized
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

}
