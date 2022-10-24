package arrays_04;

public class TrappingRainWater_17 {

    // naive approach, time complexity: O(n^2)
    /* public static int getWater(int[] height) {
        int n = height.length;
        int res = 0;

        for (int i = 1; i < n - 1; i++) { // because most left and right bar not consider for storing water
            int lMax = height[i];
            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, height[j]);
            }

            int rMax = height[i];
            for (int j = i + 1; j < n; j++) {
                rMax = Math.max(rMax, height[j]);
            }

            res = res + Math.min(lMax, rMax) - height[i];
        }

        return res;
    } */

    public static int getWater(int[] height) {
        int n = height.length;
        int res = 0;
        int[] lMax = new int[n];
        int[] rMax = new int[n];

        lMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(height[i], lMax[i - 1]);
        }

        rMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(height[i], rMax[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            res += Math.min(lMax[i], rMax[i]) - height[i];
        }

        return res;
    }

    public static void main(String[] args) {
        // int[] height = {3, 0, 1, 2, 5};
        int[] height = {5, 0, 6, 3, 3};

        System.out.println(getWater(height));
    }
}
