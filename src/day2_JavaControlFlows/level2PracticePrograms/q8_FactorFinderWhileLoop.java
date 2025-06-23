package day2_JavaControlFlows.level2PracticePrograms;
import java.util.Scanner;
public class q8_FactorFinderWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int i = 1;
        while (i < number) {
            if (number % i == 0)
                System.out.println(i);
            i++;
        }
        sc.close();
    }
}
