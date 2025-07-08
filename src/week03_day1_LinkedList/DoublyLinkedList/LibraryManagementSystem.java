package week03_day1_LinkedList.DoublyLinkedList;

class BookNode {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    BookNode next;
    BookNode prev;

    public BookNode(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
    }
}

public class LibraryManagementSystem {
    BookNode head = null, tail = null;

    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeBookById(int bookId) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp == head) {
                    head = temp.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = temp.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    public void searchBook(String titleOrAuthor) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(titleOrAuthor) || temp.author.equalsIgnoreCase(titleOrAuthor)) {
                System.out.println(temp.title + " by " + temp.author + " [" + temp.genre + "]");
            }
            temp = temp.next;
        }
    }

    public void updateAvailability(int bookId, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            System.out.print(temp.title + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.print(temp.title + " <- ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total Books: " + count);
    }

    public static void main(String[] args) {
        LibraryManagementSystem lib = new LibraryManagementSystem();
        lib.addBookAtEnd("The Hobbit", "Tolkien", "Fantasy", 1, true);
        lib.addBookAtEnd("1984", "Orwell", "Dystopia", 2, true);
        lib.addBookAtEnd("Hamlet", "Shakespeare", "Drama", 3, false);
        lib.displayForward();
        lib.displayReverse();
        lib.searchBook("Orwell");
        lib.updateAvailability(3, true);
        lib.removeBookById(1);
        lib.displayForward();
        lib.countBooks();
    }
}
