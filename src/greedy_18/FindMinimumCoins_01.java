package greedy_18;

import java.util.Arrays;
import java.util.Collections;

public class FindMinimumCoins_01 {

    public static int minCoins(Integer[] coins, int amount) {
        int n = coins.length;

        Arrays.sort(coins, Collections.reverseOrder());

        int res = 0;

        for (int i = 0; i < n; i++) {
            if (coins[i] <= amount) {
                int ct = amount / coins[i];

                res = res + ct;
                amount = amount - ct * coins[i];
            }
            if (amount == 0)
                break;
        }

        return res;
    }

    public static void main(String[] args) {
        Integer[] coins = {5, 10, 2, 1};
        int amount = 52;

        System.out.println(minCoins(coins, amount));

    }
}
