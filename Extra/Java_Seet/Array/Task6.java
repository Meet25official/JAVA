// Scenario 6: Student Enrollment
// In a university enrollment system, create an array to store the courses in which students are enrolled. Perform operations such as adding or dropping courses, checking the number of enrolled students in each course, and generating enrollment reports.

import java.util.Scanner;

class Course {
    String name;
    int enrolledStudents;

    Course(String name) {
        this.name = name;
        this.enrolledStudents = 0;
    }
}
public class Task6 {
    private static final int MAX_COURSES = 10;
    private static Course[] courses = new Course[MAX_COURSES];
    private static int courseCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("University Enrollment System");
            System.out.println("1. Add Course");
            System.out.println("2. Enroll Student in Course");
            System.out.println("3. Drop Student from Course");
            System.out.println("4. Check Enrollment Numbers");
            System.out.println("5. Generate Enrollment Report");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addCourse(scanner);
                    break;
                case 2:
                    enrollStudent(scanner);
                    break;
                case 3:
                    dropStudent(scanner);
                    break;
                case 4:
                    checkEnrollmentNumbers(scanner);
                    break;
                case 5:
                    generateEnrollmentReport();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addCourse(Scanner scanner) {
        if (courseCount == MAX_COURSES) {
            System.out.println("Cannot add more courses.");
            return;
        }
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        courses[courseCount++] = new Course(name);
        System.out.println("Course added successfully.");
    }

    private static void enrollStudent(Scanner scanner) {
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        Course course = findCourse(name);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }
        course.enrolledStudents++;
        System.out.println("Student enrolled successfully.");
    }

    private static void dropStudent(Scanner scanner) {
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        Course course = findCourse(name);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }
        if (course.enrolledStudents > 0) {
            course.enrolledStudents--;
            System.out.println("Student dropped successfully.");
        } else {
            System.out.println("No students to drop.");
        }
    }

    private static void checkEnrollmentNumbers(Scanner scanner) {
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        Course course = findCourse(name);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }
        System.out.println("Number of students enrolled in " + course.name + ": " + course.enrolledStudents);
    }

    private static void generateEnrollmentReport() {
        if (courseCount == 0) {
            System.out.println("No courses to display.");
            return;
        }
        System.out.println("Enrollment Report:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println((i + 1) + ". " + courses[i].name + ": " + courses[i].enrolledStudents + " students");
        }
    }

    private static Course findCourse(String name) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].name.equalsIgnoreCase(name)) {
                return courses[i];
            }
        }
        return null;
    }
}
