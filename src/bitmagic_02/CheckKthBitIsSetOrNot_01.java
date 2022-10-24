package bitmagic_02;

public class CheckKthBitIsSetOrNot_01 {

    public static void main(String[] args) {
        int n = 5, k = 3;
        kthBit(n, k);
    }

    // using left shift bitwise operator
    /* static void kthBit(int n, int k) {
        if ((n & (1 << (k - 1))) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    } */

    // using right shift bitwise operator
    static void kthBit(int n, int k) {
        if (((n >> (k - 1)) & 1) == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }


}
