package hackerRank.implementation;

import java.util.List;
import java.util.stream.Collectors;

public class AppleAndOrange {
    public static void main(String[] args) {
        int s = 7; // house left start point
        int t = 11; // house right end point
        int a = 5; // apple tree
        int b = 15; // orange tree
        List<Integer> apples = List.of(-2, 2, 1);
        List<Integer> orange = List.of(5, -6);

        // if s = 7, t = 10, a = 4, b = 12, m = 3, n = 3, apples = [2,3,-4], oranges = [3,-2,-4]
        // apples land is (4 + 2, 4 + 3, 4 + -4) -> (6, 7, 0)
        // organes land is (12 + 3, 12 + -2, 12 + -4) -> (15, 10, 8)

        // s <= a, o <= t inclusive is a is 7, b is 8, 10
        // result
        // 1
        // 2

        countApplesAndOranges(s, t, a, b, apples, orange);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        // s, t is start point and end point
        // apple tree is to the left of the house(s)
        // orange tree is to the right of the house(t)

        long appleCount = apples.stream()
            .map(value -> a + value)
            .filter(value -> value >= s && value <= t)
            .count();
        System.out.println(appleCount);

        long orangeCount = oranges.stream()
            .map(value -> b + value)
            .filter(value -> value >= s && value <= t)
            .count();
        System.out.println(orangeCount);
    }
}
