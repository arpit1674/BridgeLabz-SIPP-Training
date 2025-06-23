package day4_JavaMethods.level3PracticeProblems;
import java.util.Arrays;

public class Q4_NumberChecker3 {
    public static void main(String[] args) {
        int number = 121;
        int[] digits = getDigits(number);
        int[] reversed = reverseDigits(digits);
        System.out.println("Palindrome: " + Arrays.equals(digits, reversed));
        System.out.println("Duck Number: " + isDuckNumber(digits));
    }

    public static int[] getDigits(int num) {
        int[] arr = new int[String.valueOf(num).length()];
        int i = arr.length - 1;
        while (num > 0) {
            arr[i--] = num % 10;
            num /= 10;
        }
        return arr;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++)
            rev[i] = digits[digits.length - 1 - i];
        return rev;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }
}