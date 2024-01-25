package hackerRank.implementation;

import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        List<Integer> ar = List.of(1,3,2,6,1,2);
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;

        for (int i=0; i<ar.size(); i++) {
            int left = ar.get(i);

            for (int j=i+1; j<ar.size(); j++) {
                int right = ar.get(j);

                if ((left + right) % k == 0) count++;
            }
        }

        return count;
    }
}
