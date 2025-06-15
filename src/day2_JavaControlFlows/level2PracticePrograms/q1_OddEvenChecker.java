package day2_JavaControlFlows.level2PracticePrograms;
import java.util.Scanner;
public class q1_OddEvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Please enter a natural number.");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is Even");
                else
                    System.out.println(i + " is Odd");
            }
        }
        sc.close();
    }
}
