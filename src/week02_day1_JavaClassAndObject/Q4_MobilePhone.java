package week02_day1_JavaClassAndObject;

import java.util.Scanner;

public class Q4_MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q4_MobilePhone phone = new Q4_MobilePhone();

        System.out.print("Enter Brand: ");
        phone.brand = sc.nextLine();

        System.out.print("Enter Model: ");
        phone.model = sc.nextLine();

        System.out.print("Enter Price: ");
        phone.price = sc.nextDouble();

        phone.displayDetails();
        sc.close();
    }
}
