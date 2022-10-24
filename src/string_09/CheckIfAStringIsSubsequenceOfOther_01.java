package string_09;

public class CheckIfAStringIsSubsequenceOfOther_01 {

    // naive approach, time complexity: O(len(str1) + len(str2))

    public static boolean isSubSeq(String str1, String str2) {

        if (str1.length() < str2.length())
            return false;

        int j = 0;

        for (int i = 0; i < str1.length() && j < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
        }

        return j == str2.length(); // if j == str2.length that mean we find all the character of str2 in str1
    }

    // recursive approach, time complexity while we same as iterative, space complexity O(n + m)
    public static boolean isSubSeq(String str1, String str2, int n, int m) {
        if (m == 0)
            return true;

        if (n == 0)
            return false;

        if (str1.charAt(n - 1) == str2.charAt(m - 1))
            return isSubSeq(str1, str2, n - 1, m - 1);
        else
            return isSubSeq(str1, str2, n - 1, m);
    }

    public static void main(String[] args) {
        String str1 = "ABCDEF";
        String str2 = "ADE";

        // System.out.println(isSubSeq(str1, str2));
        System.out.println(isSubSeq(str1, str2, str1.length(), str2.length()));
    }
}
