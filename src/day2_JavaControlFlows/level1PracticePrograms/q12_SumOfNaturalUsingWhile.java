package day2_JavaControlFlows.level1PracticePrograms;
import java.util.Scanner;
public class q12_SumOfNaturalUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n > 0) {
            int i = 1, sum = 0;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("While loop sum = " + sum);
            System.out.println("Formula sum = " + formulaSum);
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
