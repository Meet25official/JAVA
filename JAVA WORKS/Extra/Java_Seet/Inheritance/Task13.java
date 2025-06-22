// Scenario 13: Online Ticket Booking System
// Develop an online ticket booking system with classes like "Ticket," "Event," and "User." Implement methods for users to book tickets, view event details, and manage their bookings.

class BookingEntity {
    private String name;
    
    public BookingEntity(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return name;
    }
}

class User extends BookingEntity {
    protected Ticket ticket;

    public User(String username) {
        super(username);
    }
    
    public void bookTicket(Event event) {
        if (event.getAvailableTickets() > 0) {
            ticket = new Ticket(this, event);
            event.decreaseAvailableTickets();
            System.out.println(getName() + " successfully booked a ticket for " + event.getName());
        } else {
            System.out.println("No tickets available for " + event.getName());
        }
    }
    
    public void viewBookings(Ticket[] tickets) {
        System.out.println(getName() + "'s bookings:");
        for (Ticket ticket : tickets) {
            if (ticket != null && ticket.getUser().equals(this)) {
                System.out.println(ticket);
            }
        }
    }
}

class Event extends BookingEntity {
    protected int totalTickets;
    private int availableTickets;
    
    public Event(String eventName, int totalTickets) {
        super(eventName);
        this.totalTickets = totalTickets;
        this.availableTickets = totalTickets;
    }
    
    public int getAvailableTickets() {
        return availableTickets;
    }
    
    public void decreaseAvailableTickets() {
        if (availableTickets > 0) {
            availableTickets--;
        }
    }
    
    public String toString() {
        return "Event: " + getName() + " | Available Tickets: " + availableTickets;
    }
}

class Ticket extends BookingEntity {
    private User user;
    private Event event;
    
    public Ticket(User user, Event event) {
        super(event.getName() + " Ticket");
        this.user = user;
        this.event = event;
    }
    
    public User getUser() {
        return user;
    }
    
    public String toString() {
        return "Ticket for " + event.getName() + " booked by " + user.getName();
    }
}
public class Task13 {
    public static void main(String[] args) {
        User alice = new User("Alice");
        User bob = new User("Bob");
        
        Event concert = new Event("Concert", 5);
        Event theater = new Event("Theater", 3);
        
        alice.bookTicket(concert);
        bob.bookTicket(concert);
        
        Ticket[] tickets = new Ticket[10]; 
        tickets[0] = new Ticket(alice, concert);
        tickets[1] = new Ticket(bob, concert);
        
        alice.viewBookings(tickets);
        bob.viewBookings(tickets);
        
        System.out.println(concert);
        System.out.println(theater);
    }
}
