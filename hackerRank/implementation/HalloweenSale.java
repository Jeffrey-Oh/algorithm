package hackerRank.implementation;

public class HalloweenSale {
    public static void main(String[] args) {
        int p = 20;
        int d = 3;
        int m = 6;
        int s = 80;
        int result = howManyGames(p, d, m, s);
        System.out.println(result);
    }

    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int result = 0;
        int sum = 0;

        while (sum + p <= s) {
            sum += p;
            result++;

            if (p - d >= m)
                p -= d;
            else p = m;
        }

        return result;
    }
}
