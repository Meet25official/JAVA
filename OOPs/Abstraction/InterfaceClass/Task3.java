//Scenario 3: Database Connectivity
//Create an interface called "DatabaseConnection" with methods like "connect" and "disconnect." Implement classes like "MySQLConnection" and "PostgreSQLConnection" that provide specific implementations for these interface methods.

interface DatabaseConnection{
    void connect();
    void disconnect();
}

class MySQLConnection implements DatabaseConnection{
    @Override
    public void connect(){
        System.out.println("The database is connect to the serve");
        System.out.println("The database is from SQL laungauge.");
    } 
    @Override
    public void disconnect(){
        System.out.println("Warning Something went wrong connection lost.");
        System.out.println("The database of this SQL is Disconnect.");
        System.out.println("--------------------------------------------------------------------------");
    }
}

class PostgreSQLConnection implements DatabaseConnection{
    @Override
    public void connect(){
        System.out.println("The database is connect to the serve");
        System.out.println("The database is from PLSQL laungauge.");
    } 
    @Override
    public void disconnect(){
        System.out.println("Warning Warning connnection is week. Please Try Again.");
        System.out.println("The database of this SQL is Disconnect.");
        System.out.println("--------------------------------------------------------------------------");
    }
}

public class Task3 {
    public static void main(String[] args) {
        MySQLConnection obj1 = new MySQLConnection();
        PostgreSQLConnection obj2 = new PostgreSQLConnection();

        obj1.connect();
        obj1.disconnect();

        obj2.connect();
        obj2.disconnect();
    }
}