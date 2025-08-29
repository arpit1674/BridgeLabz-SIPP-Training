package week04_day5_SubmissionOfRegex;

public class ValidateCreditCard {
    public static void main(String[] args) {
        String[] cards = {"4123456789012345", "5123456789012345", "3123456789012345"};

        for (String card : cards) {
            if (card.matches("^4\\d{15}$")) {
                System.out.println(card + " → Valid Visa");
            } else if (card.matches("^5\\d{15}$")) {
                System.out.println(card + " → Valid MasterCard");
            } else {
                System.out.println(card + " → Invalid");
            }
        }
    }
}
