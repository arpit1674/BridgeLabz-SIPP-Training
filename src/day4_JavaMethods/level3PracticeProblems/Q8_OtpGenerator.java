package day4_JavaMethods.level3PracticeProblems;
import java.util.HashSet;

public class Q8_OtpGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
        System.out.println("Are all OTPs unique? " + areUnique(otps));
    }

    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    public static boolean areUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) set.add(otp);
        return set.size() == otps.length;
    }
}