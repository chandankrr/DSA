package string_09;

import java.util.Stack;

public class ReverseWordsInAString {

    // using stack
    public static String reverseWords(String str) {
        Stack<String> st = new Stack<>();

        String[] words = str.split(" ");

        for (String word : words) {
            st.push(word);
        }

        StringBuilder sb = new StringBuilder();

        while(!st.empty()) {
            String popWord = st.pop();
            sb.append(popWord).append(" ");
        }

        return sb.toString();
    }

    // without using any extra space


    public static void main(String[] args) {
        System.out.println(reverseWords("Hello World"));
    }
}
