package recursion_03;

public class TailRecursion_05 {

    public static void main(String[] args) {
        func1(5);
        System.out.println();
        // func2(5);
        func2_t(5, 1);
    }

    // tail recursion -- print n to 1
    static void func1(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        func1(n - 1);
    }

    // none tail recursion -- print 1 to n
    static void func2(int n) {
        if (n == 0)
            return;

        func2(n - 1);
        System.out.println(n);
    }

    // convert func2 to tail recursive
    static void func2_t(int n, int k) {
        if (n == 0)
            return;

        System.out.println(k);
        func2_t(n - 1, k + 1);
    }
}
