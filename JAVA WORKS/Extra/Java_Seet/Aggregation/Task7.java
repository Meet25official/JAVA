// Scenario 7: Social Media User Connections
// Design a social media system where a user can have multiple connections or friends. The user class contains a list of user objects, representing an aggregation relationship.

class User {
    String username;
    String email;
    private User[] connections; 
    private int count;

    public User(String username, String email, int maxConnections) {
        this.username = username;
        this.email = email;
        this.connections = new User[maxConnections];
        this.count = 0;
    }

    public void addConnection(User user) {
        if (count < connections.length) {
            connections[count++] = user;
        } else {
            System.out.println(username + " has reached the maximum number of connections.");
        }
    }

    public void printConnections() {
        System.out.println(username + "'s connections:");
        for (int i = 0; i < count; i++) {
            System.out.println(connections[i].username);
        }
    }

    public int getNumberOfConnections() {
        return count;
    }
}
public class Task7 {
    public static void main(String[] args) {
        User user1 = new User("Jeck", "jeck@example.com", 5);
        User user2 = new User("Bob", "bob@example.com", 5);

        user1.addConnection(user2);
        user2.addConnection(user1);

        user1.printConnections();
        user2.printConnections();
    }
}
