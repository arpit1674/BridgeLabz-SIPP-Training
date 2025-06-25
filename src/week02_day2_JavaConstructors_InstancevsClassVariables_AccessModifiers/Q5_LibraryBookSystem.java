package week02_day2_JavaConstructors_InstancevsClassVariables_AccessModifiers;
import java.util.Scanner;

public class Q5_LibraryBookSystem {
    String title;
    String author;
    double price;
    boolean available = true;

    public Q5_LibraryBookSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Book borrowed.");
        } else {
            System.out.println("Book not available.");
        }
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        Q5_LibraryBookSystem book = new Q5_LibraryBookSystem("Java Basics", "Kathy", 399.99);
        book.display();
        book.borrow();
        book.display();
        book.borrow();
    }
}
