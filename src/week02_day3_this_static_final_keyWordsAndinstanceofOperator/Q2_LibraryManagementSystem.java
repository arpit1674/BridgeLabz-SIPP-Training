package week02_day3_this_static_final_keyWordsAndinstanceofOperator;

public class Q2_LibraryManagementSystem {
    static String libraryName = "City Library";
    final String isbn;
    String title, author;

    public Q2_LibraryManagementSystem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayBook() {
        if (this instanceof Q2_LibraryManagementSystem) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Q2_LibraryManagementSystem b1 = new Q2_LibraryManagementSystem("Java Basics", "Nisha", "ISBN1234");
        b1.displayBook();
        displayLibraryName();
    }
}
