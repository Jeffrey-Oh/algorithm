package hackerRank.implementation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesByMatch {
    public static void main(String[] args) {
        int n = 9;
        List<Integer> ar = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Set<Integer> memo = new HashSet<>();

        int count = 0;

        for (Integer value : ar) {
            if (memo.contains(value)) {
                memo.remove(value);
                count++;
            }
            else memo.add(value);
        }

        return count;
    }
}
