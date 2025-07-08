package week03_day1_LinkedList.SinglyLinkedList;

class InventoryNode {
    String itemName;
    int itemId;
    int quantity;
    double price;
    InventoryNode next;

    public InventoryNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InventoryManagementSystem {
    InventoryNode head = null;

    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        InventoryNode newNode = new InventoryNode(itemName, itemId, quantity, price);
        if (head == null) {
            head = newNode;
        } else {
            InventoryNode temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    public void removeById(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        InventoryNode current = head;
        InventoryNode prev = null;
        while (current != null && current.itemId != itemId) {
            prev = current;
            current = current.next;
        }
        if (current != null)
            prev.next = current.next;
    }

    public void updateQuantity(int itemId, int newQty) {
        InventoryNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByIdOrName(int itemId, String itemName) {
        InventoryNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId || temp.itemName.equalsIgnoreCase(itemName)) {
                System.out.println(temp.itemName + " | Qty: " + temp.quantity + " | Price: " + temp.price);
            }
            temp = temp.next;
        }
    }

    public void calculateTotalInventoryValue() {
        double total = 0;
        InventoryNode temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }

    public void displayItems() {
        InventoryNode temp = head;
        while (temp != null) {
            System.out.print(temp.itemName + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        ims.addAtEnd("Mouse", 101, 10, 500);
        ims.addAtEnd("Keyboard", 102, 5, 700);
        ims.addAtEnd("Monitor", 103, 3, 8500);
        ims.displayItems();
        ims.updateQuantity(102, 8);
        ims.searchByIdOrName(102, "");
        ims.calculateTotalInventoryValue();
        ims.removeById(101);
        ims.displayItems();
    }
}
