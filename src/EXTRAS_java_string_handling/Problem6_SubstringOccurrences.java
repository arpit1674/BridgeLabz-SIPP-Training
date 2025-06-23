package EXTRAS_java_string_handling;

import java.util.Scanner;

public class Problem6_SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sub = sc.nextLine();
        System.out.println("Occurrences: " + countOccurrences(str, sub));
        sc.close();
    }

    static int countOccurrences(String str, String sub) {
        int count = 0, idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        return count;
    }
}
