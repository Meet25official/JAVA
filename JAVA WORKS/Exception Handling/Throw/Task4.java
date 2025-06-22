// 4. Network Connection Error Handling: Develop a network handling module in Java where the 'throw' keyword is used to manage connection errors. Simulate scenarios where 'throw' is employed to handle cases like timeouts or unreachable hosts during network operations.

import java.util.Random;

class ConnectionTimeoutException extends Exception {
    public ConnectionTimeoutException(String message) {
        super(message);
    }
}

class UnreachableHostException extends Exception {
    public UnreachableHostException(String message) {
        super(message);
    }
}

class NetworkHandler {
    private Random random = new Random();

    public void connect(String host) throws ConnectionTimeoutException, UnreachableHostException {
        int randomNumber = random.nextInt(100);

        if (randomNumber < 20) {
            throw new UnreachableHostException("The host " + host + " is unreachable.");
        } else if (randomNumber < 40) {
            throw new ConnectionTimeoutException("Connection to " + host + " timed out.");
        }

        System.out.println("Successfully connected to " + host);
    }

    public void fetchData(String host) throws ConnectionTimeoutException, UnreachableHostException {
        System.out.println("Attempting to connect to " + host);
        connect(host);
        System.out.println("Data fetched successfully from " + host);
    }
}
public class Task4 {
    public static void main(String[] args) {
        NetworkHandler networkHandler = new NetworkHandler();

        String[] hosts = {"host1.example.com", "host2.example.com", "host3.example.com"};

        for (String host : hosts) {
            try {
                networkHandler.fetchData(host);
            } catch (ConnectionTimeoutException | UnreachableHostException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
