package mathematics_01;

public class PowerOfNumber_12 {

    public static void main(String[] args) {
        System.out.println("Name: Chandan Kumar\t UID: 20BCS3056\n");

        int x = 3, n = 4;
        System.out.println("Power of " + x + " raise to " + n + " = " + power(x, n));
    }

    // naive solution -- time complexity O(n)
    /* static int power(int x, int n){
        int res = 1;
        for (int i = 0; i < n; i++) {
            res = res * x;
        }

        return res;
    } */

    // efficient solution using recursion -- time complexity O(log n), space complexity O(log n)
    // approach
    // if n % 2 == 0
    //     power(x, n / 2) * power(x, n / 2);
    // else
    //    power(x, n - 1) * x;
    /* static int power(int x, int n) {
        if (n == 0)
            return 1;

        int temp = power(x, n / 2);
        temp = temp * temp;

        if (n % 2 == 0)
            return temp;
        else
            return temp * x;
    } */

    // efficient solution using iterative method (Binary Exponentiation) -- time complexity O(log n), space complexity O(1)
    static int power(int x, int n) {
        int res = 1;
        while (n > 0) {
            // if (n % 2 != 0)
            if ((n & 1) != 0) // for optimization purpose
                res = res * x;
            x = x * x;

            // n = n / 2;
            n = n >> 1; // for optimization purpose
        }

        return res;
    }

}
