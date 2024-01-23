package hackerRank.implementation;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> result = gradingStudents(List.of(73, 67, 38, 33));
        result.forEach(System.out::println);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        // 점수의 다음 5배수 와의 차이에서 3 미만이면 round 아니면 not round
        // 40 점 미만이면 fail
        // 단 38점 39점은 통과임 다음 5배수인 40점과의 차이가 3 미만이므로
        return grades.stream().map(value -> {
            if (value == 100) return value;
            if (value == 38 || value == 39) return 40;
            if (value <= 37) return value;
            if (value % 5 != 0) {
                int nextGrade = (value / 5) * 5 + 5;
                if (nextGrade - value >= 3) return value;
                return nextGrade;
            }
            return value;
        }).collect(Collectors.toList());
    }
}
