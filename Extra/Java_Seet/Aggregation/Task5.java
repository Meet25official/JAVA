// Scenario 5: School Course Enrollment
// Create a school course enrollment system where a student can enroll in multiple courses. The student class contains a list of course objects, representing an aggregation relationship.

class Course {
    String courseName;
    String courseCode;
    int credits;

    public Course(String courseName, String courseCode, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "courseName='" + courseName + '\'' + ", courseCode='" + courseCode + '\'' + ", credits=" + credits;
    }
}

class Student {
    String name;
    String studentId;
    private Course[] courses;
    private int count;

    public Student(String name, String studentId, int maxCourses) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new Course[maxCourses];
        this.count = 0;
    }

    public void enrollInCourse(Course course) {
        if (count < courses.length) {
            courses[count++] = course;
        } else {
            System.out.println("Cannot enroll in more courses, limit reached.");
        }
    }

    public void printEnrolledCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (int i = 0; i < count; i++) {
            System.out.println(courses[i]);
        }
    }

    public int calculateTotalCredits() {
        int totalCredits = 0;
        for (int i = 0; i < count; i++) {
            totalCredits += courses[i].credits;
        }
        return totalCredits;
    }
}
public class Task5 {
    public static void main(String[] args) {
        Student student = new Student("Meet", "S123", 5);

        Course course1 = new Course("Mathematics", "MATH101", 3);
        Course course2 = new Course("Physics", "PHYS101", 4);
        Course course3 = new Course("Computer Science", "CS101", 3);

        student.enrollInCourse(course1);
        student.enrollInCourse(course2);
        student.enrollInCourse(course3);

        student.printEnrolledCourses();

        int totalCredits = student.calculateTotalCredits();
        System.out.println("Total credits enrolled: " + totalCredits);
    }
}
