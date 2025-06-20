package EXTRAS_java_string_handling;

import java.util.Scanner;

public class Problem8_CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int res = compare(str1, str2);
        if (res < 0) System.out.println(str1 + " comes before " + str2);
        else if (res > 0) System.out.println(str2 + " comes before " + str1);
        else System.out.println("Both are equal");
        sc.close();
    }

    static int compare(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return s1.charAt(i) - s2.charAt(i);
        }
        return s1.length() - s2.length();
    }
}
