package week04_day5_SubmissionOfRegex;

public class ValidateLicensePlate {
    public static void main(String[] args) {
        String[] plates = {"AB1234", "A12345", "XY9876"};
        for (String plate : plates) {
            if (plate.matches("^[A-Z]{2}\\d{4}$")) {
                System.out.println(plate + " → Valid");
            } else {
                System.out.println(plate + " → Invalid");
            }
        }
    }
}
