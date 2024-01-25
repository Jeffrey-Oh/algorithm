package hackerRank.implementation;

public class NumberLineJumps {
    public static void main(String[] args) {
        int x1 = 43;
        int v1 = 2;
        int x2 = 70;
        int v2 = 2;
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        String yes = "YES";
        String no = "NO";

        if (x1 == x2) {
            if (v1 != v2) return no;
        } else {
            if (v1 == v2) return no;

            int mod = Math.abs((x1 - x2) % (v1 - v2));

            if (x1 < x2) {
                if (v1 < v2) return no;
            } else {
                if (v1 > v2) return no;
            }
            if (mod != 0) return no;

        }
        return yes;
    }

}
