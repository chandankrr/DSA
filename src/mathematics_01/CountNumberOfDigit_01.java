package mathematics_01;

public class CountNumberOfDigit_01 {

    public static void main(String[] args) {
        long num = 12345;
    
        System.out.println("number of digit = " + countDigit(num));
    }

    // iterative solution
    /* public static int countDigit(Long n) {
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        return count;
    } */

    // recursive solution
    /* public static int countDigit(long n) {
        if (n == 0)
            return 0;

        return 1 + countDigit(n / 10);
    } */

    // logarithmic solution
    public static int countDigit(long n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }
}