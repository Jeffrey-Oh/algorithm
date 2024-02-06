package hackerRank.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CutTheSticks {
    public static void main(String[] args) {
        List<Integer> arr = List.of(5, 4, 4, 2, 2, 8);
        List<Integer> result = cutTheSticks(arr);
        result.forEach(System.out::println);
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        List<Integer> save = new ArrayList<>(arr);
        List<Integer> temp;

        while(true) {
            AtomicInteger count = new AtomicInteger();
            temp = new ArrayList<>();

            if (save.stream().filter(value -> value == 0).count() == save.size())
                break;

            int min = save.stream().filter(value -> value > 0).mapToInt(Integer::intValue).min().getAsInt();

            List<Integer> finalTemp = temp;
            save.forEach(value -> {
                if (value == 0)
                    finalTemp.add(value);
                else {
                    int sub = value - min;
                    if (sub < 0) sub = 0;
                    finalTemp.add(sub);
                    count.getAndIncrement();
                }
            });

            save = new ArrayList<>(temp);
            result.add(count.get());
        }

        return result;
    }
}
