package day1_ProgrammingElements.level1PracticePrograms;
import java.util.Scanner;
public class q8_CourseFeeDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter Discount %: ");
        double discountPercent = input.nextDouble();
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        input.close();
    }
}