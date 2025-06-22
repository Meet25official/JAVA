// Scenario 3: Database Connectivity
// Create an interface called "DatabaseConnection" with methods like "connect" and "disconnect." Implement classes like "MySQLConnection" and "PostgreSQLConnection" that provide specific implementations for these interface methods.

interface DatabaseConnection {
    void connect();
    void disconnect();
}

class MySQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL database...");
    }
}

class PostgreSQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from PostgreSQL database...");
    }
}

public class Task3 {
    public static void main(String[] args) {
        DatabaseConnection mySQLConnection = new MySQLConnection();
        mySQLConnection.connect();
        mySQLConnection.disconnect();

        DatabaseConnection postgreSQLConnection = new PostgreSQLConnection();
        postgreSQLConnection.connect();
        postgreSQLConnection.disconnect();
    }
}
