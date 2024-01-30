package hackerRank.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TheHurdleRace {
    public static void main(String[] args) {
        int k = 7;
        List<Integer> height = new ArrayList<>();
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(5);
        height.add(2);
        int result = hurdleRace(7, height);
        System.out.println(result);
    }

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        Collections.sort(height);
        LinkedList<Integer> list = new LinkedList<>(height);
        Integer max = list.getLast();

        if (max <= k)
            return 0;
        else return Math.abs(max - k);
    }
}
