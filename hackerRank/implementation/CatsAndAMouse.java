package hackerRank.implementation;

public class CatsAndAMouse {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        int z = 2;
        String result = catAndMouse(x, y, z);
        System.out.println(result);
    }

    static String catAndMouse(int x, int y, int z) {
        final String catA = "Cat A";
        final String catB = "Cat B";
        final String mouseC = "Mouse C";

        int a = Math.abs(z - x);
        int b = Math.abs(z - y);

        if (a > b) return catB;
        else if (a < b) return catA;
        else return mouseC;
    }
}
