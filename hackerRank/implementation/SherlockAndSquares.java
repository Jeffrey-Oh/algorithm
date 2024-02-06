package hackerRank.implementation;

public class SherlockAndSquares {
    public static void main(String[] args) {
        int result = squares(2, 4);
        System.out.println(result);
    }

    public static int squares(int a, int b) {
        // Write your code here
        int result = 0;

        int index = 1;
        while(Math.pow(index, 2) <= b) {
            int pow = (int) Math.pow(index, 2);
            if (pow >= a && pow <= b)
                result++;

            index++;
        }

        return result;
    }

}
