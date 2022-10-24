package recursion_03;

public class GenerateSubsets_13 {

    public static void main(String[] args) {
        String s = "abc", curr = "";
        int index = 0;

        subsets(s, curr, index);

    }

    static void subsets(String str, String curr, int index) {
        if (index == str.length()) {
            System.out.println(curr);
            return;
        }

        subsets(str, curr + str.charAt(index), index + 1);
        subsets(str, curr, index + 1);
    }
}
