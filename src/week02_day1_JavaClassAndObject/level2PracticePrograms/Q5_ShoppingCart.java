package week02_day1_JavaClassAndObject.level2PracticePrograms;
import java.util.Scanner;

public class Q5_ShoppingCart {
    String itemName;
    double price;
    int quantity;

    public void addItem(String item, double p, int q) {
        itemName = item;
        price = p;
        quantity = q;
    }

    public void removeItem() {
        itemName = "";
        price = 0;
        quantity = 0;
    }

    public void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q5_ShoppingCart cart = new Q5_ShoppingCart();
        System.out.print("Enter item name: ");
        String item = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        cart.addItem(item, price, qty);
        cart.displayTotalCost();
        sc.close();
    }
}
