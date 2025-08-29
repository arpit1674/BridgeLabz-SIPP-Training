package week04_day5_SubmissionOfRegex;

public class ValidateHexColor {
    public static void main(String[] args) {
        String[] colors = {"#FFA500", "#ff4500", "#123"};
        for (String color : colors) {
            if (color.matches("^#([a-fA-F0-9]{6})$")) {
                System.out.println(color + " → Valid");
            } else {
                System.out.println(color + " → Invalid");
            }
        }
    }
}
