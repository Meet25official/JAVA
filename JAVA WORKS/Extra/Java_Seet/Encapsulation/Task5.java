// Scenario 5: Customer Relationship Management (CRM) System
// In a CRM system, encapsulate the customer data and methods for managing customer interactions to ensure data integrity, privacy, and controlled access to customer information.

class Customer {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    public Customer(String name, String email, String phoneNumber, String address) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email address.");
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (isValidPhoneNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number.");
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private boolean isValidEmail(String email) {
        return email.contains("@");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}

class Interaction {
    private String interactionType;
    private String date;
    private String notes;
    private Customer customer;

    public Interaction(String interactionType, String date, String notes, Customer customer) {
        this.interactionType = interactionType;
        this.date = date;
        this.notes = notes;
        this.customer = customer;
    }

    public String getInteractionType() {
        return interactionType;
    }

    public String getDate() {
        return date;
    }

    public String getNotes() {
        return notes;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void updateNotes(String notes) {
        this.notes = notes;
    }

    public void displayInteractionDetails() {
        System.out.println("Interaction Type: " + interactionType);
        System.out.println("Date: " + date);
        System.out.println("Notes: " + notes);
        System.out.println("Customer Info:");
        customer.displayCustomerInfo();
    }
}

public class Task5 {
    public static void main(String[] args) {
        Customer customer = new Customer("bob", "bob@gmail.com", "1234567890", "xyz");
        customer.displayCustomerInfo();

        Interaction interaction = new Interaction("Phone Call", "2024-07-28", "Discussed new product features.", customer);
        interaction.displayInteractionDetails();

        customer.setEmail("bob@gmail.com");
        customer.setPhoneNumber("0987654321");

        interaction.updateNotes("Follow-up call scheduled.");
        interaction.displayInteractionDetails();
    }
}
