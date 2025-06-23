package day1_ProgrammingElements.level2PracticePrograms;
import java.util.Scanner;
public class q7_IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int a = input.nextInt();
        System.out.print("Enter value b: ");
        int b = input.nextInt();
        System.out.print("Enter value c: ");
        int c = input.nextInt();

        int op1 = a + b * c;
        int op2 = a * b + c;
        int op3 = c + a / b;
        int op4 = a % b + c;

        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
        input.close();
    }
}
