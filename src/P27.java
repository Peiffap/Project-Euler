/**
 * Created by admin on 27/01/17.
 * Validated.
 */
public class P27 {

    private static boolean[] primes = Library.primeTab(10000000);

    public static int consec (int a, int b) {
        int n = 0;
        while (primes[Math.abs(n*n + a*n + b)]) {
            n++;
        }
        return n;
    }

    public static void main (String[] args) {
        long s = System.nanoTime();
        int max = 40;
        int maxProd = 41;
        for (int a = -999; a < 1000; a++) {
            for (int b = -1000; b <= 1000; b++) {
                if (consec(a,b) > max) {
                    max = consec(a,b);
                    maxProd = a*b;
                }
            }
        }
        System.out.println(maxProd);
        long e = System.nanoTime();
        System.out.println((e-s)/1000000000.0);
    }
}
