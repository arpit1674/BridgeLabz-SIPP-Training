package week02_day2_JavaConstructors_InstancevsClassVariables_AccessModifiers.InstanceVsClassVariablesAndMethods;

public class Q1_ProductInventory {
    String productName;
    double price;
    static int totalProducts;

    public Q1_ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Q1_ProductInventory p1 = new Q1_ProductInventory("Laptop", 50000);
        Q1_ProductInventory p2 = new Q1_ProductInventory("Mouse", 500);
        p1.displayProductDetails();
        p2.displayProductDetails();
        displayTotalProducts();
    }
}
