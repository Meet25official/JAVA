// Scenario 4: Contact Management
// In a contact management application, create an array to store contact information such as names, phone numbers, and email addresses. Implement features such as adding new contacts, searching for a specific contact, and deleting contacts from the array.

import java.util.Scanner;

class Contact {
    String name;
    String phoneNumber;
    String email;

    Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email;
    }
}
public class Task4 {
    private static final int MAX_CONTACTS = 100;
    private static Contact[] contacts = new Contact[MAX_CONTACTS];
    private static int contactCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Contact Management System");
            System.out.println("1. Add New Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addNewContact(scanner);
                    break;
                case 2:
                    searchContact(scanner);
                    break;
                case 3:
                    deleteContact(scanner);
                    break;
                case 4:
                    displayAllContacts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addNewContact(Scanner scanner) {
        if (contactCount == MAX_CONTACTS) {
            System.out.println("Contact list is full. Cannot add more contacts.");
            return;
        }
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email address: ");
        String email = scanner.nextLine();

        contacts[contactCount++] = new Contact(name, phoneNumber, email);
        System.out.println("Contact added successfully.");
    }

    private static void searchContact(Scanner scanner) {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i].name.equalsIgnoreCase(name)) {
                System.out.println("Contact found: " + contacts[i]);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    private static void deleteContact(Scanner scanner) {
        System.out.print("Enter name to delete: ");
        String name = scanner.nextLine();
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i].name.equalsIgnoreCase(name)) {
                for (int j = i; j < contactCount - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                contacts[--contactCount] = null;
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    private static void displayAllContacts() {
        if (contactCount == 0) {
            System.out.println("No contacts to display.");
            return;
        }
        System.out.println("All Contacts:");
        for (int i = 0; i < contactCount; i++) {
            System.out.println((i + 1) + ". " + contacts[i]);
        }
    }
}
