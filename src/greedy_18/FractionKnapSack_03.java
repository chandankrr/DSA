package greedy_18;

import java.util.Arrays;

class Item {
    int weight, value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" + weight + ", " + value + "}";
    }
}

public class FractionKnapSack_03 {

    // time complexity: O(nlogn)
    public static double fracKnapSack(Item[] arr, int capacity) {
        Arrays.sort(arr, (i1, i2) -> i1.weight * i2.value - i1.value * i2.weight); // ratio: value/weight = ((i1.value/i1.weight) - (i2.value/i2.weight)) >= 0
        // for simplicity cross multiply ((i1.weight * i2.value) - (i1.value * i2.weight))

        double res = 0.0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].weight <= capacity) {
                res = res + arr[i].value;
                capacity = capacity - arr[i].weight;
            } else {
                res = res + arr[i].value * (double) capacity / arr[i].weight;
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        /* Item[] arr = {new Item(10, 60),
                new Item(40, 40),
                new Item(20, 100),
                new Item(30, 120)};
        int capacity = 50; */

        Item[] arr = {new Item(5, 30),
                new Item(10, 20),
                new Item(20, 100),
                new Item(30, 90),
                new Item(40, 160)};
        int capacity = 50;

        System.out.println(fracKnapSack(arr, capacity));
    }
}
