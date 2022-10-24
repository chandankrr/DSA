package mathematics_01;

public class PalindromeNumber_02 {

    public static void main(String[] args) {
        int num = 10001;

        System.out.println("number is palindrome? " + (isPalindrome(num) ? "Yes" : "No"));
    }
    
    // naive solution
    public static boolean isPalindrome(int n) {
        int temp = n;
        int reverse = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }

        return temp == reverse;
    }
    
}
