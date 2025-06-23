package day5_JavaStrings;
import java.util.*;

public class Q17_TrimStringCustom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string with leading and trailing spaces: ");
        String text = sc.nextLine();

        int[] range = findTrimRange(text);
        String trimmed = customSubstring(text, range[0], range[1]);
        String builtIn = text.trim();

        boolean isEqual = compareStrings(trimmed, builtIn);
        System.out.println("Trimmed: [" + trimmed + "]");
        System.out.println("Equal to built-in trim(): " + isEqual);
        sc.close();
    }

    public static int[] findTrimRange(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String customSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) result += s.charAt(i);
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
}
