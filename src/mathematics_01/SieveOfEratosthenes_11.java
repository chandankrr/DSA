package mathematics_01;/*
 * print all prime number up to n
 */

import java.util.Arrays;

public class SieveOfEratosthenes_11 {

    public static void main(String[] args) {
        sieveOfEratosthenes(23);
    }

    // naive approach
    /* public static void printPrimes(int n){
        for(int i = 2; i <= n; i++){
            if (PrimeNumber_08.isPrime(i)){
                System.out.print(i + " ");
            }
        }
    } */

    // sieve of Eratosthenes -- print all prime number up to n
    /* public static void sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j = j + i)
                    isPrime[j] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i])
                System.out.print(i + " ");
        }
    } */

    // more optimize sieve of eratosthenes
    public static void sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}

