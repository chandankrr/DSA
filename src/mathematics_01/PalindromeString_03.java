package mathematics_01;

public class PalindromeString_03 {

    public static void main(String[] args) {
        String s = "boob";
        System.out.println("string is palindrome: " + (isPalindrome(s) ? "Yes" : "No"));
    }

    // method 1
    /* public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s == null)
            return true;

        StringBuilder str = new StringBuilder(s);
        str.reverse();

        return s.equals(String.valueOf(str));
    } */

    // method 2
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;

        for (int i = 0; i < s.length() / 2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);

            if (start != end)
                return false;
        }

        return true;
    }

}
