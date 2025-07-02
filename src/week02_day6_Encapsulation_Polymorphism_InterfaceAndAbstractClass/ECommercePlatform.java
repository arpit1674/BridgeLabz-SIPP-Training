package week02_day6_Encapsulation_Polymorphism_InterfaceAndAbstractClass;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateDiscount();

    public void displayFinalPrice() {
        double discount = calculateDiscount();
        double tax = 0;
        if (this instanceof Taxable) {
            tax = ((Taxable) this).calculateTax();
        }
        double finalPrice = price + tax - discount;
        System.out.println(name + " Final Price: " + finalPrice);
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "18% GST";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    public double calculateTax() {
        return getPrice() * 0.12;
    }

    public String getTaxDetails() {
        return "12% GST";
    }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Electronics(101, "Laptop", 60000);
        products[1] = new Clothing(102, "T-Shirt", 1200);
        products[2] = new Groceries(103, "Rice", 1000);

        for (int i = 0; i < products.length; i++) {
            products[i].displayFinalPrice();
        }
    }
}
