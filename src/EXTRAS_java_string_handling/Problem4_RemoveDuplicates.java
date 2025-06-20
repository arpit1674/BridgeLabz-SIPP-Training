package EXTRAS_java_string_handling;

import java.util.Scanner;

public class Problem4_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Modified: " + removeDuplicates(input));
        sc.close();
    }

    static String removeDuplicates(String s) {
        String result = "";
        for (char c : s.toCharArray()) {
            if (result.indexOf(c) == -1) result += c;
        }
        return result;
    }
}
