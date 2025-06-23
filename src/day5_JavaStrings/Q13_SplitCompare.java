package day5_JavaStrings;
import java.util.*;

public class Q13_SplitCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = sc.nextLine();

        String[] builtIn = text.split(" ");
        String[] custom = splitManually(text);

        boolean isEqual = compareArrays(builtIn, custom);
        System.out.println("Are the arrays equal: " + isEqual);
        sc.close();
    }

    public static String[] splitManually(String text) {
        List<String> list = new ArrayList<>();
        String word = "";
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                if (!word.equals("")) list.add(word);
                word = "";
            } else word += text.charAt(i);
        }
        return list.toArray(new String[0]);
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }
}
