package week02_day2_JavaConstructors_InstancevsClassVariables_AccessModifiers;

public class Q1_BookConstructor {
    String title;
    String author;
    double price;

    public Q1_BookConstructor() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    public Q1_BookConstructor(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Q1_BookConstructor book1 = new Q1_BookConstructor();
        Q1_BookConstructor book2 = new Q1_BookConstructor("Java", "James", 599.99);
        book1.display();
        book2.display();
    }
}
