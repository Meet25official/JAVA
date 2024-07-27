// Scenario 17: Flight Reservation System
// Design a flight reservation system with classes like "Flight," "Passenger," and "Reservation." Implement methods for passengers to search for flights, book tickets, and manage their reservations.

class Entity {
    private String name;
    
    public Entity(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return name;
    }
}

class Passenger extends Entity {
    private int passengerId;
    
    public Passenger(String name, int passengerId) {
        super(name);
        this.passengerId = passengerId;
    }
    
    public int getPassengerId() {
        return passengerId;
    }
}

class Flight {
    private String flightNumber;
    private String destination;
    private int availableSeats;
    
    public Flight(String flightNumber, String destination, int availableSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }
    
    public String getFlightNumber() {
        return flightNumber;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public int getAvailableSeats() {
        return availableSeats;
    }
    
    public void decreaseAvailableSeats() {
        if (availableSeats > 0) {
            availableSeats--;
        } else {
            System.out.println("No available seats.");
        }
    }
    
    public String toString() {
        return "Flight Number: " + flightNumber + ", Destination: " + destination + ", Available Seats: " + availableSeats;
    }
}

class Reservation {
    private Passenger passenger;
    private Flight flight;
    
    public Reservation(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
    }
    
    public void bookTicket() {
        if (flight.getAvailableSeats() > 0) {
            flight.decreaseAvailableSeats();
            System.out.println("Reservation confirmed for " + passenger.getName() + " on flight " + flight.getFlightNumber());
        } else {
            System.out.println("Unable to book ticket. No available seats.");
        }
    }
    
    public String toString() {
        return passenger.getName() + " has a reservation on flight " + flight.getFlightNumber();
    }
}
public class Task17 {
    public static void main(String[] args) {
        Passenger alice = new Passenger("Alice Johnson", 101);
        Passenger bob = new Passenger("Bob Smith", 102);
        
        Flight flight101 = new Flight("AA101", "New York", 2);
        Flight flight102 = new Flight("BB202", "Los Angeles", 1);
        
        Reservation reservation1 = new Reservation(alice, flight101);
        Reservation reservation2 = new Reservation(bob, flight102);
        
        reservation1.bookTicket();
        reservation2.bookTicket();
        
        Reservation reservation3 = new Reservation(bob, flight101);
        reservation3.bookTicket(); 

        System.out.println(flight101);
        System.out.println(flight102);
    }
}
