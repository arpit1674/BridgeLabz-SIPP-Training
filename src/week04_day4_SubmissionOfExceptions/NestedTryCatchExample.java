package week04_day4_SubmissionOfExceptions;

import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40};

        try {
            System.out.print("Enter index: ");
            int index = scanner.nextInt();
            int value = 0;

            try {
                value = arr[index];
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();
                int result = value / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
