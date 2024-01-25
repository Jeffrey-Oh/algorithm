package hackerRank.implementation;

public class DayOfTheProgrammer {
    public static void main(String[] args) {
        int year = 2024;
        String days = dayOfProgrammer(year);
        System.out.println(days);
    }

    public static String dayOfProgrammer(int year) {
        // Write your code here
        boolean leaf = false;

        if (year == 1918) {
            return "26.09.1918";
        }

        if (year < 1918) {
            if (year % 4 == 0) leaf = true;
        } else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                leaf = true;
        }
        String no = "13.09.";
        String yes = "12.09.";

        return leaf ? yes + year : no + year;
    }
}
