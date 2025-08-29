package week06_day2_SubmissionOfFunctionalInterfaces;

interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.matches(".*[0-9].*") && password.matches(".*[A-Z].*");
    }
}

public class PasswordStrengthValidator {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrongPassword("WeakPass"));
        System.out.println(SecurityUtils.isStrongPassword("Strong1Pass"));
    }
}
