package day1_ProgrammingElements.level2PracticePrograms;
import java.util.Scanner;
public class q5_TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double total = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        input.close();
    }
}
