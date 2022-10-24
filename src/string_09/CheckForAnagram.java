package string_09;

public class CheckForAnagram {

    // naive approach, time complexity: O(nlogn)
    /* public static boolean areAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        s1 = String.valueOf(ch1);

        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch2);
        s2 = String.valueOf(ch2);

        return s1.equals(s2);
    } */

    // bit optimize solution, time complexity: O(n), space complexity: O(256)
    static final int CHAR = 256;

    public static boolean areAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] count = new int[CHAR];

        for(int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for(int i = 0; i < CHAR; i++) {
            if (count[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "abaac";
        String s2 = "aacba";

        System.out.println(areAnagram(s1, s2));

    }
}
