package week02_day5_Inheritance.SingleInheritance;

class Book {
    String title;
    int publicationYear;
}

class Author extends Book {
    String name;
    String bio;

    void displayInfo() {
        System.out.println(title + " " + publicationYear + " " + name + " " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author a = new Author();
        a.title = "Java Basics";
        a.publicationYear = 2020;
        a.name = "John Smith";
        a.bio = "Expert in Java";
        a.displayInfo();
    }
}
