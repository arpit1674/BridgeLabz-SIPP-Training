package week02_day3_this_static_final_keyWordsAndinstanceofOperator;

public class Q4_ShoppingCartSystem {
    static double discount = 10.0;
    final int productID;
    String productName;
    double price;
    int quantity;

    public Q4_ShoppingCartSystem(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void display() {
        if (this instanceof Q4_ShoppingCartSystem) {
            System.out.println("ID: " + productID + ", Name: " + productName + ", Price: " + price + ", Qty: " + quantity + ", Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Q4_ShoppingCartSystem p1 = new Q4_ShoppingCartSystem(1, "Pen", 10.0, 5);
        Q4_ShoppingCartSystem p2 = new Q4_ShoppingCartSystem(2, "Notebook", 50.0, 2);
        p1.display();
        p2.display();
        updateDiscount(15.0);
        System.out.println("Updated Discount: " + discount + "%");
    }
}
