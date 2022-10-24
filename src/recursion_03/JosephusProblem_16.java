package recursion_03;

/**
 * Josephus problem: In this problem kill the kth person, and start again form the k + 1 position and killed the kth person
 * until only one person remain in the circle.
 */

public class JosephusProblem_16 {

    public static void main(String[] args) {
        System.out.println(jos(5, 3));
    }

    // position start from 0, if it starts from 1 then simply add 1 to the answer
    static int jos(int n, int k) {
        if (n == 1)
            return 0;

        return (jos(n - 1, k) + k) % n;
    }
}
