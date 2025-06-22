// Scenario 5: Travel Booking System
// Develop an interface called "TravelBooking" with methods like "bookTicket" and "cancelBooking." Implement classes like "FlightBooking" and "HotelBooking" that provide specific implementations for these interface methods.

interface TravelBooking {
    void bookTicket(String details);
    void cancelBooking(int bookingId);
}

class FlightBooking implements TravelBooking {
    @Override
    public void bookTicket(String details) {
        System.out.println("Booking flight with details: " + details);
    }

    @Override
    public void cancelBooking(int bookingId) {
        System.out.println("Cancelling flight booking with ID: " + bookingId);
    }
}

class HotelBooking implements TravelBooking {
    @Override
    public void bookTicket(String details) {
        System.out.println("Booking hotel with details: " + details);
    }

    @Override
    public void cancelBooking(int bookingId) {
        System.out.println("Cancelling hotel booking with ID: " + bookingId);
    }
}
public class Task5 {
    public static void main(String[] args) {
        TravelBooking flightBooking = new FlightBooking();
        flightBooking.bookTicket("Flight to New York, 12th August, Economy Class");
        flightBooking.cancelBooking(101);

        TravelBooking hotelBooking = new HotelBooking();
        hotelBooking.bookTicket("Hotel in New York, 12th to 15th August, Single Room");
        hotelBooking.cancelBooking(102);
    }
}
