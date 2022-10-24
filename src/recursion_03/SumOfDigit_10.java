package recursion_03;


public class SumOfDigit_10 {

    public static void main(String[] args) {
        int n = 253;

        System.out.println(getDigitSum(n));
    }

    // time complexity O(d), space complexity O(d), ie d = no. of digit of number
    /* static int getDigitSum(int n) {
        if (n == 0)
            return 0;
        else
            return getDigitSum(n / 10) + n % 10;
    } */

    // improve code
    /* static int getDigitSum(int n) {
        if (n <= 9)
            return n;
        else
            return getDigitSum(n / 10) + n % 10;
    } */

    // iterative solution is preferred -- time complexity O(d), space complexity O(1)
    static int getDigitSum(int n) {
        int res = 0;
        while (n > 0) {
            res = res + n % 10;
            n = n / 10;
        }

        return res;
    }
}
