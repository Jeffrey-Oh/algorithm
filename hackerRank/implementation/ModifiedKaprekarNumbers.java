package hackerRank.implementation;

public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        int p = 297;
        int q = 297;
        kaprekarNumbers(p, q);
    }

    public static void kaprekarNumbers(int p, int q) {
        // Write your code here
        String result = "";
        for (int i=p; i<=q; i++) {
            if (i == 1) {
                if (i == q)
                    result += 1;
                else
                    result += 1 + " ";
                continue;
            }
            if (Math.pow(i, 2) < 10) continue;
            String pow = String.valueOf((long) Math.pow(i, 2));
            String front = pow.substring(0, pow.length() / 2);
            String back = pow.substring(pow.length() / 2);
            if (!front.isEmpty() && !back.isEmpty() && Long.parseLong(front) + Long.parseLong(back) == i) {
                if (i == q) {
                    result += i;
                } else {
                    result += i + " ";
                }
            }
        }

        if (result.isEmpty())
            System.out.println("INVALID RANGE");
        else
            System.out.println(result);
    }
}
