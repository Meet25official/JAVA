//4. Network Connection Error Handling: Develop a network handling module in Java where the 'throw' keyword is used to manage connection errors. Simulate scenarios where 'throw' is employed to handle cases like timeouts or unreachable hosts during network operations.

class NetWorkConnectionError extends Exception{
    public NetWorkConnectionError(String messege){
        super(messege);
    }
}

class Error{
    private String cname;
    private int speed;

    public Error(String cname , int speed){
        this.cname = cname;
        this.speed = speed;
    }

    public void connection() throws NetWorkConnectionError{
        if(speed <= 23){
            throw new NetWorkConnectionError("The network speed is very low check connection.");  
        }
        else{
            System.out.println("You are loginned succesfuly your network connection is ready and your card name is :- "+cname);
        }
    }
}

public class Taskthr4 {
    public static void main(String[] args) {
        Error obj = new Error("BSNL", 12);
        try {
            obj.connection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}