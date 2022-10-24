package string_09;

public class LeftmostNonRepeatingElement {

    // naive solution, tc: O(n^2)
    /* public static int nonRep(String s) {
        for(int i = 0; i < s.length(); i++) {
            boolean flag = false;

            for(int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                return i;
        }

        return -1;
    } */

    static final int CHAR = 256;

    public static int nonRep(String s) {
        int[] count = new int[CHAR];

        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        for(int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";

        System.out.println(nonRep(s));
    }
}
