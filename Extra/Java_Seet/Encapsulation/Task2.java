// Scenario 2: Health Tracking Application
// In a health tracking application, encapsulate the "User" class's personal health data, such as weight, heart rate, and sleep patterns, to maintain privacy and provide controlled access to the user's health information.

class User {
    private double weight;
    private int heartRate;
    private int sleepHours;

    public User(double weight, int heartRate, int sleepHours) {
        this.weight = weight;
        this.heartRate = heartRate;
        this.sleepHours = sleepHours;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight value.");
        }
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        if (heartRate > 0) {
            this.heartRate = heartRate;
        } else {
            System.out.println("Invalid heart rate value.");
        }
    }

    public int getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(int sleepHours) {
        if (sleepHours >= 0 && sleepHours <= 24) {
            this.sleepHours = sleepHours;
        } else {
            System.out.println("Invalid sleep hours value.");
        }
    }

    public void displayHealthData() {
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Sleep Hours: " + sleepHours + " hours");
    }
}
public class Task2 {
    public static void main(String[] args) {
        User user = new User(70.5, 72, 8);

        user.displayHealthData();
        user.setWeight(68.0);
        user.setHeartRate(75);
        user.setSleepHours(7);

        user.displayHealthData();
    }
}
