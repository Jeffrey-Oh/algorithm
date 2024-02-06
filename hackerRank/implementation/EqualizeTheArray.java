package hackerRank.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EqualizeTheArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        int result = equalizeArray(arr);
        System.out.println(result);
    }

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        int max = 0;

        Collections.sort(arr);

        int count = 0;
        int now = arr.get(0);
        for (int i=1; i<arr.size(); i++) {
            int value = arr.get(i);
            if (now == value) count++;
            else {
                max = Math.max(max, count);
                now = value;
                count = 0;
            }
        }

        if (count > 0) max = Math.max(max, count);

        return arr.size() - max - 1;
    }
}
