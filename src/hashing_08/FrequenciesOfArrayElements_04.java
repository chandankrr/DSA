package hashing_08;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesOfArrayElements_04 {

    // naive solution
    /* public static void printFreq(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean flag = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag)
                continue;

            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) freq++;
            }

            System.out.println(arr[i] + " -> " + freq);
        }
    } */

    // efficient solution
    public static void printFreq(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 10};

        printFreq(arr);
    }
}
