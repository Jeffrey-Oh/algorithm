package hackerRank.implementation;

public class DrawingBook {
    public static void main(String[] args) {
        int n = 13;
        int p = 8;
        int result = pageCount(n, p);
        System.out.println(result);

        // 1 23 45 67 89 1011 1213
    }

    public static int pageCount(int n, int p) {
        // Write your code here
        if (n % 2 == 1 && n - p == 1) return 0;
        if (n % 2 == 0 && n - p == 0) return 0;

        boolean flag = n / 2 < p; // false : left, true : right

        int count = 0;
        int start = flag ? n : 1;
        int minus = p % 2 == 0 ? 1 : 0;

        while(true) {
            if (flag) {
                if (p < start - minus) {
                    start -= 2;
                    count++;
                } else break;
            } else {
                if (p > start - minus) {
                    start += 2;
                    count++;
                } else break;
            }
        }

        return count;
    }
}
