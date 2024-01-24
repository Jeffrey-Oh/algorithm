package hackerRank.implementation;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3);
        List<Integer> queries = List.of(2, 0, 1);
        List<Integer> result = circularArrayRotation(a, 2, queries);
        result.forEach(System.out::println);
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        // n = array size
        // k = rotate count
        // q = queries size (ex 3 -> 0, 1, 2)

        List<Integer> result = new ArrayList<>();

        // list copy
        result.addAll(0, a.subList(a.size() - k, a.size()));
        result.addAll(a.subList(0, a.size() - k));

        return result;
    }
}
