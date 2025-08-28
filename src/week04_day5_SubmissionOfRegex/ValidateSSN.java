package week04_day5_SubmissionOfRegex;

public class ValidateSSN {
    public static void main(String[] args) {
        String[] inputs = {"123-45-6789", "123456789"};
        for (String ssn : inputs) {
            if (ssn.matches("^\\d{3}-\\d{2}-\\d{4}$")) {
                System.out.println(ssn + " → Valid");
            } else {
                System.out.println(ssn + " → Invalid");
            }
        }
    }
}
