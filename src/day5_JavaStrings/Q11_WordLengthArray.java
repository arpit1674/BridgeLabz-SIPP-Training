package day5_JavaStrings;
import java.util.*;

public class Q11_WordLengthArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = sc.nextLine();

        String[] words = splitIntoWords(text);
        String[][] result = mapWordsToLength(words);

        System.out.println("Word\tLength");
        for (String[] row : result)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        sc.close();
    }

    public static String[] splitIntoWords(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ') count++;
        String[] words = new String[count];
        int index = 0, start = 0;
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) word += text.charAt(j);
                words[index++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    public static int getLength(String word) {
        int len = 0;
        try {
            while (true) {
                word.charAt(len);
                len++;
            }
        } catch (Exception e) {
            return len;
        }
    }

    public static String[][] mapWordsToLength(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(getLength(words[i]));
        }
        return arr;
    }
}
