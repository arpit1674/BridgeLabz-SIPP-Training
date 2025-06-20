package EXTRAS_java_string_handling;

import java.util.Scanner;

public class Problem12_WordReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String wordToReplace = sc.nextLine();
        String replacement = sc.nextLine();
        System.out.println("Modified: " + replaceWord(sentence, wordToReplace, replacement));
        sc.close();
    }

    static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll(oldWord, newWord);
    }
}
