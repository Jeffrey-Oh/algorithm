package hackerRank.implementation;

import java.util.ArrayList;
import java.util.List;

public class SequenceEquation {
    public static void main(String[] args) {
        List<Integer> p = List.of(4, 3, 5, 1, 2);
        permutationEquation(p).forEach(System.out::println);
    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        for (int i=1; i <= p.size(); i++) {
            int index = p.indexOf(i) + 1;
            int find = p.indexOf(index) + 1;
            result.add(find);
        }

        return result;
    }
}
