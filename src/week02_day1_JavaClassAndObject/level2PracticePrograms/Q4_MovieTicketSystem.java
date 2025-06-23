package week02_day1_JavaClassAndObject.level2PracticePrograms;
import java.util.Scanner;

public class Q4_MovieTicketSystem {
    String movieName;
    String seatNumber;
    double price;

    public void bookTicket(String movie, String seat, double p) {
        movieName = movie;
        seatNumber = seat;
        price = p;
    }

    public void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q4_MovieTicketSystem ticket = new Q4_MovieTicketSystem();
        System.out.print("Enter movie name: ");
        String movie = sc.nextLine();
        System.out.print("Enter seat number: ");
        String seat = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        ticket.bookTicket(movie, seat, price);
        ticket.displayTicket();
        sc.close();
    }
}
