package hackerRank.implementation;

public class ViralAdvertising {
    public static void main(String[] args) {
        int result = viralAdvertising(5);
        System.out.println(result);
    }

    public static int viralAdvertising(int n) {
        // Write your code here
        int shared = 5; // default 5
        int cumulative = 0;

        for (int i=0; i<n; i++) {
            int half = shared / 2; // float
            cumulative += half;
            shared = half * 3;
        }

        return cumulative;
    }
}
