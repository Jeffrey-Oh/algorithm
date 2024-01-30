package hackerRank.implementation;

public class UtopianTree {
    public static void main(String[] args) {
        int n = 5;
        int result = utopianTree(n);
        System.out.println(result);
    }

    public static int utopianTree(int n) {
        // Write your code here
        int height = 1; // init spring +1
        int cycle = 1;
        for (int i=0; i<n; i++) {
            if (i != 0) {
                cycle++;
                if (cycle == 1) // spring
                    height *= 2;
                else {
                    height += 1;
                    cycle = 0;
                }
            } else height++; // init summer +1
        }
        return height;
    }
}
