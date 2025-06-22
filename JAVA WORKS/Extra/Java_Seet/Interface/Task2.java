// Scenario 2: Messaging Service Integration
// Develop an interface called "MessagingService" with methods like "sendMessage" and "receiveMessage." Implement classes like "EmailService" and "SMSService" that provide specific implementations for these interface methods.

interface MessagingService {
    void sendMessage(String recipient, String message);
    String receiveMessage();
}

class EmailService implements MessagingService {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending email to " + recipient + " with message: " + message);
    }

    @Override
    public String receiveMessage() {
        String receivedMessage = "Email received message";
        System.out.println(receivedMessage);
        return receivedMessage;
    }
}

class SMSService implements MessagingService {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + " with message: " + message);
    }

    @Override
    public String receiveMessage() {
        String receivedMessage = "SMS received message";
        System.out.println(receivedMessage);
        return receivedMessage;
    }
}

public class Task2 {
    public static void main(String[] args) {
        MessagingService emailService = new EmailService();
        emailService.sendMessage("bob@gmail.com", "Hello gooogle Email!");
        emailService.receiveMessage();

        MessagingService smsService = new SMSService();
        smsService.sendMessage("123-456-7890", "Hello jack SMS!");
        smsService.receiveMessage();
    }
}
