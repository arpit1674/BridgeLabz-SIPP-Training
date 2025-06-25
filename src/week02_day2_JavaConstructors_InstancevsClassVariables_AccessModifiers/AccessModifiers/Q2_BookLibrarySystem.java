package week02_day2_JavaConstructors_InstancevsClassVariables_AccessModifiers.AccessModifiers;

import java.util.Scanner;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

public class Q2_BookLibrarySystem extends Book {
    public Q2_BookLibrarySystem(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();

        Q2_BookLibrarySystem b = new Q2_BookLibrarySystem(isbn, title, author);
        b.display();

        System.out.print("Enter new author to update: ");
        author = sc.nextLine();
        b.setAuthor(author);
        b.display();
        sc.close();
    }
}
