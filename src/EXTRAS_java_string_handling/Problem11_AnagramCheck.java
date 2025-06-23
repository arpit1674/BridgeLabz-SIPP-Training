package EXTRAS_java_string_handling;

import java.util.Arrays;
import java.util.Scanner;

public class Problem11_AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(areAnagrams(s1, s2) ? "Anagrams" : "Not Anagrams");
        sc.close();
    }

    static boolean areAnagrams(String s1, String s2) {
        char[] a1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] a2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}
