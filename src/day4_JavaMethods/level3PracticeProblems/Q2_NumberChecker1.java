package day4_JavaMethods.level3PracticeProblems;

public class Q2_NumberChecker1 {
    public static void main(String[] args) {
        int number = 153;
        int count = getDigitCount(number);
        int[] digits = getDigits(number, count);
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(number, digits));
        findTwoLargest(digits);
        findTwoSmallest(digits);
    }

    public static int getDigitCount(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num, int count) {
        int[] arr = new int[count];
        int i = count - 1;
        while (num > 0) {
            arr[i--] = num % 10;
            num /= 10;
        }
        return arr;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, digits.length);
        return sum == num;
    }

    public static void findTwoLargest(int[] digits) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max) {
                second = max;
                max = d;
            } else if (d > second && d != max) {
                second = d;
            }
        }
        System.out.println("Largest: " + max + ", Second Largest: " + second);
    }

    public static void findTwoSmallest(int[] digits) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min) {
                second = min;
                min = d;
            } else if (d < second && d != min) {
                second = d;
            }
        }
        System.out.println("Smallest: " + min + ", Second Smallest: " + second);
    }
}