package day5_JavaStrings;
import java.util.Scanner;

public class Q5_CharArrayCompare {
    public static char[] customToCharArray(String s) {
        char[] res = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            res[i] = s.charAt(i);
        }
        return res;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] a = customToCharArray(text);
        char[] b = text.toCharArray();
        System.out.println(compareArrays(a, b));
        sc.close();
    }
}
