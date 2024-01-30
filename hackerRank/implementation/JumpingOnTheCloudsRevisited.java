package hackerRank.implementation;

public class JumpingOnTheCloudsRevisited {
    public static void main(String[] args) {
        int[] c = {0, 0, 1, 0, 0, 1, 1, 0};
        int k = 2;
        int result = jumpingOnClouds(c, k);
        System.out.println(result);
    }

    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int i = 0;
        int n = c.length;

        // ends land back on cloud 0
        do {
            int jumpNum = c[(i + k) % n];
            i = (i + k) % n;
            energy--;
            if (jumpNum == 1)
                energy = energy - 2;

        } while (i != 0);

        return energy;
    }
}
