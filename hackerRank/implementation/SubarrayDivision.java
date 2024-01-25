package hackerRank.implementation;

import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        List<Integer> s = List.of(4,2,4,3,3,1,2,3,5,2,4,3,5,2,3,4,1,5,2,3,4,2);
        int d = 6;
        int m = 3;
        int result = birthday(s, d, m);
        System.out.println(result);
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        // m is length
        // d is goal

        int count = 0;

        if (m == 1) {
            for (Integer v : s) {
                if (v == d) count++;
            }
        } else {
            for (int i=0; i<s.size(); i++) {
                if (i + m > s.size()) break;

                int sum = 0;

                for (int j=0; j<m; j++) {
                    sum += s.get(i + j);
                }

                if (sum == d) count++;
            }
        }

        return count;
    }
}
