package EXTRAS_java_string_handling;

import java.util.Scanner;

public class Problem10_RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char remove = sc.next().charAt(0);
        System.out.println("Modified String: " + removeChar(str, remove));
        sc.close();
    }

    static String removeChar(String s, char ch) {
        return s.replaceAll(String.valueOf(ch), "");
    }
}
