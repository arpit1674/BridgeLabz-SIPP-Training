package week02_day4_ObjectModeling_ObjectRelationshipsAndCommunication.Class_ObjectAndSequenceDiagram;

import java.util.*;

class Customer {
    String name;
    List<Product> products;

    Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    List<Product> getProducts() {
        return products;
    }
}

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }
}

class BillGenerator {
    static void generateBill(Customer customer) {
        double total = 0;
        System.out.println("Customer: " + customer.name);
        for (Product p : customer.getProducts()) {
            double cost = p.getTotal();
            System.out.println(p.name + " - " + p.quantity + " × $" + p.price + " = $" + cost);
            total += cost;
        }
        System.out.println("Total Bill: $" + total);
    }
}

public class GroceryStoreBillGenerationApplication {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        customer.addProduct(new Product("Apples", 3.0, 2));
        customer.addProduct(new Product("Milk", 2.0, 1));
        BillGenerator.generateBill(customer);
    }
}
