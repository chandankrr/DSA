package arrays_04;

public class FrequenciesOfAllElementInUnsortedArray_15 {

    // time complexity: O(n^2), space complexity: O(n)
    /* static void countFreq(int[] arr) {
        int n = arr.length;

        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        // traverse through array elements and
        // count frequencies
        for(int i = 0; i < n; i++) {
            // Skip this element if already processed
            if (visited[i])
                continue;

            // count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    } */

    // time complexity: O(n), space complexity: O(1)
    static void countFreq(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] - 1;
        }

        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] = arr[arr[i] % n] + n;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + ": " + arr[i] / n);
        }


        // time complexity: O(n), space complexity: O(n)
    /*static void countFreq(int[] arr) {
        int n = arr.length;

        Map<Integer, Integer> mp = new HashMap<>();

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else{
                mp.put(arr[i], 1);
            }
        }

        // Traverse through map and print frequencies
        // for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }

        mp.forEach((k, v) -> System.out.println(k + " " + v));*/
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 2, 5};

        countFreq(arr);
    }
}
