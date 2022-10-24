package mathematics_01;

public class FactorialOfNumber_04 {

    public static void main(String[] args) {
        int num = 5;

        System.out.println("factorial: " + factorial(num));
    }

    // iterative
    /* public static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;

        return res;
    } */

    // recursive
    public static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

}
