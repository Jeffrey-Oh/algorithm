package hackerRank.implementation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LibraryFine {
    public static void main(String[] args) {
        int d1 = 14;
        int m1 = 7;
        int y1 = 2018;
        int d2 = 5;
        int m2 = 7;
        int y2 = 2018;
        int result = libraryFine(d1, m1, y1, d2, m2, y2);
        System.out.println(result);
    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        Date returned = new Date(y1, m1, d1);
        Date due = new Date(y2, m2, d2);

        if (returned.after(due)) {
            if (y1 > y2)
                return 10000;

            if (d1 <= d2 && m1 <= m2) {
                return 0;
            }

            if (m1 != m2) {
                int abs = Math.abs(m1 - m2);
                return abs * 500;
            }

            int abs = Math.abs(d1 - d2);
            return abs * 15;
        }

        return 0;
    }
}
