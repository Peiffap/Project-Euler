/**
 * Created by admin on 27/01/17.
 * Validated.
 */

import java.math.BigInteger;

public class P48 {
    public static void main(String[] args) {
        long s = System.nanoTime();
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 1000; i++) {
            sum = sum.add((new BigInteger(Integer.toString(i))).pow(i));
        }
        System.out.println(sum.mod(BigInteger.TEN.pow(10)));
        long e = System.nanoTime();
        System.out.println((e-s)/1000000000.0);
    }
}
