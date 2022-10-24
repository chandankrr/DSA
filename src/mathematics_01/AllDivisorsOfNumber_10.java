package mathematics_01;

public class AllDivisorsOfNumber_10 {

    public static void main(String[] args) {
        int n = 25;

        printDivisors(n);

    }

    // naive
    /* public static void printDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    } */

    // optimize but not print all divisors in sorted manner
    /* public static void printDivisors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != n / i)
                    System.out.println(n / i);
            }

        }
    } */

    // optimize solution
    public static void printDivisors(int n) {
        int i;

        for (i = 1; i * i < n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }

        for (; i >= 1; i--) {
            if (n % i == 0)
                System.out.println(n / i);
        }
    }
}
