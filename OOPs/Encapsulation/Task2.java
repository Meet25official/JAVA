//Scenario 2: Health Tracking Application
// In a health tracking application, encapsulate the "User" class's personal health data, such as weight, heart rate, and sleep patterns, to maintain privacy and provide controlled access to the user's health information.

class User{
    private int weight;
    private int heartRate;
    private String sleepPattern;

    public User(int weight , int heartRate , String sleepPattern){
        this.weight = weight;
        this.heartRate = heartRate;
        this.sleepPattern = sleepPattern;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public String getSleepPattern() {
        return sleepPattern;
    }

    public void setSleepPattern(String sleepPattern) {
        this.sleepPattern = sleepPattern;
    }
}

public class Task2 {
    public static void main(String[] args) {
        User himesh = new User(67, 96, "RightSide");
        // himesh.weight;
        System.out.println("The weight of the user is :- "+himesh.getWeight());    
         // we can access private data form this class using getter setter and encapsulation.
        System.out.println("The Heart Rate of the user is :- "+himesh.getHeartRate());
        System.out.println("The Sleep Pattern of the user is :- "+himesh.getSleepPattern());
    }
}