package week03_day1_LinkedList.CircularLinkedList;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }
}

public class OnlineTicketReservationSystem {
    Ticket head = null;
    Ticket tail = null;

    public void reserveTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            tail = newTicket;
            newTicket.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
    }

    public void cancelTicket(int ticketId) {
        if (head == null) return;
        Ticket temp = head, prev = null;

        do {
            if (temp.ticketId == ticketId) {
                if (temp == head) {
                    if (head == tail) {
                        head = null;
                        tail = null;
                        return;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets reserved.");
            return;
        }
        Ticket temp = head;
        do {
            System.out.println("TicketID: " + temp.ticketId + ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber +
                    ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchTicket(String key) {
        if (head == null) return;
        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(key) || temp.movieName.equalsIgnoreCase(key)) {
                System.out.println("TicketID: " + temp.ticketId + ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber +
                        ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No ticket found with name/movie: " + key);
        }
    }

    public void totalTickets() {
        if (head == null) {
            System.out.println("Total tickets: 0");
            return;
        }
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Total tickets: " + count);
    }

    public static void main(String[] args) {
        OnlineTicketReservationSystem system = new OnlineTicketReservationSystem();
        system.reserveTicket(101, "Alice", "Inception", "A1", "10:00 AM");
        system.reserveTicket(102, "Bob", "Interstellar", "B1", "12:00 PM");
        system.reserveTicket(103, "Charlie", "Inception", "A2", "10:00 AM");

        system.displayTickets();
        system.searchTicket("Inception");
        system.totalTickets();

        system.cancelTicket(102);
        system.displayTickets();
        system.totalTickets();
    }
}

