package week02_day4_ObjectModeling_ObjectRelationshipsAndCommunication.SelfProblems;

import java.util.*;

public class EcommerceOrderSystem {
    public static void main(String[] args) {
        Customer2 c = new Customer2("Arpit");
        Order o = new Order();
        o.addProduct(new Product("Laptop"));
        o.addProduct(new Product("Mouse"));
        c.placeOrder(o);
        o.showProducts();
    }
}

class Customer2 {
    String name;
    Customer2(String name) {
        this.name = name;
    }
    void placeOrder(Order o) {
        System.out.println(name + " placed an order.");
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();
    void addProduct(Product p) {
        products.add(p);
    }
    void showProducts() {
        for (Product p : products) {
            System.out.println("Product: " + p.name);
        }
    }
}

class Product {
    String name;
    Product(String name) {
        this.name = name;
    }
}
