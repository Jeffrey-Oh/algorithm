package hackerRank.implementation;

import java.util.List;

public class MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 4, 4, 4, 5, 3);
        int result = migratoryBirds(arr);
        System.out.println(result);
    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int count1 = (int) arr.stream().filter(value -> value == 1).count();
        int count2 = (int) arr.stream().filter(value -> value == 2).count();
        int count3 = (int) arr.stream().filter(value -> value == 3).count();
        int count4 = (int) arr.stream().filter(value -> value == 4).count();
        int count5 = (int) arr.stream().filter(value -> value == 5).count();

        int max = count1;
        int result = 1;

        if (count2 > max) {
            result = 2;
            max = count2;
        }
        if (count3 > max) {
            result = 3;
            max = count3;
        }
        if (count4 > max) {
            result = 4;
            max = count4;
        }
        if (count5 > max)
            return 5;

        return result;
    }
}
