package arrays_04;

public class FrequenciesOfAllElementInSortedArray_14 {

    // naive solution: time complexity theta(n)
    static void printFreq(int[] arr) {
        int n = arr.length;

        // Stores the frequency of an element
        int freq = 1;

        for (int i = 1; i < n; i++) {
            // If the current element is equal
            // to the previous element
            if (arr[i] == arr[i - 1]) {
                freq++;
            }
            // Otherwise,
            else {
                System.out.println("Frequency of " + arr[i - 1] + " is: " + freq);
                // Update freq
                freq = 1;
            }
        }

        // Print the frequency of the last element
        System.out.println("Frequency of " + arr[n - 1] + " is: " + freq);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10};

        printFreq(arr);
    }

}
