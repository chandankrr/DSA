package recursion_03;

public class Example_01 {

    public static void main(String[] args) {
        // func1(); // throw StackOverFlowError
        // func2(2);
        func3(3);
    }

    static void func1() {
        System.out.println("Hello World!");
        func1();
    }

    static void func2(int n) {
        if (n == 0) // base case
            return;
        System.out.println("Hello World!");
        func2(n - 1);
    }

    static void func3(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        func3(n - 1);
        System.out.println(n);
    }
}
