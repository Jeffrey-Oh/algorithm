package hackerRank.implementation;

import java.util.List;

public class BillDivision {
    public static void main(String[] args) {
        List<Integer> bill = List.of(3, 10, 2, 9);
        int k = 1;
        int b = 12;
        bonAppetit(bill, k, b);
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        final String BON_APPETIT = "Bon Appetit";

        int annaSum = 0;
        for (int i=0; i<bill.size(); i++) {
            if (i != k)
                annaSum += bill.get(i);
        }

        if (annaSum / 2 == b)
            System.out.println(BON_APPETIT);
        else
            System.out.println(Math.abs(b - (annaSum / 2)));
    }
}
