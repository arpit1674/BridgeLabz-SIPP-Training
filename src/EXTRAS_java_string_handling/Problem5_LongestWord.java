package EXTRAS_java_string_handling;

import java.util.Scanner;

public class Problem5_LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println("Longest Word: " + findLongest(sentence));
        sc.close();
    }

    static String findLongest(String s) {
        String[] words = s.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        return longest;
    }
}
