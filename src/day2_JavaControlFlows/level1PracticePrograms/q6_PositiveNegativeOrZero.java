package day2_JavaControlFlows.level1PracticePrograms;
import java.util.Scanner;
public class q6_PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) System.out.println("Positive");
        else if (num < 0) System.out.println("Negative");
        else System.out.println("Zero");
        sc.close();
    }
}
