package week04_day2_SubmissionOfJavaCollections;
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Integer> cart = new HashMap<>();
        cart.put("Laptop", 1);
        cart.put("Mouse", 2);

        for (Map.Entry<String, Integer> item : cart.entrySet()) {
            System.out.println(item.getKey() + " - Quantity: " + item.getValue());
        }
    }
}