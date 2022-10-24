package arrays_04;

public class FindSecondLargestElement_04 {

    public static void printSecondLargest(int[] arr) {
        int arr_size = arr.length;
        int first, second;

        /* There should be at least two elements */
        if (arr_size < 2) {
            System.out.println("Invalid Input");
            return;
        }

        first = second = Integer.MIN_VALUE;
        for (int j : arr) {
            /* If current element is greater than
            first then update both first and second */
            if (j > first) {
                second = first;
                first = j;
            }

            /* If arr[i] is in between first and second then update second  */
            else if (j > second && j != first) {
                second = j;
            }
        }

        if (second == Integer.MIN_VALUE)
            System.out.println("There is no second largest element");
        else
            System.out.println("The second largest element is: " + second);
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1, 1};

        printSecondLargest(arr);
    }
}
