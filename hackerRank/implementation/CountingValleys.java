package hackerRank.implementation;

public class CountingValleys {
    public static void main(String[] args) {
        int steps = 12;
        String path = "DDUUDDUDUUUD";
        int result = countingValleys(steps, path);
        System.out.println(result);

        // -         /\-
        //  \ /\    /
        //  \/  \/\/
    }

    public static int countingValleys(int steps, String path) {
        // Write your code here
        boolean flag = false; // false : -, true : +

        String[] split = path.split("");

        int count = 0;
        int seaLevel = 0;

        for (String step : split) {
            // first D
            if (seaLevel == 0 && step.equals("D"))
                flag = true; // start

            if (step.equals("D")) seaLevel--;
            else seaLevel++;

            if (flag && seaLevel == 0) {
                flag = false;
                count++;
            }
        }

        return count;
    }
}
