package week02_day6_Encapsulation_Polymorphism_InterfaceAndAbstractClass;

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        System.out.println("Book reserved.");
    }

    public boolean checkAvailability() {
        return true;
    }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem() {
        System.out.println("Magazine reserved.");
    }

    public boolean checkAvailability() {
        return true;
    }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 3;
    }

    public void reserveItem() {
        System.out.println("DVD reserved.");
    }

    public boolean checkAvailability() {
        return false;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("B1", "Java Basics", "Author A");
        items[1] = new Magazine("M1", "Tech Weekly", "Editor B");
        items[2] = new DVD("D1", "Java Movie", "Director C");

        for (int i = 0; i < items.length; i++) {
            items[i].getItemDetails();
            System.out.println("Loan Duration: " + items[i].getLoanDuration() + " days");
            Reservable reservable = (Reservable) items[i];
            reservable.reserveItem();
            System.out.println("Available: " + reservable.checkAvailability());
            System.out.println();
        }
    }
}
