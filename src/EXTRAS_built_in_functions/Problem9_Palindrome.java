package EXTRAS_built_in_functions;

import java.util.Scanner;

public class Problem9_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Is palindrome: " + isPalindrome(input));
        sc.close();
    }

    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
