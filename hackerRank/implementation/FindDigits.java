package hackerRank.implementation;

public class FindDigits {
    public static void main(String[] args) {
        int n = 1012;
        int result = findDigits(n);
        System.out.println(result);
    }

    public static int findDigits(int n) {
        // Write your code here
        String num = String.valueOf(n);
        String[] split = num.split("");

        int count = 0;

        for (String value : split) {
            int parse = Integer.parseInt(value);
            if (parse > 0 && n % parse == 0)
                count++;
        }

        return count;
    }
}
