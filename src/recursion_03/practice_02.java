package recursion_03;

public class practice_02 {

    public static void main(String[] args) {
        // func1(3);
        // System.out.println(func2(16));
        func3(7);
    }

    static void func1(int n) {
        if (n == 0)
            return;
        func1(n - 1);
        System.out.println(n);
        func1(n - 1);
    }

    static int func2(int n) {
        if (n == 1)
            return 0;
        else
            return 1 + func2(n / 2);
    }

    static void func3(int n) {
        if (n == 0)
            return;
        func3(n / 2);
        System.out.println(n % 2);
    }
}
