package hackerRank.implementation;

import java.util.List;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        List<Integer> c = List.of(0, 0, 1, 0, 0, 1, 0);
        int result = jumpingOnClouds(c);
        System.out.println(result);
    }

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jumps = 0;

        for (int i=0; i<c.size(); i++) {
            if (i == c.size() - 1) break;

            int now = c.get(i);
            if (i == 0 && now == 1)
                break;

            if (i + 2 <= c.size()) {
                int add = i + 2 == c.size() ? 1 : 2;
                int plus2 = c.get(i + add);
                if (plus2 == 0) {
                    jumps += 1;
                    i += 1;
                    continue;
                }
            }

            if (i + 1 <= c.size()) {
                int add = i + 1 == c.size() ? 0 : 1;
                int plus1 = c.get(i + add);
                if (plus1 == 0) {
                    jumps += 1;
                }
            }
        }

        return jumps;
    }
}
