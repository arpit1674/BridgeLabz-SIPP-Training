package week04_day5_SubmissionOfRegex;

import java.util.regex.*;
import java.util.HashSet;
import java.util.Set;

public class FindRepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        Matcher matcher = Pattern.compile("\\b(\\w+)\\b\\s+\\1\\b", Pattern.CASE_INSENSITIVE).matcher(text);
        Set<String> repeats = new HashSet<>();
        while (matcher.find()) {
            repeats.add(matcher.group(1));
        }

        for (String word : repeats) {
            System.out.println(word);
        }
    }
}
