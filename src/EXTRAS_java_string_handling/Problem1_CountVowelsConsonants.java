package EXTRAS_java_string_handling;

import java.util.Scanner;

public class Problem1_CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] result = countVowelsConsonants(input);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
        sc.close();
    }

    static int[] countVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
}
