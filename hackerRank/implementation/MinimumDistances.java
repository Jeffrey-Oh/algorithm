package hackerRank.implementation;

import java.util.List;

public class MinimumDistances {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 3, 4, 4, 1, 4, 2);
        int result = minimumDistances(a);
        System.out.println(result);
    }

    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        int result = -1;
        int max = a.stream().mapToInt(Integer::intValue).max().getAsInt();
        int min = 0;

        for (int i=0; i<a.size(); i++) {
            for (int j=i+1; j<a.size(); j++) {
                if (a.get(i).equals(a.get(j))) {
                    if (min == 0) min = Math.min(max, Math.abs(j - i));
                    else min = Math.min(min, Math.abs(j - i));
                    break;
                }
            }
        }

        if (min > 0) result = min;

        return result;
    }
}
