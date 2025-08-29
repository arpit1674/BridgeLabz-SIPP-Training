package week04_day5_SubmissionOfRegex;

import java.util.regex.*;

public class ExtractCapitalizedWords {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        Matcher matcher = Pattern.compile("\\b[A-Z][a-zA-Z]*\\b").matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
