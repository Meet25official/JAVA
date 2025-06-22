// Scenario 1: University Course Registration
// In a university course registration system, have classes like "Course," "Lecture," and "Lab" representing different types of courses. Use the instanceof operator to determine the type of course and perform specific registration operations based on the course type.

class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void register() {
        System.out.println("Registering for course: " + name);
    }
}
class Lecture extends Course {

    public Lecture(String name) {
        super(name);
    }

    @Override
    public void register() {
        System.out.println("Registering for lecture: " + getName());
    }
}
class Lab extends Course {

    public Lab(String name) {
        super(name);
    }

    @Override
    public void register() {
        System.out.println("Registering for lab: " + getName());
    }
}
class RegistrationSystem {

    public void registerCourse(Course course) {
        if (course instanceof Lecture) {
            ((Lecture) course).register();
        } else if (course instanceof Lab) {
            ((Lab) course).register();
        } else {
            course.register();
        }
    }
}
public class Task3 {
    public static void main(String[] args) {
        Course lecture = new Lecture("Introduction to Programming");
        Course lab = new Lab("Programming Lab");

        RegistrationSystem registrationSystem = new RegistrationSystem();

        registrationSystem.registerCourse(lecture);
        registrationSystem.registerCourse(lab);
    }
}
