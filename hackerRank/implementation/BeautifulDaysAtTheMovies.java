package hackerRank.implementation;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        int result = beautifulDays(20, 23, 6);
        System.out.println(result);
    }

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int count = 0;
        for (int x=i; x<=j; x++) {
            StringBuilder sb = new StringBuilder(String.valueOf(x));
            String reversed = sb.reverse().toString();
            int xr = Integer.parseInt(reversed);
            int abs = Math.abs(x - xr);

            if (abs % k == 0) count++;
        }
        return count;
    }
}
