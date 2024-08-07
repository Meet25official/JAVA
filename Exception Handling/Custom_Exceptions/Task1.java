// 1. Library Management System: Overdue Book Exception

// Problem Statement:
// In a library management system, you need to handle cases where a book is returned after the due date. Create a custom exception `OverdueBookException` to manage this scenario.

import java.time.LocalDate;

class OverdueBookException extends Exception {
    public OverdueBookException(String message) {
        super(message);
    }
}
class Library {
    public void returnBook(LocalDate dueDate, LocalDate returnDate) throws OverdueBookException {
        if (returnDate.isAfter(dueDate)) {
            throw new OverdueBookException("The book is returned after the due date: " + dueDate);
        }
        System.out.println("Book returned on time.");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Library library = new Library();
        LocalDate dueDate = LocalDate.of(2024, 8, 1);
        LocalDate returnDate = LocalDate.of(2024, 8, 5);

        try {
            library.returnBook(dueDate, returnDate);
        } catch (OverdueBookException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
