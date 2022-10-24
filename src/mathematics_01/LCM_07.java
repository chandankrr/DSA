package mathematics_01;

public class LCM_07 {

    public static void main(String[] args) {
        int a = 4, b = 6;

        System.out.println("LCM = " + lcm(a, b));
    }

    // naive solution
    /* public static int lcm(int a, int b) {
        int res = Math.max(a, b);

        while (true) {
            if (res % a == 0 && res % b == 0)
                return res;

            res++;
        }
    } */

    // efficient solution
    // a * b = gcd(a, b) * lcm(a, b)
    // lcm = (a * b) / gcd(a, b)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

}
