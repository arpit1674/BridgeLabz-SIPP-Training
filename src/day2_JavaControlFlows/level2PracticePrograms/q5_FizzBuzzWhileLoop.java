package day2_JavaControlFlows.level2PracticePrograms;
import java.util.Scanner;
public class q5_FizzBuzzWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Invalid input");
        } else {
            int i = 1;
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
                i++;
            }
        }
        sc.close();
    }
}
