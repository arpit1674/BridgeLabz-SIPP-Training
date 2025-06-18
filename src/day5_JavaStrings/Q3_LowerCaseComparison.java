package day5_JavaStrings;
import java.util.Scanner;

public class Q3_LowerCaseComparison {
    public static String toLower(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') res += (char)(ch + 32);
            else res += ch;
        }
        return res;
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String custom = toLower(text);
        String builtIn = text.toLowerCase();
        System.out.println(compare(custom, builtIn));
        sc.close();
    }
}
