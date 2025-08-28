package week04_day5_SubmissionOfRegex;

import java.util.regex.*;

public class ExtractEmails {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
        Matcher matcher = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}").matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
