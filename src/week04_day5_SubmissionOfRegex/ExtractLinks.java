package week04_day5_SubmissionOfRegex;

import java.util.regex.*;

public class ExtractLinks {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        Matcher matcher = Pattern.compile("https?://[\\w./-]+").matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
