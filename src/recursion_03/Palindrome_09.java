package recursion_03;

public class Palindrome_09 {

    public static void main(String[] args) {
        String s = "AbaCabA";

        System.out.println(isPalindrome(s, 0, s.length() - 1));
    }

    // time complexity O(n), space complexity O(n/2)
    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;

        return str.charAt(start) == str.charAt(end) && isPalindrome(str, start + 1, end - 1);
    }
}
