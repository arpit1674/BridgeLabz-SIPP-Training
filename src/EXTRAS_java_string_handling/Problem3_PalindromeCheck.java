package EXTRAS_java_string_handling;

import java.util.Scanner;

public class Problem3_PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(isPalindrome(input) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }

    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}
