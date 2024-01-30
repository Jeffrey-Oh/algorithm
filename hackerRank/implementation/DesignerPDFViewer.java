package hackerRank.implementation;

import java.util.List;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        List<Integer> h = List.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        String word = "zaba";
        int result = designerPdfViewer(h, word);
        System.out.println(result);
    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String[] split = word.split("");

        int max = 0;
        for (int i=0; i<split.length; i++) {
            String value = split[i];
            int index = alpha.indexOf(value);
            int num = h.get(index);
            max = Math.max(num, max);
        }

        return max * word.length();
    }
}
