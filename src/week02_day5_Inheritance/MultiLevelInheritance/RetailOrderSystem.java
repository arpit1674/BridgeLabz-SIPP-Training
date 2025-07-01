package week02_day5_Inheritance.MultiLevelInheritance;

class Order {
    String orderId;
    String orderDate;
}

class ShippedOrder extends Order {
    String trackingNumber;
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    void getOrderStatus() {
        System.out.println(orderId + " " + orderDate + " " + trackingNumber + " " + deliveryDate + " Delivered");
    }
}

public class RetailOrderSystem {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder();
        d.orderId = "ORD123";
        d.orderDate = "2025-06-15";
        d.trackingNumber = "TRK456";
        d.deliveryDate = "2025-06-17";
        d.getOrderStatus();
    }
}
