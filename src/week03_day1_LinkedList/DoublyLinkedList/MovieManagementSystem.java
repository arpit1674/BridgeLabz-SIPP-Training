package week03_day1_LinkedList.DoublyLinkedList;

class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;

    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

public class MovieManagementSystem {
    MovieNode head, tail;

    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeByTitle(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;
                break;
            }
            temp = temp.next;
        }
    }

    public void searchByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println(temp.title + " | " + temp.year + " | " + temp.rating);
            }
            temp = temp.next;
        }
    }

    public void searchByRating(double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println(temp.title + " | " + temp.director + " | " + temp.year);
            }
            temp = temp.next;
        }
    }

    public void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                break;
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.print(temp.title + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.print(temp.title + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();
        mms.addAtEnd("Inception", "Nolan", 2010, 9.0);
        mms.addAtEnd("Interstellar", "Nolan", 2014, 8.6);
        mms.addAtEnd("Titanic", "Cameron", 1997, 9.5);
        mms.displayForward();
        mms.searchByDirector("Nolan");
        mms.updateRating("Titanic", 9.6);
        mms.removeByTitle("Inception");
        mms.displayReverse();
    }
}
