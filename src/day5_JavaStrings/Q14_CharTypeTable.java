package day5_JavaStrings;
import java.util.*;

public class Q14_CharTypeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String text = sc.nextLine();
        String[][] result = charTypeArray(text);

        System.out.println("Character\tType");
        for (String[] row : result)
            System.out.println(row[0] + "\t\t" + row[1]);
        sc.close();
    }

    public static String getCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] charTypeArray(String s) {
        String[][] arr = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            arr[i][0] = String.valueOf(s.charAt(i));
            arr[i][1] = getCharType(s.charAt(i));
        }
        return arr;
    }
}
