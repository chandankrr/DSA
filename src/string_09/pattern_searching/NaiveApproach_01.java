package string_09.pattern_searching;

public class NaiveApproach_01 {

    public static void patternSearching(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABCDABCDEFDE";
        String pattern = "ABCD";

        patternSearching(text, pattern);
    }
}
