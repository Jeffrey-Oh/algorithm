package hackerRank.implementation;

public class SaveThePrisoner {
    public static void main(String[] args) {
        int result = saveThePrisoner(4, 6, 2);
        System.out.println(result);
    }

    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        if (n > m) {
            int boom = m - 1 + s;
            return n < boom ? boom - n : boom;
        } else if (n < m) {
            int mod = m % n;
            if (mod == 0) mod = n;
            int boom = mod - 1 + s;
            return n < boom ? boom - n : boom;
        } else {
            return s == 1 ? m : s - 1;
        }
    }
}
