package week02_day2_JavaConstructors_InstancevsClassVariables_AccessModifiers;

public class Q4_HotelBookingSystem {
    String guestName;
    String roomType;
    int nights;

    public Q4_HotelBookingSystem() {
        this("Default Guest", "Standard", 1);
    }

    public Q4_HotelBookingSystem(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public Q4_HotelBookingSystem(Q4_HotelBookingSystem h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    public void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        Q4_HotelBookingSystem b1 = new Q4_HotelBookingSystem();
        Q4_HotelBookingSystem b2 = new Q4_HotelBookingSystem("Alice", "Deluxe", 3);
        Q4_HotelBookingSystem b3 = new Q4_HotelBookingSystem(b2);
        b1.display();
        b2.display();
        b3.display();
    }
}
