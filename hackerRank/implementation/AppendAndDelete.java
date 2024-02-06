package hackerRank.implementation;

public class AppendAndDelete {
    public static void main(String[] args) {
        String s = "qwerasdf";
        String t = "qwerbsdf";
        int k = 6;
        String result = appendAndDelete(s, t, k);
        System.out.println(result);
    }

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        if (s.length() + t.length() <= k)
            return "Yes";

        int size = Math.min(s.length(), t.length());

        StringBuilder temp = new StringBuilder();

        for (int i=0; i<size; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                temp.append(s.charAt(i));
            } else break;
        }

        if (s.length() < t.length()) {
            String left = t.replace(temp.toString(), "");
            int leftLen = left.length();

            if ((k - leftLen) % 2 == 0)
                return "Yes";
        } else {
            s = s.replace(temp.toString(), "");
            t = t.replace(temp.toString(), "");

            if (s.length() + t.length() <= k)
                return "Yes";
        }

        return "No";
    }
}
