package string_09;

public class LeftmostRepeatingCharacter_03 {

    // naive approach, time complexity: O(n^2)
    /* public static int leftMost(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return i;
            }
        }

        return -1;
    } */

    // better approach - 1
    static final int CHAR = 256;

    /* public static int leftMost(String str) {
        int[] count = new int[CHAR];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > 1)
                return i;
        }

        return -1;
    } */

    // better approach - 2
    public static int leftMost(String str) {
        boolean[] visited = new boolean[CHAR];

        int res = -1;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (visited[str.charAt(i)])
                res = i;
            else
                visited[str.charAt(i)] = true;
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "abccbd";

        System.out.println(leftMost(str));
    }
}
