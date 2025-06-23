package EXTRAS_java_string_handling;

import java.util.Scanner;

public class Problem9_MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Most Frequent Character: " + mostFrequentChar(input));
        sc.close();
    }

    static char mostFrequentChar(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        int max = 0;
        char result = ' ';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = (char) i;
            }
        }
        return result;
    }
}
