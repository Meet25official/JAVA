// Scenario 2: Messaging App
// In a messaging application, implement method overloading for sending messages. Create different methods with different parameter combinations, such as sending a text message, sending an image message, and sending a video message.

class MessagingApp {
    public void sendMessage(String recipient, String text) {
        System.out.println("Sending text message to " + recipient + ": " + text);
    }

    public void sendMessage(String recipient, String imagePath, boolean isHighResolution) {
        System.out.println("Sending image message to " + recipient + " from path " + imagePath + 
                           ". High resolution: " + isHighResolution);
    }

}

public class Task2 {
    public static void main(String[] args) {
        MessagingApp app = new MessagingApp();
        app.sendMessage("Jack", "Hello, how are you?");
        app.sendMessage("Bob", "/path/to/image.jpg", true);
    }
}
