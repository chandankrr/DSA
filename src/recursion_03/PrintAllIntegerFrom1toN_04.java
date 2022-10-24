package recursion_03;

public class PrintAllIntegerFrom1toN_04 {

    public static void main(String[] args) {
        print1toN(10);
    }

    static void print1toN(int n) {
        if (n == 0)
            return;

        print1toN(n-1);
        System.out.println(n);
    }
}
