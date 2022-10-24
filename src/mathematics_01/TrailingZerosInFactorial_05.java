package mathematics_01;

public class TrailingZerosInFactorial_05 {

    public static void main(String[] args) {
        int num = 100;

        System.out.println("number of zeros = " + countZeros(num));
    }

    // naive method
    /* public static int countZeros(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact = fact * i;

        int zero = 0;
        while (fact % 10 == 0) {
            zero++;
            fact = fact / 10;
        }

        return zero;
    } */

    // generalize method
    public static int countZeros(int n) {
        int res = 0;

        for (int i = 5; i <= n; i = i * 5)
            res = res + n / i;

        return res;
    }

}
