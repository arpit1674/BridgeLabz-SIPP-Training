package week02_day1_JavaClassAndObject.level1PracticePrograms;

import java.util.Scanner;

public class Q3_ItemInventory {
    int itemCode;
    String itemName;
    double price;

    void displayDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: ₹" + price);
        System.out.println("Total Cost for " + quantity + " units: ₹" + (price * quantity));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q3_ItemInventory item = new Q3_ItemInventory();

        System.out.print("Enter Item Code: ");
        item.itemCode = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Item Name: ");
        item.itemName = sc.nextLine();

        System.out.print("Enter Price: ");
        item.price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        item.displayDetails(quantity);
        sc.close();
    }
}
