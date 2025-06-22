// Scenario 1: Online Course Platform
// In an online course platform, create classes like "Course," "VideoLesson," and "Quiz" representing different course components. Use the instanceof operator to determine the type of course component and perform specific actions or display relevant information.

class OnlineCoursePlatform {
    public static class CourseComponent {
        private String title;

        public CourseComponent(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void display() {
            System.out.println("Course Component: " + title);
        }
    }

    public static class VideoLesson extends CourseComponent {
        private int duration;

        public VideoLesson(String title, int duration) {
            super(title);
            this.duration = duration;
        }

        public int getDuration() {
            return duration;
        }

        @Override
        public void display() {
            System.out.println("Video Lesson: " + getTitle() + ", Duration: " + duration + " minutes");
        }
    }

    public static class Quiz extends CourseComponent {
        private int numberOfQuestions;

        public Quiz(String title, int numberOfQuestions) {
            super(title);
            this.numberOfQuestions = numberOfQuestions;
        }

        public int getNumberOfQuestions() {
            return numberOfQuestions;
        }

        @Override
        public void display() {
            System.out.println("Quiz: " + getTitle() + ", Number of Questions: " + numberOfQuestions);
        }
    }

    public static class Course {
        private String courseName;
        private CourseComponent[] components;
        private int componentCount;

        public Course(String courseName, int maxComponents) {
            this.courseName = courseName;
            this.components = new CourseComponent[maxComponents];
            this.componentCount = 0;
        }

        public void addComponent(CourseComponent component) {
            if (componentCount < components.length) {
                components[componentCount++] = component;
            } else {
                System.out.println("Cannot add more components to the course.");
            }
        }

        public void displayCourseInfo() {
            System.out.println("Course: " + courseName);
            for (int i = 0; i < componentCount; i++) {
                CourseComponent component = components[i];
                if (component instanceof VideoLesson) {
                    ((VideoLesson) component).display();
                } else if (component instanceof Quiz) {
                    ((Quiz) component).display();
                } else {
                    System.out.println("Unknown component: " + component.getTitle());
                }
            }
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        OnlineCoursePlatform.Course course = new OnlineCoursePlatform.Course("Java Programming", 10);
        OnlineCoursePlatform.VideoLesson video1 = new OnlineCoursePlatform.VideoLesson("Introduction to Java", 30);
        OnlineCoursePlatform.VideoLesson video2 = new OnlineCoursePlatform.VideoLesson("Object-Oriented Programming", 45);
        OnlineCoursePlatform.Quiz quiz1 = new OnlineCoursePlatform.Quiz("Java Basics Quiz", 10);

        course.addComponent(video1);
        course.addComponent(video2);
        course.addComponent(quiz1);

        course.displayCourseInfo();
    }
}

