package hackerRank.implementation;

import java.util.List;

public class BeautifulTriplets {
    public static void main(String[] args) {
        int d = 3;
        List<Integer> arr = List.of(1, 2, 4, 5, 7, 8, 10);
        int result = beautifulTriplets(d, arr);
        System.out.println(result);
    }

    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int result = 0;

        for (int i=0; i<arr.size(); i++) {
            int value = arr.get(i);
            if (arr.contains(value + d) && arr.contains(value + (2 * d)))
                result++;
        }

        return result;
    }
}
