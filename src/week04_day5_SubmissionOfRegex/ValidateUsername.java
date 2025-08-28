package week04_day5_SubmissionOfRegex;

public class ValidateUsername {
    public static void main(String[] args) {
        String[] usernames = {"user_123", "123user", "us"};
        for (String username : usernames) {
            if (username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$")) {
                System.out.println(username + " → Valid");
            } else {
                System.out.println(username + " → Invalid");
            }
        }
    }
}
