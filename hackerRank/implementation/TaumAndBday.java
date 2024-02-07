package hackerRank.implementation;

import java.math.BigInteger;

public class TaumAndBday {
    public static void main(String[] args) {
        int b = Integer.MAX_VALUE;
        int w = Integer.MAX_VALUE;
        int bc = Integer.MAX_VALUE;
        int wc = Integer.MAX_VALUE;
        int z = Integer.MAX_VALUE;
        long result = taumBday(b, w, bc, wc, z);
        System.out.println(result);
    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        BigInteger convB = new BigInteger(String.valueOf(b), 10);
        BigInteger convW = new BigInteger(String.valueOf(w), 10);
        BigInteger convBC = new BigInteger(String.valueOf(bc), 10);
        BigInteger convWC = new BigInteger(String.valueOf(wc), 10);
        BigInteger convZ = new BigInteger(String.valueOf(z), 10);

        BigInteger calc1 = convB.multiply(convBC).add(convW.multiply(convWC));
        BigInteger calc2 = convB.add(convW).multiply(convBC).add(convW.multiply(convZ));
        BigInteger calc3 = convB.add(convW).multiply(convWC).add(convB.multiply(convZ));

        BigInteger min = calc1.min(calc2);
        min = min.min(calc3);

        if (z > bc && z > wc) {
            min = calc1;
        }

        return min.longValue();
    }
}
