package hackerRank.implementation;

import java.util.List;

public class AngryProfessor {
    public static void main(String[] args) {
        String result = angryProfessor(3, List.of(-2, -1, 0, 1, 2));
        System.out.println(result);
    }

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        return a.stream().filter(v -> v <= 0).count() < k ? "YES" : "NO";
    }
}
