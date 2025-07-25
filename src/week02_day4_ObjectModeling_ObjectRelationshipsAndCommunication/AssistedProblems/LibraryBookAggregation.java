package week02_day4_ObjectModeling_ObjectRelationshipsAndCommunication.AssistedProblems;
import java.util.ArrayList;

public class LibraryBookAggregation {
    String name;
    ArrayList<Book> books = new ArrayList<>();
    LibraryBookAggregation(String name) {
        this.name = name;
    }
    void addBook(Book book) {
        books.add(book);
    }
    void showBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author);
        }
    }
    public static void main(String[] args) {
        Book b1 = new Book("Java", "James");
        Book b2 = new Book("Python", "Guido");
        LibraryBookAggregation lib = new LibraryBookAggregation("City Library");
        lib.addBook(b1);
        lib.addBook(b2);
        lib.showBooks();
    }
}

class Book {
    String title, author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}