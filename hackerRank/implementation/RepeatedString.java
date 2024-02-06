package hackerRank.implementation;

import java.math.BigDecimal;
import java.util.Arrays;

public class RepeatedString {
    public static void main(String[] args) {
        String s = "a";
        long n = 1000000000000L;
        long result = repeatedString(s, n);
        System.out.println(result);
    }

    public static long repeatedString(String s, long n) {
        // Write your code here
        BigDecimal bigDecimal = new BigDecimal(n);

        long count = Arrays.stream(s.split("")).filter(value -> value.equals("a")).count();
        int size = s.length();

        if (bigDecimal.longValue() % size == 0)
            return bigDecimal.longValue() / size * count;

        String sub = s.substring(0, Math.toIntExact(bigDecimal.longValue() % size));
        long subCount = Arrays.stream(sub.split("")).filter(value -> value.equals("a")).count();

        return (bigDecimal.longValue() / size * count) + subCount;
    }
}
