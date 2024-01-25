package hackerRank.implementation;

import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {
        List<Integer> scores = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1);
        List<Integer> result = breakingRecords(scores);
        result.forEach(System.out::println);
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int minNum = 0;
        int maxNum = 0;

        int minCount = 0;
        int maxCount = 0;

        for (int i=0; i<scores.size(); i++) {
            int score = scores.get(i);
            if (i == 0) {
                minNum = score;
                maxNum = score;
                continue;
            }

            if (minNum == score && maxNum == score)
                continue;

            if (minNum > score) {
                minNum = score;
                minCount++;
                continue;
            }

            if (maxNum < score) {
                maxNum = score;
                maxCount++;
            }
        }

        return List.of(maxCount, minCount);
    }
}
