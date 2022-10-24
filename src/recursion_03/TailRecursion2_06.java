package recursion_03;

public class TailRecursion2_06 {

    public static void main(String[] args) {
        System.out.println(fact1(5));
        System.out.println(fact2(5, 1));
    }

    // function to  find factorial
    static int fact1(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact1(n - 1); // not a tail recursion
    }

    // function to  find factorial
    static int fact2(int n, int k) {
        if (n == 0 || n == 1)
            return k;
        return fact2(n - 1, k * n); // tail recursion
    }
}
