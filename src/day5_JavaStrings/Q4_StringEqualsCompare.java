package day5_JavaStrings;
import java.util.Scanner;

public class Q4_StringEqualsCompare {
    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(compare(a, b));
        System.out.println(a.equals(b));
        sc.close();
    }
}
