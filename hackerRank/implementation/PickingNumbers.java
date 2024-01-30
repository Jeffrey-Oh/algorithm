package hackerRank.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(9);
        a.add(8);
        int result = pickingNumbers(a);
        System.out.println(result);
    }

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);

        int count = 0;
        int max = 2;
        int check = a.get(0);
        for (int i=0; i < a.size(); i++) {
            if (i + 1 < a.size()) {
                int now = a.get(i);
                int next = a.get(i + 1);
                int abs = Math.abs(next - now);

                if (abs <= 1) {
                    if (Math.abs(check - next) < 2)
                        count++;
                    else {
                        max = Math.max(max, count + 1);
                        count = 0;
                        check = next;
                    }
                } else {
                    max = Math.max(max, count + 1);
                    count = 0;
                    check = next;
                }
            } else {
                max = Math.max(max, count + 1);
            }
        }

        return max;
    }
}
