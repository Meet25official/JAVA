// 3. Problem: Develop a student grading system where you have different grading scales for different courses. Use method overloading to calculate the final grade based on the course's grading scale.
//    - Example: Create a `Student` class with overloaded `calculateFinalGrade` methods for each course, allowing custom grading logic.

class Student {
    public String calculateFinalGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public String calculateFinalGrade(double score, double maxScore) {
        double percentage = (score / maxScore) * 100;
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student();

        double score1 = 85;
        System.out.println("Final grade for score " + score1 + ": " + student.calculateFinalGrade(score1));

        double score2 = 75;
        double maxScore2 = 90;
        System.out.println("Final grade for score " + score2 + " out of " + maxScore2 + ": " + student.calculateFinalGrade(score2, maxScore2));
    }
}
