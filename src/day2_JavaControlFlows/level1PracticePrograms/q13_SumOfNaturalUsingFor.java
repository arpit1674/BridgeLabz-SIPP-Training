package day2_JavaControlFlows.level1PracticePrograms;
import java.util.Scanner;
public class q13_SumOfNaturalUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) sum += i;
            int formulaSum = n * (n + 1) / 2;
            System.out.println("For loop sum = " + sum);
            System.out.println("Formula sum = " + formulaSum);
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
} 
