package hackerRank.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(4, 2);
        List<Integer> b = Arrays.asList(32, 16, 96);
        int result = getTotalX(a, b);
        System.out.println(result);
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here

        AtomicInteger result = new AtomicInteger(0);

        Collections.sort(a);
        Collections.sort(b);

        LinkedList<Integer> linkA = new LinkedList<>(a);
        LinkedList<Integer> linkB = new LinkedList<>(b);

        Integer linkALast = linkA.getLast();
        Integer linkBFirst = linkB.getFirst();

        List<Integer> search = new ArrayList<>();

        for (int i=linkALast; i<= linkBFirst; i += linkALast)
            search.add(i);

        search.forEach(searchValue -> {
            boolean flag = linkA.stream().anyMatch(value -> {
                if (value < searchValue && searchValue % value != 0 || value >= searchValue && value % searchValue != 0) {
                    return true;
                }

                return linkB.stream().anyMatch(value2 -> value2 < searchValue && searchValue % value2 != 0 || value2 >= searchValue && value2 % searchValue != 0);
            });

            if (!flag) result.getAndIncrement();
        });

        return result.get();
    }

}
