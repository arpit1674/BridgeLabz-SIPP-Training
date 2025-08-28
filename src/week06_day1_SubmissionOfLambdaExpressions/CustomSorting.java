package week06_day1_SubmissionOfLambdaExpressions;

import java.util.*;

class Product {
    String name;
    double price, rating, discount;
    Product(String name, double price, double rating, double discount) {
        this.name = name; this.price = price; this.rating = rating; this.discount = discount;
    }
    public String toString() {
        return name + " (Price: " + price + ", Rating: " + rating + ", Discount: " + discount + ")";
    }
}

public class CustomSorting {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 60000, 4.5, 10));
        products.add(new Product("Phone", 25000, 4.8, 15));
        products.add(new Product("Headphones", 2000, 4.2, 5));

        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("By Price: " + products);

        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("By Rating: " + products);

        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("By Discount: " + products);
    }
}
