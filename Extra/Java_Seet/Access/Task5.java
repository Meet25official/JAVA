// Scenario 5: Travel Booking System
// In a travel booking system, use a combination of access modifiers, such as "private" for sensitive data like customer payment details, "protected" for methods used within specific subclasses, and "public" for API methods accessible by external systems.

class Customer {
    private String name;
    private String email;
    private String paymentDetails;

    public Customer(String name, String email, String paymentDetails) {
        this.name = name;
        this.email = email;
        this.paymentDetails = paymentDetails;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    private void processPayment(String paymentDetails) {}

    public void bookTravel(String travelDetails) {
        System.out.println("Booking travel for " + name + " with details: " + travelDetails);
        processPayment(paymentDetails);
    }
}

abstract class Travel {
    protected String destination;
    protected double price;

    public Travel(String destination, double price) {
        this.destination = destination;
        this.price = price;
    }

    protected void calculateDiscount() {}

    public abstract void book();
}

class Flight extends Travel {
    private String flightNumber;

    public Flight(String destination, double price, String flightNumber) {
        super(destination, price);
        this.flightNumber = flightNumber;
    }

    @Override
    public void book() {
        System.out.println("Booking flight to " + destination + " with flight number " + flightNumber);
        calculateDiscount();
    }
}

class Hotel extends Travel {
    private String hotelName;

    public Hotel(String destination, double price, String hotelName) {
        super(destination, price);
        this.hotelName = hotelName;
    }

    @Override
    public void book() {
        System.out.println("Booking hotel at " + destination + " in hotel " + hotelName);
        calculateDiscount();
    }
}
public class Task5 {
    public static void main(String[] args) {
        Customer customer = new Customer("bob", "bob@gmail.com", "securepayment123");

        Flight flight = new Flight("New York", 500.0, "NY123");
        Hotel hotel = new Hotel("New York", 200.0, "Hotel XYZ");

        customer.bookTravel("Flight and Hotel Booking");
        flight.book();
        hotel.book();
    }
}
