package bitmagic_02;

public class CountSetBit2_03 {
    static int[] table = new int[256];

    static void initialize() {
        table[0] = 0;
        for (int i = 1; i < 256; i++) {
            table[i] = (i & 1) + table[i/2];
        }
    }

    // lookup table method -- time complexity Θ(1)
    static int count(int n) {
        int res = table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];

        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        initialize();
        System.out.println(count(n));
    }
}
