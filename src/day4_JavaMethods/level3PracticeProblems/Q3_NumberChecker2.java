package day4_JavaMethods.level3PracticeProblems;

public class Q3_NumberChecker2 {
    public static void main(String[] args) {
        int number = 21;
        int[] digits = getDigits(number);
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares: " + sumOfSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(number, digits));
        printDigitFrequency(digits);
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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        return num % sumOfDigits(digits) == 0;
    }

    public static void printDigitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        System.out.println("Digit Frequency:");
        for (int[] row : freq) {
            if (row[1] > 0) System.out.println(row[0] + " -> " + row[1]);
        }
    }
}