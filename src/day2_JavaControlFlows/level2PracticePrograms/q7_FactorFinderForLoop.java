package day2_JavaControlFlows.level2PracticePrograms;
import java.util.Scanner;
public class q7_FactorFinderForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 1)
            System.out.println("Invalid input.");
        else {
            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                    System.out.println(i);
            }
        }
        sc.close();
    }
}