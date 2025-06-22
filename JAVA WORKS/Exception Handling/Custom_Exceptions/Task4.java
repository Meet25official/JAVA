// 4. Travel Booking System: Flight Not Available Exception

// Problem Statement:
// In a travel booking system, handle cases where a flight is not available for booking. Create a custom exception `FlightNotAvailableException` to manage this scenario.

class FlightNotAvailableException extends Exception {
    public FlightNotAvailableException(String message) {
        super(message);
    }
}
class Flight {
    private String flightNumber;

    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}

class TravelBookingSystem {
    private Flight[] availableFlights;

    public TravelBookingSystem() {
        availableFlights = new Flight[] {
            new Flight("FL123"),
            new Flight("AU178")
        };
    }

    public void bookFlight(String flightNumber) throws FlightNotAvailableException {
        for (Flight flight : availableFlights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                System.out.println("Flight " + flightNumber + " booked successfully.");
                return;
            }
        }
        throw new FlightNotAvailableException("Flight " + flightNumber + " is not available.");
    }
}
public class Task4 {
    public static void main(String[] args) {
        TravelBookingSystem bookingSystem = new TravelBookingSystem();
        String flightNumber = "AU178";

        try {
            bookingSystem.bookFlight(flightNumber);
        } catch (FlightNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
