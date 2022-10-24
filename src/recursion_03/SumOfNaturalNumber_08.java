package recursion_03;

public class SumOfNaturalNumber_08 {

    public static void main(String[] args) {
        System.out.println(getSum(4));
    }

    static int getSum(int n) {
        if (n == 0)
            return 0;

        return n + getSum(n - 1);
    }
}
