// Scenario 9: Event RSVPs
// In an event management system, create an array to store the RSVP status of attendees for an event. Perform operations such as counting the number of confirmed attendees, generating a guest list, and checking the availability of seats.

import java.util.Scanner;

class Attendee {
    String name;
    boolean isConfirmed;

    Attendee(String name, boolean isConfirmed) {
        this.name = name;
        this.isConfirmed = isConfirmed;
    }

    @Override
    public String toString() {
        return "Attendee: " + name + ", RSVP: " + (isConfirmed ? "Confirmed" : "Not Confirmed");
    }
}
public class Task9 {
    private static final int MAX_ATTENDEES = 50;
    private static Attendee[] attendees = new Attendee[MAX_ATTENDEES];
    private static int attendeeCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Event Management System");
            System.out.println("1. Add Attendee");
            System.out.println("2. Confirm Attendance");
            System.out.println("3. Count Confirmed Attendees");
            System.out.println("4. Generate Guest List");
            System.out.println("5. Check Seat Availability");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addAttendee(scanner);
                    break;
                case 2:
                    confirmAttendance(scanner);
                    break;
                case 3:
                    countConfirmedAttendees();
                    break;
                case 4:
                    generateGuestList();
                    break;
                case 5:
                    checkSeatAvailability();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addAttendee(Scanner scanner) {
        if (attendeeCount == MAX_ATTENDEES) {
            System.out.println("Cannot add more attendees.");
            return;
        }
        System.out.print("Enter attendee name: ");
        String name = scanner.nextLine();
        attendees[attendeeCount++] = new Attendee(name, false);
        System.out.println("Attendee added successfully.");
    }

    private static void confirmAttendance(Scanner scanner) {
        System.out.print("Enter attendee name: ");
        String name = scanner.nextLine();
        Attendee attendee = findAttendee(name);
        if (attendee == null) {
            System.out.println("Attendee not found.");
            return;
        }
        attendee.isConfirmed = true;
        System.out.println("Attendance confirmed.");
    }

    private static void countConfirmedAttendees() {
        int confirmedCount = 0;
        for (int i = 0; i < attendeeCount; i++) {
            if (attendees[i].isConfirmed) {
                confirmedCount++;
            }
        }
        System.out.println("Number of confirmed attendees: " + confirmedCount);
    }

    private static void generateGuestList() {
        if (attendeeCount == 0) {
            System.out.println("No attendees to display.");
            return;
        }
        System.out.println("Guest List:");
        for (int i = 0; i < attendeeCount; i++) {
            System.out.println((i + 1) + ". " + attendees[i]);
        }
    }

    private static void checkSeatAvailability() {
        int confirmedCount = 0;
        for (int i = 0; i < attendeeCount; i++) {
            if (attendees[i].isConfirmed) {
                confirmedCount++;
            }
        }
        int availableSeats = MAX_ATTENDEES - confirmedCount;
        System.out.println("Available seats: " + availableSeats);
    }

    private static Attendee findAttendee(String name) {
        for (int i = 0; i < attendeeCount; i++) {
            if (attendees[i].name.equalsIgnoreCase(name)) {
                return attendees[i];
            }
        }
        return null;
    }
}
