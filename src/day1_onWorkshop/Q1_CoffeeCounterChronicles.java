package day1_onWorkshop;
import java.util.Scanner;

public class Q1_CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        while (true) {
            System.out.println("Enter coffee type (Espresso / Latte / Cappuccino) or 'exit' to quit :");
            choice = sc.next();
            if (choice.equalsIgnoreCase("exit")) break;
            System.out.println("Enter quantity:");
            int quantity = sc.nextInt();
            double price = 0;
            switch (choice.toLowerCase()) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 140;
                    break;
                default:
                    System.out.println("Invalid coffee type");
                    continue;
            }
            double total = price * quantity;
            double gst = total * 0.18;
            double bill = total + gst;
            System.out.println("Bill with GST: ₹" + bill);
        }
        sc.close();
    }
}
