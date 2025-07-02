package week02_day6_Encapsulation_Polymorphism_InterfaceAndAbstractClass;

interface Discountable {
    void applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    public void applyDiscount() {
        discount = getPrice() * getQuantity() * 0.05;
    }

    public String getDiscountDetails() {
        return "5% veg item discount applied: ₹" + discount;
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private double nonVegCharge;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
        this.nonVegCharge = 20;
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + nonVegCharge) - discount;
    }

    public void applyDiscount() {
        discount = getPrice() * getQuantity() * 0.03;
    }

    public String getDiscountDetails() {
        return "3% non-veg item discount applied: ₹" + discount;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order = new FoodItem[2];
        order[0] = new VegItem("Paneer Roll", 100, 2);
        order[1] = new NonVegItem("Chicken Wrap", 150, 1);

        for (int i = 0; i < order.length; i++) {
            order[i].getItemDetails();
            Discountable d = (Discountable) order[i];
            d.applyDiscount();
            System.out.println(d.getDiscountDetails());
            System.out.println("Total Payable: ₹" + order[i].calculateTotalPrice());
            System.out.println();
        }
    }
}
