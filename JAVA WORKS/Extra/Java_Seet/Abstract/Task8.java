// Scenario 8: Mobile Application Development
// Design an abstract class called "App" with abstract methods like "open" and "close." Implement derived classes like "ChatApp" and "PhotoEditingApp" that provide specific implementations for these abstract methods.

abstract class App {
    private String appName;

    public App(String appName) {
        this.appName = appName;
    }

    abstract void open();
    abstract void close();

    public String getAppName() {
        return appName;
    }
}

class ChatApp extends App {
    public ChatApp(String appName) {
        super(appName);
    }

    @Override
    void open() {
        System.out.println("Opening chat application: " + getAppName());
    }

    @Override
    void close() {
        System.out.println("Closing chat application: " + getAppName());
    }
}

class PhotoEditingApp extends App {
    public PhotoEditingApp(String appName) {
        super(appName);
    }

    @Override
    void open() {
        System.out.println("Opening photo editing application: " + getAppName());
    }

    @Override
    void close() {
        System.out.println("Closing photo editing application: " + getAppName());
    }
}
public class Task8 {
    public static void main(String[] args) {
        App chatApp = new ChatApp("WhatsApp");
        chatApp.open();
        chatApp.close();

        App photoEditingApp = new PhotoEditingApp("Adobe Photoshop");
        photoEditingApp.open();
        photoEditingApp.close();
    }
}
